package p000;

import android.content.Context;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aaxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxo implements Runnable {

    /* renamed from: a */
    private final aarp f56773a;

    /* renamed from: b */
    private final Context f56774b;

    /* renamed from: c */
    private final HelpConfig f56775c;

    /* renamed from: d */
    private final bqgj f56776d;

    /* renamed from: e */
    private final abcr f56777e;

    public aaxo(aarp aarp, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, abcr abcr) {
        this.f56773a = aarp;
        this.f56774b = chatRequestAndConversationChimeraService.getApplicationContext();
        this.f56775c = helpConfig;
        this.f56776d = chatRequestAndConversationChimeraService.mo43285a();
        this.f56777e = abcr;
    }

    public final void run() {
        if (ssk.m36235a(this.f56774b)) {
            aarp aarp = this.f56773a;
            Context context = this.f56774b;
            HelpConfig helpConfig = this.f56775c;
            bqgj bqgj = this.f56776d;
            abcr abcr = this.f56777e;
            abdu a = aaxt.m47185a(aarp, helpConfig);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            abdk abdk = abdk.f57097a;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abdu abdu = (abdu) bxvd.f164949b;
            abdu abdu2 = abdu.f57135g;
            abdk.getClass();
            abdu.f57139c = abdk;
            abdu.f57138b = 5;
            aaxt.m47186a((abdu) bxvd.mo74062i(), 50, context, helpConfig, bqgj, abcr);
        }
    }
}
