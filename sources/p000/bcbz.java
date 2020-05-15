package p000;

import java.util.List;

/* renamed from: bcbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bcbz {
    /* renamed from: a */
    public static bngx m88785a(List list) {
        bngs j = bngx.m109377j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bcbz bcbz = (bcbz) list.get(i);
            if (bcbz.mo56678b() == 1) {
                j.mo67668c(bcbz.mo56677a());
            }
        }
        return j.mo67664a();
    }

    /* renamed from: b */
    public static bngx m88786b(List list) {
        bngs j = bngx.m109377j();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bcbz bcbz = (bcbz) list.get(i);
            if (bcbz.mo56678b() == 2) {
                j.mo67668c(bcbz.mo56682c());
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public abstract bcns mo56677a();

    /* renamed from: b */
    public abstract int mo56678b();

    /* renamed from: c */
    public abstract Object mo56682c();
}
