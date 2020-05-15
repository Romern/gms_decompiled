package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: bcab */
final /* synthetic */ class bcab implements Runnable {

    /* renamed from: a */
    private final bcas f103857a;

    /* renamed from: b */
    private final List f103858b;

    /* renamed from: c */
    private final long f103859c;

    /* renamed from: d */
    private final ConversationId f103860d;

    public bcab(bcas bcas, List list, long j, ConversationId conversationId) {
        this.f103857a = bcas;
        this.f103858b = list;
        this.f103859c = j;
        this.f103860d = conversationId;
    }

    public final void run() {
        bcas bcas = this.f103857a;
        List list = this.f103858b;
        long j = this.f103859c;
        ConversationId conversationId = this.f103860d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) list.get(i)).longValue();
            if (((long) bcas.f103908c.mo54675a(bcas.mo56655d("participants"), "conversation_row_id =? AND contact_row_id =?", new String[]{Long.toString(j), Long.toString(longValue)})) < 0) {
                StringBuilder sb = new StringBuilder((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS);
                sb.append("Failed to kick participant,  Contact Row ID: ");
                sb.append(longValue);
                sb.append(" from Conversation Row ID: ");
                sb.append(j);
                bbos.m88294d("SQLiteMessagingStore", sb.toString());
            }
        }
        bcas.mo56659f(conversationId);
    }
}
