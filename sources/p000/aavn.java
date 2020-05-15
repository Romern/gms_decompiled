package p000;

import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aavn */
public final /* synthetic */ class aavn implements View.OnLayoutChangeListener {

    /* renamed from: a */
    private final ChatConversationChimeraActivity f56660a;

    public aavn(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56660a = chatConversationChimeraActivity;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56660a;
        int i9 = i4 - i2;
        if (i9 != i8 - i6) {
            chatConversationChimeraActivity.mo43255a(i9);
        }
    }
}
