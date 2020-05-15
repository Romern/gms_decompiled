package p000;

import android.widget.Button;
import com.google.android.places.p095ui.autocomplete.AutocompleteChimeraActivity;

/* renamed from: bikl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f120789a;

    /* renamed from: b */
    final /* synthetic */ boolean f120790b;

    /* renamed from: c */
    final /* synthetic */ AutocompleteChimeraActivity f120791c;

    public bikl(AutocompleteChimeraActivity autocompleteChimeraActivity, String str, boolean z) {
        this.f120791c = autocompleteChimeraActivity;
        this.f120789a = str;
        this.f120790b = z;
    }

    public final void run() {
        this.f120791c.f151403k.setText(this.f120789a);
        int i = 0;
        this.f120791c.f151401i.setVisibility(0);
        this.f120791c.f151402j.setVisibility(8);
        this.f120791c.f151400h.setVisibility(8);
        Button button = this.f120791c.f151404l;
        if (!this.f120790b) {
            i = 8;
        }
        button.setVisibility(i);
    }
}
