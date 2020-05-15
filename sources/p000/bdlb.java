package p000;

import android.app.Activity;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: bdlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdlb implements bdez, bdex {

    /* renamed from: a */
    final /* synthetic */ bdld f105866a;

    public bdlb(bdld bdld) {
        this.f105866a = bdld;
    }

    /* renamed from: a */
    public final void mo57950a(Activity activity) {
        bdgg bdgg;
        bdld bdld = this.f105866a;
        Class<?> cls = activity.getClass();
        if (!TextUtils.isEmpty(null)) {
            String valueOf = String.valueOf((Object) null);
            String valueOf2 = String.valueOf(cls.getSimpleName());
            bdgg = new bdgg(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        } else {
            bdgg = new bdgg(cls.getSimpleName());
        }
        bdld.f105869a = bdgg;
    }

    /* renamed from: b */
    public final void mo57952b(Activity activity) {
        this.f105866a.f105869a = null;
        if (this.f105866a.f105871c.get()) {
            bdhp.m90826a(bqga.m112776a(new bdla(this.f105866a), (Executor) this.f105866a.f105870b.mo6445a()));
        }
    }
}
