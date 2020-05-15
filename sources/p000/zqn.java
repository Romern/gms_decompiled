package p000;

import java.util.Collection;

/* renamed from: zqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zqn {

    /* renamed from: a */
    public final bngx f55709a;

    /* renamed from: b */
    public final caae f55710b;

    /* renamed from: c */
    public final Long f55711c;

    /* renamed from: d */
    public final long f55712d;

    /* renamed from: e */
    public final long f55713e;

    public zqn(zqm zqm) {
        this.f55709a = bngx.m109368a((Collection) zqm.f55704a);
        this.f55710b = zqm.f55705b;
        this.f55711c = zqm.f55706c;
        this.f55712d = zqm.f55707d;
        this.f55713e = zqm.f55708e;
    }

    public final String toString() {
        return String.format("BackfillRequest{dataSource=%s, dataPoints=%s, minContiguousTimeNanos=%s, startNanos=%s, endNanos=%s}", this.f55710b.f172326b, this.f55709a, this.f55711c, Long.valueOf(this.f55712d), Long.valueOf(this.f55713e));
    }
}
