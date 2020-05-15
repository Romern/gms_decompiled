package p000;

import android.content.Context;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.FenceState;
import java.util.List;

/* renamed from: ear */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ear extends dyd implements lrj {

    /* renamed from: b */
    public static final dxr f14565b = new dxr(new eao(), "SunStateProducer", new int[]{43}, null);

    /* renamed from: j */
    public final dqi f14566j;

    /* renamed from: k */
    final Runnable f14567k;

    /* renamed from: l */
    public AwarenessFence f14568l;

    /* renamed from: m */
    public final String f14569m;

    /* renamed from: n */
    public final long[] f14570n = new long[3];

    /* renamed from: o */
    public final long[] f14571o = new long[3];

    /* renamed from: p */
    public long f14572p;

    public ear(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14565b, str, dqb);
        String valueOf = String.valueOf(doh.f13690b);
        this.f14569m = valueOf.length() == 0 ? new String("SunStateProductionFence") : "SunStateProductionFence".concat(valueOf);
        this.f14572p = 120000;
        this.f14566j = new eap(this, "[SunStateProducer] get location snapshot", new Object[0]);
        this.f14567k = new eaq(this);
    }

    /* renamed from: a */
    public static bxni m10000a(int i, long[] jArr) {
        bxvd da = bxni.f164032d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxni bxni = (bxni) da.f164949b;
        bxni.f164035b = i - 1;
        bxni.f164034a |= 1;
        if (jArr != null) {
            List b = bqcr.m112598b(jArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxni bxni2 = (bxni) da.f164949b;
            if (!bxni2.f164036c.mo73666a()) {
                bxni2.f164036c = bxvk.m124020a(bxni2.f164036c);
            }
            bxsy.m123078a(b, bxni2.f164036c);
        }
        return (bxni) da.mo74062i();
    }

    /* renamed from: c */
    public final void mo9914c() {
        if (this.f14568l != null) {
            lrk lrk = new lrk();
            lrk.mo15394a(this);
            lrh.m19577a(this.f14388d, this.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[SunStateProducer] unregister fence", new Object[0]));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: j */
    public final void mo9915j() {
        new Object[1][0] = Long.valueOf(this.f14572p);
        this.f13883a.mo9434a(this.f14567k, this.f14572p, dqy.m9123a("SunStateProducer_repostLocationSnapshot"));
        long j = this.f14572p;
        this.f14572p = Math.min(14400000L, j + j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9848b() {
        mo9846a(dwq.m9665i().mo20505a());
        mo9914c();
        this.f13883a.mo9433a(this.f14567k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9845a() {
        lrh.m19578b(this.f14388d, this.f14391g).mo24748h().mo50378a(this.f13883a.mo9432a(dqy.m9123a("SunStateProducer_getLocationSnapshot")), this.f14566j);
    }

    /* renamed from: a */
    public final void mo9826a(FenceState fenceState) {
        if (fenceState.mo8005a() == 2) {
            this.f13883a.mo9435a(this.f14567k, dqy.m9123a("SunStateProducer_fenceStateChanged"));
        }
    }
}
