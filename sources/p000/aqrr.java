package p000;

import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqrr implements aqwu {

    /* renamed from: a */
    final /* synthetic */ aqru f86670a;

    public aqrr(aqru aqru) {
        this.f86670a = aqru;
    }

    /* renamed from: a */
    public final void mo48117a(List list) {
        int i;
        int i2;
        bzil a = aqrx.m72026a(list);
        if (a == null || (a.f170204a & 8) == 0) {
            aqsm aqsm = (aqsm) this.f86670a;
            aqsm.f86700c.mo48127b();
            aqsm.f86704g = aqsm.f86703f.mo48121a();
            aqsm.f86704g.mo64020c();
            return;
        }
        aqru aqru = this.f86670a;
        bzin bzin = a.f170206c;
        if (bzin == null) {
            bzin = bzin.f170212b;
        }
        aqsm aqsm2 = (aqsm) aqru;
        aqsm2.f86699b = true;
        aqsm2.f86700c.mo48127b();
        aqsm2.mo48131a(bzin.f170214a);
        List list2 = aqsm2.f86702e;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            aqsl aqsl = (aqsl) list2.get(i3);
            ArrayList arrayList = new ArrayList();
            bxwc bxwc = aqsm2.f86698a.f170250b;
            int size2 = bxwc.size();
            int i4 = 0;
            while (i4 < size2) {
                bxwc bxwc2 = ((bzit) bxwc.get(i4)).f170238d;
                int size3 = bxwc2.size();
                int i5 = 0;
                while (true) {
                    i2 = i4 + 1;
                    if (i5 >= size3) {
                        break;
                    }
                    arrayList.add(((bziu) bxwc2.get(i5)).f170242a);
                    i5++;
                }
                i4 = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            bxwc bxwc3 = aqsm2.f86698a.f170250b;
            int size4 = bxwc3.size();
            int i6 = 0;
            while (i6 < size4) {
                bxwc bxwc4 = ((bzit) bxwc3.get(i6)).f170237c;
                int size5 = bxwc4.size();
                int i7 = 0;
                while (true) {
                    i = i6 + 1;
                    if (i7 >= size5) {
                        break;
                    }
                    arrayList2.add(((bziu) bxwc4.get(i7)).f170242a);
                    i7++;
                }
                i6 = i;
            }
            aqsl.mo48047a(arrayList, arrayList2);
        }
        aqsm2.f86704g = aqsm2.f86703f.mo48122a(C0126R.string.profile_merge_merged_succeed, C0126R.string.profile_merge_undo, new aqsi(aqsm2));
        aqsm2.f86704g.mo64020c();
    }
}
