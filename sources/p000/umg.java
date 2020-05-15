package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* renamed from: umg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum umg implements vpj {
    PERSISTED_EVENT_ID(r1),
    CONTENT_HASH(r1);
    

    /* renamed from: c */
    public final unp f48204c;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("persistedEventId", 1);
        unu.mo27739a(umk.f48215a.f48341a, unv.CASCADE);
        unu.mo27741b();
        b.mo27747a(31, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("contentHash", 2);
        unu2.mo27739a(ukr.CONTENT_HASH.f48050k, unv.CASCADE);
        unu2.mo27741b();
        b2.mo27747a(31, unu2);
    }

    private umg(uoa uoa) {
        this.f48204c = uoa.mo27745a(173, umh.f48205a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48204c;
    }
}
