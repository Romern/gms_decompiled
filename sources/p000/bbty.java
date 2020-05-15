package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* renamed from: bbty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bbty extends TimerTask {

    /* renamed from: a */
    final /* synthetic */ ConversationId f103372a;

    /* renamed from: b */
    final /* synthetic */ ContactId f103373b;

    /* renamed from: c */
    final /* synthetic */ bbub f103374c;

    public bbty(bbub bbub, ConversationId conversationId, ContactId contactId) {
        this.f103374c = bbub;
        this.f103372a = conversationId;
        this.f103373b = contactId;
    }

    public final void run() {
        bbub bbub = this.f103374c;
        long j = bbub.f103378a;
        synchronized (bbub.f103399t) {
            bbub bbub2 = this.f103374c;
            ConversationId conversationId = this.f103372a;
            ContactId contactId = this.f103373b;
            bbon.m88284a();
            long currentTimeMillis = System.currentTimeMillis();
            if (!bbub2.f103400u.containsKey(conversationId) || !((Map) bbub2.f103400u.get(conversationId)).containsKey(contactId) || currentTimeMillis >= ((Long) ((Map) bbub2.f103400u.get(conversationId)).get(contactId)).longValue()) {
                bbpv bbpv = this.f103374c.f103386g;
                ConversationId conversationId2 = this.f103372a;
                ContactId contactId2 = this.f103373b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bbon.m88284a();
                bbpv.mo56348b(conversationId2, contactId2, timeUnit.toMicros(System.currentTimeMillis() - bbub.f103378a));
                this.f103374c.mo56422a(this.f103372a, this.f103373b);
            }
        }
    }
}
