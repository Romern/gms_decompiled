package p000;

import android.content.pm.PackageManager;
import android.os.Process;

/* renamed from: sfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sfs implements PackageManager.OnPermissionsChangedListener {

    /* renamed from: a */
    final /* synthetic */ sft f44146a;

    public sfs(sft sft) {
        this.f44146a = sft;
    }

    public final void onPermissionsChanged(int i) {
        if (Process.myUid() == i) {
            this.f44146a.mo25490c();
        }
    }
}
