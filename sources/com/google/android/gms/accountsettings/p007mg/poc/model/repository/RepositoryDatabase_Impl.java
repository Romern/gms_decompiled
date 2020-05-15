package com.google.android.gms.accountsettings.p007mg.poc.model.repository;

import java.util.HashMap;

/* renamed from: com.google.android.gms.accountsettings.mg.poc.model.repository.RepositoryDatabase_Impl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class RepositoryDatabase_Impl extends RepositoryDatabase {

    /* renamed from: j */
    private volatile erg f7756j;

    /* renamed from: k */
    private volatile epw f7757k;

    /* renamed from: l */
    private volatile eqo f7758l;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0929df mo6326a(C0940dq dqVar) {
        C0925dc dcVar = new C0925dc(dqVar, new erf(this), "670f3d20202cb8e1b2a07d18cf889162", "2de9fd33e29273c90009d60c5beb7d43");
        C0926dd a = C0927de.m8233a(dqVar.f13797a);
        a.f12908b = dqVar.f13798b;
        a.f12909c = dcVar;
        return C0937dn.m8852a(a.mo8535a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C0947dx mo6327b() {
        HashMap hashMap = new HashMap(0);
        new HashMap(0);
        return new C0947dx(this, hashMap, "resource_info", "dismissed_prompt_item", "per_device_dismissed_onboarding_flow");
    }

    /* renamed from: k */
    public final erg mo6323k() {
        erg erg;
        if (this.f7756j != null) {
            return this.f7756j;
        }
        synchronized (this) {
            if (this.f7756j == null) {
                this.f7756j = new erm(this);
            }
            erg = this.f7756j;
        }
        return erg;
    }

    /* renamed from: l */
    public final epw mo6324l() {
        epw epw;
        if (this.f7757k != null) {
            return this.f7757k;
        }
        synchronized (this) {
            if (this.f7757k == null) {
                this.f7757k = new eqa(this);
            }
            epw = this.f7757k;
        }
        return epw;
    }

    /* renamed from: m */
    public final eqo mo6325m() {
        eqo eqo;
        if (this.f7758l != null) {
            return this.f7758l;
        }
        synchronized (this) {
            if (this.f7758l == null) {
                this.f7758l = new eqs(this);
            }
            eqo = this.f7758l;
        }
        return eqo;
    }
}
