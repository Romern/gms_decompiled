package p000;

import java.util.concurrent.Executor;

/* renamed from: bacn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bacn extends chql {

    /* renamed from: a */
    private static final chtn f100476a = chtn.m149535a("X-Goog-Api-Key", chtr.f189134b);

    /* renamed from: b */
    private static final chtn f100477b = chtn.m149535a("X-Android-Package", chtr.f189134b);

    /* renamed from: c */
    private static final chtn f100478c = chtn.m149535a("X-Android-Cert", chtr.f189134b);

    /* renamed from: d */
    private final chtr f100479d;

    public bacn(String str, String str2, String str3) {
        chtr chtr = new chtr();
        this.f100479d = chtr;
        chtr.mo85648a(f100476a, str);
        this.f100479d.mo85648a(f100477b, str2);
        this.f100479d.mo85648a(f100478c, str3);
    }

    /* renamed from: a */
    public final void mo55569a(chqj chqj, Executor executor, chqk chqk) {
        chqk.mo85540a(this.f100479d);
    }
}
