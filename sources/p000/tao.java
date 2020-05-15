package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tao implements suh {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45578a;

    public tao(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45578a = constellationSettingsChimeraActivity;
    }

    /* renamed from: a */
    public final void mo7099a(View view, sui sui) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f45578a.f30563w.f177999l));
        if (intent.resolveActivity(this.f45578a.getPackageManager()) != null) {
            this.f45578a.startActivity(intent);
        }
    }
}
