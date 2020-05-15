package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ecq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecq {

    /* renamed from: a */
    public static final bngx f14693a = bngx.m109376e();

    /* renamed from: b */
    public final List f14694b = new ArrayList();

    public ecq(bxlh bxlh) {
        mo9967a(bxlh);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, bmxz]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo9967a(bxlh bxlh) {
        this.f14694b.clear();
        if (bxlh != null) {
            bxwc bxwc = bxlh.f163850a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                bxlg bxlg = (bxlg) bxwc.get(i);
                List list = this.f14694b;
                bxla bxla = bxlg.f163845a;
                if (bxla == null) {
                    bxla = bxla.f163823c;
                }
                long j = bxla.f163825a;
                bxla bxla2 = bxlg.f163845a;
                if (bxla2 == null) {
                    bxla2 = bxla.f163823c;
                }
                long j2 = bxla2.f163826b;
                ArrayList arrayList = new ArrayList(new bxvv(bxlg.f163846b, bxlg.f163842c));
                bnjd.m109580a((Iterable) arrayList, eco.f14689a);
                Collections.sort(arrayList);
                list.add(new ecp(j, j2, arrayList));
            }
        }
    }
}
