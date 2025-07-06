plugins {
    id("earth.terrarium.cloche") version "0.10.21"
}

repositories {
    cloche.librariesMinecraft()

    mavenCentral()

    cloche {
        main()

        mavenFabric()
        mavenNeoforgedMeta()
        mavenNeoforged()
    }
}

cloche {
    minecraftVersion = "1.21.1"

    metadata {
        modId = "example"
        name = "Example Mod"
        license = "ARR"
        description = "Hello!"
    }

    neoforge {
        loaderVersion = "21.1.135"

        data()

        runs {
            server()
            client()
            data()
        }
    }

    fabric {
        loaderVersion = "0.16.10"

        metadata {
            entrypoint("main", "org.example.fabric.FabricExampleMod::initialize")
        }

        data()
        client()

        dependencies {
            fabricApi("0.115.2")
        }

        runs {
            server()
            client()
            data()
        }
    }
}
