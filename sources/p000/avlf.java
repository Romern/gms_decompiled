package p000;

import android.content.Context;
import com.google.android.gms.update.ActivityStatus;
import com.google.android.gms.update.DownloadOptions;
import com.google.android.gms.update.InstallationOptions;

/* renamed from: avlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avlf extends rjx {

    /* renamed from: a */
    private static final rjo f93302a = new rjo("SystemUpdate.API", f93304c, f93303b);

    /* renamed from: b */
    private static final rje f93303b = new rje();

    /* renamed from: c */
    private static final rjl f93304c = new avkv();

    protected avlf(Context context) {
        super(context, f93302a, (rjk) null, rjw.f43159a);
    }

    /* renamed from: G */
    public final void mo51340G() {
        mo24732b(new avkr());
    }

    /* renamed from: a */
    public final aucb mo51341a() {
        return mo24701a((rpa) new avlb());
    }

    /* renamed from: b */
    public final aucb mo51345b() {
        return mo24732b(new avks());
    }

    /* renamed from: c */
    public final aucb mo51348c() {
        return mo24701a((rpa) new avku());
    }

    /* renamed from: d */
    public final void mo51349d() {
        mo24732b(new avkp());
    }

    /* renamed from: e */
    public final void mo51350e() {
        mo24732b(new avky());
    }

    /* renamed from: a */
    public final void mo51342a(ActivityStatus activityStatus) {
        mo24732b(new avla(activityStatus));
    }

    /* renamed from: b */
    public final void mo51346b(DownloadOptions downloadOptions) {
        mo24732b(new avkz(downloadOptions));
    }

    /* renamed from: a */
    public final void mo51343a(DownloadOptions downloadOptions) {
        mo24732b(new avkw(downloadOptions));
    }

    /* renamed from: b */
    public final void mo51347b(InstallationOptions installationOptions) {
        mo24732b(new avkq(installationOptions));
    }

    /* renamed from: a */
    public final void mo51344a(InstallationOptions installationOptions) {
        mo24732b(new avkx(installationOptions));
    }
}
