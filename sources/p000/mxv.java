package p000;

import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mxv implements mvt {

    /* renamed from: a */
    final /* synthetic */ PhotosBackupPreference f34911a;

    public mxv(PhotosBackupPreference photosBackupPreference) {
        this.f34911a = photosBackupPreference;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        boolean z;
        PhotosBackupPreference photosBackupPreference = this.f34911a;
        Boolean bool = (Boolean) photosBackupPreference.f29186b.mo20294a(new mxh(photosBackupPreference.f29194j));
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        this.f34911a.f29191g = ((Boolean) obj).booleanValue();
        mvp mvp = this.f34911a.f29191g ? mvp.f34817d : mvp.f34819f;
        PhotosBackupPreference photosBackupPreference = this.f34911a;
        photosBackupPreference.f29192h = mvp.mo20275a(photosBackupPreference.f1595k);
        this.f34911a.mo17275w();
    }
}
