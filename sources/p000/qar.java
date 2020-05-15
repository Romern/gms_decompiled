package p000;

import android.content.SharedPreferences;
import android.os.Handler;
import com.android.volley.Response;

/* renamed from: qar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qar implements Response.Listener {

    /* renamed from: a */
    public final pjp f40820a;

    /* renamed from: b */
    private final String f40821b;

    /* renamed from: c */
    private final String f40822c;

    /* renamed from: d */
    private final Handler f40823d;

    /* renamed from: e */
    private final SharedPreferences f40824e;

    public qar(String str, String str2, pjp pjp, Handler handler, SharedPreferences sharedPreferences) {
        this.f40821b = str;
        this.f40822c = str2;
        this.f40820a = pjp;
        this.f40823d = handler;
        this.f40824e = sharedPreferences;
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        bltv bltv = (bltv) obj;
        String valueOf = String.valueOf(System.currentTimeMillis());
        SharedPreferences.Editor edit = this.f40824e.edit();
        edit.putString(String.format("com.google.android.gms.cast.INTENT_TO_JOIN_DEEP_LINK_KEY_%s", this.f40821b), String.format("%s %s", bltv.f127751d, valueOf));
        edit.putString(String.format("com.google.android.gms.cast.PLAYBACK_CONTROL_DEEP_LINK_KEY_%s", this.f40822c), String.format("%s %s", bltv.f127750c, valueOf));
        edit.putString("com.google.android.gms.cast.HOME_APP_PLAY_STORE_LINK_KEY", String.format("%s %s", bltv.f127749b, valueOf));
        edit.putString(String.format("com.google.android.gms.cast.FALLBACK_PLAY_STORE_LINK_KEY_%s", this.f40821b), String.format("%s %s", bltv.f127752e, valueOf));
        edit.commit();
        this.f40823d.post(new qaq(this, bltv));
    }
}
