plugins {
    id("earth.terrarium.cloche") version "0.8.20"
}

group = "org.example"
version = "1.0.0"

repositories {
    cloche {
        librariesMinecraft()
    }

    mavenCentral()

    cloche {
        main()

        mavenFabric()
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

        data()
        client()

        dependencies {
            fabricApi("0.115.2+1.21.1")
        }

        runs {
            server()
            client()
            data()
        }
    }
}
