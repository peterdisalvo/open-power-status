import json

d = None

with open(r"C:\Users\Alfred\Downloads\LAST_outage_location_document.json", 'rb') as f:
    d = json.load(f)


for c in d['outages'][0]['polygon']:
    print "({x} , {y}),".format(**c)