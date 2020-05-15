package p000;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: auod */
final /* synthetic */ class auod implements Callable {

    /* renamed from: a */
    private final auol f92185a;

    public auod(auol auol) {
        this.f92185a = auol;
    }

    public final Object call() {
        auol auol = this.f92185a;
        try {
            synchronized (auol.f92195b) {
                auob auob = auol.f92198e;
                if (auob == null) {
                    auol.f92192a.mo50711a("Failed to retrieve preferences, preference service is null.", new Object[0]).mo50706a();
                    return null;
                }
                Bundle a = auob.mo50713a("");
                return a;
            }
        } catch (RemoteException e) {
            auol.f92192a.mo50710a("Failed to retrieve preferences.", e, new Object[0]).mo50706a();
            return null;
        }
    }
}
