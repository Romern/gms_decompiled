package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawi */
public final /* synthetic */ class aawi implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56709a;

    public aawi(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.f56709a = chatRequestAndConversationChimeraService;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56709a;
        if (chatRequestAndConversationChimeraService.f78907m == null) {
            chatRequestAndConversationChimeraService.f78907m = new aaxc(chatRequestAndConversationChimeraService.f78899e, chatRequestAndConversationChimeraService);
        }
        chatRequestAndConversationChimeraService.f78907m.run();
    }
}
