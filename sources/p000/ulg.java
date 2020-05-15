package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* renamed from: ulg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ulg implements vpj {
    PARENT_ENTRY_ID(r1),
    CHILD_ENTRY_ID(r1);
    

    /* renamed from: c */
    public final unp f48115c;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("parentEntryId", 1);
        unu.mo27741b();
        unu.mo27737a();
        unu.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b.mo27747a(1, unu);
        b.mo27748b(132);
        unu unu2 = new unu("parentEntryId", 1);
        unu2.mo27741b();
        unu2.mo27737a();
        unu2.mo27739a(ujs.f47815a.f48341a, unv.CASCADE);
        b.mo27747a(132, unu2);
        uoa b2 = uoa.m39042b();
        unu unu3 = new unu("childEntryId", 1);
        unu3.mo27741b();
        unu3.mo27737a();
        unu3.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        b2.mo27747a(1, unu3);
        b2.mo27748b(133);
        unu unu4 = new unu("childEntryId", 1);
        unu4.mo27741b();
        unu4.mo27737a();
        unu4.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        unu4.mo27740a(PARENT_ENTRY_ID.f48115c);
        b2.mo27747a(133, unu4);
    }

    private ulg(uoa uoa) {
        this.f48115c = uoa.mo27745a(173, ulh.f48116a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48115c;
    }
}
