package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import java.io.FileNotFoundException;

/* renamed from: ryz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryz {

    /* renamed from: a */
    private static final String[] f43871a = {"url", "local"};

    /* renamed from: c */
    private static ryz f43872c;

    /* renamed from: b */
    private final shj f43873b;

    private ryz(Context context) {
        this.f43873b = shj.m35270a(context.getApplicationContext());
    }

    /* renamed from: a */
    public static synchronized ryz m34694a(Context context, int i) {
        ryz ryz;
        synchronized (ryz.class) {
            if (f43872c == null) {
                f43872c = new ryz(context);
            }
            f43872c.f43873b.f44447g = i;
            ryz = f43872c;
        }
        return ryz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(com.android.volley.Request, boolean, java.lang.String):void
     arg types: [shw, int, ?[OBJECT, ARRAY]]
     candidates:
      shj.a(android.content.Context, android.net.Uri, java.lang.String):byte[]
      shj.a(com.android.volley.Request, boolean, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener
     arg types: [java.lang.String, com.android.volley.toolbox.RequestFuture]
     candidates:
      shj.a(java.lang.String, com.android.volley.Response$Listener):com.android.volley.Response$Listener
      shj.a(android.content.Context, java.lang.String):byte[]
      sgv.a(int, java.util.Map):int
      sgv.a(java.lang.String, java.lang.String):java.lang.String
      sgv.a(android.content.Context, com.google.android.gms.common.internal.ClientContext):java.util.HashMap
      sgv.a(com.android.volley.Request, java.lang.String):void
      sgv.a(java.util.concurrent.ExecutionException, java.lang.String):void
      shj.a(java.lang.String, com.android.volley.Response$ErrorListener):com.android.volley.Response$ErrorListener */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de A[RETURN] */
    /* renamed from: a */
    public final AssetFileDescriptor mo25259a(Context context, Uri uri) {
        Pair pair;
        byte[] bArr;
        String str;
        Uri uri2 = uri;
        int i = 1;
        if (!"android.resource".equals(uri.getScheme())) {
            Cursor query = context.getContentResolver().query(uri, f43871a, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(0);
                        i = query.getInt(1);
                        query.close();
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("No image store record found for image ID ");
            sb.append(valueOf);
            Log.w("ImageBroker", sb.toString());
            if (query != null) {
                query.close();
                pair = null;
            } else {
                pair = null;
            }
            if (pair != null) {
                int intValue = ((Integer) pair.first).intValue();
                String str2 = (String) pair.second;
                if (intValue != 0) {
                    if (intValue == 2) {
                        if (str2 != null) {
                            shj shj = this.f43873b;
                            RequestFuture newFuture = RequestFuture.newFuture();
                            shj.mo25538a((Request) new shw(context, uri, str2, false, shj.mo25534a(str2, (Response.Listener) newFuture), shj.mo25533a(str2, (Response.ErrorListener) newFuture), shj.f44447g, shj.f44448h), false, (String) null);
                        }
                    }
                } else if (str2 != null) {
                    try {
                        try {
                            bArr = this.f43873b.mo25542a(context, uri2, str2);
                        } catch (VolleyError e) {
                            Log.w("ImageBroker", str2.length() != 0 ? new String("Error retrieving image at URL ") : "Error retrieving image at URL ".concat(str2));
                            bArr = null;
                            if (bArr == null) {
                            }
                            return context.getContentResolver().openAssetFileDescriptor(uri2, "r");
                        }
                    } catch (VolleyError e2) {
                        Log.w("ImageBroker", str2.length() != 0 ? new String("Error retrieving image at URL ") : "Error retrieving image at URL ".concat(str2));
                        bArr = null;
                        if (bArr == null) {
                        }
                        return context.getContentResolver().openAssetFileDescriptor(uri2, "r");
                    }
                    if (bArr == null) {
                        return null;
                    }
                } else {
                    String valueOf2 = String.valueOf(uri);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 62);
                    sb2.append("No local image data and no external image URL found for image ");
                    sb2.append(valueOf2);
                    Log.e("ImageBroker", sb2.toString());
                }
                try {
                    return context.getContentResolver().openAssetFileDescriptor(uri2, "r");
                } catch (FileNotFoundException e3) {
                    String valueOf3 = String.valueOf(uri);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 48);
                    sb3.append("Fetched image data was not stored for image URI ");
                    sb3.append(valueOf3);
                    Log.e("ImageBroker", sb3.toString());
                    return null;
                }
            }
            return null;
        }
        str = null;
        pair = Pair.create(Integer.valueOf(i), str);
        if (pair != null) {
        }
        return null;
    }
}
