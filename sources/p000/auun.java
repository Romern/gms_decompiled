package p000;

import androidx.preference.Preference;

/* renamed from: auun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auun implements aoa {

    /* renamed from: a */
    final /* synthetic */ auur f92553a;

    public auun(auur auur) {
        this.f92553a = auur;
    }

    /* renamed from: a */
    public final boolean mo2219a(Preference preference) {
        new auuq().show(this.f92553a.getFragmentManager(), "RESET_DIALOG_FRAGMENT_TAG");
        return true;
    }
}
