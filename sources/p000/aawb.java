package p000;

import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;

/* renamed from: aawb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aawb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ aasm f56687a;

    /* renamed from: b */
    final /* synthetic */ aawe f56688b;

    public aawb(aawe aawe, aasm aasm) {
        this.f56688b = aawe;
        this.f56687a = aasm;
    }

    public void onClick(View view) {
        abcx.m47472a(this.f56688b.f56701n, 161, this.f56687a.f56497g);
        aazy aazy = new aazy();
        aasm aasm = this.f56687a;
        aazy.f56911a = aasm.f56496f;
        if (aasm.mo31736s()) {
            aazy.f56912b = this.f56687a.mo31735r();
        }
        aasm aasm2 = this.f56687a;
        aazy.f56913c = aasm2.f56497g;
        aazy.f56914d = aasm2.mo31740v();
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56688b.f56701n;
        aazy.f56917g = chatConversationChimeraActivity.f78879q;
        aazy.show(chatConversationChimeraActivity.getSupportFragmentManager(), "setting_action_dialog");
    }
}
