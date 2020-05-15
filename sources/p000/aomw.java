package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aomw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aomw extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f78548a;

    public aomw(Context context, String[] strArr) {
        super(context, (int) C0126R.C0128layout.plus_sharebox_account_spinner, (int) C0126R.C0129id.account_name, strArr);
        this.f78548a = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f78548a.inflate(17367050, viewGroup, false);
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText((CharSequence) getItem(i));
        }
        return textView;
    }
}
