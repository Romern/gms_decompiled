package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* JADX WARN: Init of enum i can be incorrect */
/* JADX WARN: Init of enum j can be incorrect */
/* JADX WARN: Init of enum k can be incorrect */
/* JADX WARN: Init of enum l can be incorrect */
/* JADX WARN: Init of enum m can be incorrect */
/* renamed from: ump */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ump implements vpj {
    ENTRY_ID(r1),
    UNUSED(r1),
    UNUSED_2(r1),
    RESOURCE_ID(r1),
    LOCAL_ID(r1),
    AUTHORIZED_APP(r1),
    DRIVE_APP_ID(r1),
    LAST_ACCESSED(r1),
    SIZE_BYTES(r1),
    DATABASE_NAME(r1),
    HAS_PENDING_CHANGES(r1),
    REQUIRES_SYNC(r1),
    HISTORY_LENGTH(r1);
    

    /* renamed from: n */
    public final unp f48247n;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("entryId", 1);
        unu.mo27737a();
        unu.mo27741b();
        unu.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b.mo27747a(30, unu);
        b.mo27748b(34);
        unu unu2 = new unu("entryId", 1);
        unu2.mo27737a();
        unu2.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b.mo27747a(34, unu2);
        b.mo27748b(132);
        unu unu3 = new unu("entryId", 1);
        unu3.mo27737a();
        unu3.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        b.mo27747a(132, unu3);
        uoa b2 = uoa.m39042b();
        unu unu4 = new unu("packagingId", 1);
        unu4.mo27741b();
        b2.mo27747a(30, unu4);
        b2.mo27748b(35);
        uoa b3 = uoa.m39042b();
        unu unu5 = new unu("authorizedApp", 1);
        unu5.mo27737a();
        unu5.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        unu5.mo27740a(ENTRY_ID.f48247n);
        b3.mo27747a(35, unu5);
        b3.mo27748b(36);
        uoa b4 = uoa.m39042b();
        b4.mo27747a(34, new unu("resourceId", 2));
        uoa b5 = uoa.m39042b();
        b5.mo27747a((int) ErrorInfo.TYPE_SDU_FAILED, new unu("localId", 2));
        uoa b6 = uoa.m39042b();
        unu unu6 = new unu("authorizedApp", 1);
        unu6.mo27737a();
        unu6.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        unu6.mo27740a(ENTRY_ID.f48247n, RESOURCE_ID.f48247n);
        b6.mo27747a(36, unu6);
        b6.mo27748b(ErrorInfo.TYPE_SDU_FAILED);
        unu unu7 = new unu("authorizedApp", 1);
        unu7.mo27737a();
        unu7.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        unu7.mo27740a(ENTRY_ID.f48247n, RESOURCE_ID.f48247n, LOCAL_ID.f48247n);
        b6.mo27747a((int) ErrorInfo.TYPE_SDU_FAILED, unu7);
        b6.mo27748b(137);
        uoa b7 = uoa.m39042b();
        unu unu8 = new unu("driveAppId", 1);
        unu8.mo27737a();
        unu8.mo27739a(ujo.f47807a.f48341a, unv.CASCADE);
        unu8.mo27740a(ENTRY_ID.f48247n, RESOURCE_ID.f48247n, LOCAL_ID.f48247n);
        b7.mo27747a(136, unu8);
        uoa b8 = uoa.m39042b();
        unu unu9 = new unu("lastAccessed", 1);
        unu9.mo27741b();
        unu9.mo27737a();
        b8.mo27747a(30, unu9);
        uoa b9 = uoa.m39042b();
        unu unu10 = new unu("size", 1);
        unu10.mo27737a();
        b9.mo27747a(30, unu10);
        uoa b10 = uoa.m39042b();
        unu unu11 = new unu("databasePath", 2);
        unu11.mo27737a();
        b10.mo27747a(30, unu11);
        uoa b11 = uoa.m39042b();
        unu unu12 = new unu("hasPendingChanges", 1);
        unu12.mo27737a();
        b11.mo27747a(30, unu12);
        uoa b12 = uoa.m39042b();
        unu unu13 = new unu("requiresSync", 1);
        unu13.mo27737a();
        b12.mo27747a(37, unu13);
        uoa b13 = uoa.m39042b();
        unu unu14 = new unu("historyLength", 1);
        unu14.mo27741b();
        unu14.mo27738a((Object) 0);
        unu14.mo27737a();
        b13.mo27747a(40, unu14);
    }

    private ump(uoa uoa) {
        this.f48247n = uoa.mo27745a(173, umq.f48248a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48247n;
    }
}
