package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* renamed from: ult */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ult implements vpj {
    ACTION_TYPE(r1),
    ACTION_ID(r1),
    APPLY_ON_SERVER_TIME(r1),
    ACCOUNT_ID(r1);
    

    /* renamed from: e */
    public final unp f48159e;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("actionType", 2);
        unu.mo27741b();
        b.mo27747a(48, unu);
        uoa b2 = uoa.m39042b();
        unu unu2 = new unu("actionId", 1);
        unu2.mo27741b();
        unu2.mo27740a(new unp[0]);
        b2.mo27747a(48, unu2);
        uoa b3 = uoa.m39042b();
        unu unu3 = new unu("applyOnServerTime", 1);
        unu3.mo27741b();
        b3.mo27747a(48, unu3);
        uoa b4 = uoa.m39042b();
        unu unu4 = new unu("accountId", 1);
        unu4.mo27739a(uim.f47706a.f48341a, unv.CASCADE);
        unu4.mo27741b();
        unu4.mo27738a((Object) 0);
        b4.mo27747a(49, unu4);
    }

    private ult(uoa uoa) {
        this.f48159e = uoa.mo27745a(173, ulu.f48160a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48159e;
    }
}
