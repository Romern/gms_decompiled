package p000;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aaxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxn extends aaru {

    /* renamed from: e */
    private final aarp f56769e;

    /* renamed from: f */
    private final ChatRequestAndConversationChimeraService f56770f;

    /* renamed from: g */
    private final HelpConfig f56771g;

    /* renamed from: h */
    private final abcr f56772h;

    public aaxn(aarp aarp, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, abcr abcr) {
        super(chatRequestAndConversationChimeraService);
        this.f56769e = aarp;
        this.f56770f = chatRequestAndConversationChimeraService;
        this.f56771g = helpConfig;
        this.f56772h = abcr;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        abdi abdi = (abdi) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56770f;
        if (abdi == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got empty MobileJoinConversationResponse");
        } else if (chatRequestAndConversationChimeraService.f78899e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "onJoinChatConversationAccepted but config is null");
        } else {
            chatRequestAndConversationChimeraService.mo43291a(new aawl(chatRequestAndConversationChimeraService, abdi));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!ssk.m36235a(this.f56770f)) {
            return null;
        }
        aarp aarp = this.f56769e;
        Context applicationContext = this.f56770f.getApplicationContext();
        HelpConfig helpConfig = this.f56771g;
        bqgj a = this.f56770f.mo43285a();
        abcr abcr = this.f56772h;
        abdu a2 = aaxt.m47185a(aarp, helpConfig);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((bxvk) a2);
        abdh abdh = abdh.f57087a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abdu abdu = (abdu) bxvd.f164949b;
        abdu abdu2 = abdu.f57135g;
        abdh.getClass();
        abdu.f57139c = abdh;
        abdu.f57138b = 4;
        abdv a3 = aaxt.m47186a((abdu) bxvd.mo74062i(), 49, applicationContext, helpConfig, a, abcr);
        if (a3 == null) {
            return null;
        }
        if (a3.f57145a == 2) {
            return (abdi) a3.f57146b;
        }
        return abdi.f57089d;
    }
}
