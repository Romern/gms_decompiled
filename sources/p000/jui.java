package p000;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.widget.Button;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: jui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jui implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23230a;

    public jui(SourceChimeraActivity sourceChimeraActivity) {
        this.f23230a = sourceChimeraActivity;
    }

    public final void run() {
        AlertDialog alertDialog;
        if (!this.f23230a.isFinishing() && !this.f23230a.f11272g && (alertDialog = this.f23230a.f11278m) != null) {
            Button button = alertDialog.getButton(-2);
            if (button != null) {
                button.setEnabled(false);
            }
            SourceChimeraActivity sourceChimeraActivity = this.f23230a;
            AsyncTask asyncTask = sourceChimeraActivity.f11283r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            sourceChimeraActivity.f11283r = new juj(sourceChimeraActivity).execute(new Void[0]);
        }
    }
}
