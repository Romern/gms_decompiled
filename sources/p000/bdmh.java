package p000;

import android.app.Activity;
import java.util.concurrent.TimeUnit;

/* renamed from: bdmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdmh implements bdez {

    /* renamed from: a */
    final /* synthetic */ bdmk f105964a;

    public bdmh(bdmk bdmk) {
        this.f105964a = bdmk;
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        String simpleName = activity.getClass().getSimpleName();
        this.f105964a.f105976i.mo58186a(3, simpleName);
        this.f105964a.mo58183b();
        bdmk bdmk = this.f105964a;
        bdmk.f105971d = ((bqgk) bdmk.f105972e.mo6606a()).mo25814a(new bdmg(this, simpleName), 10, TimeUnit.SECONDS);
    }
}
