package p000;

import android.graphics.PorterDuff;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;
import com.google.android.libraries.photos.backup.api.AutoBackupState;

/* renamed from: mxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mxu implements mvt {

    /* renamed from: a */
    final /* synthetic */ String f34908a;

    /* renamed from: b */
    final /* synthetic */ String f34909b;

    /* renamed from: c */
    final /* synthetic */ PhotosBackupPreference f34910c;

    public mxu(PhotosBackupPreference photosBackupPreference, String str, String str2) {
        this.f34910c = photosBackupPreference;
        this.f34908a = str;
        this.f34909b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        String str;
        if (!((Boolean) this.f34910c.f29188d.mo6606a()).booleanValue()) {
            return this.f34910c.mo17271a(this.f34908a, this.f34909b);
        }
        PhotosBackupPreference photosBackupPreference = this.f34910c;
        String str2 = this.f34908a;
        String str3 = this.f34909b;
        AutoBackupState a = photosBackupPreference.f29186b.mo20293a();
        if (a != null) {
            str = a.f111401a;
        } else {
            str = null;
        }
        if (str3 != null && !str3.equals(str2)) {
            PhotosBackupPreference.f29184a.mo25412b("Drive backup account was changed from [%s] to [%s]", str2, str3);
            if (!(str == null || str2 == null || sdg.m34949a(str, str3))) {
                PhotosBackupPreference.f29184a.mo25412b("Photos backup account [%s] is different; asking for confirmation", str);
                photosBackupPreference.f29187c.post(new mxn(photosBackupPreference, str3));
                return str;
            }
        }
        return str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        PhotosBackupPreference photosBackupPreference = this.f34910c;
        photosBackupPreference.f29189e = this.f34909b;
        photosBackupPreference.f29190f = (String) obj;
        photosBackupPreference.mo17275w();
        if (ccoa.m130956b()) {
            PhotosBackupPreference photosBackupPreference2 = this.f34910c;
            if (photosBackupPreference2.f29190f == null) {
                photosBackupPreference2.mo1989c((int) C0126R.C0127drawable.quantum_gm_ic_sync_disabled_vd_theme_24);
                photosBackupPreference2.mo2003h().setColorFilter(photosBackupPreference2.f1595k.getColor(C0126R.color.error_icon_tint), PorterDuff.Mode.SRC_IN);
                return;
            }
            photosBackupPreference2.mo1989c((int) C0126R.C0127drawable.quantum_ic_photos_vd_theme_24);
        }
    }
}
