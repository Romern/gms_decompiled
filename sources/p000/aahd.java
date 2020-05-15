package p000;

import android.content.Context;
import com.google.ads.afma.proto2api.C0152c;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: aahd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahd {

    /* renamed from: a */
    public final Context f28105a;

    /* renamed from: b */
    public final aagb f28106b;

    /* renamed from: c */
    public final aagd f28107c;

    /* renamed from: d */
    public aucb f28108d;

    /* renamed from: e */
    public aucb f28109e;

    /* renamed from: f */
    private final Executor f28110f;

    public aahd(Context context, Executor executor, aagb aagb, aagd aagd) {
        this.f28105a = context;
        this.f28110f = executor;
        this.f28106b = aagb;
        this.f28107c = aagd;
    }

    /* renamed from: a */
    public static C0152c m21250a(aucb aucb, C0152c cVar) {
        return aucb.mo50384b() ? (C0152c) aucb.mo50386d() : cVar;
    }

    /* renamed from: a */
    public final aucb mo16871a(Callable callable) {
        aucb a = aucu.m76780a(this.f28110f, callable);
        a.mo50379a(this.f28110f, new aaha(this));
        return a;
    }
}
