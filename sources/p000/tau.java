package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.List;

/* renamed from: tau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class tau extends ArrayAdapter {

    /* renamed from: a */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45584a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tau(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity, Context context, List list) {
        super(context, (int) C0126R.C0128layout.c11n_consent_option_row, list);
        this.f45584a = constellationSettingsChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        if (view == null) {
            linearLayout = (LinearLayout) LayoutInflater.from(this.f45584a).inflate((int) C0126R.C0128layout.c11n_consent_option_row, viewGroup, false);
        } else {
            linearLayout = (LinearLayout) view;
        }
        TextView textView = (TextView) linearLayout.findViewById(C0126R.C0129id.option_title);
        TextView textView2 = (TextView) linearLayout.findViewById(C0126R.C0129id.option_subtitle);
        Pair pair = (Pair) getItem(i);
        if (pair != null) {
            if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                textView.setText((CharSequence) pair.first);
            } else {
                textView.setVisibility(8);
            }
            if (!TextUtils.isEmpty((CharSequence) pair.second)) {
                textView2.setText((CharSequence) pair.second);
            } else {
                textView2.setVisibility(8);
            }
        }
        return linearLayout;
    }
}
