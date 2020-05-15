package p000;

import android.view.View;
import com.google.android.gms.update.phone.PopupDialogChimeraActivity;

/* renamed from: avqo */
public final /* synthetic */ class avqo implements View.OnClickListener {

    /* renamed from: a */
    private final PopupDialogChimeraActivity f93796a;

    /* renamed from: b */
    private final avlf f93797b;

    public avqo(PopupDialogChimeraActivity popupDialogChimeraActivity, avlf avlf) {
        this.f93796a = popupDialogChimeraActivity;
        this.f93797b = avlf;
    }

    public void onClick(View view) {
        PopupDialogChimeraActivity popupDialogChimeraActivity = this.f93796a;
        this.f93797b.mo51345b();
        popupDialogChimeraActivity.mo59676a(16);
        popupDialogChimeraActivity.finish();
    }
}
