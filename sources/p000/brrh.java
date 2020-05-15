package p000;

/* renamed from: brrh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrh implements brpk {

    /* renamed from: a */
    public String f143233a;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkla.f124682c.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        bybw bybw;
        if (bxxc instanceof bkla) {
            bkla bkla = (bkla) bxxc;
            if (bkla.f124684a == 1) {
                bybw = (bybw) bkla.f124685b;
            } else {
                bybw = bybw.f165603b;
            }
            this.f143233a = stm.m36300b(bybw.f165605a);
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of StartMfaSignInResponse.");
    }
}
