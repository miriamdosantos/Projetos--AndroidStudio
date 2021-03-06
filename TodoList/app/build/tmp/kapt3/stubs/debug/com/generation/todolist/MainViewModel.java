package com.generation.todolist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001cJ\b\u0010\"\u001a\u00020\u001cH\u0002J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006$"}, d2 = {"Lcom/generation/todolist/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/generation/todolist/api/Repository;", "(Lcom/generation/todolist/api/Repository;)V", "_myCategoriaResponse", "Landroidx/lifecycle/MutableLiveData;", "Lretrofit2/Response;", "", "Lcom/generation/todolist/model/Categoria;", "_myTarefaResponse", "Lcom/generation/todolist/model/Tarefa;", "dataSelecionada", "Ljava/time/LocalDate;", "getDataSelecionada", "()Landroidx/lifecycle/MutableLiveData;", "myCategoriaResponse", "Landroidx/lifecycle/LiveData;", "getMyCategoriaResponse", "()Landroidx/lifecycle/LiveData;", "myTarefaResponse", "getMyTarefaResponse", "tarefaSelecionada", "getTarefaSelecionada", "()Lcom/generation/todolist/model/Tarefa;", "setTarefaSelecionada", "(Lcom/generation/todolist/model/Tarefa;)V", "addTarefa", "", "tarefa", "deleteTarefa", "id", "", "listCategoria", "listTarefa", "updateTarefa", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.generation.todolist.api.Repository repository = null;
    @org.jetbrains.annotations.Nullable()
    private com.generation.todolist.model.Tarefa tarefaSelecionada;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Categoria>>> _myCategoriaResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Categoria>>> myCategoriaResponse = null;
    private final androidx.lifecycle.MutableLiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Tarefa>>> _myTarefaResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Tarefa>>> myTarefaResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.time.LocalDate> dataSelecionada = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.api.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.generation.todolist.model.Tarefa getTarefaSelecionada() {
        return null;
    }
    
    public final void setTarefaSelecionada(@org.jetbrains.annotations.Nullable()
    com.generation.todolist.model.Tarefa p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Categoria>>> getMyCategoriaResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<retrofit2.Response<java.util.List<com.generation.todolist.model.Tarefa>>> getMyTarefaResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.time.LocalDate> getDataSelecionada() {
        return null;
    }
    
    public final void listCategoria() {
    }
    
    public final void addTarefa(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.model.Tarefa tarefa) {
    }
    
    private final void listTarefa() {
    }
    
    public final void updateTarefa(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.model.Tarefa tarefa) {
    }
    
    public final void deleteTarefa(long id) {
    }
}