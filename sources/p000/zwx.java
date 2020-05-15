package p000;

import android.content.SharedPreferences;

/* renamed from: zwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zwx extends zwy {

    /* renamed from: a */
    private final zwh f56076a;

    public zwx(zwh zwh) {
        this.f56076a = zwh;
    }

    /* renamed from: a */
    public final rtc mo31545a() {
        zwh zwh = this.f56076a;
        return rtc.m34378a(zwh.f56053a, (String) zwh.f56054b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo31546a(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.f56076a.f56053a, (String) obj);
    }
}
