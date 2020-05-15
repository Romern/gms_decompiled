package p000;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;

/* renamed from: aefg */
final /* synthetic */ class aefg implements bruv {

    /* renamed from: a */
    private final Context f63316a;

    /* renamed from: b */
    private final cijl f63317b;

    public aefg(Context context, cijl cijl) {
        this.f63316a = context;
        this.f63317b = cijl;
    }

    /* renamed from: a */
    public final chqp mo34112a(bruu bruu) {
        boolean z;
        Context context = this.f63316a;
        chvz a = chvz.m149656a(bruu.mo69991k(), bruu.mo69992l(), (CronetEngine) this.f63317b.mo6445a());
        a.f189402i = new CronetEngine.Builder(context).getDefaultUserAgent();
        bruc bruc = (bruc) bruu;
        a.mo85768a(bruc.f143390b);
        long j = bruc.f143393e;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bmxy.m108593a(z, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) < 30) {
            a.f189406m = Math.max(timeUnit.toMillis(j), chwp.f189391b);
        } else {
            a.f189406m = -1;
        }
        Integer num = bruc.f143392d;
        if (num != null) {
            a.mo85717a(num.intValue());
        }
        Integer num2 = bruc.f143391c;
        if (num2 != null) {
            a.mo85718b(num2.intValue());
        }
        return a.mo85581b();
    }
}
