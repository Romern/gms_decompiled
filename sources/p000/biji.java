package p000;

import android.util.Log;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: biji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AliasEditorChimeraActivity f120720a;

    public biji(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.f120720a = aliasEditorChimeraActivity;
    }

    public final void run() {
        this.f120720a.mo71309k();
        if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Failed to find aliased places");
        }
    }
}
