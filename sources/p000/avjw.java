package p000;

import android.os.RecoverySystem;
import android.util.Log;
import com.google.android.gms.update.ChimeraUpdateFromSdCardService;
import java.io.File;
import java.io.IOException;

/* renamed from: avjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avjw extends Thread {

    /* renamed from: a */
    final /* synthetic */ ChimeraUpdateFromSdCardService f93284a;

    public avjw(ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService) {
        this.f93284a = chimeraUpdateFromSdCardService;
    }

    public final void run() {
        try {
            Log.i("CmaUpdateFromSdCardS", "calling install package on recovery.");
            ChimeraUpdateFromSdCardService chimeraUpdateFromSdCardService = this.f93284a;
            int i = ChimeraUpdateFromSdCardService.f109439d;
            File file = chimeraUpdateFromSdCardService.f109443c;
            RecoverySystem.installPackage(chimeraUpdateFromSdCardService, null);
        } catch (IOException e) {
            Log.e("CmaUpdateFromSdCardS", "exception trying to install package", e);
        }
        Log.e("CmaUpdateFromSdCardS", "reboot to install failed");
    }
}
