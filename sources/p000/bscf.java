package p000;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: bscf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscf extends bsbq {

    /* renamed from: b */
    private static final long f144043b = TimeUnit.SECONDS.toNanos(12);

    /* renamed from: c */
    private static final long f144044c = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: d */
    private final bsct f144045d;

    /* renamed from: e */
    private bsbl f144046e;

    /* renamed from: f */
    private long f144047f;

    /* renamed from: g */
    private long f144048g;

    public bscf(bsct bsct) {
        this.f144045d = bsct;
        this.f144002a = new bsct[]{bsct};
    }

    /* renamed from: a */
    private final boolean m115181a(long j) {
        return this.f144046e != null && j < this.f144047f + f144044c;
    }

    /* renamed from: e */
    private final boolean m115182e() {
        return this.f144046e != null && this.f144048g < this.f144047f + f144043b;
    }

    /* renamed from: b */
    public final long mo70214b() {
        return !m115182e() ? this.f144045d.mo70214b() : this.f144047f;
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f144046e = null;
        this.f144047f = 0;
        this.f144045d.mo70215c();
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        int a = super.mo70205a(j, i);
        return m115181a(j) ? a & -5 : a;
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return !m115182e() ? this.f144045d.mo70206a() : this.f144046e;
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        bsbk bsbk = bsbk.GPS;
        int ordinal = bsbl.f143965a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                this.f144046e = bsbl;
                this.f144047f = j;
            }
        } else if (m115181a(j)) {
            bsbl = null;
        }
        this.f144048g = j;
        if (bsbl != null) {
            this.f144045d.mo70209a(j, bsbl);
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("InjectionSensorFusion:");
        long j2 = this.f144048g;
        long j3 = this.f144047f;
        StringBuilder sb2 = new StringBuilder(92);
        sb2.append(" time(ns): {lastAbsoluteTimeNs=");
        sb2.append(j2);
        sb2.append(",lastInjectedTimeNs=");
        sb2.append(j3);
        sb2.append("}");
        sb.append(sb2.toString());
        printWriter.println(sb);
        this.f144045d.mo70213a(j, printWriter);
    }
}
