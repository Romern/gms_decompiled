package p000;

import com.google.android.gms.appdatasearch.CorpusStatus;

/* renamed from: abvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvr {
    /* renamed from: a */
    public static void m48357a(abrv abrv, abyy abyy, abww abww) {
        String str = abww.f58662b;
        String b = abww.mo32395b();
        CorpusStatus b2 = abrv.mo32315b(abyy, b, str);
        if (!b2.f9523a || Integer.parseInt(b2.f9528f) != abww.f58661a.f58534e) {
            absg.m48185a("Couldn't find corpus '%s'.", b);
            abrv.f58067c.mo32995d(new abvq(abrv.f58066b, abrv, abxu.m48512a(abww), abyy, b));
        }
    }
}
