package p000;

import android.view.View;
import com.google.android.gms.chimera.container.p034ui.ModuleDownloadChimeraActivity;

/* renamed from: qoc */
public final /* synthetic */ class qoc implements View.OnClickListener {

    /* renamed from: a */
    private final ModuleDownloadChimeraActivity f41827a;

    public qoc(ModuleDownloadChimeraActivity moduleDownloadChimeraActivity) {
        this.f41827a = moduleDownloadChimeraActivity;
    }

    public void onClick(View view) {
        ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = this.f41827a;
        int i = moduleDownloadChimeraActivity.f29985c;
        if (i == 0 || i == 2 || i == 3 || i == 4) {
            moduleDownloadChimeraActivity.onBackPressed();
        } else if (i == 5) {
            moduleDownloadChimeraActivity.mo17635a(0);
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append(i);
            sb.append(" is not a valid state");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
