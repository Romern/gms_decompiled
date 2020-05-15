package p000;

/* renamed from: uev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uev {

    /* renamed from: a */
    public final ueu f47378a;

    /* renamed from: b */
    public final uey f47379b;

    /* renamed from: c */
    public final ues f47380c;

    /* renamed from: d */
    public final uet f47381d;

    private uev(ueu ueu, uey uey, ues ues, uet uet) {
        sdo.m34959a(ueu);
        this.f47378a = ueu;
        this.f47379b = uey;
        this.f47380c = ues;
        this.f47381d = uet;
    }

    /* renamed from: a */
    public static uev m38249a(ueu ueu, ues ues) {
        sdo.m34959a(ues);
        sdo.m34975b(!ueu.f47377f, "result.isSuccess() must be false");
        return new uev(ueu, null, ues, null);
    }

    /* renamed from: a */
    public static uev m38250a(ueu ueu, uey uey, boolean z, Integer num) {
        sdo.m34959a(uey);
        sdo.m34975b(ueu.f47377f, "result.isSuccess() must be true");
        return new uev(ueu, uey, null, new uet(z, num));
    }
}
