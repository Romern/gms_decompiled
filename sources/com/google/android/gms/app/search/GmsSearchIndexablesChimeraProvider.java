package com.google.android.gms.app.search;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.ContentProvider;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsSearchIndexablesChimeraProvider extends ContentProvider {

    /* renamed from: a */
    final fpo f9501a = new fpo();

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f9501a.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f9501a.delete(uri, str, strArr);
    }

    public final String getType(Uri uri) {
        return this.f9501a.getType(uri);
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return this.f9501a.insert(uri, contentValues);
    }

    public final boolean onCreate() {
        this.f9501a.onCreate();
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f9501a.query(uri, strArr, str, strArr2, str2);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f9501a.update(uri, contentValues, str, strArr);
    }
}
