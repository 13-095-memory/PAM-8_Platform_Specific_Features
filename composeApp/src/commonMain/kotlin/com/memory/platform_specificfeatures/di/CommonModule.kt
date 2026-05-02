package com.memory.platform_specificfeatures.di

import com.memory.platform_specificfeatures.data.repository.NoteRepository
import com.memory.platform_specificfeatures.data.repository.SettingsRepository
import com.memory.platform_specificfeatures.presentation.NotesViewModel
import com.memory.platform_specificfeatures.presentation.SettingsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val commonModule = module {
    // Repositories
    single { NoteRepository() }
    single { SettingsRepository() }

    // ViewModels
    viewModelOf(::NotesViewModel)
    viewModelOf(::SettingsViewModel)
}