package com.google.android.gms.cast.discovery.gaia;

import java.util.HashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GaiaDiscoveryStorage_Impl extends GaiaDiscoveryStorage {

    /* renamed from: e */
    private volatile ppd f29871e;

    /* renamed from: f */
    private volatile pqh f29872f;

    /* renamed from: g */
    private volatile ppy f29873g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0929df mo6326a(C0940dq dqVar) {
        C0925dc dcVar = new C0925dc(dqVar, new pqc(this), "8aec0f32c4d2d2b2037e0df9a7535ab3", "a678937f7c5fd47d64347c80c83acec0");
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
        return new C0947dx(this, hashMap, "gaia_device_link", "gaia_info", "cloud_device_info");
    }

    /* renamed from: k */
    public final ppd mo17581k() {
        ppd ppd;
        if (this.f29871e != null) {
            return this.f29871e;
        }
        synchronized (this) {
            if (this.f29871e == null) {
                this.f29871e = new pph(this);
            }
            ppd = this.f29871e;
        }
        return ppd;
    }

    /* renamed from: l */
    public final pqh mo17582l() {
        pqh pqh;
        if (this.f29872f != null) {
            return this.f29872f;
        }
        synchronized (this) {
            if (this.f29872f == null) {
                this.f29872f = new pqh(this);
            }
            pqh = this.f29872f;
        }
        return pqh;
    }

    /* renamed from: m */
    public final ppy mo17583m() {
        ppy ppy;
        if (this.f29873g != null) {
            return this.f29873g;
        }
        synchronized (this) {
            if (this.f29873g == null) {
                this.f29873g = new ppy(this);
            }
            ppy = this.f29873g;
        }
        return ppy;
    }
}
