package p000;

/* renamed from: brqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqh implements brpk {

    /* renamed from: a */
    public String f143179a;

    /* renamed from: b */
    public String f143180b;

    /* renamed from: c */
    public String f143181c;

    /* renamed from: d */
    public String f143182d;

    /* renamed from: e */
    public long f143183e;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkki.f124551e.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        bybt bybt;
        bybt bybt2;
        bybt bybt3;
        if (bxxc instanceof bkki) {
            bkki bkki = (bkki) bxxc;
            this.f143179a = stm.m36300b(bkki.f124555c);
            this.f143180b = stm.m36300b(bkki.f124556d);
            if (bkki.f124553a == 3) {
                bybt = (bybt) bkki.f124554b;
            } else {
                bybt = bybt.f165594d;
            }
            this.f143182d = stm.m36300b(bybt.f165598c);
            if (bkki.f124553a == 3) {
                bybt2 = (bybt) bkki.f124554b;
            } else {
                bybt2 = bybt.f165594d;
            }
            this.f143181c = stm.m36300b(bybt2.f165596a);
            if (bkki.f124553a == 3) {
                bybt3 = (bybt) bkki.f124554b;
            } else {
                bybt3 = bybt.f165594d;
            }
            bxyk bxyk = bybt3.f165597b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            this.f143183e = bxyk.f165097a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaSignInResponse.");
    }
}
