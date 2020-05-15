package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

/* renamed from: bbzn */
final /* synthetic */ class bbzn implements Callable {

    /* renamed from: a */
    private final bcas f103812a;

    /* renamed from: b */
    private final ConversationId f103813b;

    /* renamed from: c */
    private final bngx f103814c;

    /* renamed from: d */
    private final long f103815d;

    public bbzn(bcas bcas, ConversationId conversationId, bngx bngx, long j) {
        this.f103812a = bcas;
        this.f103813b = conversationId;
        this.f103814c = bngx;
        this.f103815d = j;
    }

    public final Object call() {
        bcas bcas = this.f103812a;
        ConversationId conversationId = this.f103813b;
        bngx bngx = this.f103814c;
        long j = this.f103815d;
        long c = bcas.mo56650c(conversationId);
        if (c == -1) {
            c = bcas.mo56604a(conversationId, bmvz.f131120a);
            if (c == -1) {
                return false;
            }
        }
        bmxv a = bcas.mo56614a(c);
        if (!a.mo66813a()) {
            return false;
        }
        bcso m = ((bcsp) a.mo66814b()).mo57329m();
        m.mo57460a(bngx);
        m.mo57466b(Long.valueOf(j));
        bcsp a2 = m.mo57457a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_properties", bcbx.m88783b(a2));
        if (bcas.f103908c.mo54674a(bcas.mo56655d("conversations"), contentValues, "id = ?", new String[]{String.valueOf(c)}) < 0) {
            bbos.m88294d("SQLiteMessagingStore", "Failed to update conversation.");
            return false;
        }
        bcas.mo56658e(((bcsp) a.mo66814b()).mo57317a());
        return true;
    }
}
