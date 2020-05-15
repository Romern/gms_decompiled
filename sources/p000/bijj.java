package p000;

import android.content.DialogInterface;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: bijj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijj implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    final /* synthetic */ AliasEditorChimeraActivity f120721a;

    public bijj(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.f120721a = aliasEditorChimeraActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        biij biij = this.f120721a.f151374b;
        if (biij != null) {
            biij.mo64646a();
        }
    }
}
