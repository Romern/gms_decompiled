package p000;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anu implements aoc {

    /* renamed from: a */
    public static anu f1858a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo2209a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.mo1970g())) {
            return listPreference.f1595k.getString(C0126R.string.not_set);
        }
        return listPreference.mo1970g();
    }
}
