package p000;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: ayyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayyu implements ayvv {

    /* renamed from: a */
    public final ayyi f98767a;

    /* renamed from: b */
    public final aywe f98768b;

    /* renamed from: c */
    private final ayyo f98769c;

    public ayyu(ayyi ayyi, ayyo ayyo, aywe aywe) {
        this.f98767a = ayyi;
        this.f98769c = ayyo;
        this.f98768b = aywe;
    }

    /* renamed from: a */
    public final bqgg mo54458a(ayvy ayvy) {
        Throwable th;
        bqgg bqgg;
        boolean z;
        boolean z2;
        ayvy ayvy2 = ayvy;
        bljb a = blkh.m107281a("GIL:NVLGraftHandler");
        try {
            ayyf ayyf = (ayyf) ayvy2.f98587a;
            String a2 = this.f98767a.mo40447a(ayyf);
            if (!a2.isEmpty()) {
                bqgg b = this.f98767a.mo40448b(ayyf);
                bqgg a3 = this.f98767a.mo40446a(ayvy2.f98588b);
                List list = ayyf.f98737c;
                SparseIntArray sparseIntArray = ayyf.f98738d;
                int size = list.size();
                bxvf[] bxvfArr = new bxvf[size];
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < size) {
                    aywu aywu = (aywu) list.get(i);
                    bptu bptu = aywu.f98654c;
                    if (bptu == null) {
                        bptu = bptu.f139179e;
                    }
                    if ((bptu.f139181a & 2048) != 0) {
                        bptv bptv = bptu.f139184d;
                        if (bptv == null) {
                            bptv = bptv.f139186d;
                        }
                        z = (bptv.f139188a & 2) != 0;
                    } else {
                        z = true;
                    }
                    bmxy.m108588a(z);
                    if (i == bptu.f139182b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bmxy.m108588a(z2);
                    bxvf bxvf = (bxvf) bpcb.f135695g.mo74144da();
                    int i2 = bptu.f139183c;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bpcb bpcb = (bpcb) bxvf.f164949b;
                    List list2 = list;
                    bpcb.f135697a |= 1;
                    bpcb.f135698b = i2;
                    bxvfArr[i] = bxvf;
                    int a4 = bpca.m111766a(aywu.f98655d);
                    if (a4 != 0) {
                        if (a4 != 1) {
                            bxvf bxvf2 = bxvfArr[i];
                            int a5 = bpca.m111766a(aywu.f98655d);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            if (bxvf2.f164950c) {
                                bxvf2.mo74035c();
                                bxvf2.f164950c = false;
                            }
                            bpcb bpcb2 = (bpcb) bxvf2.f164949b;
                            bpcb2.f135702f = a5 - 1;
                            bpcb2.f135697a |= 32;
                        }
                    }
                    if (aywu.f98653b.size() > 0) {
                        this.f98769c.mo54530a(aywu, aywu.f98653b, bxvfArr[i], arrayList);
                    }
                    i++;
                    list = list2;
                }
                for (int i3 = 0; i3 < size; i3++) {
                    int valueAt = sparseIntArray.valueAt(i3);
                    if (valueAt != -1) {
                        bxvf bxvf3 = bxvfArr[valueAt];
                        if (bxvf3.f164950c) {
                            bxvf3.mo74035c();
                            bxvf3.f164950c = false;
                        }
                        bpcb bpcb3 = (bpcb) bxvf3.f164949b;
                        bpcb bpcb4 = bpcb.f135695g;
                        if (!bpcb3.f135700d.mo73666a()) {
                            bpcb3.f135700d = GeneratedMessageLite.m124019a(bpcb3.f135700d);
                        }
                        bpcb3.f135700d.mo74153d(i3);
                    }
                }
                if (arrayList.isEmpty()) {
                    bqgg = bqga.m112775a(bxvfArr);
                } else {
                    bqgg = bqga.m112785c(arrayList).mo69216a(new ayys(arrayList, bxvfArr), bqfb.INSTANCE);
                }
                bqgg a6 = bqga.m112786c(bqgg).mo69216a(new ayyr(bqgg, ayyf), bqfb.INSTANCE);
                bqgg a7 = bqga.m112786c(b, a3, a6).mo69214a(bljx.m107265a(new ayyq(this, a2, b, a6, ayyf, a3, ayvy)), bqfb.INSTANCE);
                a.mo66586a(a7);
                if (a != null) {
                    a.close();
                }
                return a7;
            }
            bqgg a8 = bqga.m112775a((Object) null);
            if (a != null) {
                a.close();
            }
            return a8;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    /* renamed from: a */
    public final Set mo54459a() {
        return bnic.m109489a(ayyf.class);
    }
}
