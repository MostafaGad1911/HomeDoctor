package homedoctor.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0013B \b\u0016\u0012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\u001f\u0010\u0011\u001a\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005J\u001f\u0010\u0012\u001a\u00020\u00042\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\b\u0005R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lhomedoctor/models/DialogBuilder;", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "()V", "imageHolder", "Ljava/io/File;", "messageHolder", "Lhomedoctor/models/DialogBuilder$TextView;", "titleHolder", "build", "Lhomedoctor/models/Dialog;", "image", "Lkotlin/Function0;", "message", "title", "TextView", "app_debug"})
public final class DialogBuilder {
    private homedoctor.models.DialogBuilder.TextView titleHolder;
    private homedoctor.models.DialogBuilder.TextView messageHolder;
    private java.io.File imageHolder;
    
    public final void title(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super homedoctor.models.DialogBuilder.TextView, kotlin.Unit> init) {
    }
    
    public final void message(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super homedoctor.models.DialogBuilder.TextView, kotlin.Unit> init) {
    }
    
    public final void image(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends java.io.File> init) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final homedoctor.models.Dialog build() {
        return null;
    }
    
    public DialogBuilder() {
        super();
    }
    
    public DialogBuilder(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super homedoctor.models.DialogBuilder, kotlin.Unit> init) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lhomedoctor/models/DialogBuilder$TextView;", "", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "text", "getText", "setText", "app_debug"})
    public static final class TextView {
        @org.jetbrains.annotations.NotNull()
        private java.lang.String text;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String color;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getText() {
            return null;
        }
        
        public final void setText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getColor() {
            return null;
        }
        
        public final void setColor(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public TextView() {
            super();
        }
    }
}