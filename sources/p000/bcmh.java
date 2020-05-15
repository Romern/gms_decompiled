package p000;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.UUID;

/* renamed from: bcmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcmh implements bcnl {

    /* renamed from: a */
    private final bngx f104474a;

    /* renamed from: b */
    private final bcoh f104475b;

    /* renamed from: c */
    private final long f104476c;

    public bcmh(bngx bngx, long j, bcoh bcoh) {
        this.f104474a = bngx;
        this.f104475b = bcoh;
        this.f104476c = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmg((cbdd) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = cbdd.f176718d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbmo.getClass();
        ((cbdd) da.f164949b).f176720a = cbmo;
        bngx a = bbow.m88301a(this.f104474a, bcmf.f104472a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbdd cbdd = (cbdd) da.f164949b;
        if (!cbdd.f176721b.mo73666a()) {
            cbdd.f176721b = bxvk.m124021a(cbdd.f176721b);
        }
        bxsy.m123078a(a, cbdd.f176721b);
        long j = this.f104476c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((cbdd) da.f164949b).f176722c = j;
        return bqga.m112775a((cbdd) da.mo74062i());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        bbyf bbyf = new bbyf();
        bbyf.f103752b = 2;
        bbyf.f103751a = Long.valueOf(((cbde) obj).f176725a);
        String str = bbyf.f103751a == null ? " timestampUsec" : "";
        if (bbyf.f103752b == 0) {
            str = str.concat(" status");
        }
        if (str.isEmpty()) {
            return new bbxx(bbyf.f103751a.longValue(), bbyf.f103752b);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bnre i2 = this.f104474a.listIterator();
        while (i2.hasNext()) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(this.f104475b.mo57058b().mo57074e());
            q.mo57010a(this.f104475b.mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57008a((ConversationId) i2.next());
            q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
            q.mo57014c(22);
            q.mo57003a(i);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbyg bbyg = (bbyg) obj;
        bnre i = this.f104474a.listIterator();
        while (i.hasNext()) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(this.f104475b.mo57058b().mo57074e());
            q.mo57010a(this.f104475b.mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57008a((ConversationId) i.next());
            q.mo57014c(22);
            q.mo57003a(1);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
        }
    }
}
