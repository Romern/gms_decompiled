package p000;

/* renamed from: vde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vde implements vcr {

    /* renamed from: a */
    private static final sbw f49061a = new sbw("ImpressionAppInfoBuilde", "");

    /* renamed from: b */
    private final bxvd f49062b;

    /* renamed from: c */
    private bxvd f49063c = blay.f125802e.mo74144da();

    public vde(bxvd bxvd) {
        this.f49062b = bxvd;
    }

    /* renamed from: b */
    private final void m40092b() {
        sdo.checkIfNull(this.f49063c, "Builder can only be used once.");
    }

    /* renamed from: a */
    public final void mo28226a() {
        m40092b();
        bxvd bxvd = this.f49062b;
        bxvd bxvd2 = this.f49063c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bkzo bkzo = (bkzo) bxvd.f164949b;
        blay blay = (blay) bxvd2.mo74062i();
        bkzo bkzo2 = bkzo.f125631K;
        blay.getClass();
        bkzo.f125645c = blay;
        bkzo.f125643a |= 1;
        this.f49063c = null;
    }

    /* renamed from: b */
    public final void mo28229b(String str) {
        m40092b();
        try {
            bxvd bxvd = this.f49063c;
            long parseLong = Long.parseLong(str);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blay blay = (blay) bxvd.f164949b;
            blay blay2 = blay.f125802e;
            blay.f125804a |= 1;
            blay.f125805b = parseLong;
        } catch (NumberFormatException e) {
            f49061a.mo25371b("Non-numeric sdkAppId value. Unable to log.");
        }
    }

    /* renamed from: a */
    public final void mo28227a(int i) {
        m40092b();
        if (i == 0) {
            bxvd bxvd = this.f49063c;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            blay blay = (blay) bxvd.f164949b;
            blay blay2 = blay.f125802e;
            blay.f125806c = 1;
            blay.f125804a |= 2;
        } else if (i == 1) {
            bxvd bxvd2 = this.f49063c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            blay blay3 = (blay) bxvd2.f164949b;
            blay blay4 = blay.f125802e;
            blay3.f125806c = 2;
            blay3.f125804a |= 2;
        } else if (i != 2) {
            f49061a.mo25374b("ImpressionAppInfoBuilde", "Unknown proxy: %d", Integer.valueOf(i));
            bxvd bxvd3 = this.f49063c;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            blay blay5 = (blay) bxvd3.f164949b;
            blay blay6 = blay.f125802e;
            blay5.f125806c = 0;
            blay5.f125804a |= 2;
        } else {
            bxvd bxvd4 = this.f49063c;
            if (bxvd4.f164950c) {
                bxvd4.mo74035c();
                bxvd4.f164950c = false;
            }
            blay blay7 = (blay) bxvd4.f164949b;
            blay blay8 = blay.f125802e;
            blay7.f125806c = 3;
            blay7.f125804a |= 2;
        }
    }

    /* renamed from: a */
    public final void mo28228a(String str) {
        m40092b();
        bxvd bxvd = this.f49063c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        blay blay = (blay) bxvd.f164949b;
        blay blay2 = blay.f125802e;
        str.getClass();
        blay.f125804a |= 4;
        blay.f125807d = str;
    }
}
