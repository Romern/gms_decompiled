package p000;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.plus.sharebox.Circle;
import java.util.ArrayList;

/* renamed from: aola */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aola extends BaseAdapter implements SpinnerAdapter {

    /* renamed from: a */
    public final ArrayList f78381a;

    /* renamed from: b */
    private final Context f78382b;

    /* renamed from: c */
    private final LayoutInflater f78383c;

    public aola(Context context, ArrayList arrayList) {
        this.f78382b = context;
        this.f78383c = LayoutInflater.from(context);
        if (arrayList == null) {
            this.f78381a = new ArrayList();
        } else {
            this.f78381a = arrayList;
        }
    }

    /* renamed from: a */
    private final Circle m65976a(int i) {
        if (this.f78381a.isEmpty()) {
            return i != 0 ? Circle.m69350a(this.f78382b) : Circle.f83441b;
        }
        if (mo42941a()) {
            return this.f78381a.size() == i ? Circle.m69350a(this.f78382b) : (Circle) this.f78381a.get(i);
        }
        if (i == 0) {
            return Circle.f83441b;
        }
        if (i > this.f78381a.size()) {
            return Circle.m69350a(this.f78382b);
        }
        return (Circle) this.f78381a.get(i - 1);
    }

    public final int getCount() {
        if (this.f78381a.isEmpty() || !mo42941a()) {
            return this.f78381a.size() + 2;
        }
        return this.f78381a.size() + 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        if (view == null) {
            linearLayout = (LinearLayout) this.f78383c.inflate((int) C0126R.C0128layout.plus_sharebox_spinner_dropdown_item, viewGroup, false);
        } else {
            linearLayout = (LinearLayout) view;
        }
        m65977a(linearLayout, m65976a(i), true);
        return linearLayout;
    }

    public final Object getItem(int i) {
        return m65976a(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view == null) {
            textView = (TextView) this.f78383c.inflate(17367048, viewGroup, false);
        } else {
            textView = (TextView) view;
        }
        m65977a(textView, m65976a(i), false);
        return textView;
    }

    /* renamed from: a */
    private final void m65977a(View view, Circle circle, boolean z) {
        if (z) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.dropdown_item_text);
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.dropdown_item_icon);
            imageView.setVisibility(8);
            if (m65978a(circle)) {
                textView.setText(circle.f83446e);
                imageView.setImageDrawable(this.f78382b.getResources().getDrawable(C0126R.C0127drawable.plus_iconic_ic_add_to_circles_darkgrey_16));
                imageView.setVisibility(0);
            } else {
                int i = circle.f83447f;
                if (i > 0) {
                    textView.setText(this.f78382b.getString(C0126R.string.plus_sharebox_circles_option, circle.f83446e, Integer.valueOf(i)));
                } else {
                    textView.setText(circle.f83446e);
                }
            }
            int i2 = Build.VERSION.SDK_INT;
        } else if (m65978a(circle)) {
            ((TextView) view).setText("");
        } else {
            ((TextView) view).setText(circle.f83446e);
        }
        view.setTag(circle);
    }

    /* renamed from: a */
    private final boolean m65978a(Circle circle) {
        return Circle.m69350a(this.f78382b) == circle;
    }

    /* renamed from: a */
    public final boolean mo42941a() {
        String a = aokz.m65975a(this.f78382b);
        if (a != null) {
            int size = this.f78381a.size();
            for (int i = 0; i < size; i++) {
                if (a.equalsIgnoreCase(((Circle) this.f78381a.get(i)).f83446e)) {
                    return true;
                }
            }
        }
        return false;
    }
}
