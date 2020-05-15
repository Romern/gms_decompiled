package p000;

import android.view.View;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: biki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biki implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AutocompleteChimeraActivity f120786a;

    public biki(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.f120786a = autocompleteChimeraActivity;
    }

    public void onClick(View view) {
        AutocompleteChimeraActivity autocompleteChimeraActivity = this.f120786a;
        autocompleteChimeraActivity.f151397e.f151426m++;
        autocompleteChimeraActivity.f151399g.setText("");
    }
}
