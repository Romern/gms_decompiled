package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: bcmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmm implements bcnl {

    /* renamed from: a */
    private final bcoh f104483a;

    /* renamed from: b */
    private final ConversationId f104484b;

    /* renamed from: c */
    private final bbpw f104485c;

    public bcmm(bcoh bcoh, ConversationId conversationId, bbpw bbpw) {
        this.f104483a = bcoh;
        this.f104484b = conversationId;
        this.f104485c = bbpw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcml((cbcr) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbcr.f176677e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbcr) da.f164949b).f176679a = cbmo;
        cbdl a = bcli.m89240a(this.f104484b);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((cbcr) da.f164949b).f176682d = a;
        ByteString c = this.f104483a.mo57059c();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        c.getClass();
        ((cbcr) da.f164949b).f176680b = c;
        List a2 = this.f104485c.mo56349a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbcr cbcr = (cbcr) da.f164949b;
        if (!cbcr.f176681c.mo73666a()) {
            cbcr.f176681c = GeneratedMessageLite.m124019a(cbcr.f176681c);
        }
        int size = a2.size();
        for (int i = 0; i < size; i++) {
            cbcr.f176681c.mo74153d(((Integer) a2.get(i)).intValue());
        }
        return bqga.m112775a((cbcr) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        bbyh bbyh = new bbyh();
        cbct cbct = ((cbcs) obj).f176685a;
        if (cbct == null) {
            cbct = cbct.f176686b;
        }
        bbyh.f103753a = bngx.m109368a((Collection) cbct.f176688a);
        String str = bbyh.f103753a == null ? " conversationCapabilities" : "";
        if (str.isEmpty()) {
            return new bbxy(bbyh.f103753a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104483a.mo57058b().mo57074e());
        q.mo57010a(this.f104483a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(21);
        q.mo57003a(i);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbyi bbyi = (bbyi) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104483a.mo57058b().mo57074e());
        q.mo57010a(this.f104483a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(21);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
