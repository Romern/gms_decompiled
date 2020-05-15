package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: brub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brub extends brue {

    /* renamed from: a */
    public final Executor f143378a;

    /* renamed from: b */
    public final brux f143379b;

    /* renamed from: c */
    private final Context f143380c;

    /* renamed from: d */
    private final ayte f143381d;

    /* renamed from: e */
    private final bruv f143382e;

    /* renamed from: f */
    private final Executor f143383f;

    /* renamed from: g */
    private final Executor f143384g;

    /* renamed from: h */
    private final bmzi f143385h;

    /* renamed from: i */
    private final bmzi f143386i;

    /* renamed from: j */
    private final bmzi f143387j;

    /* renamed from: k */
    private final bmzi f143388k;

    public brub(Context context, ayte ayte, bruv bruv, Executor executor, Executor executor2, Executor executor3, brux brux, bmzi bmzi, bmzi bmzi2, bmzi bmzi3, bmzi bmzi4) {
        this.f143380c = context;
        this.f143381d = ayte;
        this.f143382e = bruv;
        this.f143383f = executor;
        this.f143384g = executor2;
        this.f143378a = executor3;
        this.f143379b = brux;
        this.f143385h = bmzi;
        this.f143386i = bmzi2;
        this.f143387j = bmzi3;
        this.f143388k = bmzi4;
    }

    /* renamed from: a */
    public final Context mo69942a() {
        return this.f143380c;
    }

    /* renamed from: b */
    public final ayte mo69943b() {
        return this.f143381d;
    }

    /* renamed from: c */
    public final bruv mo69944c() {
        return this.f143382e;
    }

    /* renamed from: d */
    public final Executor mo69945d() {
        return this.f143383f;
    }

    /* renamed from: e */
    public final Executor mo69946e() {
        return this.f143384g;
    }

    public final boolean equals(Object obj) {
        brux brux;
        if (obj == this) {
            return true;
        }
        if (obj instanceof brue) {
            brue brue = (brue) obj;
            return this.f143380c.equals(brue.mo69942a()) && this.f143381d.equals(brue.mo69943b()) && this.f143382e.equals(brue.mo69944c()) && this.f143383f.equals(brue.mo69945d()) && this.f143384g.equals(brue.mo69946e()) && this.f143378a.equals(brue.mo69948f()) && brue.mo69949g() == null && ((brux = this.f143379b) == null ? brue.mo69950h() == null : brux.equals(brue.mo69950h())) && brue.mo69952i() == null && this.f143385h.equals(brue.mo69953j()) && this.f143386i.equals(brue.mo69954k()) && this.f143387j.equals(brue.mo69955l()) && this.f143388k.equals(brue.mo69956m()) && brue.mo69957n() == null && brue.mo69958o() == null;
        }
    }

    /* renamed from: f */
    public final Executor mo69948f() {
        return this.f143378a;
    }

    /* renamed from: g */
    public final ScheduledExecutorService mo69949g() {
        return null;
    }

    /* renamed from: h */
    public final brux mo69950h() {
        return this.f143379b;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.f143380c.hashCode() ^ 1000003) * 1000003) ^ this.f143381d.hashCode()) * 1000003) ^ this.f143382e.hashCode()) * 1000003) ^ this.f143383f.hashCode()) * 1000003) ^ this.f143384g.hashCode()) * 1000003) ^ this.f143378a.hashCode()) * -721379959;
        brux brux = this.f143379b;
        if (brux != null) {
            i = brux.hashCode();
        } else {
            i = 0;
        }
        return (((((((((hashCode ^ i) * -721379959) ^ this.f143385h.hashCode()) * 1000003) ^ this.f143386i.hashCode()) * 1000003) ^ this.f143387j.hashCode()) * 1000003) ^ this.f143388k.hashCode()) * -721379959;
    }

    /* renamed from: i */
    public final brul mo69952i() {
        return null;
    }

    /* renamed from: j */
    public final bmzi mo69953j() {
        return this.f143385h;
    }

    /* renamed from: k */
    public final bmzi mo69954k() {
        return this.f143386i;
    }

    /* renamed from: l */
    public final bmzi mo69955l() {
        return this.f143387j;
    }

    /* renamed from: m */
    public final bmzi mo69956m() {
        return this.f143388k;
    }

    /* renamed from: n */
    public final bruq mo69957n() {
        return null;
    }

    /* renamed from: o */
    public final brui mo69958o() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f143380c);
        String valueOf2 = String.valueOf(this.f143381d);
        String valueOf3 = String.valueOf(this.f143382e);
        String valueOf4 = String.valueOf(this.f143383f);
        String valueOf5 = String.valueOf(this.f143384g);
        String valueOf6 = String.valueOf(this.f143378a);
        String valueOf7 = String.valueOf((Object) null);
        String valueOf8 = String.valueOf(this.f143379b);
        String valueOf9 = String.valueOf((Object) null);
        String valueOf10 = String.valueOf(this.f143385h);
        String valueOf11 = String.valueOf(this.f143386i);
        String valueOf12 = String.valueOf(this.f143387j);
        String valueOf13 = String.valueOf(this.f143388k);
        String valueOf14 = String.valueOf((Object) null);
        String valueOf15 = String.valueOf((Object) null);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = String.valueOf(valueOf9).length();
        int length10 = String.valueOf(valueOf10).length();
        int length11 = String.valueOf(valueOf11).length();
        int length12 = String.valueOf(valueOf12).length();
        int length13 = String.valueOf(valueOf13).length();
        StringBuilder sb = new StringBuilder(length + 310 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("ChannelConfig{context=");
        sb.append(valueOf);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", transport=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", ioExecutor=");
        sb.append(valueOf5);
        sb.append(", networkExecutor=");
        sb.append(valueOf6);
        sb.append(", transportScheduledExecutor=");
        sb.append(valueOf7);
        sb.append(", authContextManager=");
        sb.append(valueOf8);
        sb.append(", rpcCacheProvider=");
        sb.append(valueOf9);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf10);
        sb.append(", recordCachingMetricsToPrimes=");
        sb.append(valueOf11);
        sb.append(", recordBandwidthMetrics=");
        sb.append(valueOf12);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(valueOf13);
        sb.append(", streamzConfig=");
        sb.append(valueOf14);
        sb.append(", grpcServiceConfig=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }
}
