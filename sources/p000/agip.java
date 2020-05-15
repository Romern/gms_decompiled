package p000;

import android.content.SharedPreferences;

/* renamed from: agip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agip {

    /* renamed from: a */
    final /* synthetic */ agiq f65610a;

    /* renamed from: b */
    private final String f65611b;

    /* renamed from: c */
    private boolean f65612c;

    /* renamed from: d */
    private String f65613d;

    public agip(agiq agiq, String str) {
        this.f65610a = agiq;
        sdo.m34977c(str);
        this.f65611b = str;
    }

    /* renamed from: a */
    public final String mo35462a() {
        if (!this.f65612c) {
            this.f65612c = true;
            this.f65613d = this.f65610a.mo35468c().getString(this.f65611b, null);
        }
        return this.f65613d;
    }

    /* renamed from: a */
    public final void mo35463a(String str) {
        if (this.f65610a.mo35538v().mo35314a(aghn.f65487am) || !agms.m54594b(str, this.f65613d)) {
            SharedPreferences.Editor edit = this.f65610a.mo35468c().edit();
            edit.putString(this.f65611b, str);
            edit.apply();
            this.f65613d = str;
        }
    }
}
