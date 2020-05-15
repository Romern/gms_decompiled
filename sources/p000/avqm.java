package p000;

import android.view.View;
import com.google.android.gms.update.InstallationOptions;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;

/* renamed from: avqm */
public final /* synthetic */ class avqm implements View.OnClickListener {

    /* renamed from: a */
    private final PopupDialogChimeraActivity f93792a;

    /* renamed from: b */
    private final avlf f93793b;

    public avqm(PopupDialogChimeraActivity popupDialogChimeraActivity, avlf avlf) {
        this.f93792a = popupDialogChimeraActivity;
        this.f93793b = avlf;
    }

    public void onClick(View view) {
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93792a;
        this.f93793b.mo51344a(new InstallationOptions(true, true, true, false));
        popupDialogChimeraActivity.mo59676a(15);
        popupDialogChimeraActivity.finish();
    }
}
