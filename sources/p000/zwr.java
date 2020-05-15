package p000;

import android.content.SharedPreferences;

/* renamed from: zwr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwr extends zwy {

    /* renamed from: a */
    private final zwe f56064a;

    public zwr(zwe zwe) {
        this.f56064a = zwe;
    }

    /* renamed from: a */
    public final rtc mo31545a() {
        zwe zwe = this.f56064a;
        return rtc.m34379a(zwe.f56053a, ((Boolean) zwe.f56054b).booleanValue());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31546a(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.f56064a.f56053a, ((Boolean) obj).booleanValue());
    }
}
