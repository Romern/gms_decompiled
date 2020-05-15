package p000;

import android.content.Context;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aavz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aavz implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f56680a;

    /* renamed from: b */
    final /* synthetic */ long f56681b;

    /* renamed from: c */
    final /* synthetic */ Context f56682c;

    /* renamed from: d */
    final /* synthetic */ aawe f56683d;

    public aavz(aawe aawe, String str, long j, Context context) {
        this.f56683d = aawe;
        this.f56680a = str;
        this.f56681b = j;
        this.f56682c = context;
    }

    public void onClick(View view) {
        ChatRequestAndConversationChimeraService.m66449a(this.f56680a, this.f56681b, this.f56682c, this.f56683d.f56701n.f78879q);
        view.setEnabled(false);
        int a = this.f56683d.mo31844a(this.f56681b);
        abdq abdq = (abdq) this.f56683d.f56692e.get(a);
        bxvd bxvd = (bxvd) abdq.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) abdq);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abdq abdq2 = (abdq) bxvd.f164949b;
        abdq abdq3 = abdq.f57120e;
        abdq2.f57122a |= 4;
        abdq2.f57125d = true;
        this.f56683d.f56692e.set(a, (abdq) bxvd.mo74062i());
        aawe aawe = this.f56683d;
        aawe.mo158M(aawe.mo31853g(a));
        aatj.m46980a(view, (int) C0126R.string.gh_sending_message_announcement);
    }
}
