package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* renamed from: ujn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ujn implements vpj {
    ACCOUNT_ID(r1),
    SDK_APP_ID(r1),
    EXPIRY_TIMESTAMP(r1),
    APPDATA_ROOT_ENTRY_ID(r1),
    IS_APPDATA_ROOT_PLACEHOLDER(r1),
    HAS_APPDATA_SYNCED(r1),
    SCOPES(r1);
    

    /* renamed from: h */
    public final unp f47806h;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("accountId", 1);
        unu.mo27741b();
        unu.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        b.mo27747a(121, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("projectNumber", 1);
        unu2.mo27741b();
        unu2.mo27737a();
        unu2.mo27740a(ACCOUNT_ID.f47806h);
        b2.mo27747a(121, unu2);
        b2.mo27748b(162);
        unu unu3 = new unu("sdkAppId", 2);
        unu3.mo27741b();
        unu3.mo27737a();
        unu3.mo27740a(ACCOUNT_ID.f47806h);
        b2.mo27747a(162, unu3);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("expiryTimestamp", 1);
        unu4.mo27741b();
        b3.mo27747a(121, unu4);
        uoa b4 = uoa.m39042b();
        unu unu5 = new unu("appDataRootEntryId", 1);
        unu5.mo27739a(ukn.f48023a.f48341a, unv.SET_NULL);
        b4.mo27747a(129, unu5);
        b4.mo27748b(132);
        unu unu6 = new unu("appDataRootEntryId", 1);
        unu6.mo27739a(ukm.ENTRY_ID.f48022aB, unv.SET_NULL);
        b4.mo27747a(132, unu6);
        uoa b5 = uoa.m39042b();
        b5.mo27747a(129, new unu("isAppDataRootPlaceholder", 1));
        uoa b6 = uoa.m39042b();
        b6.mo27747a(129, new unu("hasAppDataSynced", 1));
        b6.mo27748b(140);
        uoa b7 = uoa.m39042b();
        b7.mo27747a(134, new unu("scopes", 2));
        b7.mo27748b(135);
        unu unu7 = new unu("scopes", 2);
        unu7.mo27741b();
        b7.mo27747a(135, unu7);
    }

    private ujn(uoa uoa) {
        this.f47806h = uoa.mo27745a(173, ujo.f47807a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47806h;
    }
}
