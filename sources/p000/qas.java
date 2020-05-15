package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.android.volley.RequestQueue;

/* renamed from: qas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qas {

    /* renamed from: a */
    private final SharedPreferences f40825a;

    /* renamed from: b */
    private final RequestQueue f40826b;

    public qas(Context context, RequestQueue requestQueue) {
        this.f40825a = qay.m31785b(context);
        this.f40826b = requestQueue;
    }

    /* renamed from: a */
    private final String m31757a(String str) {
        String[] split;
        String string = this.f40825a.getString(str, null);
        if (string == null || (split = string.split("\\s")) == null || split.length < 2 || Long.parseLong(split[1]) < System.currentTimeMillis() - cday.f180398a.mo6606a().mo77181c()) {
            return null;
        }
        return split[0];
    }

    /* renamed from: a */
    public final synchronized void mo23847a(String str, String str2, pjp pjp, Handler handler) {
        String a = m31757a(String.format("com.google.android.gms.cast.INTENT_TO_JOIN_DEEP_LINK_KEY_%s", str));
        String a2 = m31757a(String.format("com.google.android.gms.cast.PLAYBACK_CONTROL_DEEP_LINK_KEY_%s", str2));
        String a3 = m31757a(String.format("com.google.android.gms.cast.FALLBACK_PLAY_STORE_LINK_KEY_%s", str));
        String a4 = m31757a("com.google.android.gms.cast.HOME_APP_PLAY_STORE_LINK_KEY");
        if (a != null) {
            if (!(a2 == null || a3 == null || a4 == null)) {
                handler.post(new qan(a, a2, a4, a3, pjp));
                return;
            }
        }
        bxvd da = bltu.f127741d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bltu bltu = (bltu) da.f164949b;
        str.getClass();
        int i = 1 | bltu.f127743a;
        bltu.f127743a = i;
        bltu.f127744b = str;
        str2.getClass();
        bltu.f127743a = i | 2;
        bltu.f127745c = str2;
        this.f40826b.add(new qaw((bltu) da.mo74062i(), new qar(str, str2, pjp, handler, this.f40825a), new qap(handler, pjp)));
    }
}
