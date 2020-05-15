package p000;

import android.os.RemoteException;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: atkl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atkl {

    /* renamed from: a */
    public static final atkl f90415a = new atkl();

    /* renamed from: b */
    public static final Object f90416b = new Object();

    /* renamed from: c */
    public final Map f90417c = new WeakHashMap();

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    private atkl() {
    }

    /* renamed from: a */
    public final void mo50008a() {
        synchronized (f90416b) {
            Iterator it = this.f90417c.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    ((aswm) ((Map.Entry) it.next()).getValue()).mo49606a();
                } catch (RemoteException e) {
                    it.remove();
                }
            }
        }
    }
}
