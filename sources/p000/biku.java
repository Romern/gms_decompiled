package p000;

import android.graphics.Rect;
import com.felicanetworks.mfc.C0126R;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: biku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biku implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AutocompleteChimeraActivity f120799a;

    public biku(AutocompleteChimeraActivity autocompleteChimeraActivity) {
        this.f120799a = autocompleteChimeraActivity;
    }

    public final void run() {
        String charSequence = this.f120799a.getResources().getText(C0126R.string.place_autocomplete_search_detailed_hint).toString();
        Rect rect = new Rect();
        this.f120799a.f151399g.getPaint().getTextBounds(charSequence, 0, charSequence.length(), rect);
        if (rect.width() < this.f120799a.f151399g.getWidth()) {
            this.f120799a.f151399g.setHint((int) C0126R.string.place_autocomplete_search_detailed_hint);
        }
    }
}
