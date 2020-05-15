package p000;

import android.os.Binder;
import com.google.android.gms.fitness.service.internal.FitInternalChimeraBroker;

/* renamed from: znp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class znp extends zlz {

    /* renamed from: d */
    public static final srn f55565d = zvt.m46581a();

    /* renamed from: e */
    public final zre f55566e;

    /* renamed from: f */
    public final zrk f55567f;

    /* renamed from: g */
    public final zuu f55568g;

    public znp(FitInternalChimeraBroker fitInternalChimeraBroker, String str, yzs yzs) {
        super(fitInternalChimeraBroker, str, yzs);
        this.f55566e = yzs.mo30877c(this.f55429b);
        this.f55567f = yzs.mo30880e(this.f55429b);
        this.f55568g = yzs.mo30892k(this.f55429b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zbs(this, ytu);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zno(this);
    }
}
