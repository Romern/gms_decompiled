package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0405r;
import com.google.android.gms.ads.internal.report.C0537d;
import com.google.android.gms.ads.internal.report.C0538e;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.an */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0616an {
    @Deprecated
    /* renamed from: a */
    public static Object m5619a(Context context, Callable callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            C0633h.m5669b("Unexpected exception.", th);
            synchronized (C0537d.f8567a) {
                if (C0537d.f8568b == null) {
                    if (((Boolean) C0405r.f8361d.mo6621a()).booleanValue()) {
                        if (!((Boolean) C0371o.f8222aI.mo6604a()).booleanValue()) {
                            C0537d.f8568b = new C0537d(context, VersionInfoParcel.m5635a());
                        }
                    }
                    C0537d.f8568b = new C0538e();
                }
                C0537d.f8568b.mo6712a(th, "StrictModeUtil.runWithLaxStrictMode");
                return null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Object m5620a(bmzi bmzi) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object a = bmzi.mo6606a();
            StrictMode.setThreadPolicy(threadPolicy);
            return a;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
