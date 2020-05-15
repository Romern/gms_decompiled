package p000;

import java.util.HashSet;
import java.util.Set;

/* renamed from: bhtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhtg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bvoa[] f119537a;

    /* renamed from: b */
    final /* synthetic */ bhtl f119538b;

    public bhtg(bhtl bhtl, bvoa[] bvoaArr) {
        this.f119538b = bhtl;
        this.f119537a = bvoaArr;
    }

    public final void run() {
        bhtl bhtl = this.f119538b;
        bvoa[] bvoaArr = this.f119537a;
        if (bhtl.f119551b != null) {
            int length = bvoaArr.length;
            HashSet hashSet = new HashSet(length);
            for (bvoa bvoa : bvoaArr) {
                if ((bvoa.f156996a & 1) != 0) {
                    bvni bvni = bvoa.f156997b;
                    if (bvni == null) {
                        bvni = bvni.f156861b;
                    }
                    hashSet.add(Long.valueOf(bvni.f156863a));
                }
            }
            bhtq a = bhtl.f119551b.mo64242a((Set) hashSet);
            C1223np npVar = new C1223np(a.f119564b.size());
            for (bvoa bvoa2 : bvoaArr) {
                if ((bvoa2.f156996a & 1) != 0) {
                    bvni bvni2 = bvoa2.f156997b;
                    if (bvni2 == null) {
                        bvni2 = bvni.f156861b;
                    }
                    long j = bvni2.f156863a;
                    Set set = a.f119564b;
                    Long valueOf = Long.valueOf(j);
                    if (set.contains(valueOf)) {
                        npVar.put(valueOf, bvoa2);
                    }
                }
            }
            int i = npVar.f26809h;
            StringBuilder sb = new StringBuilder(36);
            sb.append("adding ");
            sb.append(i);
            sb.append(" new l2data points");
            sb.toString();
            bhtl.mo64275b(bhtl.f119551b.mo64239a(npVar, false));
        }
    }
}
