plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.hedera.hashgraph:sdk:2.29.2")
    implementation("io.grpc:grpc-netty-shaded:1.57.2")
    implementation("org.slf4j:slf4j-nop:2.0.9")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
