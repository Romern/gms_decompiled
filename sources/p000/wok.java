package p000;

import android.accounts.Account;
import android.util.TypedValue;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: wok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wok implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ wot f51035a;

    public wok(wot wot) {
        this.f51035a = wot;
    }

    public void onClick(View view) {
        wot wot = this.f51035a;
        TypedValue typedValue = new TypedValue();
        wot.getActivity().getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true);
        GoogleHelp googleHelp = new GoogleHelp("family_disabled_android_ota");
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.f31623a = 2132018595;
        themeSettings.f31624b = typedValue.data;
        googleHelp.f78776s = themeSettings;
        googleHelp.f78760c = new Account(wot.f51049d, "com.google");
        new aarh(wot.getActivity()).mo31646a(googleHelp.mo43194a());
    }
}
