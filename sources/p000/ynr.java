package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ynr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ynr extends ynq {

    /* renamed from: c */
    private static final float f54221c = ((float) TimeUnit.SECONDS.toNanos(1));

    /* renamed from: d */
    private final yix f54222d;

    /* renamed from: e */
    private final ypv f54223e;

    /* renamed from: f */
    private final yjw f54224f = new yjw(1);

    public ynr(yix yix, ypv ypv, long j) {
        super(j);
        this.f54222d = yix;
        this.f54223e = ypv;
    }

    /* renamed from: a */
    public final ygx mo30582a(ygx ygx, List list, yhg yhg, yhx yhx, yhy yhy) {
        Iterable iterable;
        bnjq bnjq;
        ArrayList arrayList;
        yhu yhu;
        Iterable iterable2;
        int i;
        Iterable iterable3;
        int i2;
        Iterable iterable4;
        yhg yhg2 = yhg;
        yhx yhx2 = yhx;
        yhy yhy2 = yhy;
        ygx a = yjy.m44261a(list, "com.google.activity.segment");
        bmxy.m108581a(a);
        ygx a2 = yjy.m44261a(list, "com.google.step_count.delta");
        bngx a3 = a.mo30473a();
        Iterable a4 = this.f54219b.mo30578a(ygx.mo30473a(), a3, yjy.m44266a(yhy2, ygx.mo30474b()));
        if (a2 == null) {
            iterable = bngx.m109376e();
        } else {
            iterable = this.f54224f.mo30580a(a2.mo30473a(), a4, yjy.m44266a(yhy2, a2.mo30474b()));
        }
        bnjq h = bnjr.m109626h(a4.iterator());
        bnjq h2 = bnjr.m109626h(iterable.iterator());
        int size = a3.size();
        int i3 = 0;
        while (i3 < size) {
            yhu yhu2 = (yhu) a3.get(i3);
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                if (h.hasNext()) {
                    if (yfp.m43976d((yhg) h.mo67862a(), yhu2)) {
                        bnjq = h2;
                        arrayList = arrayList2;
                        yhu = yhu2;
                        iterable2 = a4;
                        i = size;
                        break;
                    }
                    yhu yhu3 = (yhu) h.next();
                    if (yfp.m43975c(yhu3, yhu2)) {
                        ynq.m44443a(yhx2, yhu3, yhg2);
                    } else {
                        ArrayList arrayList3 = arrayList2;
                        yhu yhu4 = yhu2;
                        bmxy.m108598a(yfp.m43977e(yhu3, yhu2), "%s not contained in %s, activity segments: %s, distances: %s", yhu3, yhu2, a3, a4);
                        float a5 = ynq.m44439a(yhu3);
                        yhu yhu5 = yhu3;
                        float a6 = ynq.m44440a(yhu4, yhu5);
                        if (a6 <= 0.0f || a5 > a6) {
                            ynq.m44441a(yhu5, a6, a5);
                            a4 = a4;
                            arrayList2 = arrayList3;
                            yhu2 = yhu4;
                            size = size;
                            h2 = h2;
                        } else {
                            int j = yhu4.mo30517j();
                            ArrayList arrayList4 = new ArrayList();
                            while (true) {
                                if (!h2.hasNext()) {
                                    iterable3 = a4;
                                    break;
                                }
                                yhu yhu6 = (yhu) h2.mo67862a();
                                if (yhu6.mo30387b() > yhu5.mo30385a()) {
                                    if (yhu6.mo30387b() > yhu5.mo30387b()) {
                                        iterable3 = a4;
                                        break;
                                    }
                                    iterable4 = a4;
                                    if (this.f54223e.mo30654a(j, (float) yhu6.mo30517j(), yhf.m44092a(yhu6), TimeUnit.NANOSECONDS)) {
                                        arrayList4.add(yhu6);
                                    }
                                } else {
                                    iterable4 = a4;
                                }
                                h2.next();
                                a4 = iterable4;
                            }
                            int b = yfp.m43968b(arrayList4);
                            long b2 = yfp.m43969b(arrayList4, TimeUnit.NANOSECONDS);
                            float f = (float) b;
                            bnjq bnjq2 = h2;
                            if (this.f54223e.mo30654a(j, f, b2, TimeUnit.NANOSECONDS)) {
                                float f2 = f54221c;
                                i2 = size;
                                yix yix = this.f54222d;
                                float f3 = a5 / f;
                                float a7 = f3 / yix.mo30550a(j, f / (((float) b2) / f2));
                                if (f3 < 0.4f || f3 > 2.0f || yix.f53893b > a7 || a7 > yix.f53894c) {
                                    ypq.m44538a("Reported distance not in-line with reported steps", Level.FINE, "reported distance: [%fm] steps: [%d] distance point: %s", Float.valueOf(a5), Integer.valueOf(b), yhu5);
                                    a4 = iterable3;
                                    h2 = bnjq2;
                                    yhu2 = yhu4;
                                    arrayList2 = arrayList3;
                                    size = i2;
                                }
                            } else {
                                i2 = size;
                            }
                            arrayList3.add(yhu5);
                            a4 = iterable3;
                            arrayList2 = arrayList3;
                            yhu2 = yhu4;
                            size = i2;
                            h2 = bnjq2;
                        }
                    }
                } else {
                    bnjq = h2;
                    arrayList = arrayList2;
                    yhu = yhu2;
                    iterable2 = a4;
                    i = size;
                    break;
                }
            }
            if (mo30635a(yhu, arrayList)) {
                ynq.m44442a(yhx2, arrayList.iterator(), yhg2);
            }
            i3++;
            a4 = iterable2;
            h2 = bnjq;
            size = i;
        }
        if (!ynq.m44444a(a3)) {
            ynq.m44442a(yhx2, h, yhg2);
        }
        return yhx.mo30520b();
    }
}
