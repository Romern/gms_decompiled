package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.p033ui.DriveBackupSettingsFragment;

/* renamed from: mwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mwr implements anz {

    /* renamed from: a */
    final /* synthetic */ DriveBackupSettingsFragment f34858a;

    public mwr(DriveBackupSettingsFragment driveBackupSettingsFragment) {
        this.f34858a = driveBackupSettingsFragment;
    }

    /* renamed from: a */
    public final boolean mo2218a(Preference preference, Object obj) {
        int[] iArr;
        String str;
        int i;
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (this.f34858a.mo17266i() == booleanValue) {
            return true;
        }
        if (!booleanValue) {
            mwp mwp = new mwp(this);
            DriveBackupSettingsFragment driveBackupSettingsFragment = this.f34858a;
            if (driveBackupSettingsFragment.f29181x == null) {
                if (!driveBackupSettingsFragment.f29164d) {
                    i2 = C0126R.string.drive_backup_state_dialog_message_no_photos;
                } else {
                    i2 = C0126R.string.drive_backup_state_dialog_message_no_photos_no_branding;
                }
                iArr = driveBackupSettingsFragment.f29179v.mo17274v() ? new int[]{C0126R.string.drive_backup_state_dialog_message, i2, C0126R.string.drive_backup_state_dialog_photos_extra} : new int[]{i2};
            } else {
                if (!driveBackupSettingsFragment.f29164d) {
                    i = C0126R.string.drive_backup_state_dialog_message_no_photos_with_account;
                } else {
                    i = C0126R.string.f7399x64067f67;
                }
                iArr = driveBackupSettingsFragment.f29179v.mo17274v() ? new int[]{C0126R.string.drive_backup_state_dialog_message_with_account, i, C0126R.string.drive_backup_state_dialog_photos_extra} : new int[]{i};
            }
            bsqh bsqh = this.f34858a.f29183z;
            bxvd bxvd = (bxvd) bsqh.mo74142c(5);
            bxvd.mo73625a((bxvk) bsqh);
            bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
            bsqp.mo70703a((int) C0126R.string.drive_backup_state_dialog_title);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh2 = (bsqh) bxvd.f164949b;
            bsqq bsqq = (bsqq) bsqp.mo74062i();
            bsqh bsqh3 = bsqh.f146634g;
            bsqq.getClass();
            bsqh2.f146638c = bsqq;
            bsqh2.f146636a |= 2;
            bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
            bsqp2.mo70704a(bqcn.m112586b(iArr));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh4 = (bsqh) bxvd.f164949b;
            bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
            bsqq2.getClass();
            bsqh4.f146639d = bsqq2;
            bsqh4.f146636a |= 4;
            bsqp bsqp3 = (bsqp) bsqq.f146675b.mo74144da();
            bsqp3.mo70703a((int) C0126R.string.drive_backup_state_dialog_okaction);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh5 = (bsqh) bxvd.f164949b;
            bsqq bsqq3 = (bsqq) bsqp3.mo74062i();
            bsqq3.getClass();
            bsqh5.f146640e = bsqq3;
            bsqh5.f146636a |= 8;
            bsqp bsqp4 = (bsqp) bsqq.f146675b.mo74144da();
            bsqp4.mo70703a(17039360);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh6 = (bsqh) bxvd.f164949b;
            bsqq bsqq4 = (bsqq) bsqp4.mo74062i();
            bsqq4.getClass();
            bsqh6.f146641f = bsqq4;
            bsqh6.f146636a |= 16;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsqh bsqh7 = (bsqh) bxvd.f164949b;
            bsqh7.f146636a |= 1;
            bsqh7.f146637b = true;
            this.f34858a.f29183z = (bsqh) bxvd.mo74062i();
            bsqq bsqq5 = ((bsqh) bxvd.f164949b).f146639d;
            if (bsqq5 == null) {
                bsqq5 = bsqq.f146675b;
            }
            int[] a = bqcn.m112584a(bsqq5.f146677a);
            DriveBackupSettingsFragment driveBackupSettingsFragment2 = this.f34858a;
            if (driveBackupSettingsFragment2.f29181x == null) {
                if (a.length > 1) {
                    str = this.f34858a.getResources().getString(a[0], driveBackupSettingsFragment2.getResources().getString(a[1]), this.f34858a.getResources().getString(a[2]));
                } else {
                    str = driveBackupSettingsFragment2.getResources().getString(a[0]);
                }
            } else if (a.length > 1) {
                str = this.f34858a.getResources().getString(a[0], driveBackupSettingsFragment2.getResources().getString(a[1], this.f34858a.f29181x.name), this.f34858a.getResources().getString(a[2]));
            } else {
                str = driveBackupSettingsFragment2.getResources().getString(a[0], this.f34858a.f29181x.name);
            }
            AlertDialog.Builder message = mba.m24785a(this.f34858a.getActivity()).setMessage(str);
            bsqq bsqq6 = ((bsqh) bxvd.f164949b).f146638c;
            if (bsqq6 == null) {
                bsqq6 = bsqq.f146675b;
            }
            AlertDialog.Builder title = message.setTitle(bsqq6.f146677a.mo74151b(0));
            bsqq bsqq7 = ((bsqh) bxvd.f164949b).f146640e;
            if (bsqq7 == null) {
                bsqq7 = bsqq.f146675b;
            }
            AlertDialog.Builder positiveButton = title.setPositiveButton(bsqq7.f146677a.mo74151b(0), mwp);
            bsqq bsqq8 = ((bsqh) bxvd.f164949b).f146641f;
            if (bsqq8 == null) {
                bsqq8 = bsqq.f146675b;
            }
            positiveButton.setNegativeButton(bsqq8.f146677a.mo74151b(0), (DialogInterface.OnClickListener) null).setCancelable(true).setOnDismissListener(new mwq(this)).show();
            return false;
        }
        this.f34858a.mo17263b(true);
        if (ccmz.m130715c()) {
            mvd mvd = this.f34858a.f34882B;
            bxvd da = mqy.f34367f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mqy mqy = (mqy) da.f164949b;
            mqy.f34372d = 2;
            mqy.f34369a |= 4;
            mvd.mo20268a((mqy) da.mo74062i());
        }
        return true;
    }
}
