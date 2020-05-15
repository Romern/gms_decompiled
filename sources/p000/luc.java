package p000;

import android.os.Parcel;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;
import java.lang.ref.WeakReference;

/* renamed from: luc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class luc extends dck implements lud {

    /* renamed from: a */
    private final WeakReference f32997a;

    public luc() {
        super("com.google.android.gms.backup.IBackUpNowClientCallbacks");
    }

    /* renamed from: a */
    public final void mo19602a(int i) {
        stq.m36309a(new mxa((DriveBackupSettingsFragment) this.f32997a.get(), i));
    }

    public luc(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        super("com.google.android.gms.backup.IBackUpNowClientCallbacks");
        this.f32997a = new WeakReference(driveBackupSettingsFragment);
    }

    /* renamed from: a */
    public final void mo19603a(int i, int i2) {
        DriveBackupSettingsFragment.f29137f.mo25409a("Processed %d of %d packages", Integer.valueOf(i2), Integer.valueOf(i));
        stq.m36309a(new mxb((DriveBackupSettingsFragment) this.f32997a.get(), i, i2));
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo19602a(parcel.readInt());
        } else if (i != 2) {
            return false;
        } else {
            mo19603a(parcel.readInt(), parcel.readInt());
        }
        return true;
    }
}
