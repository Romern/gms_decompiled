package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;

/* renamed from: tas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tas implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45582a;

    public tas(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        this.f45582a = constellationSettingsChimeraActivity;
    }

    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f45582a.f30563w.f177994g));
        if (intent.resolveActivity(this.f45582a.getPackageManager()) != null) {
            this.f45582a.startActivity(intent);
        }
    }
}
