package p000;

import android.content.Context;
import android.provider.Settings;

/* renamed from: nwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nwi extends npc {

    /* renamed from: c */
    private final String f36800c;

    public nwi(String str, String str2) {
        super(str);
        this.f36800c = str2;
    }

    /* renamed from: a */
    private final void m28019a(Context context, String str) {
        try {
            Settings.System.putString(context.getContentResolver(), this.f36290a, str);
        } catch (IllegalArgumentException e) {
            bnsi b = nwj.f36801a.mo68387b();
            b.mo68437a(e);
            b.mo68432a("nwi", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Failed to write to Settings.System table");
        }
    }

    /* renamed from: b */
    public final void mo21375b(Context context) {
        if (this.f36291b != null) {
            m28019a(context, this.f36800c);
        }
    }

    /* renamed from: c */
    public final void mo21376c(Context context) {
        m28019a(context, this.f36291b);
    }

    /* renamed from: a */
    public final String mo21374a(Context context) {
        return Settings.System.getString(context.getContentResolver(), this.f36290a);
    }
}
