package p000;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: bsdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsdc extends bsbq {

    /* renamed from: c */
    private static final long f144146c = TimeUnit.SECONDS.toNanos(12);

    /* renamed from: b */
    public final bscx f144147b;

    /* renamed from: d */
    private final bsct f144148d;

    public bsdc() {
        this(new bscx());
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return this.f144148d.mo70205a(j, i);
    }

    /* renamed from: b */
    public final long mo70214b() {
        return this.f144148d.mo70214b();
    }

    public bsdc(bscx bscx) {
        this.f144147b = bscx;
        bscw bscw = new bscw();
        this.f144148d = new bsbt(new bsda(new bsbr()), new bsbt(new bscy(new bsbu(new bscr(new bscu(bscw, 3000), f144146c), 2), new bsbu(new bsbr(), 2)), new bsbu(new bscz(), 3)));
        this.f144002a = new bsct[]{this.f144148d, new bsdb(this), bscw};
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return this.f144148d.mo70206a();
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        this.f144147b.mo70256a(bsbl);
        super.mo70209a(j, bsbl);
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
        this.f144147b.mo70257a(bscs);
        super.mo70211a(j, this.f144147b.f144138a);
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        String valueOf = String.valueOf(this.f144147b.f144138a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("ViterbiSensorFusion: Activity{");
        sb.append(valueOf);
        sb.append("}");
        printWriter.println(sb.toString());
        super.mo70213a(j, printWriter);
    }
}
