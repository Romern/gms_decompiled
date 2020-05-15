package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* JADX WARN: Init of enum f can be incorrect */
/* renamed from: ulk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ulk implements vpj {
    ACCOUNT_ID(r1),
    FEED_TYPE(r1),
    FEED_PARAMETERS(r1),
    NEXT_PAGE_TOKEN(r1),
    CLIP_TIME(r1),
    NUM_PAGES_RETRIEVED(r1);
    

    /* renamed from: g */
    public final unp f48128g;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("accountId", 1);
        unu.mo27741b();
        unu.mo27737a();
        unu.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        b.mo27747a(1, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("feedType", 2);
        unu2.mo27741b();
        unu2.mo27738a(uzz.QUERY.f48797f);
        b2.mo27747a(1, unu2);
        uoa b3 = uoa.m39042b();
        unu unu3 = new unu("feedParameters", 2);
        unu3.mo27741b();
        unu3.mo27737a();
        b3.mo27747a(1, unu3);
        uoa b4 = uoa.m39042b();
        b4.mo27747a(1, new unu("nextPageToken", 2));
        uoa b5 = uoa.m39042b();
        unu unu4 = new unu("clipTime", 1);
        unu4.mo27738a((Object) Long.MAX_VALUE);
        b5.mo27747a(1, unu4);
        uoa b6 = uoa.m39042b();
        unu unu5 = new unu("numPagesRetrieved", 1);
        unu5.mo27738a((Object) 0);
        unu5.mo27741b();
        b6.mo27747a(1, unu5);
    }

    private ulk(uoa uoa) {
        this.f48128g = uoa.mo27745a(173, ull.f48129a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48128g;
    }
}
