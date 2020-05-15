package p000;

import android.os.Binder;
import com.google.android.gms.fitness.service.proxy.FitProxyChimeraBroker;

/* renamed from: zoc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zoc extends zlz {

    /* renamed from: d */
    public final zoh f55582d;

    /* renamed from: e */
    public final zor f55583e;

    /* renamed from: f */
    public final zne f55584f;

    /* renamed from: g */
    public final zon f55585g;

    /* renamed from: h */
    public final zmn f55586h;

    /* renamed from: i */
    public final zmp f55587i;

    /* renamed from: j */
    public final znp f55588j;

    public zoc(FitProxyChimeraBroker fitProxyChimeraBroker, String str, zma zma, zma zma2, zma zma3, zma zma4, zma zma5, zma zma6, zma zma7, yzs yzs) {
        super(fitProxyChimeraBroker, str, yzs);
        this.f55582d = (zoh) zma.mo31238a(str);
        this.f55583e = (zor) zma2.mo31238a(str);
        this.f55584f = (zne) zma3.mo31238a(str);
        this.f55585g = (zon) zma4.mo31238a(str);
        this.f55586h = (zmn) zma5.mo31238a(str);
        this.f55587i = (zmp) zma6.mo31238a(str);
        this.f55588j = (znp) zma7.mo31238a(str);
    }

    /* renamed from: a */
    public final Binder mo31232a(ytt ytt) {
        return new zcd(this, ytt);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        throw new UnsupportedOperationException();
    }
}
