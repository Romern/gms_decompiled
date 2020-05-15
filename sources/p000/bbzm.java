package p000;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;

/* renamed from: bbzm */
final /* synthetic */ class bbzm implements Callable {

    /* renamed from: a */
    private final bcas f103808a;

    /* renamed from: b */
    private final bctk f103809b;

    /* renamed from: c */
    private final ConversationId f103810c;

    /* renamed from: d */
    private final bctk f103811d;

    public bbzm(bcas bcas, bctk bctk, ConversationId conversationId, bctk bctk2) {
        this.f103808a = bcas;
        this.f103809b = bctk;
        this.f103810c = conversationId;
        this.f103811d = bctk2;
    }

    public final Object call() {
        Throwable th;
        bcas bcas = this.f103808a;
        bctk bctk = this.f103809b;
        ConversationId conversationId = this.f103810c;
        bctk bctk2 = this.f103811d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(bctk.f104871m));
        String[] strArr = {Long.toString(bcas.mo56650c(conversationId)), Integer.toString(bctk2.f104871m)};
        bngs j = bngx.m109377j();
        String str = "conversation_row_id = ? AND message_status = ?";
        String str2 = "messages";
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ?", strArr, null, null);
        try {
            if (a.moveToFirst()) {
                bcas.f103908c.mo54674a(bcas.mo56655d(str2), contentValues, str, strArr);
                bcas.mo56653c(a.getString(0));
                do {
                    j.mo67668c(a.getString(0));
                } while (a.moveToNext());
                if (bcas.f103910e.contains(bctk) || bcas.f103910e.contains(bctk2)) {
                    bcas.mo56661h(conversationId);
                }
                bcas.mo56660g(conversationId);
                bcas.mo56622a(bctk2);
                bcas.mo56622a(bctk);
            }
            bngx a2 = j.mo67664a();
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }
}
