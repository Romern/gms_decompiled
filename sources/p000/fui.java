package p000;

import android.view.View;
import com.google.android.gms.appinvite.AppInviteChimeraActivity;

/* renamed from: fui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fui implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AppInviteChimeraActivity f17267a;

    public fui(AppInviteChimeraActivity appInviteChimeraActivity) {
        this.f17267a = appInviteChimeraActivity;
    }

    public void onClick(View view) {
        this.f17267a.getSupportFragmentManager().beginTransaction().remove(this.f17267a.f9727i).commitAllowingStateLoss();
    }
}
