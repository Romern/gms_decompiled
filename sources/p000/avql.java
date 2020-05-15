package p000;

import android.view.View;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;

/* renamed from: avql */
public final /* synthetic */ class avql implements View.OnClickListener {

    /* renamed from: a */
    private final PopupDialogChimeraActivity f93790a;

    /* renamed from: b */
    private final avlf f93791b;

    public avql(PopupDialogChimeraActivity popupDialogChimeraActivity, avlf avlf) {
        this.f93790a = popupDialogChimeraActivity;
        this.f93791b = avlf;
    }

    public void onClick(View view) {
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93790a;
        this.f93791b.mo51344a(new InstallationOptions(true, true, true, false));
        popupDialogChimeraActivity.finish();
    }
}
