package p000;

import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;
import java.util.concurrent.Callable;

/* renamed from: mwl */
public final /* synthetic */ class mwl implements Callable {

    /* renamed from: a */
    private final DriveBackupSettingsFragment f34850a;

    public mwl(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34850a = driveBackupSettingsFragment;
    }

    public final Object call() {
        mvc mvc = this.f34850a.f29168k;
        boolean z = true;
        try {
            int a = mvc.f34793c.mo19720a().mo19710a(mvc.f34792b);
            lvn lvn = mvc.f34791a;
            String a2 = lwp.m24569a(a);
            lvn.mo25412b(a2.length() == 0 ? new String("Active secondary key status is: ") : "Active secondary key status is: ".concat(a2), new Object[0]);
            if (a != 1) {
                z = false;
            }
        } catch (lws e) {
            mvc.f34791a.mo25417e("Encountered error while checking the active secondary key: ", e, new Object[0]);
            throw e;
        } catch (lwt e2) {
            mvc.mo20266a();
        }
        return Boolean.valueOf(z);
    }
}
