package p000;

import android.net.RssiCurve;
import java.util.Iterator;
import java.util.Map;

/* renamed from: akml */
final /* synthetic */ class akml implements bmxj {

    /* renamed from: a */
    static final bmxj f72260a = new akml();

    private akml() {
    }

    public final Object apply(Object obj) {
        byte b;
        cafg cafg = (cafg) obj;
        if (!akmp.m60022b(cafg)) {
            eoa.m10824a("NetRec", "Invalid ThroughputCurve: %s", cafg);
            return null;
        }
        byte[] bArr = new byte[cafg.f172901e.size()];
        int i = cafg.f172900d;
        if (i == 0) {
            i = 100000;
        }
        for (int i2 = 0; i2 < cafg.f172901e.size(); i2++) {
            long b2 = ((long) cafg.f172901e.mo74151b(i2)) * ((long) i);
            Iterator it = akmp.f72266c.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    b = 0;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (b2 >= ((Long) entry.getValue()).longValue()) {
                    b = ((Byte) entry.getKey()).byteValue();
                    break;
                }
            }
            bArr[i2] = b;
        }
        return new RssiCurve(cafg.f172898b, cafg.f172899c, bArr);
    }
}
