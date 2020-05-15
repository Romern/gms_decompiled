package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: wrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrs extends ArrayAdapter {

    /* renamed from: a */
    public String f51207a;

    /* renamed from: b */
    private final LayoutInflater f51208b;

    /* renamed from: c */
    private final int f51209c = C0126R.C0128layout.fm_date_spinner_text;

    public wrs(Context context, String str, List list) {
        super(context, (int) C0126R.C0128layout.fm_date_spinner_text, list);
        this.f51208b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f51207a = str;
    }

    public final int getCount() {
        return super.getCount() + 1;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        if (view instanceof TextView) {
            return super.getDropDownView(i, view, viewGroup);
        }
        return super.getDropDownView(i, null, viewGroup);
    }

    public final Object getItem(int i) {
        if (i != 0) {
            return super.getItem(i - 1);
        }
        return null;
    }

    public final int getPosition(Object obj) {
        return super.getPosition(obj) + 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i != 0) {
            return super.getView(i, view, viewGroup);
        }
        if (!(view instanceof TextView)) {
            view = this.f51208b.inflate(this.f51209c, viewGroup, false);
        }
        TextView textView = (TextView) view;
        textView.setText((CharSequence) null);
        textView.setHint(this.f51207a);
        return view;
    }
}
