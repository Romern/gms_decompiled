package p000;

import android.content.SharedPreferences;

/* renamed from: agio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agio {

    /* renamed from: a */
    final String f65605a;

    /* renamed from: b */
    public final String f65606b;

    /* renamed from: c */
    public final String f65607c;

    /* renamed from: d */
    public final long f65608d;

    /* renamed from: e */
    final /* synthetic */ agiq f65609e;

    public agio(agiq agiq, String str, long j) {
        this.f65609e = agiq;
        sdo.m34977c(str);
        sdo.m34974b(j > 0);
        this.f65605a = str.concat(":start");
        this.f65606b = str.concat(":count");
        this.f65607c = str.concat(":value");
        this.f65608d = j;
    }

    /* renamed from: a */
    public final void mo35460a() {
        this.f65609e.mo35241h();
        long a = this.f65609e.mo35534A().mo20505a();
        SharedPreferences.Editor edit = this.f65609e.mo35468c().edit();
        edit.remove(this.f65606b);
        edit.remove(this.f65607c);
        edit.putLong(this.f65605a, a);
        edit.apply();
    }

    /* renamed from: b */
    public final long mo35461b() {
        return this.f65609e.mo35468c().getLong(this.f65605a, 0);
    }
}
