package p000;

import android.os.Handler;

/* renamed from: bfgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfgg {

    /* renamed from: a */
    public final Handler f113745a;

    /* renamed from: b */
    public bfey f113746b;

    /* renamed from: c */
    public bfgn f113747c;

    /* renamed from: d */
    public bfev f113748d;

    /* renamed from: e */
    public final bhdb f113749e;

    /* renamed from: f */
    public String f113750f;

    /* renamed from: g */
    public bfeb f113751g;

    /* renamed from: h */
    public final bgns f113752h;

    /* renamed from: i */
    public bfek f113753i;

    public bfgg(bgns bgns, Handler handler, bhdb bhdb) {
        this.f113745a = handler;
        this.f113749e = bfib.m96837a(bhdb);
        this.f113752h = bgns;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61650a() {
        bfev bfev;
        bfey bfey = this.f113746b;
        if (bfey != null && (bfev = this.f113748d) != null) {
            bfev.post(new bfem(bfey));
        }
    }
}
