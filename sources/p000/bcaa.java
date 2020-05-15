package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bcaa */
final /* synthetic */ class bcaa implements Runnable {

    /* renamed from: a */
    private final bcas f103854a;

    /* renamed from: b */
    private final ConversationId f103855b;

    /* renamed from: c */
    private final List f103856c;

    public bcaa(bcas bcas, ConversationId conversationId, List list) {
        this.f103854a = bcas;
        this.f103855b = conversationId;
        this.f103856c = list;
    }

    public final void run() {
        bcas bcas = this.f103854a;
        ConversationId conversationId = this.f103855b;
        List list = this.f103856c;
        long c = bcas.mo56650c(conversationId);
        if (c == -1) {
            bbos.m88294d("SQLiteMessagingStore", "Could not find conversation with the given id.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long c2 = bcas.mo56649c((ContactId) list.get(i));
            if (c2 != -1) {
                arrayList.add(Long.valueOf(c2));
            }
        }
        bcbb.m88742a(bcas.f103908c, new bcab(bcas, arrayList, c, conversationId));
    }
}
