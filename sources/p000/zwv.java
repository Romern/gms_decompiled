package p000;

import android.content.SharedPreferences;

/* renamed from: zwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwv extends zwy {

    /* renamed from: a */
    private final zwg f56072a;

    public zwv(zwg zwg) {
        this.f56072a = zwg;
    }

    /* renamed from: a */
    public final rtc mo31545a() {
        zwg zwg = this.f56072a;
        return rtc.m34377a(zwg.f56053a, (Long) zwg.f56054b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31546a(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.f56072a.f56053a, ((Long) obj).longValue());
    }
}
