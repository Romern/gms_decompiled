package p000;

import android.content.Context;
import android.view.View;
import com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;

/* renamed from: aavm */
public final /* synthetic */ class aavm implements View.OnClickListener {

    /* renamed from: a */
    private final ChatConversationChimeraActivity f56659a;

    public aavm(ChatConversationChimeraActivity chatConversationChimeraActivity) {
        this.f56659a = chatConversationChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
     arg types: [int, com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity, com.google.android.gms.googlehelp.common.HelpConfig]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(long, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(abdx, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, boolean, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void */
    public void onClick(View view) {
        ChatConversationChimeraActivity chatConversationChimeraActivity = this.f56659a;
        chatConversationChimeraActivity.mo43265e();
        ChatRequestAndConversationChimeraService.m66446a(chatConversationChimeraActivity, chatConversationChimeraActivity.f78879q);
        ChatRequestAndConversationChimeraService.m66450a(true, (Context) chatConversationChimeraActivity, chatConversationChimeraActivity.f78879q);
    }
}
