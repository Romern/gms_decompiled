package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyPair;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: bcna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcna implements bcnl {

    /* renamed from: a */
    private final bcjz f104514a;

    /* renamed from: b */
    private final bcoh f104515b;

    /* renamed from: c */
    private final KeyPair f104516c;

    /* renamed from: d */
    private final long f104517d;

    /* renamed from: e */
    private final azbk f104518e;

    public bcna(bcoh bcoh, bbpw bbpw, azbk azbk, KeyPair keyPair, long j) {
        this.f104514a = new bcjz(bbpw);
        this.f104515b = bcoh;
        this.f104518e = azbk;
        this.f104516c = keyPair;
        this.f104517d = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo56978a(bqgg bqgg, Object obj) {
        return bqdx.m112674a(bqgg, new bcmz((cblf) obj), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo56979a(cbmo cbmo) {
        bcjz bcjz = this.f104514a;
        ContactId e = this.f104515b.mo57058b().mo57074e();
        azbk azbk = this.f104518e;
        long j = this.f104517d;
        KeyPair keyPair = this.f104516c;
        cbma a = bcjz.m89173a(e);
        bqgg a2 = bcjz.m89171a(azbk);
        return bqga.m112786c(a2).mo69216a(new bcjv(bcjz, cbmo, j, keyPair, a, a2), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56980a(Object obj) {
        cblg cblg = (cblg) obj;
        if (cblg.f177498a != null) {
            bcoe f = bcoh.m89462f();
            bcok g = bcol.m89477g();
            g.mo57064a(this.f104515b.mo57058b().mo57074e());
            f.mo57054a(g);
            f.mo57056a(cblg.f177501d);
            f.mo57053a(bcog.VALID);
            bcoh a = f.mo57051a();
            bcow f2 = bcoz.m89553f();
            cblx cblx = cblg.f177498a;
            if (cblx == null) {
                cblx = cblx.f177575c;
            }
            f2.mo57126a(bbou.m88297a(cblx.f177577a.getKey()));
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            bbon.m88284a();
            long micros = timeUnit.toMicros(System.currentTimeMillis());
            cblx cblx2 = cblg.f177498a;
            if (cblx2 == null) {
                cblx2 = cblx.f177575c;
            }
            f2.f104648a = Long.valueOf(micros + cblx2.f177578b);
            bbon.m88284a();
            f2.f104649b = Long.valueOf(System.currentTimeMillis());
            f2.mo57127a(this.f104516c);
            bcoz a2 = f2.mo57125a();
            bbyp e = bbyq.m88623e();
            e.f103764d = 2;
            e.f103761a = bmxv.m108566b(a);
            e.f103762b = bmxv.m108566b(a2);
            return e.mo56550a();
        } else if (!cblg.f177499b) {
            bbyp e2 = bbyq.m88623e();
            e2.f103764d = 3;
            return e2.mo56550a();
        } else {
            bbos.m88289a("RegRefreshRpcHandler", "RegisterRefreshResponse: retry with server timestamp");
            bbyp e3 = bbyq.m88623e();
            e3.f103764d = 4;
            e3.f103763c = bmxv.m108566b(Long.valueOf(cblg.f177500c));
            return e3.mo56550a();
        }
    }

    /* renamed from: a */
    public final void mo56981a(UUID uuid, int i, chuv chuv, bcfx bcfx, long j) {
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(this.f104515b.mo57058b().mo57074e());
        q.mo57010a(this.f104515b.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(1);
        q.mo57009a(Integer.valueOf(chuv.f189233s.f189211r));
        q.mo57003a(i);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo56982a(UUID uuid, Object obj, bcfx bcfx, long j) {
        bbyq bbyq = (bbyq) obj;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(((bcoh) bbyq.mo56528a().mo66814b()).mo57058b().mo57074e());
        q.mo57010a(((bcoh) bbyq.mo56528a().mo66814b()).mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57004a(j);
        if (bbyq.mo56531d() == 2 && bbyq.mo56528a().mo66813a()) {
            q.mo57014c(1);
            q.mo57003a(1);
            bcfx.mo56753a(q.mo57002a());
        } else if (bbyq.mo56531d() == 4) {
            q.mo57014c(1);
            q.mo57003a(3);
            bcfx.mo56753a(q.mo57002a());
        } else {
            q.mo57012b(this.f104515b.mo57058b().mo57074e());
            q.mo57010a(this.f104515b.mo57059c().mo73781l());
            q.mo57014c(1);
            q.mo57003a(2);
            bcfx.mo56753a(q.mo57002a());
        }
    }
}
