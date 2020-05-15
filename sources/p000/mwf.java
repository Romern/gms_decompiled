package p000;

import android.content.DialogInterface;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.p033ui.DollyBackupPreference;

/* renamed from: mwf */
public final /* synthetic */ class mwf implements aoa {

    /* renamed from: a */
    private final DollyBackupPreference f34842a;

    public mwf(DollyBackupPreference dollyBackupPreference) {
        this.f34842a = dollyBackupPreference;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        DollyBackupPreference dollyBackupPreference = this.f34842a;
        mba.m24785a(dollyBackupPreference.f1595k).setMessage(dollyBackupPreference.f29134b).setTitle(dollyBackupPreference.f29133a).setPositiveButton((int) C0126R.string.common_ok, (DialogInterface.OnClickListener) null).show();
        return true;
    }
}
