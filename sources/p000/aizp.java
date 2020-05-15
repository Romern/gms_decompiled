package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;
import java.util.Random;

/* renamed from: aizp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizp {

    /* renamed from: a */
    public final buqh f70167a;

    /* renamed from: b */
    public final geh f70168b;

    /* renamed from: c */
    public TokenBroadcaster$Params f70169c;

    /* renamed from: d */
    public TokenReceiver$Params f70170d;

    /* renamed from: e */
    public final aizf f70171e;

    /* renamed from: f */
    public final ajat f70172f;

    /* renamed from: g */
    public volatile boolean f70173g;

    /* renamed from: h */
    public aizo f70174h;

    /* renamed from: i */
    private final ger f70175i;

    /* renamed from: j */
    private final Random f70176j = new Random();

    public aizp(Context context, aizf aizf, ger ger, geh geh) {
        this.f70172f = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70167a = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70175i = ger;
        this.f70168b = geh;
        this.f70171e = aizf;
    }

    /* renamed from: a */
    public final long mo38334a(long j, long j2) {
        byyc byyc = this.f70172f.f70278f.f168922e;
        if (byyc == null) {
            byyc = byyc.f168888g;
        }
        long j3 = byyc.f168893d;
        if (j3 == 0) {
            double d = (double) j;
            double d2 = (double) j2;
            double nextDouble = this.f70176j.nextDouble();
            Double.isNaN(d2);
            Double.isNaN(d);
            return (long) (d + (d2 * nextDouble));
        }
        int i = ((int) (j2 / j3)) + 1;
        return j + (j3 * ((long) (i > 0 ? this.f70176j.nextInt(i) : 0)));
    }

    /* renamed from: b */
    public final void mo38339b() {
        this.f70171e.mo38325a(this.f70168b);
    }

    /* renamed from: a */
    public final void mo38335a() {
        this.f70171e.mo38327a(this.f70175i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aizp.a(int, long):void
     arg types: [int, int]
     candidates:
      aizp.a(long, long):long
      aizp.a(int, long):void */
    /* renamed from: a */
    public final void mo38336a(int i) {
        mo38337a(i, 0L);
    }

    /* renamed from: a */
    public final synchronized void mo38337a(int i, long j) {
        aizo aizo = new aizo(this, i);
        this.f70174h = aizo;
        this.f70167a.mo72983a(aizo, j);
    }

    /* renamed from: a */
    public final void mo38338a(boolean z) {
        aizn aizn = new aizn(this);
        byyc byyc = this.f70172f.f70278f.f168922e;
        if (byyc == null) {
            byyc = byyc.f168888g;
        }
        long j = byyc.f168891b;
        byyc byyc2 = this.f70172f.f70278f.f168922e;
        if (byyc2 == null) {
            byyc2 = byyc.f168888g;
        }
        this.f70171e.mo38328a(this.f70175i, this.f70170d, z, mo38334a(j, byyc2.f168892c), aizn);
    }
}
