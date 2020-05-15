package p000;

import java.util.LinkedHashMap;

/* renamed from: bzzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzzm {
    static {
        bnic.m109492a(bzzn.f172064D, bzzn.f172065E, bzzn.f172068H, bzzn.f172101an);
        bnic.m109491a("com.google.location.sample", "com.google.location.bounding_box", "com.google.location.track");
        bnic.m109490a("com.google.activity.segment", "com.google.calories.expended");
        bnic bnic = bzzn.f172109c;
        bmxj bmxj = bzzl.f172060a;
        bmxy.m108581a(bmxj);
        LinkedHashMap b = bnmt.m109804b();
        for (Object obj : bnic) {
            b.put(obj, bmxj.apply(obj));
        }
        bnhe.m109413a(b);
    }

    /* renamed from: a */
    public static boolean m126357a(String str) {
        return bzzn.f172087a.contains(str);
    }

    /* renamed from: b */
    public static boolean m126358b(String str) {
        return bzzn.f172108b.contains(str);
    }
}
