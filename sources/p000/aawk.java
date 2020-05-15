package p000;

import android.content.Intent;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.List;

/* renamed from: aawk */
final /* synthetic */ class aawk implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56711a;

    /* renamed from: b */
    private final List f56712b;

    public aawk(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, List list) {
        this.f56711a = chatRequestAndConversationChimeraService;
        this.f56712b = list;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
     arg types: [aarp, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void */
    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56711a;
        aawg.m47105a(this.f56712b, aarp);
        if (!chatRequestAndConversationChimeraService.f78903i) {
            chatRequestAndConversationChimeraService.mo43292a(aarp, true);
        } else {
            chatRequestAndConversationChimeraService.mo43293a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT"));
        }
    }
}
