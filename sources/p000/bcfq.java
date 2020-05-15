package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;

/* renamed from: bcfq */
final /* synthetic */ class bcfq implements C1228nu {

    /* renamed from: a */
    private final bxvd f104085a;

    public bcfq(bxvd bxvd) {
        this.f104085a = bxvd;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        bqhu bqhu;
        bxvd bxvd = this.f104085a;
        ConversationId conversationId = (ConversationId) obj;
        if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            bqhu = bcfx.m88930a(conversationId.mo60558e());
        } else {
            bxvd da = bqhu.f140722e.mo74144da();
            String b = conversationId.mo60557d().mo60504b();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((bqhu) da.f164949b).f140727d = b;
            String a = conversationId.mo60557d().mo60503a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqhu bqhu2 = (bqhu) da.f164949b;
            a.getClass();
            bqhu2.f140725b = a;
            bqhu2.f140724a = cbel.m127776a(6);
            bqhu = (bqhu) da.mo74062i();
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bqhp bqhp = bqhp.f140683q;
        bqhu.getClass();
        ((bqhp) bxvd.f164949b).f140688d = bqhu;
    }
}
