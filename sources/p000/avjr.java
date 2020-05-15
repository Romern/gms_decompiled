package p000;

import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93277a;

    public avjr(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity) {
        this.f93277a = chimeraUpdateFromSdCardActivity;
    }

    public void onClick(View view) {
        String str;
        ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity = this.f93277a;
        if (chimeraUpdateFromSdCardActivity.f109426b != null) {
            if (!chimeraUpdateFromSdCardActivity.f109431g.isEmpty()) {
                String valueOf = String.valueOf(this.f93277a.mo59652d());
                String valueOf2 = String.valueOf(this.f93277a.f109426b);
                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            } else {
                str = this.f93277a.f109426b;
            }
            String valueOf3 = String.valueOf(str);
            if (valueOf3.length() == 0) {
                new String("calling verifyUpdate for path: ");
            } else {
                "calling verifyUpdate for path: ".concat(valueOf3);
            }
            this.f93277a.mo59648a(3);
            try {
                this.f93277a.f109425a.mo51335b(str);
                this.f93277a.f109428d.dismiss();
            } catch (RemoteException e) {
                Log.e("CmaUpdateFromSdCardA", "reconnect to Sd card service on verifyUpdate() failure.");
                this.f93277a.mo59647a();
            }
        }
    }
}
