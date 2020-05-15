package p000;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: bikh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikh implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ AutocompleteChimeraActivity f120785a;

    public bikh(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.f120785a = autocompleteChimeraActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.f120785a;
        biix.m102463a(autocompleteChimeraActivity, autocompleteChimeraActivity.f151399g);
        return true;
    }
}
