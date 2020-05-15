package com.google.android.chimera;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import com.google.android.chimera.ContentProvider;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.Collection;
import java.util.Set;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class SliceProvider extends ContentProvider {

    /* renamed from: a */
    private android.app.slice.SliceProvider f7665a;

    /* renamed from: b */
    private ProxyCallbacks f7666b;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface ProxyCallbacks extends ContentProvider.ProxyCallbacks {
        Slice superOnBindSlice(Uri uri, Set set);

        PendingIntent superOnCreatePermissionRequest(Uri uri);

        Collection superOnGetSliceDescendants(Uri uri);

        Uri superOnMapIntentToUri(Intent intent);

        void superOnSlicePinned(Uri uri);

        void superOnSliceUnpinned(Uri uri);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        return this.f7666b.superCall(str, str2, bundle);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f7665a.delete(uri, str, strArr);
    }

    public final String getType(Uri uri) {
        return this.f7665a.getType(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return this.f7665a.insert(uri, contentValues);
    }

    public Slice onBindSlice(Uri uri, Set set) {
        return this.f7666b.superOnBindSlice(uri, set);
    }

    public PendingIntent onCreatePermissionRequest(Uri uri) {
        return this.f7666b.superOnCreatePermissionRequest(uri);
    }

    public Collection onGetSliceDescendants(Uri uri) {
        return this.f7666b.superOnGetSliceDescendants(uri);
    }

    public Uri onMapIntentToUri(Intent intent) {
        return this.f7666b.superOnMapIntentToUri(intent);
    }

    public void onSlicePinned(Uri uri) {
        this.f7666b.superOnSlicePinned(uri);
    }

    public void onSliceUnpinned(Uri uri) {
        this.f7666b.superOnSliceUnpinned(uri);
    }

    public final Cursor query(Uri uri, String[] strArr, Bundle bundle, CancellationSignal cancellationSignal) {
        return this.f7665a.query(uri, strArr, bundle, cancellationSignal);
    }

    public void setProxy(android.content.ContentProvider contentProvider) {
        this.f7665a = (android.app.slice.SliceProvider) contentProvider;
        this.f7666b = (ProxyCallbacks) contentProvider;
        super.setProxy(contentProvider);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f7665a.update(uri, contentValues, str, strArr);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f7665a.query(uri, strArr, str, strArr2, str2);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        return this.f7665a.query(uri, strArr, str, strArr2, str2, cancellationSignal);
    }
}
