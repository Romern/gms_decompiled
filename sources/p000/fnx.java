package p000;

import android.content.SharedPreferences;

/* renamed from: fnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fnx {

    /* renamed from: a */
    public final long f16986a;

    /* renamed from: b */
    final /* synthetic */ fny f16987b;

    /* renamed from: c */
    private final String f16988c;

    public fnx(fny fny, String str, long j) {
        this.f16987b = fny;
        sdo.m34977c(str);
        sdo.m34974b(j > 0);
        this.f16988c = str;
        this.f16986a = j;
    }

    /* renamed from: e */
    private final String m12051e() {
        return this.f16988c.concat(":start");
    }

    /* renamed from: a */
    public final void mo11046a() {
        long a = this.f16987b.mo10936e().mo20505a();
        SharedPreferences.Editor edit = this.f16987b.f16989a.edit();
        edit.remove(mo11048c());
        edit.remove(mo11049d());
        edit.putLong(m12051e(), a);
        edit.commit();
    }

    /* renamed from: b */
    public final long mo11047b() {
        return this.f16987b.f16989a.getLong(m12051e(), 0);
    }

    /* renamed from: c */
    public final String mo11048c() {
        return this.f16988c.concat(":count");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo11049d() {
        return this.f16988c.concat(":value");
    }
}
