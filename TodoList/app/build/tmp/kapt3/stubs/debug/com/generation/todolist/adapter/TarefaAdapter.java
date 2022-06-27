package com.generation.todolist.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0014\u0010!\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\'"}, d2 = {"Lcom/generation/todolist/adapter/TarefaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/generation/todolist/adapter/TarefaAdapter$TarefaViewHolder;", "taskClickListener", "Lcom/generation/todolist/adapter/TaskClickListener;", "context", "Landroid/content/Context;", "mainViewModel", "Lcom/generation/todolist/MainViewModel;", "(Lcom/generation/todolist/adapter/TaskClickListener;Landroid/content/Context;Lcom/generation/todolist/MainViewModel;)V", "getContext", "()Landroid/content/Context;", "listTarefa", "", "Lcom/generation/todolist/model/Tarefa;", "getListTarefa", "()Ljava/util/List;", "setListTarefa", "(Ljava/util/List;)V", "getMainViewModel", "()Lcom/generation/todolist/MainViewModel;", "getTaskClickListener", "()Lcom/generation/todolist/adapter/TaskClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setList", "list", "showAlertDialog", "id", "", "TarefaViewHolder", "app_debug"})
public final class TarefaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.generation.todolist.adapter.TarefaAdapter.TarefaViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.generation.todolist.adapter.TaskClickListener taskClickListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.generation.todolist.MainViewModel mainViewModel = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.generation.todolist.model.Tarefa> listTarefa;
    
    public TarefaAdapter(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.adapter.TaskClickListener taskClickListener, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.generation.todolist.MainViewModel mainViewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generation.todolist.adapter.TaskClickListener getTaskClickListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generation.todolist.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.generation.todolist.model.Tarefa> getListTarefa() {
        return null;
    }
    
    public final void setListTarefa(@org.jetbrains.annotations.NotNull()
    java.util.List<com.generation.todolist.model.Tarefa> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.generation.todolist.adapter.TarefaAdapter.TarefaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.adapter.TarefaAdapter.TarefaViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.generation.todolist.model.Tarefa> list) {
    }
    
    private final void showAlertDialog(long id) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/generation/todolist/adapter/TarefaAdapter$TarefaViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/generation/todolist/databinding/CardLayoutBinding;", "(Lcom/generation/todolist/databinding/CardLayoutBinding;)V", "getBinding", "()Lcom/generation/todolist/databinding/CardLayoutBinding;", "app_debug"})
    public static final class TarefaViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.generation.todolist.databinding.CardLayoutBinding binding = null;
        
        public TarefaViewHolder(@org.jetbrains.annotations.NotNull()
        com.generation.todolist.databinding.CardLayoutBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.generation.todolist.databinding.CardLayoutBinding getBinding() {
            return null;
        }
    }
}