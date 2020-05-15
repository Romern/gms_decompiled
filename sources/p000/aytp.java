package p000;

import android.content.Context;
import android.util.Pair;

/* renamed from: aytp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytp {

    /* renamed from: a */
    public final ayti f98458a;

    /* renamed from: b */
    public final aytn f98459b;

    /* renamed from: c */
    private final String f98460c;

    /* renamed from: d */
    private final Context f98461d;

    public aytp(String str, Context context, Pair pair) {
        civt civt;
        try {
            civt = new civt(civq.m151054b((byte[]) pair.first), civq.m151050a((byte[]) pair.second));
        } catch (civg e) {
            aytl.m84794a("SignalClient", e, "Cannot find valid Curve25519 key pair", new Object[0]);
            civt = null;
        }
        this.f98460c = str;
        this.f98461d = context;
        this.f98458a = new ayti(aytr.m84806a(str, context).getWritableDatabase());
        this.f98459b = new aytn(new aytm(this.f98458a), new ayto(this.f98458a), new aytq(this.f98458a), new aytk(this.f98458a, civt));
    }

    /* renamed from: a */
    public static int m84804a(int i) {
        if (i < 0 || i == Integer.MAX_VALUE) {
            i = 0;
        }
        return i + 1;
    }

    /* renamed from: a */
    public final void mo54427a() {
        aytr.m84808b(aytr.m84806a(this.f98460c, this.f98461d).getWritableDatabase());
    }
}
