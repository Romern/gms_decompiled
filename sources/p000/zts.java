package p000;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: zts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zts implements Callable {

    /* renamed from: a */
    final /* synthetic */ ztu f55898a;

    public zts(ztu ztu) {
        this.f55898a = ztu;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        ztk b = this.f55898a.f55902b.mo31503b();
        try {
            b.mo31497a();
            C1230nw a = ztu.m46331a(b);
            b.mo31498b();
            HashMap hashMap = new HashMap();
            for (int i = 0; i < a.mo15537b(); i++) {
                hashMap.put((caae) a.mo15538b(i), Long.valueOf(a.mo15533a(i)));
            }
            b.close();
            return hashMap;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
