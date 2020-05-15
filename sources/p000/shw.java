package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.android.volley.Cache;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.android.gms.common.server.NetworkCallbacks;

/* renamed from: shw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shw extends Request implements NetworkCallbacks {

    /* renamed from: d */
    private final Context f44507d;

    /* renamed from: e */
    private final Uri f44508e;

    /* renamed from: f */
    private final Response.Listener f44509f;

    /* renamed from: g */
    private final boolean f44510g;

    /* renamed from: h */
    private final int f44511h;

    /* renamed from: i */
    private final int f44512i;

    public shw(Context context, Uri uri, String str, boolean z, Response.Listener listener, Response.ErrorListener errorListener, int i, int i2) {
        super(str, errorListener);
        this.f44507d = context;
        this.f44508e = uri;
        this.f44509f = listener;
        this.f44510g = z;
        this.f44511h = i;
        this.f44512i = i2;
    }

    public final /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        this.f44509f.onResponse((byte[]) obj);
    }

    public final Request.Priority getPriority() {
        return Request.Priority.LOW;
    }

    public final void onPostNetworkDispatch() {
        shr.m35312a();
    }

    public final void onPreNetworkDispatch() {
        shr.m35313a(this.f44511h, this.f44512i);
    }

    /* access modifiers changed from: protected */
    public final Response parseNetworkResponse(NetworkResponse networkResponse) {
        Cache.Entry entry = null;
        if (this.f44508e != null) {
            ContentResolver contentResolver = this.f44507d.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", getUrl());
            contentValues.put("image_data", networkResponse.data);
            contentResolver.insert(this.f44508e, contentValues);
            return Response.success(networkResponse.data, null);
        }
        byte[] bArr = networkResponse.data;
        if (this.f44510g) {
            entry = HttpHeaderParser.parseCacheHeaders(networkResponse);
        }
        return Response.success(bArr, entry);
    }
}
