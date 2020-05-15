package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yjv implements ykh {

    /* renamed from: a */
    final /* synthetic */ yjw f53950a;

    /* renamed from: b */
    private final long f53951b;

    /* renamed from: c */
    private final long f53952c;

    /* renamed from: d */
    private final yhx f53953d;

    public yjv(yjw yjw, yhx yhx, yhg yhg) {
        this.f53950a = yjw;
        this.f53953d = yhx;
        this.f53951b = yhg.mo30385a();
        this.f53952c = yhg.mo30387b();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30577a(yhg yhg, Iterable iterable) {
        yhu yhu;
        yhu yhu2;
        yhu yhu3 = (yhu) yhg;
        if (yhu3.mo30385a() >= this.f53952c) {
            return bngx.m109376e();
        }
        if (yhu3.mo30387b() <= this.f53951b) {
            return bngx.m109376e();
        }
        long a = yhu3.mo30385a();
        long j = this.f53951b;
        if (a < j) {
            yhu = this.f53950a.mo30581a(yhu3, j, yhu3.mo30387b(), this.f53953d);
        } else {
            yhu = yhu3;
        }
        if (yhu != null && yhu.mo30387b() > this.f53952c) {
            yhu = this.f53950a.mo30581a(yhu, yhu.mo30385a(), this.f53952c, this.f53953d);
        }
        if (yhu == null) {
            return bngx.m109376e();
        }
        if (bnjd.m109598e(iterable)) {
            return bngx.m109356a(yhu);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            yhg yhg2 = (yhg) it.next();
            long a2 = yhg2.mo30385a();
            long b = yhg2.mo30387b();
            if (yhu == null || yhu.mo30385a() < b) {
                if (yhu == null || yhu.mo30385a() >= a2) {
                    yhu2 = yhu;
                } else {
                    long min = Math.min(yhu.mo30387b(), a2);
                    yhu a3 = this.f53950a.mo30581a(yhu, yhu.mo30385a(), min, this.f53953d);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                    yhu2 = this.f53950a.mo30581a(yhu, min, yhu.mo30387b(), this.f53953d);
                }
                if (yhu2 == null || yhu2.mo30387b() <= b) {
                    yhu = yhu2;
                } else {
                    yhu a4 = this.f53950a.mo30581a(yhu2, yhu2.mo30385a(), b, this.f53953d);
                    if (a4 != null) {
                        arrayList.add(a4);
                    }
                    yhu = this.f53950a.mo30581a(yhu2, b, yhu2.mo30387b(), this.f53953d);
                }
            }
        }
        if (yhu == null) {
            return arrayList;
        }
        arrayList.add(yhu);
        return arrayList;
    }
}
