package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jmq */
final /* synthetic */ class jmq implements roo {

    /* renamed from: a */
    private final String f22831a;

    /* renamed from: b */
    private final Role f22832b;

    public jmq(String str, Role role) {
        this.f22831a = str;
        this.f22832b = role;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        String str = this.f22831a;
        Role role = this.f22832b;
        jsv jsv = (jsv) obj;
        int i = jmx.f22842c;
        try {
            ((jsp) jsv.mo25289B()).mo13882a(str, role);
            ((aucf) obj2).mo50391a((Object) null);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
