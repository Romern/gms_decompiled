package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aiwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwt {

    /* renamed from: a */
    private final Context f69961a;

    public aiwt(Context context) {
        this.f69961a = context;
    }

    /* renamed from: c */
    private final SharedPreferences m58096c() {
        return this.f69961a.getSharedPreferences("copresence_gcm_pref", 0);
    }

    /* renamed from: a */
    public final String mo38180a() {
        return m58096c().getString("copresence_uuid_$$UNAUTH$$", null);
    }

    /* renamed from: b */
    public final String mo38182b() {
        return aaks.m21407a(this.f69961a);
    }

    /* renamed from: a */
    public final void mo38181a(String str) {
        m58096c().edit().putString("copresence_uuid_$$UNAUTH$$", str).putBoolean("REGISTERED_$$UNAUTH$$", true).commit();
    }
}
