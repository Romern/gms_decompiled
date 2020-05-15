package p000;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.notifications.ReadStateUpdate;

/* renamed from: akos */
public final /* synthetic */ class akos implements roo {

    /* renamed from: a */
    private final String f72363a;

    /* renamed from: b */
    private final String f72364b;

    /* renamed from: c */
    private final ReadStateUpdate f72365c;

    public akos(String str, String str2, ReadStateUpdate readStateUpdate) {
        this.f72363a = str;
        this.f72364b = str2;
        this.f72365c = readStateUpdate;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        try {
            ((akor) ((akol) obj).mo25289B()).mo39613a(new akon((aucf) obj2), this.f72363a, this.f72364b, this.f72365c);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.w("GunsClientImpl", valueOf.length() == 0 ? new String("Remote exception from guns service:") : "Remote exception from guns service:".concat(valueOf));
        }
    }
}
