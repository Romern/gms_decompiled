package p000;

import android.content.Intent;

/* renamed from: bdua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdua implements bdto, bdtq {

    /* renamed from: a */
    final bdul f106447a;

    /* renamed from: b */
    final bdve f106448b;

    /* renamed from: c */
    final ayte f106449c;

    /* renamed from: d */
    private final bdro f106450d;

    public bdua(bdul bdul, bdve bdve, bdro bdro, ayte ayte) {
        this.f106447a = bdul;
        this.f106448b = bdve;
        this.f106450d = bdro;
        this.f106449c = ayte;
    }

    /* renamed from: a */
    private final bqgg m91442a(bqgg bqgg, int i, long j, int i2) {
        return bqdf.m112620a(bqgg, Exception.class, new bdtz(this, i, j, i2), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bqgg mo58361b() {
        mo58377c();
        long b = this.f106449c.mo54418b();
        return bqdx.m112673a(mo58376a(this.f106447a.mo58389b(), 3012, b), new bdud(this, b), bqfb.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo58377c() {
        if (chbb.f188227a.mo6606a().mo84900a()) {
            this.f106450d.mo58314a();
        }
    }

    /* renamed from: a */
    public final bqgg mo58358a() {
        mo58377c();
        long b = this.f106449c.mo54418b();
        return bqdx.m112673a(mo58376a(this.f106447a.mo58388a(), 3008, b), new bdub(this, b), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final bqgg mo58356b(int i) {
        mo58377c();
        long b = this.f106449c.mo54418b();
        return bqdx.m112673a(m91442a(this.f106447a.mo58388a(), 3004, b, i), new bdtx(this, i, b), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo58355a(int i) {
        mo58377c();
        long b = this.f106449c.mo54418b();
        return bqdx.m112673a(m91442a(this.f106447a.mo58388a(), 3003, b, i), new bdtw(this, i, b), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo58359a(Intent intent) {
        long b = this.f106449c.mo54418b();
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT".equals(intent.getAction())) {
            return bqga.m112775a((Object) null);
        }
        return bqdx.m112673a(mo58376a(this.f106447a.mo58389b(), 3010, b), new bduc(this, b), bqfb.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo58376a(bqgg bqgg, int i, long j) {
        return m91442a(bqgg, i, j, 0);
    }

    /* renamed from: a */
    public final bqgg mo58360a(bxqf bxqf) {
        bqgg a;
        mo58377c();
        long b = this.f106449c.mo54418b();
        bdul bdul = this.f106447a;
        bxvd bxvd = (bxvd) bxqf.mo74142c(5);
        bxvd.mo73625a((bxvk) bxqf);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxqf bxqf2 = (bxqf) bxvd.f164949b;
        bxqf bxqf3 = bxqf.f164373f;
        bxqf2.f164377c = null;
        bxqf2.f164375a &= -5;
        bxqf bxqf4 = (bxqf) bxvd.mo74062i();
        synchronized (((bdvb) bdul).f106486a) {
            a = ((bdvb) bdul).mo58391a(new bduu((bdvb) bdul, bxqf4));
        }
        return bqdx.m112673a(mo58376a(a, 3007, b), new bdty(this, b), bqfb.INSTANCE);
    }
}
