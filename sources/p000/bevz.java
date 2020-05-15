package p000;

import androidx.preference.ListPreference;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bevz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevz extends dns {

    /* renamed from: c */
    public ListPreference f112773c;

    /* renamed from: d */
    public bevy f112774d;

    /* renamed from: c */
    public final void mo9322c() {
        mo9318a((int) C0126R.xml.pref_interruption_filter);
        ListPreference listPreference = (ListPreference) mo2204a((CharSequence) "interruption_setting");
        this.f112773c = listPreference;
        listPreference.mo1966a((CharSequence) listPreference.f1567j);
        this.f112773c.f1599o = new bevx(this);
    }
}
