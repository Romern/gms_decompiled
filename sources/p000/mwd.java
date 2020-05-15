package p000;

import com.google.android.gms.backup.settings.p033ui.DeviceBackupDetailFragment;

/* renamed from: mwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwd implements bqfp {

    /* renamed from: a */
    final /* synthetic */ DeviceBackupDetailFragment f34835a;

    public mwd(DeviceBackupDetailFragment deviceBackupDetailFragment) {
        this.f34835a = deviceBackupDetailFragment;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        stq.m36309a(new mwc(this, (Boolean) obj));
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        DeviceBackupDetailFragment.f29120c.mo25417e("Error getting isUnlockRequiredForEncryptedBackupCallback", th, new Object[0]);
    }
}
