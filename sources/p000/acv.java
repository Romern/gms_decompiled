package p000;

import android.support.p002v7.widget.SearchView;
import android.view.View;

/* renamed from: acv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acv implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f243a;

    public acv(SearchView searchView) {
        this.f243a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.f243a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f1261n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
