package p000;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: bbzt */
final /* synthetic */ class bbzt implements Callable {

    /* renamed from: a */
    private final bcas f103835a;

    /* renamed from: b */
    private final ConversationId f103836b;

    /* renamed from: c */
    private final long f103837c;

    /* renamed from: d */
    private final long f103838d;

    public bbzt(bcas bcas, ConversationId conversationId, long j, long j2) {
        this.f103835a = bcas;
        this.f103836b = conversationId;
        this.f103837c = j;
        this.f103838d = j2;
    }

    public final Object call() {
        Throwable th;
        bngs bngs;
        String str = "messages";
        bcas bcas = this.f103835a;
        ConversationId conversationId = this.f103836b;
        long j = this.f103837c;
        long j2 = this.f103838d;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(bctk.f104864g.f104871m));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bbon.m88284a();
        String[] strArr = {Long.toString(bcas.mo56650c(conversationId)), Integer.toString(bctk.f104863f.f104871m), Long.toString(timeUnit.toMicros((System.currentTimeMillis() + j) - j2))};
        bngs j3 = bngx.m109377j();
        bdae bdae = bcas.f103908c;
        String valueOf = String.valueOf(bcbc.m88745a("contacts", "id"));
        String str2 = "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?";
        bngs bngs2 = j3;
        Cursor a = bdae.mo54677a(bcas.mo56655d(valueOf.length() == 0 ? new String("messages INNER JOIN contacts ON sender_contact_row_id = ") : "messages INNER JOIN contacts ON sender_contact_row_id = ".concat(valueOf)), null, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us < ?", strArr, null, null);
        try {
            if (a.moveToFirst()) {
                bcas.f103908c.mo54674a(bcas.mo56655d(str), contentValues, str2, strArr);
                bngx b = bccf.m88797b(conversationId, a);
                bnre i = bcbz.m88786b(b).listIterator();
                while (i.hasNext()) {
                    bctr bctr = (bctr) i.next();
                    bngs2.mo67668c(bctr.mo57359a());
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("server_timestamp_us", Long.valueOf((bctr.mo57362d().longValue() - TimeUnit.MILLISECONDS.toMicros(j)) + TimeUnit.MILLISECONDS.toMicros(j2)));
                    bcas.f103908c.mo54674a(bcas.mo56655d(str), contentValues2, "message_id = ?", new String[]{bctr.mo57359a()});
                    bcas.mo56653c(bctr.mo57359a());
                    bngs2 = bngs2;
                    str = str;
                }
                bngs = bngs2;
                bcas.mo56660g(conversationId);
                bcas.mo56622a(bctk.f104863f);
                bcas.mo56622a(bctk.f104864g);
                bnre i2 = bcbz.m88785a(b).listIterator();
                while (i2.hasNext()) {
                    bcas.f103907b.mo56753a((bcns) i2.next());
                }
            } else {
                bngs = bngs2;
            }
            bngx a2 = bngs.mo67664a();
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
