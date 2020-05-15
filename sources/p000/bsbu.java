package p000;

import java.io.PrintWriter;

/* renamed from: bsbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsbu extends bsbq {

    /* renamed from: b */
    private final bsct f144017b;

    /* renamed from: c */
    private final int f144018c;

    public bsbu(bsct bsct, int i) {
        this.f144017b = bsct;
        this.f144018c = i;
        this.f144002a = new bsct[]{bsct};
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        return this.f144017b.mo70206a();
    }

    /* renamed from: b */
    public final long mo70214b() {
        return this.f144017b.mo70214b();
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        boolean z;
        int i = this.f144018c - 1;
        if (i == 0) {
            z = bsbl.mo70190e();
        } else if (i != 1) {
            z = bsbl.mo70193g();
        } else {
            z = bsbl.mo70192f();
        }
        if (z) {
            this.f144017b.mo70209a(j, bsbl);
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        int i = this.f144018c;
        String str = i != 1 ? i != 2 ? "CELL" : "WIFI" : "GPS";
        StringBuilder sb = new StringBuilder(str.length() + 35);
        sb.append("FilteringFusion based on ");
        sb.append(str);
        sb.append(" position.");
        printWriter.println(sb.toString());
    }
}
