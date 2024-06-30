package com.example.composecodelabs.satats.components

/**
 * What you'll learn
 * How to think about state and events in a Jetpack Compose UI.
 * How Compose uses state to determine which elements to display on the screen.
 * What state hoisting is.
 * How stateful and stateless composable functions work.
 * How Compose automatically tracks state with the State<T> API.
 * How memory and internal state work in a composable function: using the remember and rememberSaveable APIs.
 * How to work with lists and state: using the mutableStateListOf and toMutableStateList APIs.
 * How to use ViewModel with Compose.
 *
 * ###################################
 *
 * The app has two main functionalities:
 *
 * A water counter to track your water intake.
 * A list of wellness tasks to do throughout the day.
 *
 * -The Composition: a description of the UI built by Jetpack Compose when it executes composables.
 * -Initial composition: creation of a Composition by running composables the first time.
 * -Recomposition: re-running composables to update the Composition when data changes.
 * -MutableState types to make state observable by Compose.


 * -remember stores objects in the Composition, and forgets the object if the source location where remember is called is not invoked again during a recomposition.
 * -While remember helps you retain state across recompositions,
    it's not retained across configuration changes. For this, you must use rememberSaveable instead of remember.

 * -rememberSaveable automatically saves any value that can be saved in a Bundle. For other values, you can pass in a custom saver object.
   For more information on Restoring state in Compose, check out the documentation.

 * ------------------------------------------------------State Hoisting------------------------------------------------------
 *- composables with internal state tend to be less reusable and harder to test.
 *- Composables that don't hold any state are called stateless composables. An easy way to create a stateless composable is by using state hoisting.
 *- State hoisting in Compose is a pattern of moving state to a composable's caller to make a composable stateless.
    The general pattern for state hoisting in Jetpack Compose is to replace the state variable with two parameters:
    1- value: T - the current value to display
    2- onValueChange: (T) -> Unit - an event that requests the value to change with a new value T

 *-Key Point: When hoisting state, there are three rules to help you figure out where state should go:
    - State should be hoisted to at least the lowest common parent of all composables that use the state (read).
    - State should be hoisted to at least the highest level it may be changed (write).
    - If two states change in response to the same events they should be hoisted to the same level.
    - You can hoist the state higher than these rules require, but if you don't hoist the state high enough, it might be difficult or impossible to follow unidirectional data flow.
 */

//todo :Note-> Use rememberSaveable to restore your UI state after an Activity is recreated. Besides retaining state across recompositions,
// rememberSaveable also retains state across Activity recreation and system-initiated process death.