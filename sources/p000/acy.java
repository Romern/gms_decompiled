package p000;

import android.support.p002v7.widget.SearchView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: acy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acy implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f246a;

    public acy(SearchView searchView) {
        this.f246a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        SearchView searchView = this.f246a;
        if (searchView.f1267t == null) {
            return false;
        }
        if (searchView.f1251a.isPopupShowing() && this.f246a.f1251a.getListSelection() != -1) {
            SearchView searchView2 = this.f246a;
            if (searchView2.f1267t == null || searchView2.f1264q == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i == 66 || i == 84 || i == 61) {
                return searchView2.mo1626e(searchView2.f1251a.getListSelection());
            }
            if (i == 21) {
                i2 = 0;
            } else if (i != 22) {
                return (i == 19 && searchView2.f1251a.getListSelection() == 0) ? false : false;
            } else {
                i2 = searchView2.f1251a.length();
            }
            searchView2.f1251a.setSelection(i2);
            searchView2.f1251a.setListSelection(0);
            searchView2.f1251a.clearListSelection();
            searchView2.f1251a.mo1643a();
            return true;
        } else if (TextUtils.getTrimmedLength(this.f246a.f1251a.getText()) == 0 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
            return false;
        } else {
            view.cancelLongPress();
            SearchView searchView3 = this.f246a;
            searchView3.mo1617a(searchView3.f1251a.getText().toString());
            return true;
        }
    }
}
