package com.google.android.gms.ads.social;

import android.content.Context;
import com.google.android.gms.ads.internal.social.C0592a;
import com.google.android.gms.ads.internal.util.future.C0645d;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsDoritosProvider implements C0592a {

    /* renamed from: e */
    private static GmsDoritosProvider f9459e;

    /* renamed from: f */
    private static final Object f9460f = new Object();

    /* renamed from: a */
    public final Context f9461a;

    /* renamed from: b */
    public final C0904e f9462b;

    /* renamed from: c */
    public final C0903d f9463c;

    /* renamed from: d */
    public final C0900a f9464d;

    @Deprecated
    public GmsDoritosProvider(Context context) {
        C0904e a = C0904e.m6102a(context);
        C0903d a2 = C0903d.m6097a(context);
        C0900a a3 = C0900a.m6091a(context);
        this.f9461a = context;
        this.f9462b = a;
        this.f9464d = a3;
        this.f9463c = a2;
    }

    /* renamed from: a */
    public static GmsDoritosProvider m6089a(Context context) {
        GmsDoritosProvider gmsDoritosProvider;
        synchronized (f9460f) {
            if (f9459e == null) {
                f9459e = new GmsDoritosProvider(context);
            }
            gmsDoritosProvider = f9459e;
        }
        return gmsDoritosProvider;
    }

    public bqgg getDoritosCookieAsynchronously(String str) {
        return C0645d.f8973a.mo25819b(new C0905f(this, str));
    }

    public bqgg getDoritosCookiesAsynchronously(String str) {
        return C0645d.f8973a.mo25819b(new C0906g(this, str));
    }

    /* renamed from: a */
    public final boolean mo6776a() {
        return cbsy.f178239a.mo6606a().mo75342b();
    }
}
