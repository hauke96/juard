# juard
A tiny little framework as a guard to good code quality and annoying programming.
# What is it?
A veeeery simple framework for contracts, events, dependency injection and logging in java.

It was originally developed for the [METRO project](https://github.com/hauke96/METRO/), but I need this also in some other projects, so I made a library out of it.

# Changelog
## 0.0.4
* Events
 * Rename Event class `EventArgs` into `DataEvent`
 * Make `DataEvent` generic
 * Pass only one data object (now of the specified generic type), not an array
* Contract
 * Remove old, deprecated contract methods
 * Add `AreEqual` method to contracts
* Logger
 * Rename all methods (just removed the two underscores. E.g. `__debug()` became `debug()`)
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
