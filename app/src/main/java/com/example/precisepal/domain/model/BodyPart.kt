package com.example.precisepal.domain.model

data class BodyPart(
    val name: String,
    val isActive: Boolean,
    val measuringUnit: String,
    val latestValue: Float? = null,
    val bodyPartId: String? = null
)

enum class MeasuringUnit(
    val code: String,
    val label: String
){
    INCHES("in", "Inches"),
    CENTIMETERS("cm", "Centimeters"),
    FEET("ft", "Feet"),
    PERCENTAGE("%", "Percentage"),
    KILOGRAMS("kg", "Kilograms"),
    POUNDS("lbs", "Pounds"),
    METERS("m", "Meters"),
    MILLIMETERS("mm", "Millimeters")
}

val predefinedBodyPart: List<BodyPart> = listOf(
    BodyPart(
        name = "Chest",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 40.5f,
        bodyPartId = "3"
    ),
    BodyPart(
        name = "Hips",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 95.0f,
        bodyPartId = "4"
    ),
    BodyPart(
        name = "Thigh",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 24.3f,
        bodyPartId = "5"
    ),
    BodyPart(
        name = "Biceps",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 13.5f,
        bodyPartId = "6"
    ),
    BodyPart(
        name = "Neck",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 38.0f,
        bodyPartId = "7"
    ),
    BodyPart(
        name = "Forearm",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 10.5f,
        bodyPartId = "8"
    ),
    BodyPart(
        name = "Calf",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 38.5f,
        bodyPartId = "9"
    ),
    BodyPart(
        name = "Shoulder",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 45.0f,
        bodyPartId = "10"
    ),
    BodyPart(
        name = "Wrist",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 16.0f,
        bodyPartId = "11"
    ),
    BodyPart(
        name = "Ankle",
        isActive = false,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = null,
        bodyPartId = "12"
    ),
    BodyPart(
        name = "Upper Arm",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 12.0f,
        bodyPartId = "13"
    ),
    BodyPart(
        name = "Torso",
        isActive = true,
        measuringUnit = MeasuringUnit.FEET.code,
        latestValue = 5.0f,
        bodyPartId = "14"
    ),
    BodyPart(
        name = "Abdomen",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 34.0f,
        bodyPartId = "15"
    ),
    BodyPart(
        name = "Quads",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 54.0f,
        bodyPartId = "16"
    ),
    BodyPart(
        name = "Hamstring",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 18.0f,
        bodyPartId = "17"
    ),
    BodyPart(
        name = "Lower Back",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 32.5f,
        bodyPartId = "18"
    ),
    BodyPart(
        name = "Upper Back",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 38.0f,
        bodyPartId = "19"
    ),
    BodyPart(
        name = "Triceps",
        isActive = true,
        measuringUnit = MeasuringUnit.INCHES.code,
        latestValue = 12.5f,
        bodyPartId = "20"
    ),
    BodyPart(
        name = "Obliques",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 88.0f,
        bodyPartId = "21"
    ),
    BodyPart(
        name = "Glutes",
        isActive = true,
        measuringUnit = MeasuringUnit.CENTIMETERS.code,
        latestValue = 100.0f,
        bodyPartId = "22"
    )
)