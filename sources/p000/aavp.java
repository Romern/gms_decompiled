package p000;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aavp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavp implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ChatConversationChimeraActivity f56662a;

    public aavp(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56662a = chatConversationChimeraActivity;
    }

    public final void afterTextChanged(Editable editable) {
        if (this.f56662a.f78876n) {
            boolean a = ChatConversationChimeraActivity.m66401a(editable);
            this.f56662a.mo43264c(a);
            this.f56662a.mo43262b(!a);
            this.f56662a.f78886x = SystemClock.uptimeMillis();
            if (aaya.m47228a(cefw.m136749b())) {
                aawe aawe = this.f56662a.f78872j;
                aawe.mo158M(aawe.mo31849c());
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
