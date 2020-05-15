package com.google.android.chimera;

import android.content.ComponentCallbacks;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PathPermission;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ContentProvider implements ComponentCallbacks, dix {

    /* renamed from: Di */
    private android.content.ContentProvider f7613Di;

    /* renamed from: Dj */
    private ProxyCallbacks f7614Dj;

    /* renamed from: c */
    private Context f7615c;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks {
        ContentProviderResult[] superApplyBatch(ArrayList arrayList);

        int superBulkInsert(Uri uri, ContentValues[] contentValuesArr);

        Bundle superCall(String str, String str2, Bundle bundle);

        Uri superCanonicalize(Uri uri);

        void superDump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        String[] superGetStreamTypes(Uri uri, String str);

        boolean superIsTemporary();

        void superOnConfigurationChanged(Configuration configuration);

        AssetFileDescriptor superOpenAssetFile(Uri uri, String str);

        AssetFileDescriptor superOpenAssetFile(Uri uri, String str, CancellationSignal cancellationSignal);

        ParcelFileDescriptor superOpenFile(Uri uri, String str);

        ParcelFileDescriptor superOpenFile(Uri uri, String str, CancellationSignal cancellationSignal);

        ParcelFileDescriptor superOpenFileHelper(Uri uri, String str);

        AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle);

        AssetFileDescriptor superOpenTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal);

        Cursor superQuery(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal);

        Cursor superQuery(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void superSetPathPermissions(PathPermission[] pathPermissionArr);

        void superSetReadPermission(String str);

        void superSetWritePermission(String str);

        void superShutdown();

        Uri superUncanonicalize(Uri uri);
    }

    public static ContentProvider getLocalContentProvider(ContentProviderClient contentProviderClient) {
        android.content.ContentProvider localContentProvider = contentProviderClient.getLocalContentProvider();
        if (localContentProvider instanceof dgb) {
            return ((dgb) localContentProvider).mo8921a();
        }
        return null;
    }

    public ContentProviderResult[] applyBatch(ArrayList arrayList) {
        return this.f7614Dj.superApplyBatch(arrayList);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (this.f7615c == null) {
            this.f7615c = context;
            onCreate();
        }
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return this.f7614Dj.superBulkInsert(uri, contentValuesArr);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        return this.f7614Dj.superCall(str, str2, bundle);
    }

    public Uri canonicalize(Uri uri) {
        return this.f7614Dj.superCanonicalize(uri);
    }

    public abstract int delete(Uri uri, String str, String[] strArr);

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7614Dj.superDump(fileDescriptor, printWriter, strArr);
    }

    public final String getCallingPackage() {
        return this.f7613Di.getCallingPackage();
    }

    public Object getChimeraImpl() {
        return this;
    }

    public android.content.ContentProvider getContainerContentProvider() {
        return this.f7613Di;
    }

    public final Context getContext() {
        return this.f7615c;
    }

    public final PathPermission[] getPathPermissions() {
        return this.f7613Di.getPathPermissions();
    }

    public final String getReadPermission() {
        return this.f7613Di.getReadPermission();
    }

    public String[] getStreamTypes(Uri uri, String str) {
        return this.f7614Dj.superGetStreamTypes(uri, str);
    }

    public abstract String getType(Uri uri);

    public final String getWritePermission() {
        return this.f7613Di.getWritePermission();
    }

    public abstract Uri insert(Uri uri, ContentValues contentValues);

    /* access modifiers changed from: protected */
    public boolean isTemporary() {
        return this.f7614Dj.superIsTemporary();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f7614Dj.superOnConfigurationChanged(configuration);
    }

    public abstract boolean onCreate();

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    public AssetFileDescriptor openAssetFile(Uri uri, String str) {
        return this.f7614Dj.superOpenAssetFile(uri, str);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return this.f7614Dj.superOpenFile(uri, str);
    }

    /* access modifiers changed from: protected */
    public final ParcelFileDescriptor openFileHelper(Uri uri, String str) {
        return this.f7614Dj.superOpenFileHelper(uri, str);
    }

    public ParcelFileDescriptor openPipeHelper(Uri uri, String str, Bundle bundle, Object obj, ContentProvider.PipeDataWriter pipeDataWriter) {
        return this.f7613Di.openPipeHelper(uri, str, bundle, obj, pipeDataWriter);
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle) {
        return this.f7614Dj.superOpenTypedAssetFile(uri, str, bundle);
    }

    public boolean publicIsTemporary() {
        return isTemporary();
    }

    public Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.f7614Dj.superQuery(uri, strArr, bundle, cancellationSignal);
    }

    public abstract Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* access modifiers changed from: protected */
    public final void setPathPermissions(PathPermission[] pathPermissionArr) {
        this.f7614Dj.superSetPathPermissions(pathPermissionArr);
    }

    public void setProxy(android.content.ContentProvider contentProvider) {
        this.f7613Di = contentProvider;
        this.f7614Dj = (ProxyCallbacks) contentProvider;
    }

    /* access modifiers changed from: protected */
    public final void setReadPermission(String str) {
        this.f7614Dj.superSetReadPermission(str);
    }

    /* access modifiers changed from: protected */
    public final void setWritePermission(String str) {
        this.f7614Dj.superSetWritePermission(str);
    }

    public void shutdown() {
        this.f7614Dj.superShutdown();
    }

    public Uri uncanonicalize(Uri uri) {
        return this.f7614Dj.superUncanonicalize(uri);
    }

    public abstract int update(Uri uri, ContentValues contentValues, String str, String[] strArr);

    public AssetFileDescriptor openAssetFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.f7614Dj.superOpenAssetFile(uri, str, cancellationSignal);
    }

    public ParcelFileDescriptor openFile(Uri uri, String str, CancellationSignal cancellationSignal) {
        return this.f7614Dj.superOpenFile(uri, str, cancellationSignal);
    }

    public AssetFileDescriptor openTypedAssetFile(Uri uri, String str, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.f7614Dj.superOpenTypedAssetFile(uri, str, bundle, cancellationSignal);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.f7614Dj.superQuery(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
