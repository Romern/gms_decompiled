package p000;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.google.android.gms.constellation.RefreshGcmTaskChimeraService;
import java.lang.ref.WeakReference;

/* renamed from: syc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class syc {

    /* renamed from: a */
    public static final Logger f45414a = tea.m36798a("sync_scheduler");

    /* renamed from: c */
    private static final bngx f45415c = bngx.m109358a(3600000L, 7200000L, 14400000L);

    /* renamed from: d */
    private static WeakReference f45416d = new WeakReference(null);

    /* renamed from: b */
    public final bngx f45417b;

    protected syc(bngx bngx) {
        this.f45417b = bngx;
    }

    /* renamed from: a */
    public static synchronized syc m36573a() {
        syc syc;
        synchronized (syc.class) {
            syc = (syc) f45416d.get();
            if (syc == null) {
                syc = new syc(f45415c);
                f45416d = new WeakReference(syc);
            }
        }
        return syc;
    }

    /* renamed from: a */
    public final long mo26229a(Context context, long j) {
        long g = szq.m36667a(context).mo26296g();
        if (g >= j) {
            return g;
        }
        long c = j + (cdfw.f180710a.mo6606a().mo77448c() * 1000);
        szq.m36667a(context).mo26289b(c);
        return c;
    }

    /* renamed from: a */
    public final void mo26230a(Context context) {
        long j;
        int i = Build.VERSION.SDK_INT;
        if (cdfw.f180710a.mo6606a().mo77455j()) {
            szq a = szq.m36667a(context.getApplicationContext());
            Pair h = a.mo26297h();
            long longValue = ((Long) h.first).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            long a2 = mo26229a(context, currentTimeMillis);
            if (longValue != -1) {
                j = cdfw.m133051f() + longValue;
            } else {
                j = -1;
            }
            if (j < currentTimeMillis) {
                a.mo26298i();
                a.mo26299j();
                longValue = -1;
            }
            if (longValue == -1) {
                RefreshGcmTaskChimeraService.m22787a(context, a2, false);
            } else if (a2 < longValue) {
                RefreshGcmTaskChimeraService.m22787a(context, a2, false);
                a.mo26285a(longValue, ((Integer) h.second).intValue());
            } else {
                f45414a.mo25412b("did not schedule next sync refresh because re-try is already scheduled before it", new Object[0]);
            }
        } else {
            f45414a.mo25416d("refresh checker is not enabled", new Object[0]);
        }
    }
}
