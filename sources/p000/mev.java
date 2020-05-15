package p000;

import android.app.backup.BackupObserver;
import android.os.Message;

/* renamed from: mev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mev extends BackupObserver {

    /* renamed from: a */
    final /* synthetic */ mex f33549a;

    /* renamed from: b */
    private boolean f33550b = false;

    public mev(mex mex) {
        this.f33549a = mex;
    }

    /* renamed from: a */
    private final void m24933a(int i, int i2) {
        mex mex = this.f33549a;
        lvn lvn = mex.f33552a;
        Message obtainMessage = mex.f33555d.obtainMessage(i);
        obtainMessage.obj = this.f33549a.f33553b;
        obtainMessage.arg1 = i2;
        obtainMessage.sendToTarget();
    }

    public final void backupFinished(int i) {
        mex.f33552a.mo25412b("Package: %s, Backup Finished status: %d", this.f33549a.f33553b, Integer.valueOf(i));
        if (!this.f33550b) {
            mex.f33552a.mo25418e("Did not receive onResult for %s", this.f33549a.f33553b);
        }
        m24933a(2, i);
    }

    public final void onResult(String str, int i) {
        mex mex = this.f33549a;
        lvn lvn = mex.f33552a;
        if (mex.f33553b.equals(str)) {
            mex.f33552a.mo25412b("Package: %s, Result received: %d", str, Integer.valueOf(i));
            this.f33550b = true;
            m24933a(1, i);
            return;
        }
        mex.f33552a.mo25414c("Received onResult for %s. Expected it for: %s", str, this.f33549a.f33553b);
    }
}
