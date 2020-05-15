package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawv */
public final /* synthetic */ class aawv implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56730a;

    /* renamed from: b */
    private final String f56731b;

    /* renamed from: c */
    private final long f56732c;

    public aawv(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, String str, long j) {
        this.f56730a = chatRequestAndConversationChimeraService;
        this.f56731b = str;
        this.f56732c = j;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56730a;
        new aaxs(this.f56731b, this.f56732c, aarp, chatRequestAndConversationChimeraService, chatRequestAndConversationChimeraService.f78899e, chatRequestAndConversationChimeraService.f78900f).executeOnExecutor(chatRequestAndConversationChimeraService.mo43285a(), new Void[0]);
    }
}
