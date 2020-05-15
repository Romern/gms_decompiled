package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: bbut */
final /* synthetic */ class bbut implements bqeh {

    /* renamed from: a */
    private final bbwq f103465a;

    /* renamed from: b */
    private final bcoh f103466b;

    /* renamed from: c */
    private final ConversationId f103467c;

    /* renamed from: d */
    private final String f103468d;

    public bbut(bbwq bbwq, bcoh bcoh, ConversationId conversationId, String str) {
        this.f103465a = bbwq;
        this.f103466b = bcoh;
        this.f103467c = conversationId;
        this.f103468d = str;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcme, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        List list;
        bbwq bbwq = this.f103465a;
        bcoh bcoh = this.f103466b;
        ConversationId conversationId = this.f103467c;
        String str = this.f103468d;
        bbxw bbxw = bbwq.f103604b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bmvz bmvz = bmvz.f131120a;
        bcei c = bcej.m88869c();
        c.f104034a = "send conversation opened intent";
        c.mo56735a(bcen.f104044e);
        bcej a = c.mo56734a();
        if (conversationId.mo60556c().equals(ConversationId.IdType.GROUP)) {
            return bqga.m112775a((Object) null);
        }
        List arrayList = new ArrayList();
        try {
            cbdo cbdo = bcku.m89205a(str).f176864c;
            if (cbdo == null) {
                list = arrayList;
                cbds a2 = bcku.m89204a(conversationId);
                UUID randomUUID = UUID.randomUUID();
                bcku bcku = (bcku) bbxw;
                bcme bcme = new bcme(bcoh, conversationId, str, booleanValue, ((Boolean) bbqt.m88417a(bcku.f104414b).f103117aL.mo58455c()).booleanValue(), a2, list);
                bcnr q = bcns.m89409q();
                q.mo57012b(bcoh.mo57058b().mo57074e());
                q.mo57010a(bcoh.mo57059c().mo73781l());
                q.mo57013b(bcme.f104464a);
                q.mo57008a(conversationId);
                q.mo57006a(bngx.m109368a((Collection) list));
                bbot.m88296a(bmvz, new bcko(q));
                bcfx bcfx = bcku.f104415c;
                q.mo57011b(18);
                bcfx.mo56753a(q.mo57002a());
                bcjm bcjm = bcku.f104413a;
                bqgg a3 = bcjm.mo56941a(randomUUID, (bcnl) bcme, bcjm.f104335d.mo56962d(), bcoh, a, true);
                bqga.m112781a(a3, new bcks(bcku, q), bqfb.INSTANCE);
                return a3;
            }
            list = cbdo.f176765a;
            cbds a22 = bcku.m89204a(conversationId);
            UUID randomUUID2 = UUID.randomUUID();
            bcku bcku2 = (bcku) bbxw;
            bcme bcme2 = new bcme(bcoh, conversationId, str, booleanValue, ((Boolean) bbqt.m88417a(bcku2.f104414b).f103117aL.mo58455c()).booleanValue(), a22, list);
            bcnr q2 = bcns.m89409q();
            q2.mo57012b(bcoh.mo57058b().mo57074e());
            q2.mo57010a(bcoh.mo57059c().mo73781l());
            q2.mo57013b(bcme2.f104464a);
            q2.mo57008a(conversationId);
            q2.mo57006a(bngx.m109368a((Collection) list));
            bbot.m88296a(bmvz, new bcko(q2));
            bcfx bcfx2 = bcku2.f104415c;
            q2.mo57011b(18);
            bcfx2.mo56753a(q2.mo57002a());
            bcjm bcjm2 = bcku2.f104413a;
            bqgg a32 = bcjm2.mo56941a(randomUUID2, (bcnl) bcme2, bcjm2.f104335d.mo56962d(), bcoh, a, true);
            bqga.m112781a(a32, new bcks(bcku2, q2), bqfb.INSTANCE);
            return a32;
        } catch (bxwf e) {
            bbos.m88292b("TyMsgClient", "Unable to parse intent args", e);
        }
    }
}
