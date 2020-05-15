package p000;

import android.os.Bundle;
import com.google.android.gms.checkin.CheckinChimeraService;

/* renamed from: qcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ CheckinChimeraService f40937a;

    /* renamed from: b */
    private final Bundle f40938b;

    public qcs(CheckinChimeraService checkinChimeraService, Bundle bundle) {
        this.f40937a = checkinChimeraService;
        this.f40938b = bundle;
    }

    public final void run() {
        this.f40937a.mo17612a(this.f40938b);
    }
}
