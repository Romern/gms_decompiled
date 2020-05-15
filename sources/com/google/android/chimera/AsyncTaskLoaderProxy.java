package com.google.android.chimera;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AsyncTaskLoaderProxy extends C1132kg implements deb {

    /* renamed from: c */
    private final AsyncTaskLoader f7607c;

    public AsyncTaskLoaderProxy(AsyncTaskLoader asyncTaskLoader, Context context) {
        super(context);
        this.f7607c = asyncTaskLoader;
    }

    public void abandon() {
        this.f7607c.abandon();
    }

    public boolean cancelLoad() {
        return this.f7607c.cancelLoad();
    }

    public void cancelLoadInBackground() {
        this.f7607c.cancelLoadInBackground();
    }

    public void commitContentChanged() {
        this.f7607c.commitContentChanged();
    }

    public String dataToString(Object obj) {
        return this.f7607c.dataToString(obj);
    }

    public void deliverCancellation() {
        this.f7607c.deliverCancellation();
    }

    public void deliverResult(Object obj) {
        this.f7607c.deliverResult(obj);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7607c.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.f7607c.forceLoad();
    }

    public Loader getModuleLoader() {
        return this.f7607c;
    }

    public boolean isAbandoned() {
        return this.f7607c.isAbandoned();
    }

    public boolean isStarted() {
        return this.f7607c.isStarted();
    }

    public Object loadInBackground() {
        return this.f7607c.loadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.f7607c.onAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.f7607c.onCancelLoad();
    }

    public void onCanceled(Object obj) {
        this.f7607c.onCanceled(obj);
    }

    public void onContentChanged() {
        this.f7607c.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.f7607c.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public Object onLoadInBackground() {
        return this.f7607c.onLoadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.f7607c.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.f7607c.onStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.f7607c.onStopLoading();
    }

    public void reset() {
        this.f7607c.reset();
    }

    public void rollbackContentChanged() {
        this.f7607c.rollbackContentChanged();
    }

    public void stopLoading() {
        this.f7607c.stopLoading();
    }

    public void superAbandon() {
        super.abandon();
    }

    public boolean superCancelLoad() {
        return super.cancelLoad();
    }

    public void superCancelLoadInBackground() {
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

    public boolean superIsLoadInBackgroundCanceled() {
        return super.isLoadInBackgroundCanceled();
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

    public void superOnCanceled(Object obj) {
    }

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
        super.onForceLoad();
    }

    public Object superOnLoadInBackground() {
        return super.onLoadInBackground();
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

    public void superSetUpdateThrottle(long j) {
        super.setUpdateThrottle(j);
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
        return this.f7607c.toString();
    }
}
