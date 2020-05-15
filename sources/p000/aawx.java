package p000;

import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.List;

/* renamed from: aawx */
public final /* synthetic */ class aawx implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56734a;

    public aawx(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService) {
        this.f56734a = chatRequestAndConversationChimeraService;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56734a;
        List b = aawg.m47106b(aarp);
        if (!b.isEmpty()) {
            abdf abdf = (abdf) b.get(b.size() - 1);
            if (abdf.f57080d == aawg.m47114e(aarp) && abdf.f57078b == 6) {
                chatRequestAndConversationChimeraService.f78902h = false;
                chatRequestAndConversationChimeraService.stopSelf();
            }
        }
    }
}
