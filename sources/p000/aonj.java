package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aonj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aonj extends ArrayAdapter {

    /* renamed from: a */
    public String f78572a;

    /* renamed from: b */
    private final LayoutInflater f78573b;

    /* renamed from: c */
    private final int f78574c = C0126R.C0129id.spinner_title;

    public aonj(Context context, Object[] objArr) {
        super(context, (int) C0126R.C0128layout.plus_settings_account_spinner, (int) C0126R.C0129id.account_name, objArr);
        this.f78573b = LayoutInflater.from(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f78573b.inflate(17367050, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i).toString());
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f78572a != null) {
            ((TextView) view2.findViewById(this.f78574c)).setText(this.f78572a);
        }
        return view2;
    }
}
