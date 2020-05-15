package p000;

import android.content.SharedPreferences;

/* renamed from: agin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agin {

    /* renamed from: a */
    final /* synthetic */ agiq f65600a;

    /* renamed from: b */
    private final String f65601b;

    /* renamed from: c */
    private final long f65602c;

    /* renamed from: d */
    private boolean f65603d;

    /* renamed from: e */
    private long f65604e;

    public agin(agiq agiq, String str, long j) {
        this.f65600a = agiq;
        sdo.m34977c(str);
        this.f65601b = str;
        this.f65602c = j;
    }

    /* renamed from: a */
    public final long mo35458a() {
        if (!this.f65603d) {
            this.f65603d = true;
            this.f65604e = this.f65600a.mo35468c().getLong(this.f65601b, this.f65602c);
        }
        return this.f65604e;
    }

    /* renamed from: a */
    public final void mo35459a(long j) {
        SharedPreferences.Editor edit = this.f65600a.mo35468c().edit();
        edit.putLong(this.f65601b, j);
        edit.apply();
        this.f65604e = j;
    }
}
