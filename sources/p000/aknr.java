package p000;

import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: aknr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aknr implements aubt {

    /* renamed from: a */
    final /* synthetic */ GunsBrowserChimeraActivity f72316a;

    public aknr(GunsBrowserChimeraActivity gunsBrowserChimeraActivity) {
        this.f72316a = gunsBrowserChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10476a(Exception exc) {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72316a;
        int a = ((rjp) exc).mo24655a();
        StringBuilder sb = new StringBuilder(49);
        sb.append("window.onFetchPhoneNumberInfo(");
        sb.append(a);
        sb.append(" , null)");
        gunsBrowserChimeraActivity.mo44697c(sb.toString());
    }
}
