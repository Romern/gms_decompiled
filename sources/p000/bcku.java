package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: bcku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcku implements bbxw {

    /* renamed from: a */
    public final bcjm f104413a;

    /* renamed from: b */
    public final Context f104414b;

    /* renamed from: c */
    public final bcfx f104415c;

    /* renamed from: d */
    public final bbpw f104416d;

    /* renamed from: e */
    public final bckf f104417e = new bckf();

    /* renamed from: f */
    public final Map f104418f;

    public bcku(bcjm bcjm, Context context, Map map) {
        this.f104413a = bcjm;
        this.f104414b = context;
        this.f104415c = bcfx.m88929a(context);
        this.f104416d = bbpw.m88374a(context);
        this.f104418f = map;
    }

    /* renamed from: a */
    private static bmxv m89203a(byte[] bArr) {
        try {
            return bmxv.m108566b((cbkj) GeneratedMessageLite.m124014a(cbkj.f177405k, bArr));
        } catch (bxwf e) {
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public static cbds m89204a(ConversationId conversationId) {
        if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            return bclk.m89245a(conversationId.mo60558e());
        }
        bxvd da = cbds.f176782e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbds) da.f164949b).f176784a = cbel.m127776a(6);
        String a = conversationId.mo60557d().mo60503a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbds) da.f164949b).f176785b = a;
        String b = conversationId.mo60557d().mo60504b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((cbds) da.f164949b).f176787d = b;
        return (cbds) da.mo74062i();
    }

    /* renamed from: a */
    public static cbex m89205a(String str) {
        return (cbex) GeneratedMessageLite.m124014a(cbex.f176860f, Base64.decode(str, 8));
    }

    /* renamed from: a */
    public final bmxv mo56500a(bcoh bcoh, String str) {
        try {
            cbex a = m89205a(str);
            cbds cbds = a.f176862a;
            if (cbds == null) {
                cbds = cbds.f176782e;
            }
            bcsq f = ConversationId.m94839f();
            f.mo57473a(bcoh.mo57058b().mo57074e());
            int b = cbel.m127777b(cbds.f176784a);
            boolean z = true;
            if (b == 0) {
                b = 1;
            }
            int i = b - 2;
            boolean z2 = false;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    z = false;
                } else if (i != 4) {
                    return bmvz.f131120a;
                } else {
                    bcsr c = ConversationId.GroupId.m94847c();
                    c.mo57478b(cbds.f176785b);
                    c.mo57477a(cbds.f176787d);
                    f.mo57474a(c.mo57476a());
                    bcso n = bcsp.m89835n();
                    n.mo57461a(f.mo57472a());
                    n.mo57462a((Long) -1L);
                    n.mo57464a(bnmt.m109799a(Collections.unmodifiableMap(a.f176863b), bckn.f104392a));
                    n.mo57465a(z2);
                    return bmxv.m108566b(n.mo57457a());
                }
            }
            f.mo57475b(bclk.m89246a(cbds));
            z2 = z;
            bcso n2 = bcsp.m89835n();
            n2.mo57461a(f.mo57472a());
            n2.mo57462a((Long) -1L);
            n2.mo57464a(bnmt.m109799a(Collections.unmodifiableMap(a.f176863b), bckn.f104392a));
            n2.mo57465a(z2);
            return bmxv.m108566b(n2.mo57457a());
        } catch (bxwf | IllegalArgumentException e) {
            bbos.m88292b("TyMsgClient", "Unable to parse intent args", e);
            return bmvz.f131120a;
        }
    }

    /* renamed from: a */
    public final bmxv mo56501a(bcoh bcoh, byte[] bArr) {
        bmxv bmxv;
        try {
            bmxv = m89203a(Base64.decode(bArr, 8));
            if (!bmxv.mo66813a()) {
                bmxv = m89203a(bArr);
            }
        } catch (IllegalArgumentException e) {
            bmxv = m89203a(bArr);
        }
        if (!bmxv.mo66813a()) {
            return bmvz.f131120a;
        }
        Context context = this.f104414b;
        return bclm.m89252a((cbkj) bmxv.mo66814b(), bcoh, context, this.f104418f, bcfx.m88929a(context));
    }

    /* renamed from: a */
    public final bqgg mo56502a(bcoh bcoh, ConversationId conversationId, List list, bcej bcej) {
        return bqdx.m112674a(bbqt.m88418a(bbqt.m88417a(this.f104414b).f103085G, bqgs.m112810a()), new bckm(this, bcoh, conversationId, list, bcej), bqfb.INSTANCE);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg
     arg types: [java.util.UUID, bcmq, bqgg, bcoh, bcej, int]
     candidates:
      bcjm.a(bcoh, com.google.android.libraries.messaging.lighter.model.ContactId, bqeh, int, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, int, bcnl, bqgg, bcoh, bcoz):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcoz, bcej):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, com.google.android.libraries.messaging.lighter.model.ContactId, bcej, boolean):bqgg
      bcjm.a(java.util.UUID, bcnl, bqgg, bcoh, bcej, boolean):bqgg */
    /* renamed from: a */
    public final bqgg mo56965a(bcoh bcoh, ConversationId conversationId, List list, bcej bcej, boolean z) {
        ConversationId conversationId2 = conversationId;
        if (list.size() <= 0) {
            return bqga.m112775a((Object) null);
        }
        bcmq bcmq = new bcmq(bcoh, conversationId, list, m89204a(conversationId), z);
        bcfx bcfx = this.f104415c;
        bcnr q = bcns.m89409q();
        q.mo57011b(18);
        q.mo57012b(bcoh.mo57058b().mo57074e());
        q.mo57010a(bcoh.mo57059c().mo73781l());
        q.mo57013b(bcmq.f104493a);
        q.mo57008a(conversationId2);
        bcfx.mo56753a(q.mo57002a());
        bqgg a = this.f104413a.mo56941a(UUID.randomUUID(), (bcnl) bcmq, this.f104413a.f104335d.mo56962d(), bcoh, bcej, true);
        bqga.m112781a(a, new bckq(this, bcoh, bcmq, conversationId2), bqfb.INSTANCE);
        return a;
    }
}
