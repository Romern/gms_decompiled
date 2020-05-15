package p000;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aaws */
public final /* synthetic */ class aaws implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56725a;

    /* renamed from: b */
    private final Intent f56726b;

    public aaws(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, Intent intent) {
        this.f56725a = chatRequestAndConversationChimeraService;
        this.f56726b = intent;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        this.f56725a.mo43295a(this.f56726b.getBooleanExtra("EXTRA_IGNORE_CHAT_QUEUE_STATUS", false));
    }
}
