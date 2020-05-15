package p000;

import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aaxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxq extends aaru {

    /* renamed from: e */
    private final aarp f56779e;

    /* renamed from: f */
    private final ChatRequestAndConversationChimeraService f56780f;

    /* renamed from: g */
    private final HelpConfig f56781g;

    /* renamed from: h */
    private final abcr f56782h;

    public aaxq(aarp aarp, ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, HelpConfig helpConfig, abcr abcr) {
        super(chatRequestAndConversationChimeraService);
        this.f56779e = aarp;
        this.f56780f = chatRequestAndConversationChimeraService;
        this.f56781g = helpConfig;
        this.f56782h = abcr;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        abdo abdo = (abdo) obj;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56780f;
        if (abdo == null) {
            Log.w("gH_ChatReq&ConvoSvc", "Got empty MobileListConversationEventsResponse");
        } else if (chatRequestAndConversationChimeraService.f78899e == null) {
            Log.w("gH_ChatReq&ConvoSvc", "onChatConversationUpdated but config is null");
        } else {
            chatRequestAndConversationChimeraService.mo43291a(chatRequestAndConversationChimeraService.mo43283a(abdo));
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        abdo a;
        Void[] voidArr = (Void[]) objArr;
        if (!ssk.m36235a(this.f56780f) || (a = aaxp.m47175a(this.f56779e, this.f56780f.getApplicationContext(), this.f56781g, this.f56780f.mo43285a(), this.f56782h)) == null) {
            return null;
        }
        return a;
    }
}
