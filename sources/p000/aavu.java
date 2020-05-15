package p000;

import android.support.p002v7.widget.RecyclerView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: aavu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aavu extends abz {

    /* renamed from: a */
    final /* synthetic */ aah f56665a;

    /* renamed from: b */
    final /* synthetic */ int f56666b;

    /* renamed from: c */
    final /* synthetic */ AppBarLayout f56667c;

    /* renamed from: d */
    final /* synthetic */ ChatConversationChimeraActivity f56668d;

    public aavu(ChatConversationChimeraActivity chatConversationChimeraActivity, aah aah, int i, AppBarLayout appBarLayout) {
        this.f56668d = chatConversationChimeraActivity;
        this.f56665a = aah;
        this.f56666b = i;
        this.f56667c = appBarLayout;
    }

    /* renamed from: a */
    public final void mo271a(RecyclerView recyclerView, int i, int i2) {
        if (this.f56665a.mo83p() == 0 && this.f56665a.mo66c(0).getTop() == this.f56666b) {
            this.f56667c.mo70974b(false);
            this.f56668d.findViewById(C0126R.C0129id.gh_chat_activity_section_divider).setVisibility(0);
            return;
        }
        this.f56667c.mo70974b(true);
        this.f56668d.findViewById(C0126R.C0129id.gh_chat_activity_section_divider).setVisibility(4);
    }
}
