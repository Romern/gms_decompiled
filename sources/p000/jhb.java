package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInstaller;
import android.os.Handler;
import com.google.android.chimera.Loader;
import com.google.android.gms.auth.managed.p029ui.PhoneskyDpcInstallLoader$2;

/* renamed from: jhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jhb extends Loader {

    /* renamed from: a */
    public static final Logger f22465a = ght.m13171a("AuthManaged", "PhoneskyDpcInstallLoader");

    /* renamed from: h */
    private static final Intent f22466h = new Intent().setPackage("com.android.vending").setAction("com.google.android.finsky.BIND_PLAY_INSTALL_SERVICE");

    /* renamed from: b */
    final ServiceConnection f22467b = new jgy(this, "auth_managed");

    /* renamed from: c */
    final BroadcastReceiver f22468c = new PhoneskyDpcInstallLoader$2(this, "auth_managed");

    /* renamed from: d */
    final PackageInstaller.SessionCallback f22469d = new jgz(this);

    /* renamed from: e */
    public final String f22470e;

    /* renamed from: f */
    public final PackageInstaller f22471f;

    /* renamed from: g */
    public eml f22472g;

    /* renamed from: i */
    private final skh f22473i;

    /* renamed from: j */
    private Handler f22474j;

    /* renamed from: k */
    private int f22475k = -4;

    /* renamed from: l */
    private int f22476l = 0;

    /* renamed from: m */
    private boolean f22477m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jhb(Context context, String str) {
        super(context);
        PackageInstaller packageInstaller = context.getPackageManager().getPackageInstaller();
        skh a = skh.m35531a();
        sdo.m34977c(str);
        this.f22470e = str;
        sdo.m34959a(packageInstaller);
        this.f22471f = packageInstaller;
        sdo.m34959a(a);
        this.f22473i = a;
    }

    /* renamed from: a */
    public final void mo13730a(Integer num) {
        if (num.intValue() >= 0) {
            this.f22476l = num.intValue();
        } else {
            this.f22475k = num.intValue();
        }
        if (isStarted()) {
            this.f22474j.post(new jha(this, num));
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        if (this.f22477m) {
            this.f22473i.mo25689a(getContext(), this.f22467b);
            getContext().unregisterReceiver(this.f22468c);
            this.f22471f.unregisterSessionCallback(this.f22469d);
            this.f22474j = null;
            this.f22477m = false;
        }
        this.f22475k = -4;
        this.f22476l = 0;
    }

    public final void onStartLoading() {
        if (!this.f22477m) {
            this.f22474j = new adzt();
            if (!this.f22473i.mo25690a(getContext(), f22466h, this.f22467b, 1)) {
                f22465a.mo25418e("Failed to bind install service.", new Object[0]);
                this.f22473i.mo25689a(getContext(), this.f22467b);
                mo13730a(-3);
                return;
            }
            this.f22471f.registerSessionCallback(this.f22469d);
            getContext().registerReceiver(this.f22468c, new IntentFilter("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS"));
            this.f22477m = true;
            mo13730a(Integer.valueOf(this.f22475k));
            mo13730a(Integer.valueOf(this.f22476l));
        }
    }
}
