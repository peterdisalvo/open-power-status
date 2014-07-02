# easy_install geojson  OR  pip install geojson
import geojson
from geojson import Point, Polygon, Feature, FeatureCollection, GeometryCollection


class CrewStatusType:
    ASSIGNED, DISPATCHED, ARRIVED, FIELD_COMPLETE = range(4)

class Cause:
    PLANNED, UNPLANNED, ANIMAL = range(3)

class OutageStatusType:
    VERIFIED, ESTIMATED = range(2)

class ErtConfidenceType:
    HIGH, LOW = range(2)

class OutageServiceType:
    ELECTRIC, GAS, WATER = range(3)


def create_outage_document(metadata, outages):
    fc = FeatureCollection(outages)

    fc['metadata'] = metadata

    return fc


def create_outage(id, startTime, metersAffected, originalMetersAffected, ert,
                  ertDescription, ertConfidence, comments, crewStatus, cause,
                  circuitFeeder, status, typeOfService, geometryCollection):
    """
    returns a geojson Feature

    :param id: string
    :param startTime: string ISO 8601
    :param metersAffected: int
    :param originalMetersAffected: int
    :param ert: string ISO 8601
    :param ertDescription: string
    :param ertConfidence: ErtConfidenceType
    :param comments: string
    :param crewStatus: CrewStatusType
    :param cause: Cause
    :param circuitFeeder: string
    :param status: OutageStatusType
    :param typeOfService: OutageServiceType
    :param geometryCollection: GeometryCollection
    """
    return Feature(id=id,
                   geometry=geometryCollection,
                   properties={"startTime": startTime,
                               "metersAffected": metersAffected,
                               "originalMetersAffected": originalMetersAffected,
                               "ert": ert,
                               "ertDescription": ertDescription,
                               "ertConfidence": ertConfidence,
                               "comments": comments,
                               "crewStatus": crewStatus,
                               "cause": cause,
                               "circuitFeeder": circuitFeeder,
                               "status": status,
                               "typeOfService": typeOfService})



############# SCENARIO 1 - creating an outage with a single point #######################


metadata = {"timestamp": "2014-04-09T16:48:25-04:00", # time should be in ISO 8601 format
            "updateFrequencyDataExpiration": 900, # seconds
            "utility": "IFACTOR",
            "utilityDisclaimer": "Restoration Estimations could be adjusted depending on future conditions",
            "utilityLogo": "http://content.screencast.com/users/alfred_ifactor/folders/openpowerstatus/media/dbd7f950-8b68-4946-98e5-5dd69d56f2c0/logo.png"}

outages = []
outages.append(create_outage(id="O-00001",
                             startTime="2014-04-09T12:48:25-04:00", # time should be in ISO 8601 format
                             metersAffected=100,
                             originalMetersAffected=120,
                             ert="2014-04-09T20:48:25-04:00", # time should be in ISO 8601 format
                             ertDescription="April 9th 2014, 8:48PM",
                             ertConfidence=ErtConfidenceType.LOW,
                             comments="Line down",
                             crewStatus=CrewStatusType.ARRIVED,
                             cause=Cause.UNPLANNED,
                             circuitFeeder="AS-300",
                             status=OutageStatusType.ESTIMATED,
                             typeOfService=OutageServiceType.ELECTRIC,
                             geometryCollection=GeometryCollection([Point((-117.101383, 32.649782))])))


outage_document = create_outage_document(metadata, outages)

with open('../../specification/outage_single_point.geojson', 'w') as o:
    geojson.dump(outage_document, o, indent=4)



############# SCENARIO 2 - creating an outage with a point and polygon #######################


metadata = {"timestamp": "2014-04-09T16:48:25-04:00", # time should be in ISO 8601 format
            "updateFrequencyDataExpiration": 900, # seconds
            "utility": "IFACTOR",
            "utilityDisclaimer": "Restoration Estimations could be adjusted depending on future conditions",
            "utilityLogo": "http://content.screencast.com/users/alfred_ifactor/folders/openpowerstatus/media/dbd7f950-8b68-4946-98e5-5dd69d56f2c0/logo.png"}

outages = []
outages.append(create_outage(id="O-00001",
                             startTime="2014-04-09T12:48:25-04:00", # time should be in ISO 8601 format
                             metersAffected=100,
                             originalMetersAffected=120,
                             ert="2014-04-09T20:48:25-04:00", # time should be in ISO 8601 format
                             ertDescription="April 9th 2014, 8:48PM",
                             ertConfidence=ErtConfidenceType.LOW,
                             comments="Line down",
                             crewStatus=CrewStatusType.ARRIVED,
                             cause=Cause.UNPLANNED,
                             circuitFeeder="AS-300",
                             status=OutageStatusType.ESTIMATED,
                             typeOfService=OutageServiceType.ELECTRIC,
                             geometryCollection=GeometryCollection([Point((-117.101383, 32.649782)),
                                                                    Polygon([[(-117.101383 , 32.649782),
                                                                              (-117.078209 , 32.65672),
                                                                              (-117.070313 , 32.651806),
                                                                              (-117.062588 , 32.646313),
                                                                              (-117.053146 , 32.636917),
                                                                              (-117.042675 , 32.623906),
                                                                              (-117.041988 , 32.621015),
                                                                              (-117.085762 , 32.609881),
                                                                              (-117.101383 , 32.649782)]])])))


outage_document = create_outage_document(metadata, outages)

with open('../../specification/outage_point_and_polygon.geojson', 'w') as o:
    geojson.dump(outage_document, o, indent=4)


