package p000;

import android.content.SharedPreferences;

/* renamed from: zwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwt extends zwy {

    /* renamed from: a */
    private final zwf f56068a;

    public zwt(zwf zwf) {
        this.f56068a = zwf;
    }

    /* renamed from: a */
    public final rtc mo31545a() {
        zwf zwf = this.f56068a;
        return rtc.m34376a(zwf.f56053a, (Integer) zwf.f56054b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31546a(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.f56068a.f56053a, ((Integer) obj).intValue());
    }
}
