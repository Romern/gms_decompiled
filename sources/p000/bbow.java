package p000;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bbow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbow {
    /* renamed from: a */
    public static bngx m88301a(Collection collection, bmxj bmxj) {
        bngs j = bngx.m109377j();
        for (Object obj : collection) {
            j.mo67668c(bmxj.apply(obj));
        }
        return j.mo67664a();
    }

    /* renamed from: b */
    public static ArrayList m88302b(Collection collection, bmxj bmxj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            arrayList.add(bmxj.apply(obj));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static bngx m88303c(Collection collection, bmxj bmxj) {
        bngs j = bngx.m109377j();
        for (Object obj : collection) {
            bmxv bmxv = (bmxv) bmxj.apply(obj);
            if (bmxv.mo66813a()) {
                j.mo67668c(bmxv.mo66814b());
            }
        }
        return j.mo67664a();
    }
}
