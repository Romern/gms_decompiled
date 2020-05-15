package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jmr */
final /* synthetic */ class jmr implements roo {

    /* renamed from: a */
    private final Role f22833a;

    public jmr(Role role) {
        this.f22833a = role;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Role role = this.f22833a;
        jsv jsv = (jsv) obj;
        int i = jmx.f22842c;
        try {
            ((aucf) obj2).mo50391a(((jsp) jsv.mo25289B()).mo13878a(role));
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
