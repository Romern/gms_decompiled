package p000;

import android.support.p002v7.widget.SearchView;
import android.view.inputmethod.InputMethodManager;

/* renamed from: ade */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ade implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SearchView.SearchAutoComplete f250a;

    public ade(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f250a = searchAutoComplete;
    }

    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f250a;
        if (searchAutoComplete.f1276b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f1276b = false;
        }
    }
}
