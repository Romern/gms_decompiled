package p000;

import android.database.Cursor;
import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bbzc */
final /* synthetic */ class bbzc implements bmxj {

    /* renamed from: a */
    private final ConversationId f103787a;

    public bbzc(ConversationId conversationId) {
        this.f103787a = conversationId;
    }

    public final Object apply(Object obj) {
        ConversationId conversationId = this.f103787a;
        Cursor cursor = (Cursor) obj;
        int i = bcas.f103904h;
        return cursor.moveToFirst() ? bmxv.m108566b(bccf.m88795a(conversationId, cursor)) : bmvz.f131120a;
    }
}
