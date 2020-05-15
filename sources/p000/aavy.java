package p000;

import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aavy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aavy implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ long f56678a;

    /* renamed from: b */
    final /* synthetic */ aawe f56679b;

    public aavy(aawe aawe, long j) {
        this.f56679b = aawe;
        this.f56678a = j;
    }

    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56679b.f56701n;
        long j = this.f56678a;
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_MESSAGE_CLIENT_TIME", j);
        abae a = abag.m47347a();
        a.f56926b = C0126R.string.gh_chat_delete_message_confirmation_text;
        a.f56927c = C0126R.string.common_ui_confirm_deleting_button;
        a.f56928d = C0126R.string.common_cancel;
        a.f56929e = bundle;
        a.mo31968a().show(chatConversationChimeraActivity.getSupportFragmentManager(), "delete_message_dialog");
    }
}
