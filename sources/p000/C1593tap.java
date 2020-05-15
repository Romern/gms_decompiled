package p000;

import android.content.DialogInterface;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1593tap implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45579a;

    public C1593tap(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45579a = constellationSettingsChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ConstellationSettingsChimeraActivity.f30536b.mo25412b("Changed selection %s", Integer.valueOf(i));
        this.f45579a.f30554n = i;
    }
}
