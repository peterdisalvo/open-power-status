# Specification

## Introduction

## GeoJSON
The exchange format will use the [GeoJSON 1.0 specification](http://geojson.org/geojson-spec.html)

### County

### Municipality / Town / Village / City

### ZIP Code

You can find examples of this specification in [`zipcode_outage.geojson`](zipcode_outage.geojson)

Field 							| Type		| Description
--------------------------------|-----------|---------------
`id`							| String	| Zipcode
`properties.etr`				| DateTime 	| String in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations) format representing Estimated Restoration Time
`properties.customers_affected`	| Integer	| Number of customers affected
`properties.number_outages`		| Integer	| Number of outages


### Individual Order/Outage

You can find examples of this specification in [`individual_outage.geojson`](individual_outage.geojson)

Field 							| Type		| Description
--------------------------------|-----------|---------------
`id`							| String	| unique outage ID
`geometry`  					| [Point](http://geojson.org/geojson-spec.html#point)  	| Outage location in WGS84 geographic coordinate reference system
`properties.etr`				| DateTime 	| String in [ISO 8601](http://en.wikipedia.org/wiki/ISO_8601#Combined_date_and_time_representations) format representing Estimated Restoration Time
`properties.customers_affected`	| Integer	| Number of customers affected
`properties.number_outages`		| Integer	| Number of outages

### Circuit Outage

You can find examples of this specification in [`circuit_outage.geojson`](circuit_outage.geojson)

Field 							| Type		| Description
--------------------------------|-----------|---------------
`id`							| String	| unique outage ID
`geometry`  					| [Polygon](http://geojson.org/geojson-spec.html#polygon)  	| Buffer surrounding affected circuit in WGS84 geographic coordinate reference system
`properties.customers_affected`	| Integer	| Number of customers affected
`properties.number_outages`		| Integer	| Number of outages
