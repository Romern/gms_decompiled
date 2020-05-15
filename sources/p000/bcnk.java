package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcnk implements bcnl {

    /* renamed from: a */
    public final String f104545a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final bcoh f104546b;

    /* renamed from: c */
    private final boolean f104547c;

    /* renamed from: d */
    private final long f104548d;

    /* renamed from: e */
    private final cbds f104549e;

    /* renamed from: f */
    private final ConversationId f104550f;

    public bcnk(bcoh bcoh, ConversationId conversationId, boolean z, long j, cbds cbds) {
        this.f104546b = bcoh;
        this.f104547c = z;
        this.f104548d = j;
        this.f104549e = cbds;
        this.f104550f = conversationId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcnj((byeb) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = byeb.f165885d.mo74144da();
        cbds cbds = this.f104549e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byeb byeb = (byeb) da.f164949b;
        cbds.getClass();
        byeb.f165888b = cbds;
        cbmo.getClass();
        byeb.f165887a = cbmo;
        bcib g = bcic.m89110g();
        g.mo56923a(this.f104550f);
        g.mo56924a(this.f104545a);
        g.mo56922a(this.f104546b.mo57058b().mo57074e());
        int i = 2;
        g.mo56920a(!this.f104547c ? 2 : 1);
        g.mo56921a(this.f104548d);
        g.mo56925b(0);
        bcic a = g.mo56919a();
        cbds a2 = bclk.m89245a(this.f104546b.mo57058b().mo57074e());
        bcha bcha = (bcha) a;
        int i2 = bcha.f104154c;
        if (i2 == 1) {
            i = 3;
        } else if (i2 == 2) {
            i = 4;
        }
        bxvd da2 = bxte.f164763c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent".getClass();
        ((bxte) da2.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.TypingIndicatorEvent";
        bxvd da3 = cbfl.f176931c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((cbfl) da3.f164949b).f176933a = i - 2;
        ((cbfl) da3.f164949b).f176934b = bcha.f104155d;
        bxtx aL = ((cbfl) da3.mo74062i()).mo73639aL();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aL.getClass();
        ((bxte) da2.f164949b).f164766b = aL;
        bxte bxte = (bxte) da2.mo74062i();
        bxvd da4 = cbff.f176892t.mo74144da();
        String str = bcha.f104152a;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbff cbff = (cbff) da4.f164949b;
        str.getClass();
        cbff.f176900g = str;
        a2.getClass();
        cbff.f176902i = a2;
        cbdl a3 = bcli.m89240a(bcha.f104153b);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        a3.getClass();
        ((cbff) da4.f164949b).f176903j = a3;
        cbei cbei = cbei.EVENT;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((cbff) da4.f164949b).f176905l = cbei.mo3214a();
        bxvd da5 = cbfd.f176887c.mo74144da();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        ((cbfd) da5.f164949b).f176889a = cbem.m127778a(4);
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        bxte.getClass();
        ((cbfd) da5.f164949b).f176890b = bxte;
        cbfd cbfd = (cbfd) da5.mo74062i();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbff cbff2 = (cbff) da4.f164949b;
        cbfd.getClass();
        cbff2.f176897d = cbfd;
        cbff2.f176896c = ErrorInfo.TYPE_SDU_MEMORY_FULL;
        cbff cbff3 = (cbff) da4.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbff3.getClass();
        ((byeb) da.f164949b).f165889c = cbff3;
        return bqga.m112775a((byeb) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        byec byec = (byec) obj;
        return null;
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104546b.mo57058b().mo57074e());
        q.mo57010a(this.f104546b.mo57059c().mo73781l());
        q.mo57013b(this.f104545a);
        q.mo57008a(this.f104550f);
        q.mo57014c(23);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        Void voidR = (Void) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104546b.mo57058b().mo57074e());
        q.mo57010a(this.f104546b.mo57059c().mo73781l());
        q.mo57013b(this.f104545a);
        q.mo57008a(this.f104550f);
        q.mo57014c(23);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
