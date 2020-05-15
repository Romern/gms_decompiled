package p000;

import java.util.Map;

/* renamed from: zvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zvr {

    /* renamed from: a */
    private static final bmyx f56034a = bmyx.m108640a(',');

    /* renamed from: b */
    private static final bmyv f56035b = bmyx.m108640a('|').mo66924c("=");

    /* renamed from: a */
    public static Map m46577a(String str) {
        if (!str.isEmpty()) {
            return f56035b.mo66915a(str);
        }
        return bnoj.f131912b;
    }

    /* renamed from: b */
    public static Map m46578b(String str) {
        return bnmt.m109799a(m46577a(str), zvq.f56033a);
    }

    /* renamed from: c */
    public static bnic m46579c(String str) {
        if (!str.isEmpty()) {
            return bnic.m109488a(f56034a.mo66918a((CharSequence) str));
        }
        return bnon.f131923a;
    }
}
