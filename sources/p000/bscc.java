package p000;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: bscc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bscc extends bsbq {

    /* renamed from: e */
    private static final long f144026e = TimeUnit.SECONDS.toNanos(12);

    /* renamed from: b */
    public final bscx f144027b = new bscx();

    /* renamed from: c */
    public final bsct f144028c;

    /* renamed from: d */
    public final bscw f144029d = new bscw();

    /* renamed from: f */
    private final bsct f144030f;

    /* renamed from: g */
    private final bsct f144031g;

    /* renamed from: h */
    private final float f144032h;

    /* renamed from: i */
    private final boolean f144033i;

    public bscc(bsbw bsbw) {
        bsbp bsbp = (bsbp) bsbw;
        this.f144028c = new bscr(new bscu(this.f144029d, bsbp.f144000f), f144026e);
        this.f144032h = bsbp.f143995a;
        this.f144033i = bsbp.f143999e;
        bsbx bsbx = new bsbx(new bsbr());
        bsbu bsbu = new bsbu(new bsby(), 3);
        this.f144030f = new bsbz(new bsbr());
        this.f144031g = new bsbt(new bscp(new bsce(bsbp.f143996b, bsbp.f143997c), new bsca(this.f144030f, bsbx), true, bsbp.f143998d), bsbu);
        this.f144002a = new bsct[]{this.f144031g, new bscb(this), this.f144029d};
    }

    /* renamed from: e */
    private final boolean m115160e() {
        bsbl a = this.f144031g.mo70206a();
        return a != null && !a.mo70193g();
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        int a = this.f144031g.mo70205a(j, i);
        if (m115160e()) {
            if (!this.f144029d.mo70254b(j)) {
                a |= 16;
            }
            if (this.f144029d.mo70253a(j) >= 4.0f) {
                return a;
            }
            bsbl a2 = this.f144031g.mo70206a();
            if ((a2 != null && a2.mo70190e() && this.f144033i) || (a & 32) != 0 || a2.mo70192f()) {
                return a | 24;
            }
        }
        return a;
    }

    /* renamed from: b */
    public final long mo70214b() {
        return (!m115160e() ? this.f144031g : this.f144028c).mo70214b();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return m115160e() ? this.f144028c.mo70206a() : this.f144031g.mo70206a();
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
        super.mo70208a(j, f, f2);
        if (m115160e()) {
            this.f144028c.mo70208a(j, f, f2);
        }
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        bsbl a = bscq.m115246a(bsbl, this.f144032h);
        this.f144027b.mo70256a(a);
        super.mo70209a(j, a);
        this.f144030f.mo70209a(j, bsbl);
        if (m115160e()) {
            this.f144028c.mo70209a(j, this.f144031g.mo70206a());
        }
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        this.f144027b.mo70257a(bscs);
        bscs bscs2 = this.f144027b.f144138a;
        this.f144028c.mo70211a(j, bscs2);
        super.mo70211a(j, bscs2);
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("FusedPositionKalmanFusion:");
        String valueOf = String.valueOf(String.format(Locale.US, "%.1f", Float.valueOf(this.f144032h)));
        sb.append(valueOf.length() == 0 ? new String(" gpsNormalization=") : " gpsNormalization=".concat(valueOf));
        boolean e = m115160e();
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(" Kalman active: ");
        sb2.append(e);
        sb.append(sb2.toString());
        printWriter.println(sb);
        super.mo70213a(j, printWriter);
    }
}
