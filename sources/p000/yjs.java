package p000;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: yjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yjs implements ykh {

    /* renamed from: a */
    final /* synthetic */ yju f53943a;

    /* renamed from: b */
    private final yhx f53944b;

    public yjs(yju yju, yhx yhx) {
        this.f53943a = yju;
        this.f53944b = yhx;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Iterable mo30577a(yhg yhg, Iterable iterable) {
        yhx yhx;
        bngs bngs;
        boolean z;
        yhu yhu = (yhu) yhg;
        yju yju = this.f53943a;
        bngx a = bngx.m109355a(iterable);
        yhx yhx2 = this.f53944b;
        if (a.isEmpty()) {
            return bngx.m109356a(yhu);
        }
        if (yfp.m43977e(yhu, (yhg) a.get(0))) {
            return bngx.m109356a(yhu);
        }
        bngs j = bngx.m109377j();
        ArrayList arrayList = new ArrayList();
        int size = a.size();
        int i = 0;
        while (true) {
            float f = 1.4f;
            if (i >= size) {
                break;
            }
            yhu yhu2 = (yhu) a.get(i);
            bngs bngs2 = j;
            long max = Math.max(yhu.mo30385a(), yhu2.mo30385a());
            long min = Math.min(yhu.mo30387b(), yhu2.mo30387b());
            if (min < max) {
                ypq.m44539a("Interval end: %d is earlier than interval start: %d", Long.valueOf(min), Long.valueOf(max));
            } else {
                Float f2 = (Float) yju.f53949b.get(Integer.valueOf(yhu2.mo30517j()));
                if (f2 != null) {
                    f = f2.floatValue();
                }
                arrayList.add(new yjt(max, min, (((float) (min - max)) * f) / ((float) TimeUnit.SECONDS.toNanos(1))));
            }
            i++;
            j = bngs2;
        }
        bngs bngs3 = j;
        float a2 = yju.m44248a(arrayList);
        float f3 = 0.0f;
        if (a2 == 0.0f) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((yjt) arrayList.get(i2)).f53947c = 1.4f;
            }
            a2 = yju.m44248a(arrayList);
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            yjt yjt = (yjt) arrayList.get(i3);
            if (yjt.f53947c <= f3) {
                yhx = yhx2;
                bngs = bngs3;
            } else {
                if (a2 > f3) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108600b(z);
                float a3 = yfp.m43956a(yhu, 2);
                float f4 = yjt.f53947c;
                yht a4 = yhx2.mo30519a();
                yhx = yhx2;
                yfm.m43953a(a4, yjt.f53945a, yjt.f53946b);
                a4.mo30506a(yhu.mo30511d());
                yfp.m43962a(a4, (f4 / a2) * a3, 2);
                bngs = bngs3;
                bngs.mo67668c(a4.mo30508c());
            }
            i3++;
            bngs3 = bngs;
            yhx2 = yhx;
            f3 = 0.0f;
        }
        return bngs3.mo67664a();
    }
}
