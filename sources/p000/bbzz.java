package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;

/* renamed from: bbzz */
final /* synthetic */ class bbzz implements Runnable {

    /* renamed from: a */
    private final bcas f103850a;

    /* renamed from: b */
    private final List f103851b;

    /* renamed from: c */
    private final long f103852c;

    /* renamed from: d */
    private final ConversationId f103853d;

    public bbzz(bcas bcas, List list, long j, ConversationId conversationId) {
        this.f103850a = bcas;
        this.f103851b = list;
        this.f103852c = j;
        this.f103853d = conversationId;
    }

    public final void run() {
        bcas bcas = this.f103850a;
        List list = this.f103851b;
        long j = this.f103852c;
        ConversationId conversationId = this.f103853d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) list.get(i)).longValue();
            ContentValues contentValues = new ContentValues();
            contentValues.put("conversation_row_id", Long.valueOf(j));
            contentValues.put("contact_row_id", Long.valueOf(longValue));
            bcas.f103908c.mo54676a(bcas.mo56655d("participants"), contentValues, 5);
        }
        bcas.mo56659f(conversationId);
    }
}
