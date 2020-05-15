package p000;

import android.os.Binder;
import com.google.android.gms.fitness.service.goals.FitGoalsChimeraBroker;

/* renamed from: zmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zmt extends zlz {

    /* renamed from: d */
    public static final srn f55495d = zvt.m46581a();

    /* renamed from: e */
    public final zmv f55496e;

    public zmt(FitGoalsChimeraBroker fitGoalsChimeraBroker, String str, yzs yzs) {
        super(fitGoalsChimeraBroker, str, yzs);
        this.f55496e = new zmv(yzs.mo30874b().mo30741b(this.f55429b), new znm(yzs.mo30890j(this.f55429b), new yec()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zbm(ytu);
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zms(this);
    }
}
