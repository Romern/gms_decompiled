package p000;

import android.view.View;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.material.chip.Chip;

/* renamed from: aavv */
final /* synthetic */ class aavv implements View.OnClickListener {

    /* renamed from: a */
    private final aawe f56669a;

    /* renamed from: b */
    private final Chip f56670b;

    /* renamed from: c */
    private final String f56671c;

    /* renamed from: d */
    private final abeb f56672d;

    public aavv(aawe aawe, Chip chip, String str, abeb abeb) {
        this.f56669a = aawe;
        this.f56670b = chip;
        this.f56671c = str;
        this.f56672d = abeb;
    }

    public void onClick(View view) {
        aawe aawe = this.f56669a;
        Chip chip = this.f56670b;
        String str = this.f56671c;
        abeb abeb = this.f56672d;
        chip.setClickable(false);
        ChatConversationChimeraActivity chatConversationChimeraActivity = aawe.f56701n;
        chatConversationChimeraActivity.mo43258a(abeb.f57169b);
        abcx.m47498a(str, abeb.f57168a, 2, (int) BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, chatConversationChimeraActivity, chatConversationChimeraActivity.f78879q, chatConversationChimeraActivity.f78880r);
    }
}
