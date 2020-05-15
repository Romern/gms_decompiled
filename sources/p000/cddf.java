package p000;

/* renamed from: cddf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cddf implements cdde {

    /* renamed from: a */
    public static final bdyx f180521a;

    /* renamed from: b */
    public static final bdyx f180522b;

    /* renamed from: c */
    public static final bdyx f180523c;

    static {
        bdyw a = new bdyw(bdyj.m91581a("com.google.android.gms.chromesync")).mo58443a();
        f180521a = bdyx.m91609a(a, "sync_subscription_api_grpc_host", "https://firebaseperusertopics-pa.googleapis.com/v1/perusertopics/");
        f180522b = bdyx.m91609a(a, "sync_subscription_api_server_scope", "https://www.googleapis.com/auth/firebase.messaging");
        f180523c = bdyx.m91609a(a, "sync_subscription_api_grpc_port", "8181035976");
    }

    /* renamed from: a */
    public final String mo77281a() {
        return (String) f180521a.mo58455c();
    }

    /* renamed from: b */
    public final String mo77282b() {
        return (String) f180522b.mo58455c();
    }

    /* renamed from: c */
    public final String mo77283c() {
        return (String) f180523c.mo58455c();
    }
}
