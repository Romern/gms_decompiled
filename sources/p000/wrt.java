package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wrt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrt extends BaseAdapter {

    /* renamed from: a */
    public String f51210a;

    /* renamed from: b */
    public int f51211b;

    /* renamed from: c */
    public int f51212c = C0126R.C0128layout.fm_date_spinner_text;

    /* renamed from: d */
    private final LayoutInflater f51213d;

    /* renamed from: e */
    private final int f51214e;

    /* renamed from: f */
    private final int f51215f;

    /* renamed from: g */
    private final int f51216g = C0126R.C0128layout.fm_date_spinner_text;

    public wrt(Context context, String str) {
        this.f51213d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f51210a = str;
        this.f51214e = 1;
        this.f51211b = 31;
        this.f51215f = 1;
    }

    /* renamed from: a */
    public final Integer getItem(int i) {
        if (i != 0) {
            return Integer.valueOf(this.f51214e + ((i - 1) * this.f51215f));
        }
        return null;
    }

    public final int getCount() {
        return ((this.f51211b - this.f51214e) / this.f51215f) + 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        if (!(view instanceof TextView)) {
            view = this.f51213d.inflate(this.f51212c, viewGroup, false);
        }
        ((TextView) view).setText(String.format(rpr.m34216b().getResources().getConfiguration().locale, "%d", getItem(i)));
        return view;
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
        if (!(view instanceof TextView)) {
            view = this.f51213d.inflate(this.f51216g, viewGroup, false);
        }
        TextView textView = (TextView) view;
        if (i == 0) {
            textView.setText((CharSequence) null);
            textView.setHint(this.f51210a);
        } else {
            textView.setText(String.format(rpr.m34216b().getResources().getConfiguration().locale, "%d", getItem(i)));
        }
        return view;
    }
}
