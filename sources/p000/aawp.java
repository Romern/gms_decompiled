package p000;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aawp */
public final /* synthetic */ class aawp implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56720a;

    /* renamed from: b */
    private final long f56721b;

    public aawp(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, long j) {
        this.f56720a = chatRequestAndConversationChimeraService;
        this.f56721b = j;
    }

    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        this.f56720a.mo43293a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_TIMESTAMP_RELATED_OBJECTS").putExtra("EXTRA_DEVICE_SERVER_TIME_DIFFERENCE_ESTIMATE", this.f56721b));
    }
}
