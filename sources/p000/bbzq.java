package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

/* renamed from: bbzq */
final /* synthetic */ class bbzq implements Callable {

    /* renamed from: a */
    private final bcas f103824a;

    /* renamed from: b */
    private final ConversationId f103825b;

    /* renamed from: c */
    private final bctk f103826c;

    /* renamed from: d */
    private final long f103827d;

    public bbzq(bcas bcas, ConversationId conversationId, bctk bctk, long j) {
        this.f103824a = bcas;
        this.f103825b = conversationId;
        this.f103826c = bctk;
        this.f103827d = j;
    }

    public final Object call() {
        bcas bcas = this.f103824a;
        String[] strArr = {Long.toString(bcas.mo56650c(this.f103825b)), Integer.toString(this.f103826c.f104871m), Long.toString(this.f103827d)};
        bngs j = bngx.m109377j();
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us > ?", strArr, null, null);
        try {
            if (a.moveToFirst()) {
                do {
                    j.mo67668c(a.getString(0));
                } while (a.moveToNext());
            }
            bngx a2 = j.mo67664a();
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
