package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.material.opensearchbar.OpenSearchView;

/* renamed from: azyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azyb implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ OpenSearchView f100190a;

    public azyb(OpenSearchView openSearchView) {
        this.f100190a = openSearchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f100190a.f111271j.setVisibility(charSequence.length() > 0 ? 0 : 8);
    }
}
