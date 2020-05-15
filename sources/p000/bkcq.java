package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* renamed from: bkcq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkcq extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f124017a;

    public bkcq(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f124017a = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m105331a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f124017a.inflate((int) C0126R.C0128layout.view_drop_down_button, viewGroup, false);
        }
        ColorStateList d = bkfr.m105606d(getContext(), (int) C0126R.attr.colorAccent);
        bkcr bkcr = (bkcr) getItem(i);
        Drawable drawable = view.getResources().getDrawable(bkcr.f124018a);
        int i2 = Build.VERSION.SDK_INT;
        if (!(bkcr.f124020c == 2 && bkcr.f124021d == 1)) {
            C1173lt.m19601a(drawable, d);
        }
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.dropdown_button_text);
        textView.setText(getContext().getString(bkcr.f124019b));
        textView.setTextColor(d);
        int i3 = Build.VERSION.SDK_INT;
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        if (bkcr.f124021d == 2) {
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).gravity = 8388611;
        } else {
            ((FrameLayout.LayoutParams) textView.getLayoutParams()).gravity = 17;
        }
        return view;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m105331a(i, view, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m105331a(i, view, viewGroup);
    }
}
