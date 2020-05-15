package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.List;

/* renamed from: aseu */
final /* synthetic */ class aseu implements Runnable {

    /* renamed from: a */
    private final asfb f88794a;

    public aseu(asfb asfb) {
        this.f88794a = asfb;
    }

    public final void run() {
        asfb asfb = this.f88794a;
        synchronized (asfb.f88807a) {
            if (asfb.mo49124e()) {
                asfb.f88813g = true;
                asfb.mo49123d();
                if (asfb.mo49124e()) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - asfb.f88811e;
                    Context context = asfb.f88819m;
                    String str = asfb.f88816j;
                    String str2 = asfb.f88817k;
                    String str3 = asfb.f88818l;
                    int i = asfb.f88815i;
                    List a = asfb.mo49110a();
                    boolean z = asfb.f88812f;
                    if (slw.m35613a()) {
                        slw.m35612a(new WakeLockEvent(System.currentTimeMillis(), 16, str, i, slp.m35593a(a), null, elapsedRealtime, srf.m36091a(context), str2, slp.m35592a(context.getPackageName()), srf.m36096e(context), 0, str3, z));
                    }
                    asfb.f88808b = 1;
                    asfb.mo49125f();
                }
            }
        }
    }
}
