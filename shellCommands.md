## Get only numericals words from sentence 

```
#Different examples
#testing="Release-Prod-1.0.0-10.9.1"
#testing="Release-Prod-1.0.0"
testing="Release-Prod-1.0.0-12.5.0"

values=`echo $testing | awk -F"-" '{ for (i=1; i<=NF; i++) if( $i~/^[0-9]/) printf "%s-", $i}' | sed 's/-$//'`
echo $values
```
