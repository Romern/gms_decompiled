package p000;

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
/* renamed from: uke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum uke implements vpj {
    ENTRY_ID(r1),
    PERMISSION_ID(r1),
    ACCOUNT_IDENTIFIER(r1),
    ACCOUNT_NAME(r1),
    ACCOUNT_TYPE(r1),
    PHOTO_LINK(r1),
    ROLE(r1),
    GENOA_ROLE_VALUE(r1),
    GENOA_ROLE_ACTION_ID(r1),
    IS_LINK_REQUIRED(r1),
    GENOA_IS_LINK_REQUIRED_VALUE(r1),
    GENOA_IS_LINK_REQUIRED_ACTION_ID(r1);
    

    /* renamed from: m */
    public final unp f47867m;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("entryId", 1);
        unu.mo27741b();
        unu.mo27737a();
        unu.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b.mo27747a(67, unu);
        b.mo27748b(132);
        unu unu2 = new unu("entryId", 1);
        unu2.mo27741b();
        unu2.mo27737a();
        unu2.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        b.mo27747a(132, unu2);
        uoa b2 = uoa.m39042b();
        b2.mo27747a(67, new unu("permissionId", 2));
        uoa b3 = uoa.m39042b();
        b3.mo27747a(67, new unu("accountIdentifier", 2));
        b3.mo27748b(71);
        unu unu3 = new unu("accountIdentifier", 2);
        unu3.mo27740a(ENTRY_ID.f47867m);
        b3.mo27747a(71, unu3);
        uoa b4 = uoa.m39042b();
        b4.mo27747a(67, new unu("accountName", 2));
        uoa b5 = uoa.m39042b();
        unu unu4 = new unu("accountType", 1);
        unu4.mo27741b();
        b5.mo27747a(67, unu4);
        uoa b6 = uoa.m39042b();
        b6.mo27747a(67, new unu("photoLink", 2));
        uoa b7 = uoa.m39042b();
        unu unu5 = new unu("role", 1);
        unu5.mo27741b();
        b7.mo27747a(67, unu5);
        uoa b8 = uoa.m39042b();
        b8.mo27747a(67, new unu("genoaRoleValue", 1));
        uoa b9 = uoa.m39042b();
        b9.mo27747a(67, new unu("genoaRoleActionId", 1));
        uoa b10 = uoa.m39042b();
        unu unu6 = new unu("isLinkRequired", 1);
        unu6.mo27741b();
        unu6.mo27738a((Object) 0);
        b10.mo27747a(67, unu6);
        uoa b11 = uoa.m39042b();
        b11.mo27747a(67, new unu("genoaIsLinkRequiredValue", 1));
        uoa b12 = uoa.m39042b();
        b12.mo27747a(67, new unu("genoaIsLinkRequiredActionId", 1));
    }

    private uke(uoa uoa) {
        this.f47867m = uoa.mo27745a(173, ukf.f47868a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f47867m;
    }
}
