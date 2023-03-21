package com.google.samples.apps.sunflower.plantdetail

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.samples.apps.sunflower.data.Plant

@Composable
fun PlantDetailContent(plant: Plant) {
    Surface {
        Column {
            PlantDetailTitle(plantName = plant.name)
            PlantWatering(wateringInterval = 7)
            PlantDetailDescription(description = plant.description)
        }
    }
}

@Preview
@Composable
fun PreviewPlantDetailContent() {
    PlantDetailContent(plant = Plant(
        "Dummy ID",
        "Name",
        "Description",
        4,
        8,
    ))
}