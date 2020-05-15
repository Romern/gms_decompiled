package p000;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tda implements svb {

    /* renamed from: a */
    private static tda f45674a;

    /* renamed from: a */
    public static tda m36732a() {
        if (f45674a == null) {
            f45674a = new tda();
        }
        return f45674a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final sva mo23820a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C0126R.C0128layout.common_settings_item) {
            return new tdd(from.inflate((int) C0126R.C0128layout.common_settings_item, viewGroup, false));
        }
        if (i == C0126R.C0128layout.c11n_connected_apps_setting_item) {
            return new tdb(from.inflate((int) C0126R.C0128layout.c11n_connected_apps_setting_item, viewGroup, false));
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown view type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
