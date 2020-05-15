package p000;

import android.os.RemoteException;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

/* renamed from: jmp */
final /* synthetic */ class jmp implements roo {

    /* renamed from: a */
    private final RemoteDevice f22829a;

    /* renamed from: b */
    private final Role f22830b;

    public jmp(RemoteDevice remoteDevice, Role role) {
        this.f22829a = remoteDevice;
        this.f22830b = role;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        RemoteDevice remoteDevice = this.f22829a;
        Role role = this.f22830b;
        jsv jsv = (jsv) obj;
        int i = jmx.f22842c;
        try {
            ((jsp) jsv.mo25289B()).mo13880a(remoteDevice, role);
            ((aucf) obj2).mo50391a((Object) null);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
