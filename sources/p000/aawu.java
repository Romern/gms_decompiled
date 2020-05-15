package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawu */
public final /* synthetic */ class aawu implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56728a;

    /* renamed from: b */
    private final abdx f56729b;

    public aawu(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, abdx abdx) {
        this.f56728a = chatRequestAndConversationChimeraService;
        this.f56729b = abdx;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56728a;
        chatRequestAndConversationChimeraService.mo43285a().execute(new aaxv(this.f56729b, aarp, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f78899e, chatRequestAndConversationChimeraService.mo43285a(), chatRequestAndConversationChimeraService.f78900f));
    }
}
