package p000;

import android.content.Context;

/* renamed from: wgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wgy {
    /* renamed from: a */
    public static brak m41937a(Context context, wgj wgj, wgh wgh) {
        String valueOf = String.valueOf(cdsw.m134869b());
        wgn.m41923c("RpcUtil", valueOf.length() == 0 ? new String("Experiment overrides:") : "Experiment overrides:".concat(valueOf), new Object[0]);
        bxvd da = brbe.f142234f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbe brbe = (brbe) da.f164949b;
        brbe.f142238c = 7;
        int i = 2;
        brbe.f142236a |= 2;
        bxvd da2 = brbt.f142314c.mo74144da();
        int i2 = context.getResources().getDisplayMetrics().densityDpi;
        if (i2 != 160) {
            i = i2 != 240 ? i2 != 320 ? i2 != 480 ? i2 != 640 ? 1 : 6 : 5 : 4 : 3;
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        brbt brbt = (brbt) da2.f164949b;
        brbt.f142317b = i - 1;
        brbt.f142316a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbe brbe2 = (brbe) da.f164949b;
        brbt brbt2 = (brbt) da2.mo74062i();
        brbt2.getClass();
        brbe2.f142240e = brbt2;
        brbe2.f142236a |= 8;
        bxvd da3 = brak.f142152e.mo74144da();
        String a = wgj.mo29096a();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brak brak = (brak) da3.f164949b;
        a.getClass();
        if (!brak.f142157d.mo73666a()) {
            brak.f142157d = GeneratedMessageLite.m124021a(brak.f142157d);
        }
        brak.f142157d.add(a);
        String b = cdsw.m134869b();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brak brak2 = (brak) da3.f164949b;
        b.getClass();
        brak2.f142154a |= 1;
        brak2.f142155b = b;
        bxvd da4 = brbd.f142230c.mo74144da();
        String str = wgh.f50617a;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        brbd brbd = (brbd) da4.f164949b;
        str.getClass();
        brbd.f142232a |= 1;
        brbd.f142233b = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbe brbe3 = (brbe) da.f164949b;
        brbd brbd2 = (brbd) da4.mo74062i();
        brbd2.getClass();
        brbe3.f142239d = brbd2;
        brbe3.f142236a |= 4;
        String str2 = wgh.f50618b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        brbe brbe4 = (brbe) da.f164949b;
        str2.getClass();
        brbe4.f142236a |= 1;
        brbe4.f142237b = str2;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        brak brak3 = (brak) da3.f164949b;
        brbe brbe5 = (brbe) da.mo74062i();
        brbe5.getClass();
        brak3.f142156c = brbe5;
        brak3.f142154a |= 4;
        return (brak) da3.mo74062i();
    }

    /* renamed from: a */
    public static void m41938a(wgj wgj, bral bral) {
        if (bral != null && (bral.f142160a & 1) != 0) {
            blbt blbt = bral.f142161b;
            if (blbt == null) {
                blbt = blbt.f125862d;
            }
            String str = blbt.f125865b;
            blbt blbt2 = bral.f142161b;
            if (blbt2 == null) {
                blbt2 = blbt.f125862d;
            }
            wgj.mo29097a(str, (long) blbt2.f125866c);
        }
    }
}
