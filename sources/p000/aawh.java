package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawh */
public final /* synthetic */ class aawh implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56708a;

    public aawh(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.f56708a = chatRequestAndConversationChimeraService;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56708a;
        if (chatRequestAndConversationChimeraService.f78899e != null) {
            chatRequestAndConversationChimeraService.mo43285a().execute(new aaxo(aarp, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f78899e, chatRequestAndConversationChimeraService.f78900f));
        }
    }
}
