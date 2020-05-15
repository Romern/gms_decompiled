package p000;

import android.os.Message;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.sharebox.ReplyBoxChimeraActivity;

/* renamed from: aols */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aols extends adzt {

    /* renamed from: a */
    final /* synthetic */ ReplyBoxChimeraActivity f78420a;

    public aols(ReplyBoxChimeraActivity replyBoxChimeraActivity) {
        this.f78420a = replyBoxChimeraActivity;
    }

    public final void handleMessage(Message message) {
        aold aold;
        if (message.what == 1) {
            ReplyBoxChimeraActivity replyBoxChimeraActivity = this.f78420a;
            Fragment findFragmentByTag = replyBoxChimeraActivity.getSupportFragmentManager().findFragmentByTag("confirm_action_dialog");
            if (findFragmentByTag == null) {
                aold = aold.m65981a(replyBoxChimeraActivity.getString(C0126R.string.plus_replybox_confirm_cancel_dialog_message));
            } else {
                aold = (aold) findFragmentByTag;
            }
            ReplyBoxChimeraActivity replyBoxChimeraActivity2 = this.f78420a;
            aold.f78384a = replyBoxChimeraActivity2;
            aold.show(replyBoxChimeraActivity2.getSupportFragmentManager(), "confirm_action_dialog");
        }
    }
}
