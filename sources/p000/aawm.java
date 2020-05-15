package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aawm */
public final /* synthetic */ class aawm implements aarn {

    /* renamed from: a */
    private final ChatRequestAndConversationChimeraService f56715a;

    /* renamed from: b */
    private final abdo f56716b;

    public aawm(ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService, abdo abdo) {
        this.f56715a = chatRequestAndConversationChimeraService;
        this.f56716b = abdo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aawg.a(aarp, boolean):void
     arg types: [aarp, int]
     candidates:
      aawg.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):long
      aawg.a(com.google.android.gms.googlehelp.common.HelpConfig, aarp):java.lang.String
      aawg.a(long, aarp):java.util.List
      aawg.a(aarp, long):void
      aawg.a(abdd, aarp):void
      aawg.a(java.util.List, aarp):void
      aawg.a(aarp, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification
     arg types: [java.util.ArrayList, int]
     candidates:
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, android.content.Intent):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, java.lang.String):android.content.Intent
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.pm.PackageManager, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.CharSequence
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(android.content.Context, com.google.android.gms.googlehelp.common.HelpConfig):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, java.lang.Object[]):java.lang.String
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(boolean, boolean):je
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(int, android.app.Notification):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(aarp, boolean):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.lang.String, long):void
      com.google.android.gms.googlehelp.contact.chat.ChatRequestAndConversationChimeraService.a(java.util.List, boolean):android.app.Notification */
    /* renamed from: a */
    public final void mo31653a(aarp aarp) {
        abdp abdp;
        aasi aasi;
        aarp aarp2 = aarp;
        ChatRequestAndConversationChimeraService chatRequestAndConversationChimeraService = this.f56715a;
        abdo abdo = this.f56716b;
        if (aaya.m47229b(cein.m136931b()) && !chatRequestAndConversationChimeraService.f78913s && (aasi = chatRequestAndConversationChimeraService.f78912r) != null) {
            aasi.addObserver(new aawr(chatRequestAndConversationChimeraService, abdo));
            return;
        }
        aawg.m47105a(abdo.f57111a, aarp2);
        long e = aawg.m47114e(aarp);
        if (e == -1 || chatRequestAndConversationChimeraService.f78910p != e || chatRequestAndConversationChimeraService.f78908n != aawg.m47110c(chatRequestAndConversationChimeraService.f78901g)) {
            List a = aawg.m47096a(e, aarp2);
            if (!a.isEmpty()) {
                if (!chatRequestAndConversationChimeraService.f78905k) {
                    chatRequestAndConversationChimeraService.mo43293a(ChatRequestAndConversationChimeraService.m66455e());
                    chatRequestAndConversationChimeraService.f78905k = true;
                }
                String a2 = aawg.m47094a(aarp);
                long j = chatRequestAndConversationChimeraService.f78909o;
                ArrayList arrayList = new ArrayList();
                int size = a.size();
                int i = 0;
                while (i < size) {
                    bxyl bxyl = ((abdf) a.get(i)).f57081e;
                    if (bxyl == null) {
                        bxyl = bxyl.f165099b;
                    }
                    long j2 = bxyl.f165101a;
                    int i2 = i;
                    long d = aawg.m47112d(aarp);
                    long a3 = aawg.m47092a(d, System.currentTimeMillis() - j2, aarp2);
                    if (a3 != d) {
                        if (!chatRequestAndConversationChimeraService.f78903i) {
                            aawg.m47099a(chatRequestAndConversationChimeraService.f78901g, true);
                        } else if (chatRequestAndConversationChimeraService.f78905k) {
                            chatRequestAndConversationChimeraService.mo43290a(a3);
                        } else {
                            chatRequestAndConversationChimeraService.mo43308u();
                        }
                    }
                    int i3 = i2;
                    if (((abdf) a.get(i3)).f57078b == 3) {
                        arrayList.add((abdf) a.get(i3));
                        abdf abdf = (abdf) a.get(i3);
                        if (abdf.f57078b == 3) {
                            abdp = (abdp) abdf.f57079c;
                        } else {
                            abdp = abdp.f57112g;
                        }
                        if (!TextUtils.equals(a2, abdp.f57115b)) {
                            chatRequestAndConversationChimeraService.f78909o = ((abdf) a.get(i3)).f57080d;
                        }
                    } else if (((abdf) a.get(i3)).f57078b == 6) {
                        chatRequestAndConversationChimeraService.stopForeground(false);
                        chatRequestAndConversationChimeraService.f78904j = false;
                    }
                    i = i3 + 1;
                }
                if (!chatRequestAndConversationChimeraService.f78903i) {
                    if (chatRequestAndConversationChimeraService.f78909o != j) {
                        chatRequestAndConversationChimeraService.mo43289a(4102, arrayList.isEmpty() ? chatRequestAndConversationChimeraService.mo43303o() : chatRequestAndConversationChimeraService.mo43284a((List) arrayList, false));
                    }
                } else if (!chatRequestAndConversationChimeraService.f78898d) {
                    chatRequestAndConversationChimeraService.mo43289a(4102, chatRequestAndConversationChimeraService.mo43303o());
                }
                chatRequestAndConversationChimeraService.f78898d = true;
                chatRequestAndConversationChimeraService.f78910p = e;
                chatRequestAndConversationChimeraService.f78908n = ((abdf) a.get(a.size() - 1)).f57080d;
                if (!aawg.m47096a(aawg.m47114e(chatRequestAndConversationChimeraService.f78901g), chatRequestAndConversationChimeraService.f78901g).isEmpty()) {
                    chatRequestAndConversationChimeraService.mo43293a(new Intent("com.google.android.gms.googlehelp.contact.chat.ChatConversationChimeraActivity.UPDATE_CHAT"));
                }
            }
        }
    }
}
