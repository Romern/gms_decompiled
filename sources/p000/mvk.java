package p000;

import androidx.preference.Preference;
import com.google.android.gms.backup.settings.p033ui.AppsBackupFragment;

/* renamed from: mvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mvk implements anz {

    /* renamed from: a */
    final /* synthetic */ AppsBackupFragment f34808a;

    public mvk(AppsBackupFragment appsBackupFragment) {
        this.f34808a = appsBackupFragment;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        AppsBackupFragment appsBackupFragment = this.f34808a;
        if (preference == appsBackupFragment.f29098d && (obj instanceof Boolean)) {
            lvp lvp = appsBackupFragment.f29099e;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (lvp.mo19648f()) {
                lvp.f33054a.setAutoRestore(booleanValue);
            }
        } else {
            AppsBackupFragment.f29097c.mo25420f(String.format("Incorrect argument values in AutoRestore listener %s %s", preference, obj), new Object[0]);
        }
        this.f34808a.mo17248d();
        return true;
    }
}
