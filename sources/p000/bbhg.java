package p000;

import java.util.concurrent.Executor;

/* renamed from: bbhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbhg extends chql {

    /* renamed from: a */
    private static final chtn f102628a = chtn.m149535a("X-Goog-Api-Key", chtr.f189134b);

    /* renamed from: b */
    private static final chtn f102629b = chtn.m149535a("X-Android-Package", chtr.f189134b);

    /* renamed from: c */
    private static final chtn f102630c = chtn.m149535a("X-Android-Cert", chtr.f189134b);

    /* renamed from: d */
    private final chtr f102631d;

    /* renamed from: a */
    public final void mo55569a(chqj chqj, Executor executor, chqk chqk) {
        chqk.mo85540a(this.f102631d);
    }

    public bbhg(String str, String str2, String str3) {
        chtr chtr = new chtr();
        this.f102631d = chtr;
        chtr.mo85648a(f102628a, str);
        this.f102631d.mo85648a(f102629b, str2);
        this.f102631d.mo85648a(f102630c, str3);
    }
}
