package p000;

import android.util.Log;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: bijg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AliasEditorChimeraActivity f120717a;

    public bijg(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.f120717a = aliasEditorChimeraActivity;
    }

    public final void run() {
        this.f120717a.mo71309k();
        if (Log.isLoggable("Places", 5)) {
            Log.w("Places", "Failed to find aliased places");
        }
    }
}
