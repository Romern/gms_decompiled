package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: ztt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ztt implements Callable {

    /* renamed from: a */
    final /* synthetic */ ztu f55899a;

    public ztt(ztu ztu) {
        this.f55899a = ztu;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        zsu a;
        Throwable th;
        String str;
        long j;
        boolean z;
        ztk b = this.f55899a.f55902b.mo31503b();
        try {
            b.mo31497a();
            ztu ztu = this.f55899a;
            C1230nw a2 = ztu.m46331a(b);
            String str2 = "min_end";
            String[] strArr = {"data_source_id", String.format("min(%s) as %s", "end_time", str2), String.format("max(%s) as %s", "end_time", "max_end")};
            srn srn = ztl.f55885a;
            b.mo31499c();
            a = b.mo31495a("DataPointRows", strArr, null, null, null, null, "data_source_id");
            HashMap hashMap = new HashMap();
            Map k = ztu.mo31391k();
            while (a.mo31476c()) {
                long d = a.mo31479d("data_source_id");
                long d2 = a.mo31479d(str2);
                long d3 = a.mo31479d("max_end");
                caae caae = (caae) a2.mo15534a(d);
                if (caae != null) {
                    yqi yqi = (yqi) k.get(caae);
                    if (yqi != null) {
                        str = str2;
                        j = yqi.f54392c;
                    } else {
                        str = str2;
                        j = 0;
                    }
                    if (yqi == null || !zuq.m46516a(caae, ztu.f55903c)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    hashMap.put(caae, new ygw(d, z, d2, d3, j));
                    str2 = str;
                }
            }
            a.close();
            b.mo31498b();
            b.close();
            return hashMap;
        } catch (Throwable th2) {
            Throwable th3 = th2;
            try {
                b.close();
            } catch (Throwable th4) {
                bqye.m113761a(th3, th4);
            }
            throw th3;
        }
        throw th;
    }
}
