package p000;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avju implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93281a;

    public avju(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity) {
        this.f93281a = chimeraUpdateFromSdCardActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 4) {
            return true;
        }
        if (this.f93281a.f109431g.isEmpty()) {
            this.f93281a.f109428d.dismiss();
            this.f93281a.finish();
            return true;
        }
        this.f93281a.mo59653e();
        this.f93281a.mo59650b();
        return true;
    }
}
