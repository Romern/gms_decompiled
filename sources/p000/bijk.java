package p000;

import android.content.DialogInterface;
import com.google.android.places.p095ui.aliaseditor.AliasEditorChimeraActivity;

/* renamed from: bijk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bijk implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AliasEditorChimeraActivity f120722a;

    public bijk(AliasEditorChimeraActivity aliasEditorChimeraActivity) {
        this.f120722a = aliasEditorChimeraActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        biij biij = this.f120722a.f151374b;
        if (biij != null) {
            biij.mo64646a();
        }
    }
}
