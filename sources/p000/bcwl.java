package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcwl implements bcnl {

    /* renamed from: a */
    public final byte[] f105064a;

    /* renamed from: b */
    private final bqgj f105065b = bboz.m88304a().f103024a;

    /* renamed from: c */
    private final ConversationId f105066c;

    /* renamed from: d */
    private final bcoh f105067d;

    public bcwl(bcoh bcoh, ConversationId conversationId, byte[] bArr) {
        this.f105064a = bArr;
        this.f105066c = conversationId;
        this.f105067d = bcoh;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcwk(this, (cbnb) obj), this.f105065b);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        cbma cbma;
        bxvd da = cbnb.f177710e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbnb cbnb = (cbnb) da.f164949b;
        cbmo.getClass();
        cbnb.f177714c = cbmo;
        cbnb.f177715d = cipi.m150693a(12);
        bxvd da2 = cbmb.f177598b.mo74144da();
        ConversationId conversationId = this.f105066c;
        if (conversationId.mo60556c() == ConversationId.IdType.ONE_TO_ONE) {
            cbma = bclg.m89237a(conversationId.mo60558e());
        } else {
            bxvd da3 = cbma.f177591f.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbma) da3.f164949b).f177593a = cipg.m150690a(4);
            String a = conversationId.mo60557d().mo60503a();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            a.getClass();
            ((cbma) da3.f164949b).f177594b = a;
            String b = conversationId.mo60557d().mo60504b();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            b.getClass();
            ((cbma) da3.f164949b).f177595c = b;
            cbma = (cbma) da3.mo74062i();
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        cbmb cbmb = (cbmb) da2.f164949b;
        cbma.getClass();
        if (!cbmb.f177600a.mo73666a()) {
            cbmb.f177600a = bxvk.m124021a(cbmb.f177600a);
        }
        cbmb.f177600a.add(cbma);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbnb cbnb2 = (cbnb) da.f164949b;
        cbmb cbmb2 = (cbmb) da2.mo74062i();
        cbmb2.getClass();
        cbnb2.f177713b = cbmb2;
        cbnb2.f177712a = 5;
        return bqga.m112775a((cbnb) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cbnc cbnc = (cbnc) obj;
        bcvy bcvy = new bcvy();
        bcwo c = bcwp.m90173c();
        cbmf cbmf = cbnc.f177718a;
        if (cbmf == null) {
            cbmf = cbmf.f177611d;
        }
        c.mo57635a(cbmf.f177613a);
        cbmf cbmf2 = cbnc.f177718a;
        if (cbmf2 == null) {
            cbmf2 = cbmf.f177611d;
        }
        bxvl bxvl = cbmf2.f177615c;
        if (bxvl == null) {
            bxvl = bxvl.f164962b;
        }
        c.mo57634a(bxvl.f164964a);
        bcvy.f105039a = c.mo57633a();
        String str = bcvy.f105039a == null ? " mediaId" : "";
        if (str.isEmpty()) {
            return new bcvv(bcvy.f105039a);
        }
        throw new IllegalStateException(str.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(str));
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        int i2 = chuv.f189233s.f189211r;
        Throwable th = chuv.f189235u;
        if (th instanceof bcwb) {
            bcwb bcwb = (bcwb) th;
        }
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f105067d.mo57058b().mo57074e());
        q.mo57010a(this.f105067d.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(17);
        q.mo57009a(Integer.valueOf(i2));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bcvz bcvz = (bcvz) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f105067d.mo57058b().mo57074e());
        q.mo57010a(this.f105067d.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(17);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
