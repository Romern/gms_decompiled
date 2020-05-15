package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajio */
public final /* synthetic */ class ajio implements View.OnClickListener {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70718a;

    public ajio(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70718a = contactSelectChimeraActivity;
    }

    public void onClick(View view) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70718a;
        contactSelectChimeraActivity.setResult(-1);
        contactSelectChimeraActivity.finish();
    }
}
