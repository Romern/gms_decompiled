package com.google.android.chimera;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CursorLoaderProxy extends C1134ki implements deb {

    /* renamed from: c */
    private final CursorLoader f7619c;

    public CursorLoaderProxy(CursorLoader cursorLoader, Context context) {
        super(context);
        this.f7619c = cursorLoader;
    }

    public void abandon() {
        this.f7619c.abandon();
    }

    public boolean cancelLoad() {
        return this.f7619c.cancelLoad();
    }

    public void cancelLoadInBackground() {
        this.f7619c.cancelLoadInBackground();
    }

    public void commitContentChanged() {
        this.f7619c.commitContentChanged();
    }

    public String dataToString(Cursor cursor) {
        return this.f7619c.dataToString(cursor);
    }

    public void deliverCancellation() {
        this.f7619c.deliverCancellation();
    }

    public void deliverResult(Cursor cursor) {
        this.f7619c.deliverResult(cursor);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7619c.dump(str, fileDescriptor, printWriter, strArr);
    }

    public void forceLoad() {
        this.f7619c.forceLoad();
    }

    public Context getContext() {
        return this.f7619c.getContext();
    }

    public Loader getModuleLoader() {
        return this.f7619c;
    }

    public boolean isAbandoned() {
        return this.f7619c.isAbandoned();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.f7619c.isLoadInBackgroundCanceled();
    }

    public boolean isReset() {
        return this.f7619c.isReset();
    }

    public boolean isStarted() {
        return this.f7619c.isStarted();
    }

    public Cursor loadInBackground() {
        return this.f7619c.loadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
        this.f7619c.onAbandon();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return this.f7619c.onCancelLoad();
    }

    public void onCanceled(Cursor cursor) {
        this.f7619c.onCanceled(cursor);
    }

    public void onContentChanged() {
        this.f7619c.onContentChanged();
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        this.f7619c.onForceLoad();
    }

    /* access modifiers changed from: protected */
    public Cursor onLoadInBackground() {
        return (Cursor) this.f7619c.onLoadInBackground();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        this.f7619c.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        this.f7619c.onStartLoading();
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        this.f7619c.onStopLoading();
    }

    public void reset() {
        this.f7619c.reset();
    }

    public void rollbackContentChanged() {
        this.f7619c.rollbackContentChanged();
    }

    public void stopLoading() {
        this.f7619c.stopLoading();
    }

    public void superAbandon() {
        super.abandon();
    }

    public boolean superCancelLoad() {
        return super.cancelLoad();
    }

    public void superCancelLoadInBackground() {
        super.cancelLoadInBackground();
    }

    public void superCommitContentChanged() {
        super.commitContentChanged();
    }

    public String superDataToString(Cursor cursor) {
        return super.dataToString((Object) cursor);
    }

    public void superDeliverCancellation() {
        super.deliverCancellation();
    }

    public void superDeliverResult(Cursor cursor) {
        super.deliverResult(cursor);
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

    public String[] superGetProjection() {
        return super.getProjection();
    }

    public String superGetSelection() {
        return super.getSelection();
    }

    public String[] superGetSelectionArgs() {
        return super.getSelectionArgs();
    }

    public String superGetSortOrder() {
        return super.getSortOrder();
    }

    public Uri superGetUri() {
        return super.getUri();
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

    public Cursor superLoadInBackground() {
        return super.loadInBackground();
    }

    public void superOnAbandon() {
    }

    public boolean superOnCancelLoad() {
        return super.onCancelLoad();
    }

    public void superOnCanceled(Cursor cursor) {
        super.onCanceled(cursor);
    }

    public void superOnContentChanged() {
        super.onContentChanged();
    }

    public void superOnForceLoad() {
        super.onForceLoad();
    }

    public Cursor superOnLoadInBackground() {
        return (Cursor) super.onLoadInBackground();
    }

    public void superOnReset() {
        super.onReset();
    }

    public void superOnStartLoading() {
        super.onStartLoading();
    }

    public void superOnStopLoading() {
        super.onStopLoading();
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

    public void superSetProjection(String[] strArr) {
        super.setProjection(strArr);
    }

    public void superSetSelection(String str) {
        super.setSelection(str);
    }

    public void superSetSelectionArgs(String[] strArr) {
        super.setSelectionArgs(strArr);
    }

    public void superSetSortOrder(String str) {
        super.setSortOrder(str);
    }

    public void superSetUpdateThrottle(long j) {
        super.setUpdateThrottle(j);
    }

    public void superSetUri(Uri uri) {
        super.setUri(uri);
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

    public boolean takeContentChanged() {
        return this.f7619c.takeContentChanged();
    }

    public String toString() {
        return this.f7619c.toString();
    }

    public CursorLoaderProxy(CursorLoader cursorLoader, Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context, uri, strArr, str, strArr2, str2);
        this.f7619c = cursorLoader;
    }

    public /* bridge */ /* synthetic */ void deliverResult(Object obj) {
        deliverResult((Cursor) obj);
    }

    public /* bridge */ /* synthetic */ void onCanceled(Object obj) {
        onCanceled((Cursor) obj);
    }
}
