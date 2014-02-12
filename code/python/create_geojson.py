# easy_install geojson  OR  pip install geojson
import geojson
from geojson import Point, Polygon, Feature, FeatureCollection

def outage_point(id, geometry, number_outages, customers_affected, etr):
    return Feature(id=id,
                   geometry=geometry,
                   properties={'feature_type': 'point',
                               'number_outages': number_outages,
                               'customers_affected': customers_affected,
                               'etr': etr,
                               'marker-color': '#FF0000'})

def outage_area(id, geometry, number_outages, customers_affected):
    return Feature(id=id,
                   geometry=geometry,
                   properties={'feature_type': 'area',
                               'number_outages': number_outages,
                               'customers_affected': customers_affected,
                               'stroke': '#FF0000',
                               'fill': '#FF0000',
                               'fill-opacity': 0.5})



outages = []

outages.append(outage_point(id=1,
                            geometry=Point((-117.178438,32.681087)),
                            number_outages=28,
                            customers_affected=29,
                            etr='2014-02-12T18:00:00'))

outages.append(outage_point(id=2,
                            geometry=Point((-117.185175,33.760766)),
                            number_outages=23,
                            customers_affected=134,
                            etr='2014-02-12T18:00:00'))

outages.append(outage_point(id=3,
                            geometry=Point((-117.849355,33.730927)),
                            number_outages=4,
                            customers_affected=4,
                            etr='2014-02-12T18:00:00'))

outages.append(outage_area(id=4,
                            geometry=Polygon([[(-117.101383,32.649782),
                                               (-117.078209,32.656720),
                                               (-117.070313,32.651806),
                                               (-117.062588,32.646313),
                                               (-117.053146,32.636917),
                                               (-117.042675,32.623906),
                                               (-117.041988,32.621015),
                                               (-117.085762,32.609881),
                                               (-117.101383,32.649782)]]),
                            number_outages=4,
                            customers_affected=4))

fc = FeatureCollection(outages)

with open('../../specification/example.geojson','w') as o:
    geojson.dump(fc, o, indent=4)



