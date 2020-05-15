package p000;

import android.content.SharedPreferences;

/* renamed from: eog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class eog {

    /* renamed from: b */
    public final String f15384b;

    /* renamed from: c */
    public final eoh f15385c;

    protected eog(eoh eoh, String str) {
        this.f15385c = eoh;
        this.f15384b = str;
    }

    /* renamed from: a */
    public final Object mo10351a() {
        return mo10349a(this.f15385c.mo10354a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo10349a(SharedPreferences sharedPreferences);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10350a(SharedPreferences.Editor editor, Object obj);

    /* renamed from: b */
    public final void mo10353b() {
        eoh.m10843a(this.f15385c.mo10354a().edit().remove(this.f15384b));
    }

    /* renamed from: a */
    public final void mo10352a(Object obj) {
        SharedPreferences.Editor edit = this.f15385c.mo10354a().edit();
        mo10350a(edit, obj);
        eoh.m10843a(edit);
    }
}
