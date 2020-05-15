package p000;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: yfh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfh extends yfe {

    /* renamed from: b */
    private final yfg f53723b;

    public yfh(yga yga, caae caae) {
        super(yga);
        this.f53723b = new yfg(yga, caae);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: yyl.a(cadq, cadn):void
     arg types: [cado, cadn]
     candidates:
      yyl.a(cadp, caae):cado
      yyl.a(cadp, bzzz):cadp
      yyl.a(cado, cadn):void
      yyl.a(cadq, cadn):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.util.Comparator, java.lang.Iterable):bngx
     arg types: [bnny, java.util.ArrayList]
     candidates:
      bngx.a(java.lang.Object, java.lang.Object):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ List mo30405a(long j, long j2, long j3, List list, ygc ygc, ydw ydw) {
        bxvk bxvk;
        List<cadj> a = this.f53723b.mo30405a(j, j2, j3, list, ygc, ydw);
        if (a.isEmpty()) {
            return bngx.m109376e();
        }
        SparseArray sparseArray = new SparseArray();
        for (cadj cadj : a) {
            cadl cadl = cadl.ACTIVITY_SEGMENT_BUCKET;
            cadl a2 = cadl.m126501a(cadj.f172688g);
            if (a2 == null) {
                a2 = cadl.UNKNOWN_BUCKET;
            }
            boolean equals = cadl.equals(a2);
            cadl a3 = cadl.m126501a(cadj.f172688g);
            if (a3 == null) {
                a3 = cadl.UNKNOWN_BUCKET;
            }
            bmxy.m108596a(equals, "Unexpected bucket type: %s", a3);
            int i = cadj.f172686e;
            List arrayList = sparseArray.get(i) != null ? (List) sparseArray.get(i) : new ArrayList();
            arrayList.add(cadj);
            sparseArray.put(i, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(sparseArray.size());
        boolean z = false;
        int i2 = 0;
        while (i2 < sparseArray.size()) {
            List list2 = (List) sparseArray.valueAt(i2);
            boolean z2 = true;
            bmxy.m108589a(!list2.isEmpty(), "No unbaked segment buckets specified.");
            cadj cadj2 = (cadj) list2.get(z ? 1 : 0);
            cadj a4 = yyj.m45004a(cadj2.f172683b, ((cadj) bnjd.m109595d(list2)).f172684c, cadj2.f172686e, cadl.ACTIVITY_TYPE_BUCKET);
            if ((cadj2.f172682a & 64) != 0) {
                bxvd bxvd = (bxvd) a4.mo74142c(5);
                bxvd.mo73625a((bxvk) a4);
                cadi cadi = (cadi) bxvd;
                boolean z3 = cadj2.f172689h;
                if (cadi.f164950c) {
                    cadi.mo74035c();
                    cadi.f164950c = z;
                }
                cadj cadj3 = (cadj) cadi.f164949b;
                cadj cadj4 = cadj.f172680i;
                cadj3.f172682a |= 64;
                cadj3.f172689h = z3;
                a4 = (cadj) cadi.mo74062i();
            }
            HashMap hashMap = new HashMap();
            bxwc bxwc = cadj2.f172687f;
            int size = bxwc.size();
            for (int i3 = 0; i3 < size; i3++) {
                cadp cadp = (cadp) bxwc.get(i3);
                hashMap.put(yyl.m45026a((cadq) cadp).f172336b, cadp);
            }
            int i4 = 1;
            while (i4 < list2.size()) {
                bxwc bxwc2 = ((cadj) list2.get(i4)).f172687f;
                int size2 = bxwc2.size();
                int size3 = hashMap.size();
                Integer valueOf = Integer.valueOf(i4);
                Collection values = hashMap.values();
                if (size2 == size3) {
                    int size4 = bxwc2.size();
                    int i5 = 0;
                    while (i5 < size4) {
                        cadp cadp2 = (cadp) bxwc2.get(i5);
                        cadp cadp3 = (cadp) hashMap.get(yyl.m45026a((cadq) cadp2).f172336b);
                        if (cadp3 == null) {
                            z2 = false;
                        }
                        bmxy.m108596a(z2, "Unmatched data type: %s", yyl.m45026a((cadq) cadp2).f172336b);
                        bmzs.m108696a(cadp3);
                        bxvd bxvd2 = (bxvd) cadp3.mo74142c(5);
                        bxvd2.mo73625a((bxvk) cadp3);
                        cado cado = (cado) bxvd2;
                        cado.mo74617a(cadp2.f172714c);
                        hashMap.put(yyl.m45026a((cadq) cadp2).f172336b, (cadp) cado.mo74062i());
                        i5++;
                        z2 = true;
                    }
                    i4++;
                    z2 = true;
                } else {
                    throw new IllegalArgumentException(bmzh.m108675a("DataSets in bucket %s don't match the original.  %s vs %s", valueOf, bxwc2, values));
                }
            }
            ArrayList arrayList3 = new ArrayList(hashMap.size());
            for (cadp cadp4 : hashMap.values()) {
                caah a5 = yyl.m45026a((cadq) cadp4);
                caae caae = cadp4.f172713b;
                if (caae == null) {
                    caae = caae.f172323i;
                }
                yfd a6 = yec.m43879a(a5);
                if (a6 != null) {
                    cado a7 = yyl.m45027a(cadp4, a6.mo30379a());
                    if (cadp4.f172714c.size() > 0) {
                        bxwc bxwc3 = cadp4.f172714c;
                        int size5 = bxwc3.size();
                        for (int i6 = 0; i6 < size5; i6++) {
                            a6.mo30381a((cadn) bxwc3.get(i6));
                        }
                        bngx b = a6.mo30382b();
                        int size6 = b.size();
                        for (int i7 = 0; i7 < size6; i7++) {
                            yyl.m45032a((cadq) a7, (cadn) b.get(i7));
                        }
                        a7.mo74617a(b);
                    }
                    bxvk = a7.mo74062i();
                } else {
                    bxvk = yyl.m45027a(cadp4, caae).mo74062i();
                }
                arrayList3.add((cadp) bxvk);
            }
            bxvd bxvd3 = (bxvd) a4.mo74142c(5);
            bxvd3.mo73625a((bxvk) a4);
            cadi cadi2 = (cadi) bxvd3;
            if (cadi2.f164950c) {
                cadi2.mo74035c();
                cadi2.f164950c = false;
            }
            cadj cadj5 = (cadj) cadi2.f164949b;
            cadj cadj6 = cadj.f172680i;
            cadj5.mo74611c();
            bxsy.m123078a(arrayList3, cadj5.f172687f);
            arrayList2.add((cadj) cadi2.mo74062i());
            i2++;
            z = false;
        }
        return bngx.m109369a((Comparator) yyj.f54824a, (Iterable) arrayList2);
    }
}
