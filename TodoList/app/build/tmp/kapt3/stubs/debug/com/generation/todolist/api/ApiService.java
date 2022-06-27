package com.generation.todolist.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/generation/todolist/api/ApiService;", "", "addTarefa", "Lretrofit2/Response;", "Lcom/generation/todolist/model/Tarefa;", "tarefa", "(Lcom/generation/todolist/model/Tarefa;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTarefa", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listCategoria", "", "Lcom/generation/todolist/model/Categoria;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listTarefa", "updateTarefa", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "categoria")
    public abstract java.lang.Object listCategoria(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.generation.todolist.model.Categoria>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "tarefa")
    public abstract java.lang.Object addTarefa(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.generation.todolist.model.Tarefa tarefa, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.generation.todolist.model.Tarefa>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "tarefa")
    public abstract java.lang.Object listTarefa(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.generation.todolist.model.Tarefa>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.PUT(value = "tarefa")
    public abstract java.lang.Object updateTarefa(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.generation.todolist.model.Tarefa tarefa, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.generation.todolist.model.Tarefa>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "tarefa/{id}")
    public abstract java.lang.Object deleteTarefa(@retrofit2.http.Path(value = "id")
    long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.generation.todolist.model.Tarefa>> continuation);
}