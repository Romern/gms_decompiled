package p000;

import com.google.android.gms.locationsharing.common.model.ShareTarget;
import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aewn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ShareTarget f63951a;

    /* renamed from: b */
    final /* synthetic */ UpdateSharesChimeraActivity f63952b;

    public aewn(UpdateSharesChimeraActivity updateSharesChimeraActivity, ShareTarget shareTarget) {
        this.f63952b = updateSharesChimeraActivity;
        this.f63951a = shareTarget;
    }

    public final void run() {
        this.f63952b.mo43826b(bnkn.m109665a(this.f63951a));
    }
}
