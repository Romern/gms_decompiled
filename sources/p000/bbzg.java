package p000;

import android.database.sqlite.SQLiteException;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbzg */
final /* synthetic */ class bbzg implements Runnable {

    /* renamed from: a */
    private final bcas f103793a;

    /* renamed from: b */
    private final ConversationId f103794b;

    public bbzg(bcas bcas, ConversationId conversationId) {
        this.f103793a = bcas;
        this.f103794b = conversationId;
    }

    public final void run() {
        bcas bcas = this.f103793a;
        ConversationId conversationId = this.f103794b;
        long c = bcas.mo56650c(conversationId);
        if (c == -1) {
            String valueOf = String.valueOf(conversationId);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("Attempting to delete a non-existent conversation: ");
            sb.append(valueOf);
            bbos.m88294d("SQLiteMessagingStore", sb.toString());
            return;
        }
        if (bcas.f103908c.mo54675a(bcas.mo56655d("conversations"), "id = ?", new String[]{String.valueOf(c)}) >= 0) {
            bcas.mo56641b();
            return;
        }
        throw new SQLiteException("Failed to delete conversation.");
    }
}
