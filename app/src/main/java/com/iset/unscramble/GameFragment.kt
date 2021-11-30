package com.iset.unscramble

import com.iset.unscramble.ui.game.GameViewModel
import kotlin.properties.ReadOnlyProperty

private val viewModel: GameViewModel by viewModels()

fun viewModels(): ReadOnlyProperty<Nothing?, GameViewModel> {

}

class GameFragment {
 
}