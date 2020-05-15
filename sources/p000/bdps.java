package p000;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: bdps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdps implements bdkj, bdpq {

    /* renamed from: a */
    public final bdkg f106226a;

    /* renamed from: b */
    public final bdpz f106227b;

    /* renamed from: c */
    public final boolean f106228c;

    /* renamed from: d */
    private final cijl f106229d;

    /* renamed from: e */
    private final bdqa f106230e;

    bdps() {
    }

    /* renamed from: a */
    public final void mo58277a() {
        bdqi.m91283a(bdid.f105688a);
    }

    /* renamed from: b */
    public final void mo58031b() {
        bdqi.m91286b(bdid.f105688a);
    }

    /* renamed from: c */
    public final void mo58086c() {
    }

    /* renamed from: a */
    public final void mo58278a(String str, long j, long j2) {
        if (!TextUtils.isEmpty(str) && j2 > 0) {
            bdqi.m91284a(bdid.f105688a, str, j, j2);
        }
    }

    public bdps(bdkh bdkh, cijl cijl, bmxv bmxv, bmxv bmxv2, bdif bdif) {
        int i;
        float f;
        bdpp bdpp = (bdpp) bmxv.mo66812a(bdpp.m91246e().mo58272a());
        boolean a = bdpp.mo58264a();
        this.f106228c = a;
        if (a) {
            i = bdpp.mo58265b();
        } else {
            i = 10;
        }
        this.f106227b = new bdpz(i);
        this.f106226a = bdkh.mo58105a((Executor) cijl.mo6445a(), this.f106227b);
        this.f106229d = cijl;
        if (!this.f106228c) {
            f = ((bdpr) bmxv2.mo66814b()).mo58282b();
        } else {
            f = 1.0f;
        }
        this.f106230e = bdqa.m91274a(f);
        if (!this.f106228c) {
            ((bdpr) bmxv2.mo66814b()).mo58284d();
        }
        if (!this.f106228c) {
            ((bdpr) bmxv2.mo66814b()).mo58283c();
        }
        bdif.mo58069b(this);
    }

    /* renamed from: a */
    public final void mo58279a(String str, String str2) {
        bdid bdid = bdid.f105688a;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        bdqh a = bdqi.m91282a(bdid, str);
        if (a != null) {
            bdhp.m90826a(bqga.m112776a(new bdpt(this, a), (Executor) this.f106229d.mo6445a()));
        }
    }

    /* renamed from: a */
    public final boolean mo58280a(String str) {
        if (this.f106230e.mo58289a()) {
            return bdqi.m91287b(bdid.f105688a, str);
        }
        return false;
    }
}
