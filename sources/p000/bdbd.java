package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bdbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdbd extends bday {
    /* renamed from: a */
    public static final bdbe m90523a(ConversationId conversationId) {
        if (conversationId.mo60556c() == ConversationId.IdType.GROUP) {
            return bdbc.m90522a(conversationId.mo60557d());
        }
        return bdbc.m90521a(conversationId.mo60558e());
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return m90523a((ConversationId) obj);
    }
}
