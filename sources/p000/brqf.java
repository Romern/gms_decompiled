package p000;

/* renamed from: brqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brqf implements brpk {

    /* renamed from: a */
    public String f143168a;

    /* renamed from: b */
    public String f143169b;

    /* renamed from: c */
    public String f143170c;

    /* renamed from: d */
    public String f143171d;

    /* renamed from: e */
    public long f143172e;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkkg.f124537e.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        bybt bybt;
        bybt bybt2;
        bybt bybt3;
        if (bxxc instanceof bkkg) {
            bkkg bkkg = (bkkg) bxxc;
            this.f143168a = stm.m36300b(bkkg.f124541c);
            this.f143169b = stm.m36300b(bkkg.f124542d);
            if (bkkg.f124539a == 3) {
                bybt = (bybt) bkkg.f124540b;
            } else {
                bybt = bybt.f165594d;
            }
            this.f143171d = stm.m36300b(bybt.f165598c);
            if (bkkg.f124539a == 3) {
                bybt2 = (bybt) bkkg.f124540b;
            } else {
                bybt2 = bybt.f165594d;
            }
            this.f143170c = stm.m36300b(bybt2.f165596a);
            if (bkkg.f124539a == 3) {
                bybt3 = (bybt) bkkg.f124540b;
            } else {
                bybt3 = bybt.f165594d;
            }
            bxyk bxyk = bybt3.f165597b;
            if (bxyk == null) {
                bxyk = bxyk.f165095c;
            }
            this.f143172e = bxyk.f165097a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of FinalizeMfaEnrollmentResponse.");
    }
}
