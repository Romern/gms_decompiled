package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: rsp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rsp {

    /* renamed from: a */
    public final Map f43598a = new HashMap();

    /* renamed from: b */
    public final bryy f43599b;

    /* renamed from: c */
    public final rsq f43600c;

    /* renamed from: d */
    public final rsl f43601d;

    public rsp(rsl rsl, bryy bryy, rsq rsq) {
        this.f43601d = rsl;
        this.f43599b = bryy;
        this.f43600c = rsq;
    }

    /* renamed from: a */
    static String m34358a(sgj sgj) {
        String valueOf = String.valueOf(sgj.name());
        return valueOf.length() == 0 ? new String("CLIENT_LOGGING_GMSCORE_") : "CLIENT_LOGGING_GMSCORE_".concat(valueOf);
    }
}
