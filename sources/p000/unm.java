package p000;

/* JADX WARN: Init of enum a can be incorrect */
/* JADX WARN: Init of enum b can be incorrect */
/* JADX WARN: Init of enum c can be incorrect */
/* JADX WARN: Init of enum d can be incorrect */
/* JADX WARN: Init of enum e can be incorrect */
/* renamed from: unm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum unm implements vpj {
    PERMISSIONS_ID(r1),
    DISPLAY_NAME(r1),
    EMAIL_ADDRESS(r1),
    PICTURE_URL(r1),
    IS_AUTHENTICATED_USER(r1);
    

    /* renamed from: f */
    public final unp f48329f;

    static {
        uoa b = uoa.m39042b();
        unu unu = new unu("permissionsId", 2);
        unu.mo27741b();
        unu.mo27740a(new unp[0]);
        unu.mo27737a();
        b.mo27747a(27, unu);
        uoa b2 = uoa.m39042b();
        b2.mo27747a(27, new unu("displayName", 2));
        uoa b3 = uoa.m39042b();
        b3.mo27747a(27, new unu("emailAddress", 2));
        uoa b4 = uoa.m39042b();
        b4.mo27747a(27, new unu("pictureUrl", 2));
        uoa b5 = uoa.m39042b();
        unu unu2 = new unu("isAuthenticatedUser", 1);
        unu2.mo27741b();
        unu2.mo27738a((Object) 0);
        b5.mo27747a(27, unu2);
    }

    private unm(uoa uoa) {
        this.f48329f = uoa.mo27745a(173, unn.f48330a);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo27461b() {
        return this.f48329f;
    }
}
