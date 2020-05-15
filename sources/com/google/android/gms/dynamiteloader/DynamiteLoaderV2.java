package com.google.android.gms.dynamiteloader;

import android.content.Context;
import android.database.Cursor;
import android.os.StrictMode;
import android.util.Log;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DynamiteLoaderV2 extends wav {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dgd.a(dfo, boolean):void
     arg types: [wax, int]
     candidates:
      dgd.a(android.content.Context, int):void
      dgd.a(dfo, boolean):void */
    static {
        dgd.m8384a((dfo) new wax(), false);
    }

    public vzr loadModule(vzr vzr, String str, byte[] bArr) {
        Cursor b;
        Context context = (Context) vzs.m41641a(vzr);
        Context context2 = null;
        if (context == null) {
            return vzs.m41642a((Object) null);
        }
        try {
            wba a = wba.m41703a(context);
            StrictMode.ThreadPolicy a2 = stl.m36298a();
            try {
                b = waq.m41679b(a.f50370a, str, false);
                if (b != null) {
                    if (b.moveToFirst()) {
                        if (!Arrays.equals(bArr, b.getBlob(1))) {
                            Log.e("DynamiteLoaderV2Impl", "Module configuration has changed.");
                            b.close();
                            StrictMode.setThreadPolicy(a2);
                            return vzs.m41642a(context2);
                        }
                        context2 = a.mo29009a(context, str, b.getInt(0), b);
                        b.close();
                        StrictMode.setThreadPolicy(a2);
                        return vzs.m41642a(context2);
                    }
                }
                Log.e("DynamiteLoaderV2Impl", "Failed to re-retrieve module.");
                if (b != null) {
                    b.close();
                }
                StrictMode.setThreadPolicy(a2);
                return vzs.m41642a(context2);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(a2);
                throw th;
            }
        } catch (Throwable th2) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, th2);
            }
            throw th2;
        }
        throw th;
    }

    public vzr loadModule2(vzr vzr, String str, int i, vzr vzr2) {
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            return vzs.m41642a((Object) null);
        }
        try {
            return loadModule2NoCrashUtils(vzr, str, i, vzr2);
        } catch (Throwable th) {
            if (!sqr.m35998a()) {
                sqx.m36053a(context, th);
            }
            throw th;
        }
    }

    public vzr loadModule2NoCrashUtils(vzr vzr, String str, int i, vzr vzr2) {
        Context context = (Context) vzs.m41641a(vzr);
        if (context == null) {
            return vzs.m41642a((Object) null);
        }
        return vzs.m41642a(wba.m41703a(context).mo29009a(context, str, i, (Cursor) vzs.m41641a(vzr2)));
    }
}
