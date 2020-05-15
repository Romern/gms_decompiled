package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: aasv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasv extends BaseAdapter {

    /* renamed from: a */
    private final LayoutInflater f56525a;

    /* renamed from: b */
    private final List f56526b;

    /* renamed from: c */
    private final Spinner f56527c;

    /* renamed from: d */
    private final Context f56528d;

    public aasv(Context context, Spinner spinner, String str) {
        this.f56525a = (LayoutInflater) context.getSystemService("layout_inflater");
        ArrayList arrayList = new ArrayList();
        String language = Locale.getDefault().getLanguage();
        int i = 0;
        for (String str2 : Locale.getISOCountries()) {
            arrayList.add(new Locale(language, str2));
        }
        Collections.sort(arrayList, new aasu());
        this.f56526b = arrayList;
        this.f56527c = spinner;
        spinner.setAdapter((SpinnerAdapter) this);
        Spinner spinner2 = this.f56527c;
        int i2 = 0;
        while (true) {
            if (i2 < this.f56526b.size()) {
                if (((Locale) this.f56526b.get(i2)).getDisplayCountry().equals(str)) {
                    i = i2;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        spinner2.setSelection(i);
        this.f56528d = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m46949a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f56525a.inflate(17367048, viewGroup, false);
        }
        ((TextView) view).setText(getItem(i).getDisplayCountry());
        return view;
    }

    public final int getCount() {
        return this.f56526b.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View a = m46949a(i, view, viewGroup);
        int dimensionPixelSize = this.f56528d.getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_spinner_common_spacing);
        a.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, this.f56528d.getResources().getDimensionPixelSize(C0126R.dimen.gh_contact_spinner_bottom_spacing));
        ((TextView) a).setSingleLine(false);
        return a;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View a = m46949a(i, view, viewGroup);
        a.setPadding(this.f56528d.getResources().getDimensionPixelSize(C0126R.dimen.gh_control_inset_material), a.getPaddingTop(), a.getPaddingRight(), a.getPaddingBottom());
        return a;
    }

    /* renamed from: a */
    public final Locale mo31753a() {
        return getItem(this.f56527c.getSelectedItemPosition());
    }

    /* renamed from: a */
    public final Locale getItem(int i) {
        return (Locale) this.f56526b.get(i);
    }
}
