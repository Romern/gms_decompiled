package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aoq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoq extends acm {

    /* renamed from: s */
    public final Drawable f1896s;

    /* renamed from: t */
    public ColorStateList f1897t;

    /* renamed from: u */
    public boolean f1898u;

    /* renamed from: v */
    public boolean f1899v;

    /* renamed from: w */
    private final SparseArray f1900w = new SparseArray(4);

    public aoq(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(16908310);
        this.f1900w.put(16908310, textView);
        this.f1900w.put(16908304, view.findViewById(16908304));
        this.f1900w.put(16908294, view.findViewById(16908294));
        this.f1900w.put(C0126R.C0129id.icon_frame, view.findViewById(C0126R.C0129id.icon_frame));
        this.f1900w.put(16908350, view.findViewById(16908350));
        this.f1896s = view.getBackground();
        if (textView != null) {
            this.f1897t = textView.getTextColors();
        }
    }

    /* renamed from: c */
    public final View mo2241c(int i) {
        View view = (View) this.f1900w.get(i);
        if (view == null && (view = this.f201a.findViewById(i)) != null) {
            this.f1900w.put(i, view);
        }
        return view;
    }
}
