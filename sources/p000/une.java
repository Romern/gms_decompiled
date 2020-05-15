package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* renamed from: une */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum une implements vpj {
    CONTENT_HASH(r1),
    ENTRY_ID(r1),
    VERSION(r1);
    

    /* renamed from: d */
    public final unp f48305d;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("contentHash", 2);
        unu.mo27741b();
        unu.mo27739a(ukr.CONTENT_HASH.f48050k, unv.CASCADE);
        b.mo27747a(46, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("entryId", 1);
        unu2.mo27741b();
        unu2.mo27739a(ukn.f48023a.f48341a, unv.CASCADE);
        unu2.mo27737a();
        b2.mo27747a(46, unu2);
        b2.mo27748b(132);
        unu unu3 = new unu("entryId", 1);
        unu3.mo27741b();
        unu3.mo27739a(ukm.ENTRY_ID.f48022aB, unv.CASCADE);
        unu3.mo27737a();
        b2.mo27747a(132, unu3);
        uoa b3 = uoa.m39042b();
        unu unu4 = new unu("version", 1);
        unu4.mo27741b();
        b3.mo27747a(46, unu4);
    }

    private une(uoa uoa) {
        this.f48305d = uoa.mo27745a(173, unf.f48306a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48305d;
    }
}
