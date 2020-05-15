package p000;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: bcag */
final /* synthetic */ class bcag implements Callable {

    /* renamed from: a */
    private final bcas f103867a;

    /* renamed from: b */
    private final bcsp f103868b;

    public bcag(bcas bcas, bcsp bcsp) {
        this.f103867a = bcas;
        this.f103868b = bcsp;
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
    public final Object call() {
        bmxv bmxv;
        bcas bcas = this.f103867a;
        bcsp bcsp = this.f103868b;
        long b = bcas.mo56638b(bcsp.mo57317a().mo60498a());
        if (bcsp.mo57317a().mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            bmxv = bmxv.m108566b(Long.valueOf(bcas.mo56638b(bcsp.mo57317a().mo60558e())));
        } else {
            bmxv = bmvz.f131120a;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conversation_properties", bcbx.m88783b(bcsp));
        contentValues.put("conversation_app_data", bcbx.m88782a(bnmt.m109803b(bcsp.mo57325i())));
        contentValues.put("conversation_type", Integer.valueOf(bcsp.mo57317a().mo60556c().f111369c));
        if (bcsp.mo57317a().mo60556c() == ConversationId.IdType.GROUP) {
            contentValues.put("conversation_group_id", bcsp.mo57317a().mo60557d().mo60503a());
            contentValues.put("conversation_group_app_name", bcsp.mo57317a().mo60557d().mo60504b());
        }
        if (bmxv.mo66813a()) {
            contentValues.put("other_contact_row_id", (Long) bmxv.mo66814b());
        }
        Long valueOf = Long.valueOf(b);
        contentValues.put("owner_row_id", valueOf);
        contentValues.put("update_timestamp_us", (Long) 0L);
        long a = bcas.f103908c.mo54676a(bcas.mo56655d("conversations"), contentValues, 0);
        bcas.mo56641b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(valueOf);
        if (bmxv.mo66813a()) {
            arrayList.add((Long) bmxv.mo66814b());
        }
        bcas.mo56629a(bcsp.mo57317a(), a, arrayList);
        return Long.valueOf(a);
    }
}
