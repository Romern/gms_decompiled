package p000;

import android.accounts.Account;
import com.google.android.gms.backup.settings.p033ui.PhotosBackupPreference;

/* renamed from: mxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mxy implements mvt {

    /* renamed from: a */
    final /* synthetic */ Account f34914a;

    /* renamed from: b */
    final /* synthetic */ PhotosBackupPreference f34915b;

    /* renamed from: c */
    final /* synthetic */ mya f34916c;

    public mxy(PhotosBackupPreference photosBackupPreference, Account account, mya mya) {
        this.f34915b = photosBackupPreference;
        this.f34914a = account;
        this.f34916c = mya;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20271a() {
        String str;
        if (!((Boolean) this.f34915b.f29188d.mo6606a()).booleanValue()) {
            PhotosBackupPreference photosBackupPreference = this.f34915b;
            Account account = this.f34914a;
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            photosBackupPreference.mo17271a((String) null, str);
        }
        return null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo20272a(Object obj) {
        Void voidR = (Void) obj;
        this.f34916c.mo20306a(this.f34915b.mo17254a(this.f34914a));
    }
}
