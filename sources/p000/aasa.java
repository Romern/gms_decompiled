package p000;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: aasa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasa {

    /* renamed from: a */
    public final SharedPreferences.Editor f56419a;

    /* renamed from: b */
    public final /* synthetic */ aasc f56420b;

    public aasa(aasc aasc, SharedPreferences.Editor editor) {
        this.f56420b = aasc;
        this.f56419a = editor;
    }

    /* renamed from: a */
    public final void mo31685a() {
        this.f56419a.apply();
    }

    /* renamed from: b */
    public final void mo31692b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo31686a(aasc.m46836a((aars) entry.getKey()));
        }
    }

    /* renamed from: a */
    public final void mo31686a(String str) {
        this.f56419a.remove(this.f56420b.mo31656a(str));
    }

    /* renamed from: a */
    public final void mo31687a(String str, int i) {
        this.f56419a.putInt(this.f56420b.mo31656a(str), i);
    }

    /* renamed from: a */
    public final void mo31688a(String str, long j) {
        this.f56419a.putLong(this.f56420b.mo31656a(str), j);
    }

    /* renamed from: a */
    public final void mo31689a(String str, String str2) {
        this.f56419a.putString(this.f56420b.mo31656a(str), str2);
    }

    /* renamed from: a */
    public final void mo31690a(String str, boolean z) {
        this.f56419a.putBoolean(this.f56420b.mo31656a(str), z);
    }

    /* renamed from: a */
    public final void mo31691a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            mo31689a(aasc.m46836a((aars) entry.getKey()), (String) entry.getValue());
        }
    }
}
