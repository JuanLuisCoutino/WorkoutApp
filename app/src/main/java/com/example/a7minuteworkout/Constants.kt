package com.example.a7minuteworkout

object Constants {

    fun defaultExerciseList(): ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            1, "Jumping Jacks", R.drawable.ic_jumping_jacks, false, false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel( 2, "Wall Sit", R.drawable.ic_wall_sit, false, false)
        exerciseList.add(wallSit)

        val abdominalCrunch = ExerciseModel( 3, "Abdominal Crunch", R.drawable.ic_abdominal_crunch, false, false)
        exerciseList.add(abdominalCrunch)

        val highKneesRunningInPlace = ExerciseModel( 4, "High Knees Running in Place", R.drawable.ic_high_knees_running_in_place, false, false)
        exerciseList.add(highKneesRunningInPlace)

        val lunges = ExerciseModel( 5, "Lunges", R.drawable.ic_lunge, false, false)
        exerciseList.add(lunges)

        val planks = ExerciseModel( 6, "Planks", R.drawable.ic_plank, false, false)
        exerciseList.add(planks)

        val pushUp = ExerciseModel( 7, "Planks", R.drawable.ic_push_up, false, false)
        exerciseList.add(pushUp)

        val pushUpAndRotation = ExerciseModel( 8, "Push Up and Rotation", R.drawable.ic_push_up_and_rotation, false, false)
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel( 9, "Side Plank", R.drawable.ic_side_plank, false, false)
        exerciseList.add(sidePlank)

        val squat = ExerciseModel( 10, "Squat", R.drawable.ic_squat, false, false)
        exerciseList.add(squat)

        val stepOnIntoChair = ExerciseModel( 11, "Step On Into Chair", R.drawable.ic_step_up_onto_chair, false, false)
        exerciseList.add(stepOnIntoChair)

        val tricepsDipOnChair = ExerciseModel( 12, "Triceps dips on Chair", R.drawable.ic_triceps_dip_on_chair, false, false)
        exerciseList.add(tricepsDipOnChair)







        return exerciseList
    }

}