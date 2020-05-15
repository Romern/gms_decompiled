package p000;

import java.util.HashMap;
import java.util.List;

/* renamed from: adqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqj extends cazu {

    /* renamed from: b */
    private final cazn f62502b;

    /* renamed from: c */
    private final cazn f62503c;

    /* renamed from: d */
    private final cazn f62504d;

    public adqj(cijl cijl, cijl cijl2, cazn cazn, cazn cazn2, cazn cazn3) {
        super(cijl2, cbag.m127657a(adqj.class), cijl);
        this.f62502b = cbac.m127643a(cazn);
        this.f62503c = cbac.m127643a(cazn2);
        this.f62504d = cbac.m127643a(cazn3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return bqga.m112779a(this.f62502b.mo75201b(), this.f62503c.mo75201b(), this.f62504d.mo75201b());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        Throwable th;
        Long l;
        long j;
        long j2;
        List list = (List) obj;
        int i = 0;
        Long l2 = (Long) list.get(0);
        adqr adqr = (adqr) list.get(1);
        new Object[1][0] = l2;
        adrw b = ((adrm) list.get(2)).mo33747b(l2, null);
        try {
            HashMap hashMap = new HashMap();
            if (b != null) {
                long j3 = Long.MIN_VALUE;
                long j4 = Long.MAX_VALUE;
                while (true) {
                    if (!b.mo33750a()) {
                        break;
                    }
                    adsf adsf = (adsf) b.mo33751b();
                    if (adsf != null && adsf.mo33757c().booleanValue()) {
                        if (ceqm.m137877h()) {
                            l = adsf.mo33756b().booleanValue() ? adsf.f62616g : null;
                        } else {
                            l = adsf.mo33755a().booleanValue() ? adsf.f62615f : null;
                        }
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = Long.MIN_VALUE;
                        }
                        long max = Math.max(j3, j);
                        if (l != null) {
                            j2 = l.longValue();
                        } else {
                            j2 = Long.MAX_VALUE;
                        }
                        j4 = Math.min(j4, j2);
                        Integer num = adsf.f62617h;
                        if (hashMap.containsKey(num)) {
                            hashMap.put(num, Integer.valueOf(((Integer) hashMap.get(num)).intValue() + 1));
                        } else {
                            hashMap.put(num, 1);
                        }
                        j3 = max;
                    }
                    i++;
                    if (((long) i) >= ceqm.m137882m()) {
                        adqr.mo33720a(new adqq(l2, Long.valueOf(j4 - 1)));
                        break;
                    }
                }
                if (j3 > l2.longValue()) {
                    adqr.mo33719a(j3);
                }
                b.close();
            }
            return bqga.m112775a(hashMap);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
