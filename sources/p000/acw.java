package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p002v7.widget.SearchView;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* renamed from: acw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acw implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ SearchView f244a;

    public acw(SearchView searchView) {
        this.f244a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.f244a;
        if (searchView.f1257j.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.f1252b.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = aek.m624a(searchView);
            if (searchView.f1262o) {
                i9 = resources.getDimensionPixelSize(C0126R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0126R.dimen.abc_dropdownitem_text_padding_left);
            } else {
                i9 = 0;
            }
            searchView.f1251a.getDropDownBackground().getPadding(rect);
            if (a) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchView.f1251a.setDropDownHorizontalOffset(i10);
            int width = searchView.f1257j.getWidth();
            int i11 = rect.left;
            searchView.f1251a.setDropDownWidth((((width + i11) + rect.right) + i9) - paddingLeft);
        }
    }
}
