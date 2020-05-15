package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: rma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rma implements rkd {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f43267a;

    /* renamed from: b */
    final /* synthetic */ rmc f43268b;

    public rma(rmc rmc, BasePendingResult basePendingResult) {
        this.f43268b = rmc;
        this.f43267a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo24807a(Status status) {
        this.f43268b.f43271a.remove(this.f43267a);
    }
}
