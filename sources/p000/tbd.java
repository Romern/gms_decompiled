package p000;

import com.google.android.gms.constellation.p038ui.ConstellationWebSettingsChimeraActivity;

/* renamed from: tbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tbd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConstellationWebSettingsChimeraActivity f45600a;

    public tbd(ConstellationWebSettingsChimeraActivity constellationWebSettingsChimeraActivity) {
        this.f45600a = constellationWebSettingsChimeraActivity;
    }

    public final void run() {
        this.f45600a.onBackPressed();
    }
}
