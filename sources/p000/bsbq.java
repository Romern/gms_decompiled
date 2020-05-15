package p000;

import java.io.PrintWriter;

/* renamed from: bsbq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bsbq implements bsct {

    /* renamed from: b */
    private static final bsct[] f144001b = new bsct[0];

    /* renamed from: a */
    public bsct[] f144002a = f144001b;

    /* renamed from: a */
    public int mo70205a(long j, int i) {
        int i2 = 0;
        for (bsct bsct : this.f144002a) {
            i2 |= bsct.mo70205a(j, i);
        }
        return i2;
    }

    /* renamed from: b */
    public long mo70214b() {
        throw new IllegalStateException("getTimeNs not implemented");
    }

    /* renamed from: c */
    public void mo70215c() {
        for (bsct bsct : this.f144002a) {
            bsct.mo70215c();
        }
    }

    /* renamed from: d */
    public void mo70216d() {
        for (bsct bsct : this.f144002a) {
            bsct.mo70216d();
        }
    }

    /* renamed from: a */
    public bsbl mo70206a() {
        throw new IllegalStateException("getPosition not implemented");
    }

    /* renamed from: a */
    public void mo70207a(long j, float f) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70207a(j, f);
        }
    }

    /* renamed from: a */
    public void mo70208a(long j, float f, float f2) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70208a(j, f, f2);
        }
    }

    /* renamed from: a */
    public void mo70209a(long j, bsbl bsbl) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70209a(j, bsbl);
        }
    }

    /* renamed from: a */
    public void mo70210a(long j, bscd bscd) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70210a(j, bscd);
        }
    }

    /* renamed from: a */
    public void mo70211a(long j, bscs bscs) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70211a(j, bscs);
        }
    }

    /* renamed from: a */
    public void mo70212a(long j, bsde bsde) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70212a(j, bsde);
        }
    }

    /* renamed from: a */
    public void mo70213a(long j, PrintWriter printWriter) {
        for (bsct bsct : this.f144002a) {
            bsct.mo70213a(j, printWriter);
        }
    }
}
