package p000;

import android.support.p002v7.widget.SearchView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

/* renamed from: acs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acs implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ SearchView f240a;

    public acs(SearchView searchView) {
        this.f240a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.f240a;
        Editable text = searchView.f1251a.getText();
        searchView.f1266s = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.mo1636o();
        searchView.mo1623c(isEmpty);
        searchView.mo1628g();
        searchView.mo1627f();
        if (searchView.f1260m != null && !TextUtils.equals(charSequence, searchView.f1265r)) {
            searchView.f1260m.mo418b(charSequence.toString());
        }
        searchView.f1265r = charSequence.toString();
    }
}
