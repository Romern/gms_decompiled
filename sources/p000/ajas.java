package p000;

import android.os.RemoteCallbackList;
import android.os.RemoteException;

/* renamed from: ajas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajas {

    /* renamed from: a */
    public final RemoteCallbackList f70272a = new RemoteCallbackList();

    /* renamed from: a */
    public final void mo38409a(boolean z) {
        try {
            int beginBroadcast = this.f70272a.beginBroadcast();
            srn srn = ahfq.f67120a;
            for (int i = 0; i < beginBroadcast; i++) {
                ((ajcl) this.f70272a.getBroadcastItem(i)).mo38490a(z);
            }
            this.f70272a.finishBroadcast();
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ajas", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to send onPermissionChange");
        } catch (Throwable th) {
            this.f70272a.finishBroadcast();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo38411b(ajcl ajcl) {
        srn srn = ahfq.f67120a;
        ajcl.f12819a.hashCode();
        if (!this.f70272a.unregister(ajcl)) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
            bnsl.mo68432a("ajas", "b", 31, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("No status callback found to unregister: %s", ajcl.f12819a.hashCode());
        }
    }

    /* renamed from: a */
    public final boolean mo38410a(ajcl ajcl) {
        srn srn = ahfq.f67120a;
        ajcl.f12819a.hashCode();
        boolean register = this.f70272a.register(ajcl);
        if (!register) {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
            bnsl.mo68432a("ajas", "a", 22, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to register status callback: %s", ajcl.f12819a.hashCode());
        }
        return register;
    }
}
