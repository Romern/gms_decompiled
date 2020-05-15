package p000;

import android.os.Handler;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: zhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zhw implements zhj {

    /* renamed from: a */
    public static final srn f55111a = zvt.m46581a();

    /* renamed from: b */
    public final zhl f55112b;

    /* renamed from: c */
    public final ConcurrentHashMap f55113c = new ConcurrentHashMap();

    /* renamed from: d */
    private final Handler f55114d;

    public zhw(zhl zhl, Handler handler) {
        this.f55112b = zhl;
        this.f55114d = handler;
    }

    /* renamed from: a */
    private final void m45478a(zhv zhv, int i) {
        this.f55112b.mo31124b(zhv);
        this.f55114d.postDelayed(new zhu(zhv), TimeUnit.SECONDS.toMillis((long) i));
    }

    /* renamed from: a */
    public final bqgg mo31117a(String str) {
        bqgy c = bqgy.m112818c();
        m45478a(new zhs(this, str, c), 15);
        return c;
    }

    /* renamed from: a */
    public final void mo31118a(StartBleScanRequest startBleScanRequest) {
        zew zew = startBleScanRequest.f32314d;
        zht zht = new zht(this, startBleScanRequest, zew);
        m45478a(zht, startBleScanRequest.f32312b);
        this.f55113c.put(zew.f12819a, zht);
    }

    /* renamed from: a */
    public final void mo31119a(zew zew) {
        zhv zhv = (zhv) this.f55113c.remove(zew.f12819a);
        if (zhv != null) {
            zhv.mo31144b();
        }
    }
}
