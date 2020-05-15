package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbzx */
final /* synthetic */ class bbzx implements Runnable {

    /* renamed from: a */
    private final bcas f103845a;

    /* renamed from: b */
    private final ConversationId f103846b;

    /* renamed from: c */
    private final List f103847c;

    public bbzx(bcas bcas, ConversationId conversationId, List list) {
        this.f103845a = bcas;
        this.f103846b = conversationId;
        this.f103847c = list;
    }

    public final void run() {
        bcas bcas = this.f103845a;
        ConversationId conversationId = this.f103846b;
        List list = this.f103847c;
        long c = bcas.mo56650c(conversationId);
        if (c == -1) {
            bbos.m88294d("SQLiteMessagingStore", "Could not find conversation with the given id.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(Long.valueOf(bcas.mo56638b((ContactId) list.get(i))));
        }
        bcas.mo56629a(conversationId, c, arrayList);
    }
}
