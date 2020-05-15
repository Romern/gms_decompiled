package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: awgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgl extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f94307a;

    public awgl(Context context, awgk[] awgkArr) {
        super(context, 0, awgkArr);
        this.f94307a = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m79902a(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            if (!z) {
                view = this.f94307a.inflate((int) C0126R.C0128layout.wallet_row_account, viewGroup, false);
            } else {
                view = this.f94307a.inflate((int) C0126R.C0128layout.wallet_row_account_drop_down, viewGroup, false);
            }
        }
        if (i >= 0) {
            awgk awgk = (awgk) getItem(i);
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.name);
            if (!z) {
                String str = awgk.f94306b;
                if (!TextUtils.isEmpty(null)) {
                    String str2 = awgk.f94306b;
                    textView.setText((CharSequence) null);
                    textView.setTag(awgk);
                }
            }
            textView.setText(awgk.f94305a.name);
            textView.setTag(awgk);
        }
        return view;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m79902a(i, true, view, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m79902a(i, false, view, viewGroup);
    }
}
