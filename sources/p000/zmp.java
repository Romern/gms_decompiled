package p000;

import android.os.Binder;
import com.google.android.gms.fitness.service.config.FitConfigChimeraBroker;

/* renamed from: zmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmp extends zlz {

    /* renamed from: d */
    public static final srn f55479d = zvt.m46581a();

    /* renamed from: e */
    public final zpj f55480e;

    /* renamed from: f */
    public final zmq f55481f;

    public zmp(FitConfigChimeraBroker fitConfigChimeraBroker, String str, yzs yzs) {
        super(fitConfigChimeraBroker, str, yzs);
        this.f55481f = new zmq(yzs.mo30874b().mo30741b(this.f55429b), yzs.mo30877c(this.f55429b));
        this.f55480e = new zpj(this.f55428a, yzs.mo30874b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zbj(ytu);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zmo(this);
    }
}
