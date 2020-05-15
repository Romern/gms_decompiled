package p000;

import java.io.PrintWriter;

/* renamed from: bsbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsbo implements bsct {

    /* renamed from: a */
    public final long f143983a;

    /* renamed from: b */
    public final long f143984b;

    /* renamed from: c */
    public bsbl f143985c;

    /* renamed from: d */
    public long f143986d;

    /* renamed from: e */
    public bsbl f143987e;

    /* renamed from: f */
    public long f143988f;

    /* renamed from: g */
    public final long f143989g;

    /* renamed from: h */
    public String f143990h;

    /* renamed from: i */
    public String f143991i;

    /* renamed from: j */
    public long f143992j;

    /* renamed from: k */
    private final boolean f143993k;

    /* renamed from: l */
    private long f143994l;

    bsbo() {
    }

    /* renamed from: a */
    public final int mo70205a(long j, int i) {
        return this.f143993k ? 128 : 0;
    }

    /* renamed from: a */
    public final void mo70207a(long j, float f) {
        if (this.f143993k) {
            this.f143994l = j;
        }
    }

    /* renamed from: a */
    public final void mo70208a(long j, float f, float f2) {
    }

    /* renamed from: a */
    public final void mo70210a(long j, bscd bscd) {
    }

    /* renamed from: a */
    public final void mo70211a(long j, bscs bscs) {
    }

    /* renamed from: a */
    public final void mo70212a(long j, bsde bsde) {
    }

    /* renamed from: b */
    public final long mo70214b() {
        throw new UnsupportedOperationException("AlititudeFilter does not support estimating positions and their time.");
    }

    /* renamed from: c */
    public final void mo70215c() {
        this.f143985c = null;
        this.f143986d = 0;
        this.f143987e = null;
        this.f143988f = 0;
        this.f143990h = null;
        this.f143991i = null;
        this.f143992j = 0;
        this.f143994l = 0;
    }

    /* renamed from: d */
    public final void mo70216d() {
        mo70215c();
    }

    /* renamed from: a */
    public final bsbl mo70206a() {
        throw new UnsupportedOperationException("AltitudeFilter does not support estimating positions and their time.");
    }

    public bsbo(long j, long j2, long j3, boolean z) {
        this.f143985c = null;
        this.f143986d = 0;
        this.f143987e = null;
        this.f143988f = 0;
        this.f143990h = null;
        this.f143991i = null;
        this.f143992j = 0;
        this.f143994l = 0;
        this.f143983a = j;
        this.f143984b = j2;
        this.f143989g = j3;
        this.f143993k = z;
    }

    /* renamed from: a */
    public final void mo70209a(long j, bsbl bsbl) {
        String str;
        if (bsbl.mo70192f() && bsbl.mo70197j()) {
            this.f143985c = bsbl;
            this.f143986d = j;
        }
        if (bsbl.mo70190e() && bsbl.mo70197j()) {
            this.f143987e = bsbl;
            this.f143988f = j;
        }
        if (this.f143989g > 0 && (str = bsbl.f143975k) != null) {
            this.f143990h = str;
            this.f143991i = bsbl.f143973i;
            this.f143992j = j;
        }
    }

    /* renamed from: a */
    public final void mo70213a(long j, PrintWriter printWriter) {
        StringBuilder sb = new StringBuilder();
        sb.append("AltitudeFilter");
        if (this.f143985c != null) {
            sb.append(" wifi{");
            sb.append(this.f143986d);
            sb.append("}");
        }
        if (this.f143987e != null) {
            sb.append(" gps{");
            sb.append(this.f143988f);
            sb.append("}");
        }
        if (this.f143993k) {
            sb.append(" pressure{");
            sb.append(this.f143994l);
            sb.append("}");
        }
        if (this.f143990h != null) {
            sb.append(" floor{");
            sb.append(this.f143992j);
            sb.append("}");
        }
    }
}
