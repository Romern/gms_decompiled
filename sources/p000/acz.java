package p000;

import android.support.p002v7.widget.SearchView;
import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: acz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acz implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f247a;

    public acz(SearchView searchView) {
        this.f247a = searchView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.f247a.mo1631j();
        return true;
    }
}
