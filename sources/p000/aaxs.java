package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aaxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxs extends aaru {

    /* renamed from: e */
    private final String f56785e;

    /* renamed from: f */
    private final long f56786f;

    /* renamed from: g */
    private final aarp f56787g;

    /* renamed from: h */
    private final ChatRequestAndConversationChimeraService f56788h;

    /* renamed from: i */
    private final HelpConfig f56789i;

    /* renamed from: j */
    private final abcr f56790j;

    public aaxs(String str, long j, aarp aarp, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, abcr abcr) {
        super(chatRequestAndConversationChimeraService);
        this.f56785e = str;
        this.f56786f = j;
        this.f56787g = aarp;
        this.f56788h = chatRequestAndConversationChimeraService;
        this.f56789i = helpConfig;
        this.f56790j = abcr;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        abds abds = (abds) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56788h;
        long j = this.f56786f;
        if (abds != null) {
            bxwc bxwc = abds.f57132a;
            if (bxwc.isEmpty()) {
                Log.w("gH_ChatReq&ConvoSvc", "The conversationEvents was empty.");
            } else {
                chatRequestAndConversationChimeraService.mo43291a(new aawk(chatRequestAndConversationChimeraService, bxwc));
            }
        } else {
            chatRequestAndConversationChimeraService.mo43293a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.MESSAGE_NOT_SENT").putExtra("EXTRA_MESSAGE_CLIENT_TIME", j));
            if (!chatRequestAndConversationChimeraService.f78903i) {
                chatRequestAndConversationChimeraService.f78906l = true;
                chatRequestAndConversationChimeraService.mo43291a(new aawj(chatRequestAndConversationChimeraService));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!ssk.m36235a(this.f56788h)) {
            return null;
        }
        String str = this.f56785e;
        long j = this.f56786f;
        aarp aarp = this.f56787g;
        Context applicationContext = this.f56788h.getApplicationContext();
        HelpConfig helpConfig = this.f56789i;
        bqgj a = this.f56788h.mo43285a();
        abcr abcr = this.f56790j;
        int i = aaxt.f56791a;
        bxvd da = abdr.f57126c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdr abdr = (abdr) da.f164949b;
        str.getClass();
        abdr.f57128a |= 1;
        abdr.f57129b = str;
        abdr abdr2 = (abdr) da.mo74062i();
        abdu a2 = aaxt.m47185a(aarp, helpConfig);
        bxvd bxvd = (bxvd) a2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) a2);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abdu abdu = (abdu) bxvd.f164949b;
        abdu abdu2 = abdu.f57135g;
        abdr2.getClass();
        abdu.f57139c = abdr2;
        abdu.f57138b = 3;
        bxyl a3 = bxyl.m124413a(j);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abdu abdu3 = (abdu) bxvd.f164949b;
        a3.getClass();
        abdu3.f57142f = a3;
        abdu3.f57137a |= 64;
        abdv a4 = aaxt.m47186a((abdu) bxvd.mo74062i(), 51, applicationContext, helpConfig, a, abcr);
        if (a4 == null) {
            return null;
        }
        if (a4.f57145a == 1) {
            return (abds) a4.f57146b;
        }
        return abds.f57130b;
    }
}
