package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: bbzr */
final /* synthetic */ class bbzr implements Callable {

    /* renamed from: a */
    private final bcas f103828a;

    /* renamed from: b */
    private final String f103829b;

    /* renamed from: c */
    private final String[] f103830c;

    public bbzr(bcas bcas, String str, String[] strArr) {
        this.f103828a = bcas;
        this.f103829b = str;
        this.f103830c = strArr;
    }

    public final Object call() {
        bcas bcas = this.f103828a;
        String str = this.f103829b;
        String[] strArr = this.f103830c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Cursor a = bcas.f103908c.mo54677a(bcas.mo56655d("messages"), new String[]{"message_id", "conversation_row_id"}, str, strArr, null, null);
        try {
            if (a.moveToFirst()) {
                do {
                    long j = a.getLong(1);
                    String string = a.getString(0);
                    Long valueOf = Long.valueOf(j);
                    if (!hashMap2.containsKey(valueOf)) {
                        hashMap2.put(valueOf, new ArrayList());
                    }
                    ((List) hashMap2.get(valueOf)).add(string);
                } while (a.moveToNext());
            }
            if (a != null) {
                a.close();
            }
            for (Long l : hashMap2.keySet()) {
                long longValue = l.longValue();
                bmxv a2 = bcas.mo56614a(longValue);
                for (String str2 : (List) hashMap2.get(Long.valueOf(longValue))) {
                    if (a2.mo66813a()) {
                        if (!hashMap.containsKey(((bcsp) a2.mo66814b()).mo57317a())) {
                            hashMap.put(((bcsp) a2.mo66814b()).mo57317a(), new ArrayList());
                        }
                        ((List) hashMap.get(((bcsp) a2.mo66814b()).mo57317a())).add(str2);
                    } else {
                        bbos.m88293c("SQLiteMessagingStore", "Conversation decoding failed");
                    }
                }
            }
            bnha h = bnhe.m109414h();
            for (ConversationId conversationId : hashMap.keySet()) {
                h.mo67695b(conversationId, bngx.m109368a((Collection) hashMap.get(conversationId)));
            }
            return h.mo67618b();
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
