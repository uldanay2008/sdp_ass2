# Space Mission Factories

Assignment #2: an implementation of the **Factory Method** and **Abstract Factory** patterns using a space-mission theme.

## Project Structure

```text
src/main/java/spacemission/
├── Main.java                            — entry point, demonstrates both parts
├── factorymethod/                       — Part A: Factory Method
│   ├── Spacecraft.java                  — Product
│   ├── Satellite.java                   — Concrete Product
│   ├── Rover.java                       — Concrete Product
│   ├── SpacecraftFactory.java           — Creator
│   ├── SatelliteFactory.java            — Concrete Creator
│   └── RoverFactory.java                — Concrete Creator
│
└── abstractfactory/                     — Part B: Abstract Factory
    ├── PropulsionSystem.java             — Abstract Product
    ├── LifeSupportModule.java            — Abstract Product
    ├── mars/                             — Mars product family
    │   ├── MarsPropulsionSystem.java
    │   └── MarsLifeSupportModule.java
    ├── lunar/                            — Lunar product family
    │   ├── LunarPropulsionSystem.java
    │   └── LunarLifeSupportModule.java
    ├── MissionEquipmentFactory.java      — Abstract Factory
    ├── MarsMissionFactory.java            — Concrete Factory
    ├── LunarMissionFactory.java           — Concrete Factory
    └── MissionControl.java               — Client
```

## Patterns

### Factory Method — Part A

`SpacecraftFactory` declares the `createSpacecraft()` factory method.

`SatelliteFactory` and `RoverFactory` override this method and create their own concrete spacecraft.

The client works with the `Spacecraft` interface instead of concrete classes.

### Abstract Factory — Part B

`MissionEquipmentFactory` creates a family of related products:

* `PropulsionSystem`
* `LifeSupportModule`

`MarsMissionFactory` creates Mars equipment, while `LunarMissionFactory` creates Lunar equipment.

`MissionControl` works only with interfaces and does not create concrete products directly.

## Build and Run

```bash
find src -name "*.java" > sources.txt
javac -d out @sources.txt
java -cp out spacemission.Main
```

## Clean Code

The project follows these Clean Code principles:

* Meaningful names
* Single Responsibility
* Small methods
* Programming to interfaces
* No magic numbers or strings

More details are available in `CLEAN_CODE.md`.

