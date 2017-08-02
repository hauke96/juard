# juard
A mixture between "java" and "guard". Juard.
# What is it?
A lightweight framework for contracts, events, dependency injection and logging in java.

I originally developed it for some of my projects, but I think that other peoble might also find juard useful, so I made a library out of it.

# Changelog
## 0.1.0
* Events
  * Renamed `EventArgs` into `DataEvent`
  * Made `DataEvent` generic
  * Pass only one data object (now of the specified generic type), not an array
  * Refactored code a lot
* Contract
  * Removed old and deprecated methods
  * Added `AreEqual` method
* Logger
  * Renamed all methods (just removed the two underscores. E.g. `__debug()` became `debug()`)
  * Added warning method and log-level (just call `warn()`)
  * Fixed comments

## 0.0.3
* New Event class `EventArgs` (allows the passing of objects)
* More general contract
  * Old methods are deprecated now
* More general contract exceptions

## 0.0.2
* Added event class
* Added logging class
* Added dependency injection classes

## 0.0.1
* Added contract classes
