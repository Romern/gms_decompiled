package p000;

import android.view.View;
import com.google.android.gms.auth.frp.FreUnlockChimeraActivity;

/* renamed from: jdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdl implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FreUnlockChimeraActivity f22229a;

    public jdl(FreUnlockChimeraActivity freUnlockChimeraActivity) {
        this.f22229a = freUnlockChimeraActivity;
    }

    public void onClick(View view) {
        this.f22229a.getSupportLoaderManager().initLoader(2, null, this.f22229a);
    }
}
