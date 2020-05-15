package com.google.android.chimera;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LoaderProxy extends C1140ko implements deo {

    /* renamed from: a */
    private final Loader f7647a;

    public LoaderProxy(Loader loader, Context context) {
        super(context);
        this.f7647a = loader;
    }

    public void abandon() {
        this.f7647a.abandon();
    }

    public boolean cancelLoad() {
        return this.f7647a.cancelLoad();
    }

    public String dataToString(Object obj) {
        return this.f7647a.dataToString(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7647a.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.f7647a.forceLoad();
    }

    public Loader getModuleLoader() {
        return this.f7647a;
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.f7647a.onAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.f7647a.onCancelLoad();
    }

    public void onContentChanged() {
        this.f7647a.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.f7647a.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.f7647a.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.f7647a.onStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.f7647a.onStopLoading();
    }

    public void reset() {
        this.f7647a.reset();
    }

    public void stopLoading() {
        this.f7647a.stopLoading();
    }

    public void superAbandon() {
        super.abandon();
    }

    public boolean superCancelLoad() {
        return super.cancelLoad();
    }

    public void superCommitContentChanged() {
        super.commitContentChanged();
    }

    public String superDataToString(Object obj) {
        return super.dataToString(obj);
    }

    public void superDeliverCancellation() {
        super.deliverCancellation();
    }

    public void superDeliverResult(Object obj) {
        super.deliverResult(obj);
    }

    public void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void superForceLoad() {
        super.forceLoad();
    }

    public Context superGetContext() {
        return super.getContext();
    }

    public int superGetId() {
        return super.getId();
    }

    public boolean superIsAbandoned() {
        return super.isAbandoned();
    }

    public boolean superIsReset() {
        return super.isReset();
    }

    public boolean superIsStarted() {
        return super.isStarted();
    }

    public void superOnAbandon() {
    }

    public boolean superOnCancelLoad() {
        return super.onCancelLoad();
    }

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
    }

    public void superOnReset() {
    }

    public void superOnStartLoading() {
    }

    public void superOnStopLoading() {
    }

    public void superRegisterListener(int i, C1139kn knVar) {
        super.registerListener(i, knVar);
    }

    public void superRegisterOnLoadCanceledListener(C1138km kmVar) {
        super.registerOnLoadCanceledListener(kmVar);
    }

    public void superReset() {
        super.reset();
    }

    public void superRollbackContentChanged() {
        super.rollbackContentChanged();
    }

    public void superStopLoading() {
        super.stopLoading();
    }

    public boolean superTakeContentChanged() {
        return super.takeContentChanged();
    }

    public String superToString() {
        return super.toString();
    }

    public void superUnregisterListener(C1139kn knVar) {
        super.unregisterListener(knVar);
    }

    public void superUnregisterOnLoadCanceledListener(C1138km kmVar) {
        super.unregisterOnLoadCanceledListener(kmVar);
    }

    public String toString() {
        return this.f7647a.toString();
    }
}
