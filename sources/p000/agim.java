package p000;

import android.content.SharedPreferences;

/* renamed from: agim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agim {

    /* renamed from: a */
    final /* synthetic */ agiq f65595a;

    /* renamed from: b */
    private final String f65596b;

    /* renamed from: c */
    private final boolean f65597c;

    /* renamed from: d */
    private boolean f65598d;

    /* renamed from: e */
    private boolean f65599e;

    public agim(agiq agiq, String str, boolean z) {
        this.f65595a = agiq;
        sdo.m34977c(str);
        this.f65596b = str;
        this.f65597c = z;
    }

    /* renamed from: a */
    public final void mo35456a(boolean z) {
        SharedPreferences.Editor edit = this.f65595a.mo35468c().edit();
        edit.putBoolean(this.f65596b, z);
        edit.apply();
        this.f65599e = z;
    }

    /* renamed from: a */
    public final boolean mo35457a() {
        if (!this.f65598d) {
            this.f65598d = true;
            this.f65599e = this.f65595a.mo35468c().getBoolean(this.f65596b, this.f65597c);
        }
        return this.f65599e;
    }
}
