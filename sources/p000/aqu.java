package p000;

import android.view.ViewTreeObserver;
import androidx.slice.widget.GridRowView;

/* renamed from: aqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqu implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ GridRowView f2027a;

    public aqu(GridRowView gridRowView) {
        this.f2027a = gridRowView;
    }

    public final boolean onPreDraw() {
        GridRowView gridRowView = this.f2027a;
        gridRowView.f1676a.removeAllViews();
        gridRowView.setLayoutDirection(2);
        gridRowView.f1676a.setOnTouchListener(null);
        gridRowView.f1676a.setOnClickListener(null);
        gridRowView.f1677b.setBackground(null);
        gridRowView.f1676a.setClickable(false);
        this.f2027a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
