package p000;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anr implements aoc {

    /* renamed from: a */
    public static anr f1856a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo2209a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f1561g) ? editTextPreference.f1595k.getString(C0126R.string.not_set) : editTextPreference.f1561g;
    }
}
