package p000;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.os.Process;
import com.felicanetworks.mfc.C0126R;
import java.util.Iterator;

/* renamed from: lou */
final /* synthetic */ class lou implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final lpc f26515a;

    public lou(lpc lpc) {
        this.f26515a = lpc;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        lpc lpc = this.f26515a;
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) lpc.f26159a.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (lpc.f26159a.getString(C0126R.string.common_persistent_or_gapps_process).equals(next.processName)) {
                Process.killProcess(next.pid);
                break;
            }
        }
        lpc.f26528d.clear();
        lpc.mo15333h();
    }
}
