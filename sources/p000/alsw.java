package p000;

import android.os.RemoteException;

/* renamed from: alsw */
public final /* synthetic */ class alsw implements roo {
    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        try {
            ((alsp) ((alsm) obj).mo25289B()).mo40720c(new altb((aucf) obj2));
        } catch (RemoteException e) {
            ((aucf) obj2).mo50392b((Exception) e);
        }
    }
}
