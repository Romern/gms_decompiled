package p000;

import android.content.Context;

/* renamed from: nbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nbp {

    /* renamed from: a */
    public final nbq f35202a;

    /* renamed from: b */
    public final nbr f35203b;

    /* renamed from: c */
    public final int f35204c;

    public nbp(nbq nbq, nbr nbr, int i) {
        this.f35202a = nbq;
        this.f35203b = nbr;
        this.f35204c = i;
    }

    /* renamed from: a */
    public static nbp m25896a(Context context) {
        return new nbp(new nbq(context.getSharedPreferences("tertiary_key_rotation_tracker", 0), (int) cclp.f179364a.mo6606a().mo76306i()), nbr.m25898a(context), (int) cclp.f179364a.mo6606a().mo76307j());
    }
}
