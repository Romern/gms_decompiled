package p000;

import android.os.RemoteException;

/* renamed from: alsv */
final /* synthetic */ class alsv implements roo {
    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        try {
            ((alsp) ((alsm) obj).mo25289B()).mo40718b(new alta((aucf) obj2));
        } catch (RemoteException e) {
            ((aucf) obj2).mo50392b((Exception) e);
        }
    }
}
