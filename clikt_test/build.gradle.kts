plugins {
    kotlin("multiplatform") version "1.7.20" // 적절한 Kotlin 버전을 사용하세요
}

kotlin {
    linuxX64("native") {
        binaries {
            executable {
                // 실행 파일의 이름을 설정합니다.
                baseName = "myExecutable"
            }
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    // 필요한 의존성을 추가합니다.
}
