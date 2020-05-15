package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: avhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avhb {

    /* renamed from: b */
    private static final srn f93172b = srn.m36124a();

    /* renamed from: a */
    public final ViewGroup f93173a;

    /* renamed from: c */
    private final LayoutInflater f93174c;

    public avhb(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f93174c = layoutInflater;
        this.f93173a = viewGroup;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo51218a(int i) {
        View inflate = this.f93174c.inflate(i, this.f93173a, false);
        if (inflate != null) {
            this.f93173a.addView(inflate);
        } else {
            bnsl bnsl = (bnsl) f93172b.mo68387b();
            bnsl.mo68404a(bnsk.MEDIUM);
            bnsl.mo68432a("avhb", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Layout was not inflated");
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo51219a() {
        mo51218a(C0126R.C0128layout.udc_consent_spacer);
    }
}
