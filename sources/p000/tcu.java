package p000;

import android.view.View;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;

/* renamed from: tcu */
public final /* synthetic */ class tcu implements View.OnClickListener {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45659a;

    public tcu(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        this.f45659a = constellationDebugChimeraActivity;
    }

    public void onClick(View view) {
        this.f45659a.recreate();
    }
}
