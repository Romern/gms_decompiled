package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: suz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class suz implements svb {

    /* renamed from: a */
    private static suz f45207a;

    /* renamed from: a */
    public static suz m36396a() {
        if (f45207a == null) {
            f45207a = new suz();
        }
        return f45207a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final sva mo23820a(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C0126R.C0128layout.common_settings_category) {
            view = from.inflate((int) C0126R.C0128layout.common_settings_category, viewGroup, false);
        } else {
            view = from.inflate((int) C0126R.C0128layout.common_settings_item, viewGroup, false);
        }
        if (i == C0126R.C0128layout.common_settings_toggle_widget) {
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(16908312);
            viewGroup2.addView(from.inflate((int) C0126R.C0128layout.common_settings_toggle_widget, viewGroup2, false));
        }
        if (i == C0126R.C0128layout.common_settings_item) {
            return new svj(view);
        }
        if (i == C0126R.C0128layout.common_settings_category) {
            return new sve(view);
        }
        if (i == C0126R.C0128layout.common_settings_toggle_widget) {
            return new svl(view);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
