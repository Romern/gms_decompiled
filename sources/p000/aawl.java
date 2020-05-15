package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawl */
final /* synthetic */ class aawl implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56713a;

    /* renamed from: b */
    private final abdi f56714b;

    public aawl(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, abdi abdi) {
        this.f56713a = chatRequestAndConversationChimeraService;
        this.f56714b = abdi;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56713a;
        abdi abdi = this.f56714b;
        abde abde = abdi.f57091a;
        if (abde == null) {
            abde = abde.f57073a;
        }
        aawg.m47101a(abde, abdi.f57092b, abdi.f57093c, aarp);
        if (aaya.m47229b(cein.m136931b())) {
            chatRequestAndConversationChimeraService.f78913s = true;
            aasi aasi = chatRequestAndConversationChimeraService.f78912r;
            if (aasi != null) {
                aasi.mo31709a();
                chatRequestAndConversationChimeraService.f78912r = null;
            }
        }
    }
}
