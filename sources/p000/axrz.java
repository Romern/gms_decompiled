package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: axrz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axrz extends axtc {

    /* renamed from: a */
    private final WeakReference f96287a;

    /* renamed from: b */
    private final WeakReference f96288b;

    public axrz(Map map, Object obj, rlf rlf) {
        super(rlf);
        this.f96287a = new WeakReference(map);
        this.f96288b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo53437a(Status status) {
        Map map = (Map) this.f96287a.get();
        Object obj = this.f96288b.get();
        if (!(status.mo17710c() || map == null || obj == null)) {
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
