package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: axsa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axsa extends axtc {

    /* renamed from: a */
    private final WeakReference f96289a;

    /* renamed from: b */
    private final WeakReference f96290b;

    public axsa(Map map, Object obj, rlf rlf) {
        super(rlf);
        this.f96289a = new WeakReference(map);
        this.f96290b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo53437a(Status status) {
        Map map = (Map) this.f96289a.get();
        Object obj = this.f96290b.get();
        if (!(status.f30115i != 4002 || map == null || obj == null)) {
            synchronized (map) {
                axtn axtn = (axtn) map.remove(obj);
                if (axtn != null) {
                    axtn.mo53533a();
                }
            }
        }
        mo53529a((Object) status);
    }
}
