package p000;

import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.sharebox.ShareBoxChimeraActivity;

/* renamed from: aome */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aome extends adzt {

    /* renamed from: a */
    final /* synthetic */ ShareBoxChimeraActivity f78452a;

    public aome(ShareBoxChimeraActivity shareBoxChimeraActivity) {
        this.f78452a = shareBoxChimeraActivity;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1 && ((aold) this.f78452a.getSupportFragmentManager().findFragmentByTag("confirm_action_dialog")) == null) {
            aold a = aold.m65981a(this.f78452a.getString(C0126R.string.plus_sharebox_confirm_cancel_dialog_message));
            ShareBoxChimeraActivity shareBoxChimeraActivity = this.f78452a;
            a.f78384a = shareBoxChimeraActivity;
            a.show(shareBoxChimeraActivity.getSupportFragmentManager(), "confirm_action_dialog");
        }
    }
}
