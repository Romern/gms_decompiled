package p000;

import com.google.android.gms.locationsharing.updateshares.UpdateSharesChimeraActivity;

/* renamed from: aewt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aewt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ UpdateSharesChimeraActivity f63958a;

    public aewt(UpdateSharesChimeraActivity updateSharesChimeraActivity) {
        this.f63958a = updateSharesChimeraActivity;
    }

    public final void run() {
        this.f63958a.finish();
    }
}
