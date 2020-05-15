package p000;

import android.support.p002v7.widget.SearchView;
import android.view.View;

/* renamed from: acx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acx implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f245a;

    public acx(SearchView searchView) {
        this.f245a = searchView;
    }

    public void onClick(View view) {
        SearchView searchView = this.f245a;
        if (view == searchView.f1253c) {
            searchView.mo1633l();
        } else if (view == searchView.f1255e) {
            searchView.mo1632k();
        } else if (view == searchView.f1254d) {
            searchView.mo1631j();
        } else if (view == searchView.f1256i) {
            searchView.mo1634m();
        } else if (view == searchView.f1251a) {
            searchView.mo1635n();
        }
    }
}
