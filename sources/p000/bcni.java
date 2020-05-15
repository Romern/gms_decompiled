package p000;

import com.google.android.libraries.messaging.lighter.model.C$AutoValue_ContactId;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bcni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcni implements bcnl {

    /* renamed from: a */
    private final bcjz f104539a;

    /* renamed from: b */
    private final ContactId f104540b;

    /* renamed from: c */
    private final bqgg f104541c;

    /* renamed from: d */
    private final azbk f104542d;

    /* renamed from: e */
    private final azbl f104543e;

    public bcni(ContactId contactId, bbpw bbpw, azbk azbk, azbl azbl, bqgg bqgg) {
        this.f104539a = new bcjz(bbpw);
        this.f104540b = contactId;
        this.f104542d = azbk;
        this.f104543e = azbl;
        this.f104541c = bqgg;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        cbln cbln = (cbln) obj;
        if (((C$AutoValue_ContactId) this.f104540b).f111336c != ContactId.ContactType.EMAIL) {
            return bqga.m112777a((Throwable) new chux(chuv.f189218e));
        }
        return bqdx.m112674a(bqgg, new bcnh(cbln), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bcjz bcjz = this.f104539a;
        ContactId contactId = this.f104540b;
        azbk azbk = this.f104542d;
        azbl azbl = this.f104543e;
        bqgg bqgg = this.f104541c;
        cbma a = bcjz.m89173a(contactId);
        bqgg a2 = bcjz.m89171a(azbk);
        bqgg a3 = bcjz.m89172a(azbl, null, a.f177595c, bcla.m89213a(cbmo.f177657b));
        return bqga.m112786c(a2, bqgg, a3).mo69216a(new bcju(bcjz, cbmo, contactId, a2, a3, bqgg), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cblo cblo = (cblo) obj;
        if (cblo.f177544b != null) {
            try {
                bcoe f = bcoh.m89462f();
                bcok g = bcol.m89477g();
                g.mo57064a(this.f104540b);
                f.mo57054a(g);
                f.mo57056a(cblo.f177543a);
                f.mo57053a(bcog.VALID);
                bcoh a = f.mo57051a();
                bcow f2 = bcoz.m89553f();
                cblx cblx = cblo.f177544b;
                if (cblx == null) {
                    cblx = cblx.f177575c;
                }
                f2.mo57126a(bbou.m88297a(cblx.f177577a.mo73780k()));
                f2.mo57127a((KeyPair) bqga.m112780a((Future) this.f104541c));
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                bbon.m88284a();
                long micros = timeUnit.toMicros(System.currentTimeMillis());
                cblx cblx2 = cblo.f177544b;
                if (cblx2 == null) {
                    cblx2 = cblx.f177575c;
                }
                f2.f104648a = Long.valueOf(micros + cblx2.f177578b);
                bbon.m88284a();
                f2.f104649b = Long.valueOf(System.currentTimeMillis());
                bcoz a2 = f2.mo57125a();
                bbyr d = bbys.m88632d();
                d.mo56552a(0);
                d.mo56553a(a);
                d.mo56554a(a2);
                return d.mo56551a();
            } catch (ExecutionException e) {
                bbos.m88292b("RegRpcHandler", "KeyPair get was interupted.", e);
            }
        }
        bbyr d2 = bbys.m88632d();
        d2.mo56552a(1);
        return d2.mo56551a();
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104540b);
        q.mo57013b(uuid.toString());
        q.mo57014c(3);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbys bbys = (bbys) obj;
        if (bbys.mo56536b().mo66813a()) {
            bcnr q = bcns.m89409q();
            q.mo57011b(10003);
            q.mo57012b(((bcoh) bbys.mo56536b().mo66814b()).mo57058b().mo57074e());
            q.mo57010a(((bcoh) bbys.mo56536b().mo66814b()).mo57059c().mo73781l());
            q.mo57013b(uuid.toString());
            q.mo57014c(3);
            q.mo57003a(1);
            q.mo57004a(j);
            bcfx.mo56753a(q.mo57002a());
            return;
        }
        bcnr q2 = bcns.m89409q();
        q2.mo57011b(10003);
        q2.mo57012b(this.f104540b);
        q2.mo57013b(uuid.toString());
        q2.mo57014c(3);
        q2.mo57003a(2);
        q2.mo57004a(j);
        bcfx.mo56753a(q2.mo57002a());
    }
}
