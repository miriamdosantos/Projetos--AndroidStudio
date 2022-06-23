package com.generation.todolist.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J*\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/generation/todolist/fragment/DatePickerFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "timerPickerListener", "Lcom/generation/todolist/fragment/TimePickerListener;", "(Lcom/generation/todolist/fragment/TimePickerListener;)V", "getTimerPickerListener", "()Lcom/generation/todolist/fragment/TimePickerListener;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "", "view", "Landroid/widget/DatePicker;", "year", "", "month", "dayOfMonth", "app_debug"})
public final class DatePickerFragment extends androidx.fragment.app.DialogFragment implements android.app.DatePickerDialog.OnDateSetListener {
    @org.jetbrains.annotations.NotNull()
    private final com.generation.todolist.fragment.TimePickerListener timerPickerListener = null;
    
    public DatePickerFragment(@org.jetbrains.annotations.NotNull()
    com.generation.todolist.fragment.TimePickerListener timerPickerListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.generation.todolist.fragment.TimePickerListener getTimerPickerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker view, int year, int month, int dayOfMonth) {
    }
}