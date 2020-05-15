package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* renamed from: uis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uis implements vpj {
    APP_PACKAGING_ID(r1),
    ACCOUNT_ID(r1),
    DRIVE_APP_ID(r1),
    HAS_APPDATA_SYNCED(r1),
    APPDATA_FOLDER_ENTRY_ID(r1),
    IS_APPDATA_FOLDER_PLACEHOLDER(r1);
    

    /* renamed from: g */
    private final unp f47733g;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("appPackagingId", 1);
        unu.mo27741b();
        b.mo27747a(6, unu);
        b.mo27748b(122);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("accountId", 1);
        unu2.mo27741b();
        unu2.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        b2.mo27747a(6, unu2);
        b2.mo27748b(9);
        unu unu3 = new unu("accountId", 1);
        unu3.mo27741b();
        unu3.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        unu3.mo27740a(APP_PACKAGING_ID.f47733g);
        b2.mo27747a(9, unu3);
        b2.mo27748b(122);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("driveAppId", 1);
        unu4.mo27741b();
        unu4.mo27738a((Object) 0);
        b3.mo27747a(121, unu4);
        b3.mo27748b(122);
        unu unu5 = new unu("driveAppId", 1);
        unu5.mo27741b();
        unu5.mo27737a();
        unu5.mo27740a(new unp[0]);
        unu5.mo27739a(ujo.f47807a.f48341a, unv.CASCADE);
        b3.mo27747a(122, unu5);
        b3.mo27748b(130);
        uoa b4 = uoa.m39042b();
        unu unu6 = new unu("hasAppDataSynced", 1);
        unu6.mo27738a((Object) 0);
        unu6.mo27741b();
        b4.mo27747a(6, unu6);
        b4.mo27748b(130);
        uoa b5 = uoa.m39042b();
        unu unu7 = new unu("appDataFolderEntryId", 1);
        unu7.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b5.mo27747a(6, unu7);
        b5.mo27748b(130);
        uoa b6 = uoa.m39042b();
        unu unu8 = new unu("isAppDataFolderPlaceholder", 1);
        unu8.mo27738a((Object) 1);
        unu8.mo27741b();
        b6.mo27747a(6, unu8);
        b6.mo27748b(130);
    }

    private uis(uoa uoa) {
        this.f47733g = uoa.mo27745a(173, uit.f47734a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47733g;
    }
}
