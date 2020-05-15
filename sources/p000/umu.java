package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* JADX WARN: Init of enum h can be incorrect */
/* renamed from: umu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum umu implements vpj {
    ENTRY_ID(r1),
    EVENT_TYPE(r1),
    PACKAGE_NAME(r1),
    EVENT_SERVICE(r1),
    SIGNING_CERTIFICIATE_HASH(r1),
    LAST_UPDATE_TIME(r1),
    ANDROID_APP_ID(r1),
    SERIALIZED_SUBSCRIPTION_DETAILS(r1);
    

    /* renamed from: i */
    public final unp f48266i;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("entryId", 1);
        unu.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        unu.mo27737a();
        unu.mo27741b();
        b.mo27747a(2, unu);
        b.mo27748b(17);
        unu unu2 = new unu("entryId", 1);
        unu2.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        unu2.mo27737a();
        b.mo27747a(17, unu2);
        b.mo27748b(132);
        unu unu3 = new unu("entryId", 1);
        unu3.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        unu3.mo27737a();
        b.mo27747a(132, unu3);
        uoa b2 = uoa.m39042b();
        unu unu4 = new unu("eventType", 1);
        unu4.mo27741b();
        b2.mo27747a(2, unu4);
        uoa b3 = uoa.m39042b();
        unu unu5 = new unu("packageName", 2);
        unu5.mo27737a();
        unu5.mo27741b();
        b3.mo27747a(2, unu5);
        b3.mo27748b(33);
        unu unu6 = new unu("packageName", 2);
        unu6.mo27737a();
        b3.mo27747a(33, unu6);
        b3.mo27748b(170);
        uoa b4 = uoa.m39042b();
        unu unu7 = new unu("eventService", 2);
        unu7.mo27741b();
        b4.mo27747a(2, unu7);
        b4.mo27748b(32);
        b4.mo27747a(32, new unu("eventService", 2));
        b4.mo27748b(170);
        uoa b5 = uoa.m39042b();
        unu unu8 = new unu("signingCertificateHash", 2);
        unu8.mo27737a();
        unu8.mo27741b();
        unu8.mo27740a(ENTRY_ID.f48266i, EVENT_TYPE.f48266i, PACKAGE_NAME.f48266i, EVENT_SERVICE.f48266i);
        b5.mo27747a(2, unu8);
        b5.mo27748b(17);
        unu unu9 = new unu("signingCertificateHash", 2);
        unu9.mo27737a();
        unu9.mo27741b();
        b5.mo27747a(17, unu9);
        b5.mo27748b(33);
        b5.mo27747a(33, new unu("signingCertificateHash", 2));
        b5.mo27748b(170);
        uoa b6 = uoa.m39042b();
        unu unu10 = new unu("lastUpdateTime", 1);
        unu10.mo27741b();
        unu10.mo27738a((Object) 0);
        b6.mo27747a(32, unu10);
        uoa b7 = uoa.m39042b();
        unu unu11 = new unu("appAuthMetadataId", 1);
        unu11.mo27739a(uiq.f47724a.f48341a, unv.CASCADE);
        unu11.mo27738a((Object) -1);
        unu11.mo27741b();
        b7.mo27747a(33, unu11);
        b7.mo27749c(131, "androidAppId");
        uoa b8 = uoa.m39042b();
        b8.mo27747a(65, new unu("serializedSubscriptionDetails", 2));
    }

    private umu(uoa uoa) {
        this.f48266i = uoa.mo27745a(173, umv.f48267a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48266i;
    }
}
