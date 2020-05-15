package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: aupx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aupx extends rle {

    /* renamed from: a */
    final /* synthetic */ int f92295a;

    /* renamed from: b */
    final /* synthetic */ Bundle f92296b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aupx(rjo rjo, rkb rkb, int i, Bundle bundle) {
        super(rjo, rkb);
        this.f92295a = i;
        this.f92296b = bundle;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new aupr(status, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        mo17718a(((auqb) ((aupv) rjd).mo25289B()).mo50656a(new aupw(this), this.f92295a, this.f92296b));
    }
}
