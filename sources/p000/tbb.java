package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.ConstellationWebSettingsChimeraActivity;

/* renamed from: tbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tbb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ConstellationWebSettingsChimeraActivity f45597a;

    public tbb(ConstellationWebSettingsChimeraActivity constellationWebSettingsChimeraActivity) {
        this.f45597a = constellationWebSettingsChimeraActivity;
    }

    public void onClick(View view) {
        this.f45597a.recreate();
    }
}
