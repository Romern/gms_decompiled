package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;

/* renamed from: anp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anp implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    final /* synthetic */ DropDownPreference f1855a;

    public anp(DropDownPreference dropDownPreference) {
        this.f1855a = dropDownPreference;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            String charSequence = ((ListPreference) this.f1855a).f1566i[i].toString();
            if (!charSequence.equals(((ListPreference) this.f1855a).f1567j) && this.f1855a.mo1988b((Object) charSequence)) {
                this.f1855a.mo1967a(charSequence);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
