package p000;

import java.util.ArrayList;

/* renamed from: ypa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ypa implements ykh {

    /* renamed from: a */
    final /* synthetic */ ypb f54315a;

    /* renamed from: b */
    private final yhx f54316b;

    public ypa(ypb ypb, yhx yhx) {
        this.f54315a = ypb;
        this.f54316b = yhx;
    }

    /* renamed from: a */
    public final Iterable mo30577a(yhg yhg, Iterable iterable) {
        bmxv bmxv;
        bmxv bmxv2;
        ypb ypb = this.f54315a;
        bngx a = bngx.m109355a(iterable);
        ypd ypd = (ypd) ypb.f54319e;
        yoy yoy = ypd.f54324a;
        if (!a.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            long j = yox.f54305b;
            int i = 0;
            arrayList.add(new yow(yox.f54305b, yox.m44511a((yhu) a.get(0))));
            int i2 = 1;
            while (i2 < a.size()) {
                yhu yhu = (yhu) a.get(i2);
                float b = yhu.mo30510b(i);
                yox yox = (yox) yoy;
                if (yox.f54308e <= b && b <= yox.f54309f) {
                    long min = Math.min(yox.f54305b, yhu.mo30385a() - ((yhu) a.get(i2 - 1)).mo30385a());
                    j += min;
                    arrayList.add(new yow(min, yox.m44511a(yhu)));
                }
                i2++;
                i = 0;
            }
            yox yox2 = (yox) yoy;
            if (j >= yox2.f54307d) {
                bngx b2 = bngx.m109372b(arrayList);
                long j2 = (long) (((float) j) * yox2.f54306c);
                bnre i3 = b2.listIterator();
                long j3 = 0;
                while (true) {
                    if (!i3.hasNext()) {
                        break;
                    }
                    yow yow = (yow) i3.next();
                    j3 += yow.f54302a;
                    if (j3 > j2) {
                        bmxv = bmxv.m108566b(Float.valueOf(yow.f54303b));
                        break;
                    }
                }
            }
        }
        bmxv = yox.f54304a;
        bmxv a2 = bmxv.mo66810a((bmxj) new ypc(ypd));
        if (a2.mo66813a()) {
            float floatValue = ((Float) a2.mo66814b()).floatValue();
            bmxv2 = (floatValue >= ypb.f54317c && floatValue <= ypb.f54318d) ? bmxv.m108566b(Float.valueOf(floatValue)) : bmvz.f131120a;
        } else {
            bmxv2 = bmvz.f131120a;
        }
        if (!bmxv2.mo66813a()) {
            return bngx.m109376e();
        }
        yht a3 = this.f54316b.mo30519a();
        yfm.m43953a(a3, yhg.mo30387b(), yhg.mo30387b());
        a3.mo30503a().mo30432a((double) ((Float) bmxv2.mo66814b()).floatValue());
        return bngx.m109356a(a3.mo30508c());
    }
}
