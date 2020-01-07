# studious-succotash

Using advanced types in Scala

Imagine a system that fetches data types from a meta data service on the fly. E.g., that service provides the mapping:

`a -> int, b -> option[int], c -> string`, etc. 

Design a system that allows:

1. object models comprising a "shape" (or combination) of the various types to be constructed, e.g., `A` is comprised of `{a, b, c, d}` whereas `B` is comprised of `{a, d, e}`.
2. creation of base models and child models, i.e., if `B <: A`, then `B` will contain all the properties of `A`.
2. rules to be applied that modify an individual field on those object models
