package p000;

import java.util.Collection;

/* renamed from: bnec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnec {
    /* renamed from: a */
    public static Collection m109116a(Collection collection, bmxj bmxj) {
        return new bneb(collection, bmxj);
    }

    /* renamed from: a */
    public static Collection m109117a(Collection collection, bmxz bmxz) {
        bmxy.m108581a(collection);
        bmxy.m108581a(bmxz);
        return new bnea(collection, bmxz);
    }

    /* renamed from: a */
    static boolean m109118a(Collection collection, Object obj) {
        bmxy.m108581a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m109119a(Collection collection, Collection collection2) {
        for (Object obj : collection2) {
            if (!collection.contains(obj)) {
                return false;
            }
        }
        return true;
    }
}
