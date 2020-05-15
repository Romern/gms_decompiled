package p000;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.chimera.container.p034ui.ModuleDownloadChimeraActivity;

/* renamed from: qob */
public final /* synthetic */ class qob implements Handler.Callback {

    /* renamed from: a */
    private final ModuleDownloadChimeraActivity f41826a;

    public qob(ModuleDownloadChimeraActivity moduleDownloadChimeraActivity) {
        this.f41826a = moduleDownloadChimeraActivity;
    }

    public final boolean handleMessage(Message message) {
        ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = this.f41826a;
        moduleDownloadChimeraActivity.mo17635a(message.arg1);
        moduleDownloadChimeraActivity.f29986d.removeMessages(0);
        return true;
    }
}
