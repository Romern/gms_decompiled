package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcss */
public final /* synthetic */ class bcss implements bmxz {

    /* renamed from: a */
    private final int f104827a;

    public bcss(int i) {
        this.f104827a = i;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        int i = this.f104827a;
        ConversationId.IdType idType = ConversationId.IdType.ONE_TO_ONE;
        return ((ConversationId.IdType) obj).f111369c == i;
    }
}
