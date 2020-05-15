package p000;

import android.content.DialogInterface;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tar implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45581a;

    public tar(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45581a = constellationSettingsChimeraActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        ConstellationSettingsChimeraActivity.f30536b.mo25412b("DismissListener called", new Object[0]);
        if (!this.f45581a.f30551k) {
            ((C1350sh) dialogInterface).mo15914a().setItemChecked(this.f45581a.f30553m, true);
        }
        this.f45581a.f30551k = false;
    }
}
