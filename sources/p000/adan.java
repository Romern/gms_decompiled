package p000;

import android.os.Looper;
import com.google.android.chimera.FragmentActivity;
import com.google.android.chimera.FragmentManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: adan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adan {

    /* renamed from: a */
    public final Map f61215a = new HashMap();

    /* renamed from: b */
    private final adap f61216b = new adap(new adzt(Looper.getMainLooper()));

    /* renamed from: a */
    public static adan m50084a(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        adao adao = (adao) supportFragmentManager.findFragmentByTag("FutureManagerRetainedFragment");
        if (adao == null) {
            adao = new adao();
            supportFragmentManager.beginTransaction().add(adao, "FutureManagerRetainedFragment").commitNow();
        }
        return adao.f61217a;
    }

    /* renamed from: b */
    public final adas mo33294b(Object obj, bmzi bmzi) {
        mo33293a(obj);
        return mo33292a(obj, bmzi);
    }

    /* renamed from: a */
    public final adas mo33292a(Object obj, bmzi bmzi) {
        adas adas = (adas) this.f61215a.get(obj);
        if (adas != null) {
            return adas;
        }
        adas adas2 = new adas((bqgg) bmzi.mo6606a(), this.f61216b);
        this.f61215a.put(obj, adas2);
        return adas2;
    }

    /* renamed from: a */
    public final void mo33293a(Object obj) {
        adas adas = (adas) this.f61215a.remove(obj);
        if (adas != null) {
            adas.mo33298d();
            adas.cancel(true);
        }
    }
}
