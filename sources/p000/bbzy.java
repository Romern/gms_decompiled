package p000;

import android.content.ContentValues;
import android.util.Log;
import android.util.Pair;
import java.util.concurrent.Callable;

/* renamed from: bbzy */
final /* synthetic */ class bbzy implements Callable {

    /* renamed from: a */
    private final bcas f103848a;

    /* renamed from: b */
    private final bcuu f103849b;

    public bbzy(bcas bcas, bcuu bcuu) {
        this.f103848a = bcas;
        this.f103849b = bcuu;
    }

    public final Object call() {
        bcas bcas = this.f103848a;
        bcuu bcuu = this.f103849b;
        String b = bcuu.mo57417b();
        bmxv b2 = bcas.mo56639b(b);
        if (!b2.mo66813a()) {
            bbos.m88294d("SQLiteMessagingStore", "Trying to save a SuggestionList whose Message has not been saved.");
            return Pair.create(false, false);
        }
        bmxv a = bcas.mo56615a(b, "conversation_row_id");
        if (!a.mo66813a()) {
            Log.e("SQLiteMessagingStore", "Message exists without conversationId.");
            return Pair.create(false, true);
        }
        bmxv a2 = bcas.mo56614a(((Long) a.mo66814b()).longValue());
        if (!a2.mo66813a()) {
            Log.e("SQLiteMessagingStore", "Message exists without conversation.");
            return Pair.create(false, true);
        }
        bcsp bcsp = (bcsp) a2.mo66814b();
        if (bcsp.mo57326j().mo66813a()) {
            bmxv b3 = bcas.mo56639b(((bcuu) bcsp.mo57326j().mo66814b()).mo57417b());
            if (b3.mo66813a() && ((Long) b2.mo66814b()).longValue() < ((Long) b3.mo66814b()).longValue()) {
                return Pair.create(false, true);
            }
        }
        bcso m = bcsp.mo57329m();
        m.f104812b = bmxv.m108566b(bcuu);
        bcsp a3 = m.mo57457a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_properties", bcbx.m88783b(a3));
        if (bcas.f103908c.mo54674a(bcas.mo56655d("conversations"), contentValues, "id = ?", new String[]{String.valueOf(a.mo66814b())}) < 0) {
            bbos.m88294d("SQLiteMessagingStore", "Failed to update conversation.");
            return Pair.create(false, true);
        }
        bcas.mo56658e(bcsp.mo57317a());
        return Pair.create(true, true);
    }
}
