package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cyq extends cyp implements cvt {

    /* renamed from: f */
    public static final Map f12403f;

    /* renamed from: g */
    public final cue f12404g;

    /* renamed from: h */
    public final cwf f12405h;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("C8", "LCOA");
        hashMap.put("C9", "UCOA");
        hashMap.put("CA", "STA");
        hashMap.put("CB", "LCOL");
        hashMap.put("CC", "UCOL");
        hashMap.put("CD", "NCOT");
        hashMap.put("CE", "COA");
        hashMap.put("D4", "CVM-Accumulator");
        hashMap.put("D9", "CVM-Counter");
        hashMap.put("DF40", "CL-Accumulator");
        hashMap.put("DF43", "CL-Counter");
        f12403f = Collections.unmodifiableMap(hashMap);
    }

    public cyq(cvp cvp, cue cue, cys cys, cwg cwg, Map map, cwf cwf) {
        super(cys, cwg, cvp, map);
        cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(false);
        this.f12404g = cue;
        this.f12405h = cwf;
    }

    /* renamed from: a */
    public static cyq m7910a(cvs cvs) {
        cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(!(cvs instanceof cyq));
        return (cyq) cvs;
    }

    /* renamed from: b */
    public final String mo8419b(cuz cuz) {
        return cvz.m7704a(this.f12404g.mo8297a(cuz));
    }

    /* renamed from: r */
    public final cwm mo8420r() {
        return cxa.m7807a(this.f12405h.f12232c);
    }

    /* renamed from: a */
    public static boolean m7911a(long j, Long l) {
        return j > l.longValue();
    }

    /* renamed from: a */
    public static boolean m7912a(Long l, Integer num) {
        return num != null && l.longValue() > ((long) num.intValue());
    }

    /* renamed from: a */
    public static boolean m7913a(Long l, Long l2) {
        return l.longValue() > l2.longValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8398a(Map map) {
        byte[] bArr;
        super.mo8398a(map);
        cue cue = this.f12404g;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : cue.f12053b.entrySet()) {
            hashMap.put(Integer.valueOf(cvz.m7731f(((cvb) entry.getKey()).mo8320a())), ((cvc) entry.getValue()).mo8323a());
        }
        map.putAll(Collections.unmodifiableMap(hashMap));
        for (cuz cuz : Collections.unmodifiableMap(this.f12405h.f12231b).keySet()) {
            int b = cuz.mo8321b();
            cwf cwf = this.f12405h;
            Integer valueOf = Integer.valueOf(b);
            int length = ((byte[]) map.get(valueOf)).length;
            Long l = (Long) cwf.f12231b.get(cuz);
            if (l != null) {
                bArr = cvz.m7712a(cvz.m7728d(l.toString()), length);
            } else {
                bArr = null;
            }
            if (bArr != null) {
                map.put(valueOf, bArr);
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo8417a(cuz cuz) {
        return this.f12404g.mo8297a(cuz);
    }

    /* renamed from: a */
    public final byte[] mo8418a(byte[] bArr) {
        return this.f12399b.mo8427a(mo8417a(cuz.AMOUNT_AUTHORISED_NUMERIC), mo8417a(cuz.TRANSACTION_CURRENCY_CODE), mo8417a(cuz.UNPREDICTABLE_NUMBER), bArr);
    }
}
