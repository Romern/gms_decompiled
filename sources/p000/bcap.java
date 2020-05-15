package p000;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcap */
final /* synthetic */ class bcap implements Runnable {

    /* renamed from: a */
    private final bcas f103893a;

    /* renamed from: b */
    private final String f103894b;

    /* renamed from: c */
    private final String[] f103895c;

    /* renamed from: d */
    private final String f103896d;

    /* renamed from: e */
    private final String[] f103897e;

    /* renamed from: f */
    private final String f103898f;

    /* renamed from: g */
    private final long f103899g;

    /* renamed from: h */
    private final ConversationId f103900h;

    public bcap(bcas bcas, String str, String[] strArr, String str2, String[] strArr2, String str3, long j, ConversationId conversationId) {
        this.f103893a = bcas;
        this.f103894b = str;
        this.f103895c = strArr;
        this.f103896d = str2;
        this.f103897e = strArr2;
        this.f103898f = str3;
        this.f103899g = j;
        this.f103900h = conversationId;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
     arg types: [java.lang.String, long]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void} */
    public final void run() {
        Throwable th;
        Throwable th2;
        bcas bcas = this.f103893a;
        String str = this.f103894b;
        String[] strArr = this.f103895c;
        String str2 = this.f103896d;
        String[] strArr2 = this.f103897e;
        String str3 = this.f103898f;
        long j = this.f103899g;
        ConversationId conversationId = this.f103900h;
        bcas.f103908c.mo54675a(bcas.mo56655d("messages"), str, strArr);
        bcas.f103908c.mo54675a(bcas.mo56655d("messages"), str2, strArr2);
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("messages"), new String[]{"message_id"}, "conversation_row_id = ?", new String[]{str3}, null, "1");
        try {
            if (!a.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("update_timestamp_us", (Long) -1L);
                bcas.f103908c.mo54674a(bcas.mo56655d("conversations"), contentValues, "id = ?", new String[]{String.valueOf(str3)});
            }
            if (a != null) {
                a.close();
            }
            Cursor a2 = bcas.f103908c.mo54677a(bcas.mo56655d("conversations"), new String[]{"last_deleted_timestamp_us"}, "id = ?", new String[]{str3}, null, null);
            try {
                if (a2.moveToFirst() && a2.getLong(0) < j) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("last_deleted_timestamp_us", Long.valueOf(j));
                    bcas.f103908c.mo54674a(bcas.mo56655d("conversations"), contentValues2, "id = ?", new String[]{String.valueOf(str3)});
                }
                if (a2 != null) {
                    a2.close();
                }
                bcas.mo56660g(conversationId);
                bcas.mo56641b();
                return;
            } catch (Throwable th3) {
                bqye.m113761a(th2, th3);
            }
            throw th;
            throw th2;
        } catch (Throwable th4) {
            bqye.m113761a(th, th4);
        }
    }
}
