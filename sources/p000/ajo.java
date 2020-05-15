package p000;

import android.os.SystemClock;
import android.view.Choreographer;

/* renamed from: ajo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajo implements Choreographer.FrameCallback {

    /* renamed from: a */
    final /* synthetic */ ajn f654a;

    public ajo(ajn ajn) {
        this.f654a = ajn;
    }

    public final void doFrame(long j) {
        ajl ajl = this.f654a.f651a;
        ajl.f650a.f658d = SystemClock.uptimeMillis();
        ajp ajp = ajl.f650a;
        long j2 = ajp.f658d;
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < ajp.f657c.size(); i++) {
            ajm ajm = (ajm) ajp.f657c.get(i);
            if (ajm != null) {
                Long l = (Long) ajp.f656b.get(ajm);
                if (l != null) {
                    if (l.longValue() < uptimeMillis) {
                        ajp.f656b.remove(ajm);
                    }
                }
                ajm.mo831a(j2);
            }
        }
        if (ajp.f659e) {
            for (int size = ajp.f657c.size() - 1; size >= 0; size--) {
                if (ajp.f657c.get(size) == null) {
                    ajp.f657c.remove(size);
                }
            }
            ajp.f659e = false;
        }
        if (ajl.f650a.f657c.size() > 0) {
            ajl.f650a.mo834b().mo832a();
        }
    }
}
