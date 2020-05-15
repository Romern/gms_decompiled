package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: bcmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmq implements bcnl {

    /* renamed from: a */
    public final String f104493a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final bcoh f104494b;

    /* renamed from: c */
    private final List f104495c;

    /* renamed from: d */
    private final boolean f104496d;

    /* renamed from: e */
    private final cbds f104497e;

    /* renamed from: f */
    private final ConversationId f104498f;

    public bcmq(bcoh bcoh, ConversationId conversationId, List list, cbds cbds, boolean z) {
        this.f104494b = bcoh;
        this.f104495c = list;
        this.f104497e = cbds;
        this.f104496d = z;
        this.f104498f = conversationId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmp((byeb) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        int i;
        bxvd da = byeb.f165885d.mo74144da();
        cbds cbds = this.f104497e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byeb byeb = (byeb) da.f164949b;
        cbds.getClass();
        byeb.f165888b = cbds;
        cbmo.getClass();
        byeb.f165887a = cbmo;
        bchv f = bchw.m89075f();
        f.mo56908a(this.f104495c);
        f.mo56906a(this.f104498f);
        f.mo56907a(this.f104493a);
        f.mo56904a(this.f104496d ? 1 : 0);
        f.mo56905a(this.f104494b.mo57058b().mo57074e());
        bchw a = f.mo56903a();
        cbds a2 = bclk.m89245a(this.f104494b.mo57058b().mo57074e());
        ArrayList arrayList = new ArrayList();
        bcgy bcgy = (bcgy) a;
        for (String str : bcgy.f104146c) {
            bxvd da2 = cbfi.f176921b.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            str.getClass();
            ((cbfi) da2.f164949b).f176923a = str;
            arrayList.add((cbfi) da2.mo74062i());
        }
        int i2 = bcgy.f104144a;
        if (i2 == 0) {
            i = 3;
        } else if (i2 == 1) {
            i = 5;
        } else if (i2 == 2) {
            i = 4;
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid receipt type ");
            sb.append(i2);
            throw new RuntimeException(sb.toString());
        }
        bxvd da3 = bxte.f164763c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent".getClass();
        ((bxte) da3.f164949b).f164765a = "type.googleapis.com/google.internal.communications.instantmessaging.v1.ReceiptEvent";
        bxvd da4 = cbfj.f176924c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        cbfj cbfj = (cbfj) da4.f164949b;
        if (!cbfj.f176926a.mo73666a()) {
            cbfj.f176926a = bxvk.m124021a(cbfj.f176926a);
        }
        bxsy.m123078a(arrayList, cbfj.f176926a);
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        ((cbfj) da4.f164949b).f176927b = i - 2;
        bxtx aL = ((cbfj) da4.mo74062i()).mo73639aL();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        aL.getClass();
        ((bxte) da3.f164949b).f164766b = aL;
        bxte bxte = (bxte) da3.mo74062i();
        bxvd da5 = cbff.f176892t.mo74144da();
        String str2 = bcgy.f104145b;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        cbff cbff = (cbff) da5.f164949b;
        str2.getClass();
        cbff.f176900g = str2;
        a2.getClass();
        cbff.f176902i = a2;
        cbdl a3 = bcli.m89240a(bcgy.f104147d);
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        a3.getClass();
        ((cbff) da5.f164949b).f176903j = a3;
        cbei cbei = cbei.EVENT;
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        ((cbff) da5.f164949b).f176905l = cbei.mo3214a();
        bxvd da6 = cbfd.f176887c.mo74144da();
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        ((cbfd) da6.f164949b).f176889a = cbem.m127778a(6);
        if (da6.f164950c) {
            da6.mo74035c();
            da6.f164950c = false;
        }
        bxte.getClass();
        ((cbfd) da6.f164949b).f176890b = bxte;
        cbfd cbfd = (cbfd) da6.mo74062i();
        if (da5.f164950c) {
            da5.mo74035c();
            da5.f164950c = false;
        }
        cbff cbff2 = (cbff) da5.f164949b;
        cbfd.getClass();
        cbff2.f176897d = cbfd;
        cbff2.f176896c = ErrorInfo.TYPE_SDU_MEMORY_FULL;
        cbff cbff3 = (cbff) da5.mo74062i();
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
        q.mo57012b(this.f104494b.mo57058b().mo57074e());
        q.mo57010a(this.f104494b.mo57059c().mo73781l());
        q.mo57013b(this.f104493a);
        q.mo57008a(this.f104498f);
        q.mo57014c(15);
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
        q.mo57012b(this.f104494b.mo57058b().mo57074e());
        q.mo57010a(this.f104494b.mo57059c().mo73781l());
        q.mo57013b(this.f104493a);
        q.mo57008a(this.f104498f);
        q.mo57014c(15);
        q.mo57003a(1);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
