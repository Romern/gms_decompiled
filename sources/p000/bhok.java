package p000;

import android.widget.AutoCompleteTextView;

/* renamed from: bhok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhok implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AutoCompleteTextView f119196a;

    /* renamed from: b */
    final /* synthetic */ bhol f119197b;

    public bhok(bhol bhol, AutoCompleteTextView autoCompleteTextView) {
        this.f119197b = bhol;
        this.f119196a = autoCompleteTextView;
    }

    public final void run() {
        boolean isPopupShowing = this.f119196a.isPopupShowing();
        this.f119197b.f119198a.mo64099b(isPopupShowing);
        this.f119197b.f119198a.f119211c = isPopupShowing;
    }
}
