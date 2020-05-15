package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* JADX WARN: Init of enum g can be incorrect */
/* renamed from: umx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum umx implements vpj {
    ACCOUNT_ID(r1),
    SPACE(r1),
    QUERY(r1),
    APP_PROJECT_NUMBER(r1),
    NEXT_PAGE_TOKEN(r1),
    CLIP_TIME(r1),
    NUM_PAGES_RETRIEVED(r1);
    

    /* renamed from: h */
    private final unp f48277h;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("accountId", 1);
        unu.mo27741b();
        unu.mo27737a();
        unu.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        b.mo27747a(82, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("space", 2);
        unu2.mo27741b();
        unu2.mo27737a();
        b2.mo27747a(82, unu2);
        uoa b3 = uoa.m39042b();
        unu unu3 = new unu("query", 2);
        unu3.mo27737a();
        b3.mo27747a(82, unu3);
        uoa b4 = uoa.m39042b();
        unu unu4 = new unu("appPackagingId", 1);
        unu4.mo27737a();
        unu4.mo27740a(ACCOUNT_ID.f48277h, SPACE.f48277h, QUERY.f48277h);
        b4.mo27747a(82, unu4);
        b4.mo27749c(125, "appProjectNumber");
        uoa b5 = uoa.m39042b();
        b5.mo27747a(82, new unu("nextPageToken", 2));
        uoa b6 = uoa.m39042b();
        b6.mo27747a(82, new unu("clipTime", 1));
        uoa b7 = uoa.m39042b();
        unu unu5 = new unu("numPagesRetrieved", 1);
        unu5.mo27741b();
        b7.mo27747a(82, unu5);
    }

    private umx(uoa uoa) {
        this.f48277h = uoa.mo27745a(173, umy.f48278a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48277h;
    }
}
