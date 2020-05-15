package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;

/* renamed from: ajqs */
public final /* synthetic */ class ajqs implements View.OnClickListener {

    /* renamed from: a */
    private final SetupChimeraActivity f71163a;

    public ajqs(SetupChimeraActivity setupChimeraActivity) {
        this.f71163a = setupChimeraActivity;
    }

    public void onClick(View view) {
        SetupChimeraActivity setupChimeraActivity = this.f71163a;
        setupChimeraActivity.startActivityForResult(ContactSelectChimeraActivity.m67446a(setupChimeraActivity), 1002);
    }
}
