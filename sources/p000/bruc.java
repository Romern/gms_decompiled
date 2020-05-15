package p000;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bruc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bruc extends bruu {

    /* renamed from: a */
    public final URI f143389a;

    /* renamed from: b */
    public final Executor f143390b;

    /* renamed from: c */
    public final Integer f143391c;

    /* renamed from: d */
    public final Integer f143392d;

    /* renamed from: e */
    public final long f143393e;

    /* renamed from: f */
    private final Context f143394f;

    /* renamed from: g */
    private final Executor f143395g;

    /* renamed from: h */
    private final ScheduledExecutorService f143396h;

    /* renamed from: i */
    private final bmzi f143397i;

    /* renamed from: j */
    private final brui f143398j;

    public bruc(Context context, URI uri, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, bmzi bmzi, brui brui, Integer num, Integer num2, long j) {
        this.f143394f = context;
        this.f143389a = uri;
        this.f143395g = executor;
        this.f143390b = executor2;
        this.f143396h = scheduledExecutorService;
        this.f143397i = bmzi;
        this.f143398j = brui;
        this.f143391c = num;
        this.f143392d = num2;
        this.f143393e = j;
    }

    /* renamed from: a */
    public final Context mo69960a() {
        return this.f143394f;
    }

    /* renamed from: b */
    public final URI mo69961b() {
        return this.f143389a;
    }

    /* renamed from: c */
    public final Executor mo69962c() {
        return this.f143395g;
    }

    /* renamed from: d */
    public final Executor mo69963d() {
        return this.f143390b;
    }

    /* renamed from: e */
    public final ScheduledExecutorService mo69964e() {
        return this.f143396h;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        brui brui;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bruu)) {
            return false;
        }
        bruu bruu = (bruu) obj;
        return this.f143394f.equals(bruu.mo69960a()) && this.f143389a.equals(bruu.mo69961b()) && this.f143395g.equals(bruu.mo69962c()) && this.f143390b.equals(bruu.mo69963d()) && ((scheduledExecutorService = this.f143396h) == null ? bruu.mo69964e() == null : scheduledExecutorService.equals(bruu.mo69964e())) && this.f143397i.equals(bruu.mo69966f()) && ((brui = this.f143398j) == null ? bruu.mo69967g() == null : brui.equals(bruu.mo69967g())) && ((num = this.f143391c) == null ? bruu.mo69968h() == null : num.equals(bruu.mo69968h())) && ((num2 = this.f143392d) == null ? bruu.mo69970i() == null : num2.equals(bruu.mo69970i())) && this.f143393e == bruu.mo69971j();
    }

    /* renamed from: f */
    public final bmzi mo69966f() {
        return this.f143397i;
    }

    /* renamed from: g */
    public final brui mo69967g() {
        return this.f143398j;
    }

    /* renamed from: h */
    public final Integer mo69968h() {
        return this.f143391c;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((this.f143394f.hashCode() ^ 1000003) * 1000003) ^ this.f143389a.hashCode()) * 1000003) ^ this.f143395g.hashCode()) * 1000003) ^ this.f143390b.hashCode()) * 1000003;
        ScheduledExecutorService scheduledExecutorService = this.f143396h;
        int i4 = 0;
        if (scheduledExecutorService != null) {
            i = scheduledExecutorService.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f143397i.hashCode()) * 1000003;
        brui brui = this.f143398j;
        if (brui != null) {
            i2 = brui.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode2 ^ i2) * 1000003;
        Integer num = this.f143391c;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 ^ i3) * 1000003;
        Integer num2 = this.f143392d;
        if (num2 != null) {
            i4 = num2.hashCode();
        }
        long j = this.f143393e;
        return ((i6 ^ i4) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    /* renamed from: i */
    public final Integer mo69970i() {
        return this.f143392d;
    }

    /* renamed from: j */
    public final long mo69971j() {
        return this.f143393e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f143394f);
        String valueOf2 = String.valueOf(this.f143389a);
        String valueOf3 = String.valueOf(this.f143395g);
        String valueOf4 = String.valueOf(this.f143390b);
        String valueOf5 = String.valueOf(this.f143396h);
        String valueOf6 = String.valueOf(this.f143397i);
        String valueOf7 = String.valueOf(this.f143398j);
        String valueOf8 = String.valueOf(this.f143391c);
        String valueOf9 = String.valueOf(this.f143392d);
        long j = this.f143393e;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        StringBuilder sb = new StringBuilder(length + 247 + length2 + length3 + length4 + length5 + length6 + length7 + String.valueOf(valueOf8).length() + String.valueOf(valueOf9).length());
        sb.append("TransportConfig{applicationContext=");
        sb.append(valueOf);
        sb.append(", uri=");
        sb.append(valueOf2);
        sb.append(", networkExecutor=");
        sb.append(valueOf3);
        sb.append(", transportExecutor=");
        sb.append(valueOf4);
        sb.append(", transportScheduledExecutorService=");
        sb.append(valueOf5);
        sb.append(", recordNetworkMetricsToPrimes=");
        sb.append(valueOf6);
        sb.append(", grpcServiceConfig=");
        sb.append(valueOf7);
        sb.append(", trafficStatsUid=");
        sb.append(valueOf8);
        sb.append(", trafficStatsTag=");
        sb.append(valueOf9);
        sb.append(", grpcIdleTimeoutMillis=");
        sb.append(j);
        sb.append("}");
        return sb.toString();
    }
}
