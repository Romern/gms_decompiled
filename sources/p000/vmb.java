package p000;

import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;

/* renamed from: vmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vmb implements rkl {

    /* renamed from: a */
    final /* synthetic */ vme f49486a;

    public vmb(vme vme) {
        this.f49486a = vme;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        int i;
        Status status = (Status) rkk;
        if (status.mo17710c()) {
            this.f49486a.m40841a(false, true);
            return;
        }
        vme.f49489a.mo25374b("FileListAdapter", "Could not refresh: %s", status.f30116j);
        if (status.f30115i == 7) {
            i = C0126R.string.drive_menu_sync_fail_no_connection;
        } else {
            i = C0126R.string.drive_menu_sync_fail_generic;
        }
        Toast.makeText(this.f49486a.f49500m, i, 1).show();
        vmt vmt = this.f49486a.f49503p;
        if (vmt != null) {
            vmt.mo28645a();
        }
    }
}
