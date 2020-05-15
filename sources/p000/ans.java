package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ans */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ans extends Preference {

    /* renamed from: a */
    public long f1857a;

    public ans(Context context, List list, long j) {
        super(context);
        this.f1571A = C0126R.C0128layout.expand_button;
        mo1989c((int) C0126R.C0127drawable.ic_arrow_down_24dp);
        mo1984b((int) C0126R.string.expand_button_title);
        mo1974a(999);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        CharSequence charSequence = null;
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            CharSequence charSequence2 = preference.f1602r;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (!arrayList.contains(preference.f1574D)) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence != null) {
                        charSequence = this.f1595k.getString(C0126R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                    } else {
                        charSequence = charSequence2;
                    }
                }
            } else if (z) {
                arrayList.add((PreferenceGroup) preference);
            }
        }
        mo1966a(charSequence);
        this.f1857a = j + 1000000;
    }

    /* renamed from: a */
    public final void mo1956a(aoq aoq) {
        super.mo1956a(aoq);
        aoq.f1898u = false;
    }

    /* renamed from: e */
    public final long mo1997e() {
        return this.f1857a;
    }
}
