package p000;

import android.app.ProgressDialog;
import com.google.android.gms.drive.DriveId;

/* renamed from: vlv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vlv implements rkl {

    /* renamed from: a */
    final /* synthetic */ ProgressDialog f49475a;

    /* renamed from: b */
    final /* synthetic */ vlx f49476b;

    public vlv(vlx vlx, ProgressDialog progressDialog) {
        this.f49476b = vlx;
        this.f49475a = progressDialog;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        usq usq = (usq) rkk;
        if (usq.f48613a.mo17710c()) {
            DriveId driveId = usq.f48614b.f48623a;
            this.f49475a.dismiss();
            vlw vlw = this.f49476b.f49479c;
            if (vlw != null) {
                vlw.mo18325a(0, driveId);
                return;
            }
            return;
        }
        vlx.f49477a.mo25374b("CreateFolderDialogFragm", "Failed to create folder (%d): %s", Integer.valueOf(usq.f48613a.f30115i), usq.f48613a.f30116j);
        this.f49476b.mo9306a();
        this.f49475a.dismiss();
        vlw vlw2 = this.f49476b.f49479c;
        if (vlw2 != null) {
            vlw2.mo18325a(3, null);
        }
    }
}
