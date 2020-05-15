package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.Arrays;

/* renamed from: suo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class suo extends BaseAdapter implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public String[] f45182a;

    /* renamed from: b */
    public int f45183b;

    /* renamed from: c */
    public AdapterView.OnItemSelectedListener f45184c;

    /* renamed from: d */
    private final Object f45185d = new Object();

    /* renamed from: e */
    private final String f45186e;

    /* renamed from: f */
    private final Context f45187f;

    /* renamed from: g */
    private final LayoutInflater f45188g;

    /* renamed from: h */
    private final SharedPreferences f45189h;

    /* renamed from: i */
    private final CharSequence f45190i;

    /* renamed from: j */
    private C1341rz f45191j;

    /* renamed from: k */
    private Spinner f45192k;

    public suo(Context context, String str, CharSequence charSequence, String[] strArr) {
        this.f45187f = context;
        this.f45188g = LayoutInflater.from(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("common.google_account_spinner", 0);
        this.f45189h = sharedPreferences;
        this.f45186e = str;
        this.f45190i = charSequence;
        this.f45182a = strArr;
        this.f45183b = mo26113a(sharedPreferences.getString("common.google_account_spinner.selected_account", null));
    }

    /* renamed from: c */
    private final void m36373c() {
        this.f45191j.mo15840a((int) C0126R.C0128layout.common_action_bar_spinner);
        this.f45191j.mo15841a(16, 24);
        Spinner spinner = (Spinner) this.f45191j.mo15837a().findViewById(C0126R.C0129id.action_bar_spinner);
        this.f45192k = spinner;
        spinner.setAdapter((SpinnerAdapter) this);
        this.f45192k.setOnItemSelectedListener(this);
        int i = this.f45183b;
        if (i >= 0) {
            this.f45192k.setSelection(i);
        }
        this.f45192k.setVisibility(0);
    }

    /* renamed from: d */
    private final void m36374d(String str) {
        if (!TextUtils.equals(this.f45189h.getString("common.google_account_spinner.selected_account", null), str)) {
            SharedPreferences.Editor edit = this.f45189h.edit();
            if (str != null) {
                edit.putString("common.google_account_spinner.selected_account", str);
            } else {
                edit.remove("common.google_account_spinner.selected_account");
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public final int mo26113a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = this.f45182a;
            for (int i = 0; i < strArr.length; i++) {
                if (str.equals(strArr[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final String getItem(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f45182a;
        if (i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public final int getCount() {
        return this.f45182a.length;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f45188g.inflate((int) C0126R.C0128layout.support_simple_spinner_dropdown_item, viewGroup, false);
        }
        try {
            ((TextView) view).setText(getItem(i));
        } catch (ClassCastException e) {
            Log.wtf("GoogleAccountSpinnerAdapter", "drop down view didn't cast to TextView");
        }
        return view;
    }

    public final long getItemId(int i) {
        String b = getItem(i);
        if (b != null) {
            return (long) b.hashCode();
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f45188g.inflate((int) C0126R.C0128layout.common_action_bar_title_item, viewGroup, false);
        }
        try {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.action_bar_title);
            textView.setTextAppearance(this.f45187f, 2132018364);
            textView.setText(this.f45190i);
        } catch (ClassCastException e) {
            Log.wtf("GoogleAccountSpinnerAdapter", "title field didn't cast to TextView");
        }
        try {
            TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.action_bar_subtitle);
            textView2.setTextAppearance(this.f45187f, 2132018362);
            textView2.setText(getItem(i));
            textView2.setVisibility(0);
        } catch (ClassCastException e2) {
            Log.wtf("GoogleAccountSpinnerAdapter", "subtitle field didn't cast to TextView");
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f45183b = i;
        m36374d(this.f45182a[i]);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f45184c;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i, j);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        this.f45183b = -1;
        m36374d(null);
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f45184c;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    /* renamed from: a */
    public final String mo26114a() {
        return getItem(this.f45183b);
    }

    /* renamed from: b */
    public final void mo26118b() {
        boolean z;
        boolean z2;
        String[] b = soz.m35797b(soz.m35801d(this.f45187f, this.f45186e));
        synchronized (this.f45185d) {
            z = true;
            z2 = false;
            if (!Arrays.equals(b, this.f45182a)) {
                if (this.f45182a.length == 0 && b.length > 0) {
                    z2 = true;
                }
                this.f45182a = b;
            } else {
                z = false;
            }
        }
        if (z2) {
            m36373c();
        }
        if (z) {
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo26115a(int i) {
        if (i < -1 || i >= this.f45182a.length) {
            i = -1;
        }
        this.f45183b = i;
        m36374d(getItem(i));
        Spinner spinner = this.f45192k;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: c */
    public final void mo26120c(String str) {
        AdapterView.OnItemSelectedListener onItemSelectedListener = this.f45184c;
        this.f45184c = null;
        mo26118b();
        this.f45184c = onItemSelectedListener;
        int a = mo26113a(str);
        if (a < 0) {
            a = 0;
        }
        mo26115a(a);
    }

    /* renamed from: a */
    public final void mo26116a(C1341rz rzVar) {
        this.f45191j = rzVar;
        Spinner spinner = this.f45192k;
        if (spinner != null) {
            spinner.setAdapter((SpinnerAdapter) null);
            this.f45192k.setOnItemSelectedListener(null);
        }
        if (this.f45182a.length == 0) {
            this.f45191j.mo15845a(this.f45190i);
        } else {
            m36373c();
        }
    }

    /* renamed from: b */
    public final void mo26119b(String str) {
        mo26115a(mo26113a(str));
    }
}
