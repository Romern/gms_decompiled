package p000;

import android.os.SystemClock;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aavo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ChatConversationChimeraActivity f56661a;

    public aavo(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56661a = chatConversationChimeraActivity;
    }

    public final void run() {
        long g = ((long) ((int) ceeg.m136402g())) - (SystemClock.uptimeMillis() - this.f56661a.f78886x);
        if (g <= 0) {
            ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56661a;
            chatConversationChimeraActivity.f78885w = chatConversationChimeraActivity.mo43254B() ? abdx.NO_TEXT_ENTERED : abdx.TEXT_ENTERED;
            this.f56661a.mo43270p();
            return;
        }
        ChatConversationChimeraActivity chatConversationChimeraActivity2 = this.f56661a;
        chatConversationChimeraActivity2.f78887y.postDelayed(chatConversationChimeraActivity2.f78888z, g);
    }
}
