package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* renamed from: uiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uiv implements vpj {
    APP_ID(r1),
    NETWORK_TYPE_PREFERENCE(r1),
    BATTERY_USAGE_PREFERENCE(r1),
    ROAMING_PREFERENCE(r1);
    

    /* renamed from: e */
    private final unp f47741e;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("appId", 1);
        unu.mo27741b();
        unu.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        b.mo27747a(42, unu);
        b.mo27748b(128);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("dataConnectionPreference", 1);
        unu2.mo27741b();
        b2.mo27747a(42, unu2);
        b2.mo27748b(43);
        unu unu3 = new unu("networkTypePreference", 1);
        unu3.mo27741b();
        unu3.mo27738a((Object) 1);
        b2.mo27747a(43, unu3);
        b2.mo27748b(128);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("batteryUsagePreference", 1);
        unu4.mo27741b();
        b3.mo27747a(42, unu4);
        b3.mo27748b(128);
        uoa b4 = uoa.m39042b();
        unu unu5 = new unu("roamingAllowed", 1);
        unu5.mo27738a((Object) 1);
        unu5.mo27741b();
        b4.mo27747a(43, unu5);
        b4.mo27748b(128);
    }

    private uiv(uoa uoa) {
        this.f47741e = uoa.mo27745a(173, uiw.f47742a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47741e;
    }
}
