package p000;

/* renamed from: brrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brrf implements brpk {

    /* renamed from: a */
    public String f143227a;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bkky.f124670c.mo74142c(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        bybw bybw;
        if (bxxc instanceof bkky) {
            bkky bkky = (bkky) bxxc;
            if (bkky.f124672a != 1 || ((bybw) bkky.f124673b).f165605a.isEmpty()) {
                throw new IllegalArgumentException("The passed proto must have valid session info.");
            }
            if (bkky.f124672a == 1) {
                bybw = (bybw) bkky.f124673b;
            } else {
                bybw = bybw.f165603b;
            }
            this.f143227a = bybw.f165605a;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of StartMfaEnrollmentResponse.");
    }
}
