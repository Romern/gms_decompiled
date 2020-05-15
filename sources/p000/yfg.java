package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: yfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yfg extends yfe {

    /* renamed from: b */
    private static final caae f53721b = yhj.m44107a(bzzn.f172116j);

    /* renamed from: c */
    private final caae f53722c;

    public yfg(yga yga, caae caae) {
        super(yga);
        this.f53722c = caae;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cadj mo30404a(yhg yhg, cadl cadl) {
        ydu ydu = (ydu) yhg;
        cadj a = super.mo30404a(ydu, cadl);
        bxvd bxvd = (bxvd) a.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a);
        cadi cadi = (cadi) bxvd;
        int i = ydu.f53675c;
        if (cadi.f164950c) {
            cadi.mo74035c();
            cadi.f164950c = false;
        }
        cadj cadj = (cadj) cadi.f164949b;
        cadj cadj2 = cadj.f172680i;
        cadj.f172682a |= 16;
        cadj.f172686e = i;
        return (cadj) cadi.mo74062i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.List, yff]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final List mo30405a(long j, long j2, long j3, List list, ygc ygc, ydw ydw) {
        cadp cadp;
        bngx bngx;
        boolean z;
        caae caae;
        List list2 = list;
        if (list.isEmpty()) {
            return bngx.m109376e();
        }
        caae caae2 = this.f53722c;
        if (caae2 == null) {
            caae2 = this.f53719a.mo30459a(bzzn.f172115i);
        }
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long nanos2 = TimeUnit.MILLISECONDS.toNanos(j2);
        if (nanos > nanos2) {
            cadp = yyl.m45028a(caae2);
        } else {
            cadp = (cadp) bnjd.m109589b(this.f53719a.mo30457a(bngx.m109356a(caae2), nanos, nanos2, -1, ygc), yyl.m45028a(caae2));
        }
        bxwc bxwc = cadp.f172714c;
        caae caae3 = cadp.f172713b;
        if (caae3 == null) {
            caae3 = caae.f172323i;
        }
        ArrayList arrayList = new ArrayList(bxwc);
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            cadn cadn = (cadn) listIterator.next();
            long j4 = cadn.f172703c;
            if (nanos < j4) {
                listIterator.previous();
                listIterator.add(ydr.m43858a(caae3, nanos, j4));
                listIterator.next();
            }
            nanos = cadn.f172702b;
        }
        if (nanos < nanos2) {
            listIterator.add(ydr.m43858a(caae3, nanos, nanos2));
        }
        if (arrayList.isEmpty()) {
            ypq.m44538a("ActivitySegmentBucketUtils", Level.CONFIG, "No input data points", new Object[0]);
            bngx = bngx.m109376e();
        } else {
            bnia c = bnic.m109499c(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                cadn cadn2 = (cadn) arrayList.get(i);
                caah a = yyk.m45008a(cadn2);
                if (bzzn.f172115i.equals(a) || bzzn.f172116j.equals(a)) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108596a(z, "Unexpected data type: %s", a.f172336b);
                int i2 = ((caaw) cadn2.f172704d.get(0)).f172382b;
                long j5 = cadn2.f172703c;
                ArrayList arrayList2 = arrayList;
                long j6 = cadn2.f172702b;
                if ((cadn2.f172701a & 8) == 0) {
                    caae = cadn2.f172705e;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                } else {
                    caae = cadn2.f172706f;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                }
                c.mo67629b(new ydu(j5, j6, i2, caae));
                i++;
                arrayList = arrayList2;
            }
            bngx = c.mo67751a().mo67639g();
        }
        List a2 = yee.m43883a(bngx, j3);
        bngx a3 = bngx.m109355a(bnjd.m109586b((Iterable) list2, (bmxz) new yff(caae2)));
        boolean contains = list2.contains(caae2);
        List a4 = mo30406a(a3, a2, cadl.ACTIVITY_SEGMENT_BUCKET, ygc, ydw);
        if (contains) {
            bmxy.m108592a(a2.size() == a4.size(), "Size mis-match. #Intervals: %s vs #Buckets: %s", a2.size(), a4.size());
            for (int i3 = 0; i3 < a4.size(); i3++) {
                cadj cadj = (cadj) a4.get(i3);
                ydu ydu = (ydu) a2.get(i3);
                bmxv c2 = bmxv.m108567c(ydu.f53676d);
                int i4 = ydu.f53675c;
                long j7 = ydu.f53673a;
                long j8 = ydu.f53674b;
                cado b = yyl.m45033b(f53721b);
                cadn a5 = yyk.m45011a(f53721b, j7, j8, TimeUnit.NANOSECONDS, yyp.m45047a(i4), yyp.m45047a((int) TimeUnit.NANOSECONDS.toMillis(j8 - j7)), yyp.m45047a(1));
                if (c2.mo66813a()) {
                    if (!f53721b.equals(c2.mo66814b())) {
                        bxvd bxvd = (bxvd) a5.mo74142c(5);
                        bxvd.mo73625a((GeneratedMessageLite) a5);
                        cadm cadm = (cadm) bxvd;
                        caae caae4 = (caae) c2.mo66814b();
                        if (cadm.f164950c) {
                            cadm.mo74035c();
                            cadm.f164950c = false;
                        }
                        cadn cadn3 = (cadn) cadm.f164949b;
                        cadn cadn4 = cadn.f172699j;
                        caae4.getClass();
                        cadn3.f172706f = caae4;
                        cadn3.f172701a |= 8;
                        a5 = (cadn) cadm.mo74062i();
                    }
                }
                yyl.m45031a(b, a5);
                bxvd bxvd2 = (bxvd) cadj.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) cadj);
                cadi cadi = (cadi) bxvd2;
                cadi.mo74610a((cadp) b.mo74062i());
                a4.set(i3, (cadj) cadi.mo74062i());
            }
        }
        return a4;
    }
}
