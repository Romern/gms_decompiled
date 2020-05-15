package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DropDownPreference extends ListPreference {

    /* renamed from: F */
    private final ArrayAdapter f1557F;

    /* renamed from: G */
    private Spinner f1558G;

    /* renamed from: H */
    private final AdapterView.OnItemSelectedListener f1559H = new anp(this);

    /* renamed from: g */
    public final Context f1560g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1957a() {
        this.f1558G.performClick();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1958b() {
        super.mo1958b();
        ArrayAdapter arrayAdapter = this.f1557F;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0126R.attr.dropdownPreferenceStyle);
        this.f1560g = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f1560g, 17367049);
        this.f1557F = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).f1565h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f1557F.add(charSequence.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        Spinner spinner = (Spinner) aoq.f201a.findViewById(C0126R.C0129id.spinner);
        this.f1558G = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1557F);
        this.f1558G.setOnItemSelectedListener(this.f1559H);
        Spinner spinner2 = this.f1558G;
        String str = ((ListPreference) this).f1567j;
        CharSequence[] charSequenceArr = ((ListPreference) this).f1566i;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length >= 0) {
                    if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                        i = length;
                        break;
                    }
                    length--;
                } else {
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo1956a(aoq);
    }
}
