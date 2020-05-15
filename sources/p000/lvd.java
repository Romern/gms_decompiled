package p000;

import android.app.backup.RestoreObserver;
import android.app.backup.RestoreSet;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* renamed from: lvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lvd extends RestoreObserver {

    /* renamed from: a */
    final /* synthetic */ lve f33022a;

    public lvd(lve lve) {
        this.f33022a = lve;
    }

    public final void onUpdate(int i, String str) {
        lve.f33023a.logVerbose("Restore update. Current package = %s", str);
    }

    public final void restoreFinished(int i) {
        lve.f33023a.logVerbose("Restore finished, status: %d", Integer.valueOf(i));
        if (ccmh.m130653c()) {
            try {
                this.f33022a.f33024b.mo11797a(i != 0 ? new Status(29030) : Status.f30107a);
            } catch (RemoteException e) {
                lve.f33023a.mo25417e("Unable to call back the client.", e, new Object[0]);
            }
        }
        this.f33022a.f33028f.mo69138b((Object) true);
        this.f33022a.f33026d.endRestoreSession();
    }

    public final void restoreSetsAvailable(RestoreSet[] restoreSetArr) {
        int i;
        lvn lvn = lve.f33023a;
        Object[] objArr = new Object[1];
        if (restoreSetArr != null) {
            i = restoreSetArr.length;
        } else {
            i = 0;
        }
        objArr[0] = Integer.valueOf(i);
        lvn.logVerbose("Received restore sets: %s sets", objArr);
        if (restoreSetArr == null) {
            lve.f33023a.logVerbose("Returned restore sets array is null", new Object[0]);
            this.f33022a.f33027e.mo69138b(bngx.m109376e());
            return;
        }
        this.f33022a.f33027e.mo69138b(Arrays.asList(restoreSetArr));
    }

    public final void restoreStarting(int i) {
        lve.f33023a.logVerbose("Restore starting for %d packages", Integer.valueOf(i));
    }
}
