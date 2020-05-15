package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* renamed from: uiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uiy implements vpj {
    APP_ID(r1),
    DRIVE_APP_ID(r1),
    SCOPE(r1);
    

    /* renamed from: d */
    private final unp f47748d;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("appId", 1);
        unu.mo27741b();
        unu.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        b.mo27747a(1, unu);
        b.mo27748b(122);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("driveAppId", 1);
        unu2.mo27741b();
        unu2.mo27738a((Object) 0);
        b2.mo27747a(121, unu2);
        b2.mo27748b(122);
        unu unu3 = new unu("driveAppId", 1);
        unu3.mo27741b();
        unu3.mo27737a();
        unu3.mo27739a(ujo.f47807a.f48341a, unv.CASCADE);
        b2.mo27747a(122, unu3);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("scope", 1);
        unu4.mo27741b();
        unu4.mo27740a(APP_ID.f47748d);
        b3.mo27747a(1, unu4);
        b3.mo27748b(122);
        unu unu5 = new unu("scope", 1);
        unu5.mo27741b();
        unu5.mo27740a(DRIVE_APP_ID.f47748d);
        b3.mo27747a(122, unu5);
    }

    private uiy(uoa uoa) {
        this.f47748d = uoa.mo27745a(173, uiz.f47749a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47748d;
    }
}
