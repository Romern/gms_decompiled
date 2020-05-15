package p000;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.WalletCheckedTextView;

/* renamed from: bkez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkez extends ArrayAdapter {

    /* renamed from: a */
    public String f124125a;

    /* renamed from: b */
    private final int f124126b = C0126R.C0128layout.view_row_spinner;

    /* renamed from: c */
    private int f124127c;

    /* renamed from: d */
    private final int f124128d = C0126R.C0129id.description;

    /* renamed from: e */
    private final LayoutInflater f124129e;

    public bkez(ContextThemeWrapper contextThemeWrapper, Integer[] numArr) {
        super(contextThemeWrapper, (int) C0126R.C0128layout.view_row_spinner, (int) C0126R.C0129id.description, numArr);
        this.f124129e = LayoutInflater.from(contextThemeWrapper);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m105497a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.f124129e.inflate(i2, viewGroup, false);
        }
        Integer num = (Integer) getItem(i);
        TextView textView = (TextView) view.findViewById(this.f124128d);
        if (num.intValue() != 0) {
            textView.setText(bjtl.m104573b(num.intValue()));
        } else {
            textView.setText((CharSequence) null);
        }
        return view;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View a = m105497a(i, view, viewGroup, this.f124127c);
        WalletCheckedTextView.m118770a(a, this.f124125a);
        return a;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m105497a(i, view, viewGroup, this.f124126b);
    }

    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.f124127c = i;
    }
}
