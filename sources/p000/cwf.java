package p000;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwf {

    /* renamed from: a */
    public final Map f12230a;

    /* renamed from: b */
    public final Map f12231b;

    /* renamed from: c */
    public byte[] f12232c;

    /* renamed from: d */
    public Integer f12233d = 0;

    public cwf(Map map, Map map2, byte[] bArr) {
        this.f12230a = map;
        this.f12231b = map2;
        this.f12232c = bArr;
    }

    /* renamed from: a */
    public static cwf m7756a() {
        return new cwf(Collections.emptyMap(), new HashMap(), new byte[2]);
    }

    /* renamed from: b */
    public final void mo8357b(cuz cuz) {
        this.f12231b.put(cuz, 0L);
    }

    /* renamed from: a */
    public static Map m7757a(byte[] bArr) {
        try {
            HashMap hashMap = new HashMap();
            cvc[] a = cve.m7668a(bArr);
            for (cvc cvc : a) {
                cvb e = cvc.mo8332e();
                if ((e instanceof cuz) && e != cuz.PREVIOUS_TRANSACTION_HISTORY) {
                    hashMap.put((cuz) e, Long.valueOf(cvz.m7727d(cvz.m7712a(cvc.mo8323a(), 8))));
                }
            }
            return hashMap;
        } catch (IOException e2) {
            return new HashMap();
        }
    }

    /* renamed from: a */
    public final long mo8354a(cuz cuz, asrx asrx) {
        Long a = mo8355a(cuz);
        if (a == null) {
            byte[] a2 = asrx.mo3396a(cuz.mo8321b());
            if (a2 == null || a2.length == 0) {
                a = 0L;
            } else {
                a = Long.valueOf(cvz.m7732g(a2));
            }
        }
        return a.longValue();
    }

    /* renamed from: a */
    public final Long mo8355a(cuz cuz) {
        return (Long) this.f12231b.get(cuz);
    }

    /* renamed from: a */
    public final void mo8356a(cuz cuz, asrx asrx, long j, long j2) {
        this.f12231b.put(cuz, Long.valueOf(Math.min(mo8354a(cuz, asrx) + j, j2)));
    }
}
