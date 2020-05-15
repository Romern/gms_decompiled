package p000;

import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aavq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ChatConversationChimeraActivity f56663a;

    public aavq(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56663a = chatConversationChimeraActivity;
    }

    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56663a;
        chatConversationChimeraActivity.mo43258a(chatConversationChimeraActivity.f78869g.getText().toString().trim());
    }
}
