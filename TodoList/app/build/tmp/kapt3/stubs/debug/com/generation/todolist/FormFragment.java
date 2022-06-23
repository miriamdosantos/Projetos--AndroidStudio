package com.generation.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u00112\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/generation/todolist/FormFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/generation/todolist/fragment/TimePickerListener;", "()V", "binding", "Lcom/generation/todolist/databinding/FragmentFormBinding;", "categoriaSelecionada", "", "mainViewModel", "Lcom/generation/todolist/MainViewModel;", "getMainViewModel", "()Lcom/generation/todolist/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "tarefaSelecionada", "Lcom/generation/todolist/model/Tarefa;", "carregarDados", "", "inserirNoBanco", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSelectd", "date", "Ljava/time/LocalDate;", "spinnerCategoria", "listCategoria", "", "Lcom/generation/todolist/model/Categoria;", "validarCampos", "", "nomeTarefa", "", "descri\u00e7\u00e3oTarefa", "responsavel", "app_debug"})
public final class FormFragment extends androidx.fragment.app.Fragment implements com.generation.todolist.fragment.TimePickerListener {
    private com.generation.todolist.databinding.FragmentFormBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private long categoriaSelecionada = 0L;
    private com.generation.todolist.model.Tarefa tarefaSelecionada;
    
    public FormFragment() {
        super();
    }
    
    private final com.generation.todolist.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void spinnerCategoria(java.util.List<com.generation.todolist.model.Categoria> listCategoria) {
    }
    
    private final boolean validarCampos(java.lang.String nomeTarefa, java.lang.String descriçãoTarefa, java.lang.String responsavel) {
        return false;
    }
    
    private final void inserirNoBanco() {
    }
    
    @java.lang.Override()
    public void onDateSelectd(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
    }
    
    private final void carregarDados() {
    }
}