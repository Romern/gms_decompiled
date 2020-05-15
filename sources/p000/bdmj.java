package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bdmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmj implements bdfa {

    /* renamed from: a */
    final /* synthetic */ bdmk f105967a;

    public bdmj(bdmk bdmk) {
        this.f105967a = bdmk;
    }

    /* renamed from: a */
    public final void mo57953a(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f105967a.f105976i.mo58186a(4, simpleName);
        this.f105967a.mo58183b();
        bdmk bdmk = this.f105967a;
        bdmk.f105970c = ((bqgk) bdmk.f105972e.mo6606a()).mo25814a(new bdmi(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
