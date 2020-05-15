package com.google.android.chimera;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CursorLoader extends AsyncTaskLoader {
    public CursorLoader(Context context) {
        super(context);
        setProxy(new CursorLoaderProxy(this, context));
    }

    public String[] getProjection() {
        return getProxyCallbacks().superGetProjection();
    }

    /* access modifiers changed from: protected */
    /* renamed from: getProxyCallbacks$ar$class_merging */
    public CursorLoaderProxy getProxyCallbacks() {
        return (CursorLoaderProxy) this.proxyCallbacks;
    }

    public String getSelection() {
        return getProxyCallbacks().superGetSelection();
    }

    public String[] getSelectionArgs() {
        return getProxyCallbacks().superGetSelectionArgs();
    }

    public String getSortOrder() {
        return getProxyCallbacks().superGetSortOrder();
    }

    public Uri getUri() {
        return getProxyCallbacks().superGetUri();
    }

    public Cursor loadInBackground() {
        return getProxyCallbacks().superLoadInBackground();
    }

    public void setProjection(String[] strArr) {
        getProxyCallbacks().superSetProjection(strArr);
    }

    public void setSelection(String str) {
        getProxyCallbacks().superSetSelection(str);
    }

    public void setSelectionArgs(String[] strArr) {
        getProxyCallbacks().superSetSelectionArgs(strArr);
    }

    public void setSortOrder(String str) {
        getProxyCallbacks().superSetSortOrder(str);
    }

    public void setUri(Uri uri) {
        getProxyCallbacks().superSetUri(uri);
    }

    public CursorLoader(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        setProxy(new CursorLoaderProxy(this, context, uri, strArr, str, strArr2, str2));
    }

    public C1134ki getContainerLoader() {
        return (C1134ki) this.proxy;
    }
}
