package com.example.todo.feature_todo.presentation.todo_list

import com.example.todo.feature_todo.domain.model.TodoItem
import com.example.todo.feature_todo.domain.util.TodoItemOrder

data class TodoListState(
    val todoItems: List<TodoItem> = emptyList(),
    val todoItemOrder: TodoItemOrder,
    val isLoading: Boolean = true,
    val error: String? = null
)
