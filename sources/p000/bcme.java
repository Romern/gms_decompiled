package p000;

import android.util.Base64;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: bcme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcme implements bcnl {

    /* renamed from: a */
    public final String f104464a = UUID.randomUUID().toString();

    /* renamed from: b */
    private final bcoh f104465b;

    /* renamed from: c */
    private final ConversationId f104466c;

    /* renamed from: d */
    private final String f104467d;

    /* renamed from: e */
    private final boolean f104468e;

    /* renamed from: f */
    private final boolean f104469f;

    /* renamed from: g */
    private final cbds f104470g;

    /* renamed from: h */
    private final List f104471h;

    public bcme(bcoh bcoh, ConversationId conversationId, String str, boolean z, boolean z2, cbds cbds, List list) {
        this.f104465b = bcoh;
        this.f104466c = conversationId;
        this.f104467d = str;
        this.f104468e = z;
        this.f104469f = z2;
        this.f104470g = cbds;
        this.f104471h = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmd((byeb) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bxvd da = byeb.f165885d.mo74144da();
        cbds cbds = this.f104470g;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byeb byeb = (byeb) da.f164949b;
        cbds.getClass();
        byeb.f165888b = cbds;
        cbmo.getClass();
        byeb.f165887a = cbmo;
        cbff a = bclm.m89256a(this.f104464a, this.f104466c, Base64.decode(this.f104467d, 8), this.f104468e, this.f104469f);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((byeb) da.f164949b).f165889c = a;
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
        q.mo57012b(this.f104465b.mo57058b().mo57074e());
        q.mo57010a(this.f104465b.mo57059c().mo73781l());
        q.mo57013b(this.f104464a);
        q.mo57008a(this.f104466c);
        q.mo57014c(16);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57006a(bngx.m109368a((Collection) this.f104471h));
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        Void voidR = (Void) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104465b.mo57058b().mo57074e());
        q.mo57010a(this.f104465b.mo57059c().mo73781l());
        q.mo57013b(this.f104464a);
        q.mo57008a(this.f104466c);
        q.mo57014c(16);
        q.mo57003a(1);
        q.mo57006a(bngx.m109368a((Collection) this.f104471h));
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }
}
