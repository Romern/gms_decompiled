package p000;

import android.view.View;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;

/* renamed from: avqn */
public final /* synthetic */ class avqn implements View.OnClickListener {

    /* renamed from: a */
    private final PopupDialogChimeraActivity f93794a;

    /* renamed from: b */
    private final avlf f93795b;

    public avqn(PopupDialogChimeraActivity popupDialogChimeraActivity, avlf avlf) {
        this.f93794a = popupDialogChimeraActivity;
        this.f93795b = avlf;
    }

    public void onClick(View view) {
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93794a;
        this.f93795b.mo51343a(new DownloadOptions(false, true));
        popupDialogChimeraActivity.mo59676a(15);
        popupDialogChimeraActivity.startActivity(avmg.m78795a());
        popupDialogChimeraActivity.finish();
    }
}
