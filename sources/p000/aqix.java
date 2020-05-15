package p000;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: aqix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqix implements aqiw {

    /* renamed from: a */
    private final SharedPreferences f86184a;

    /* renamed from: b */
    private final SharedPreferences.Editor f86185b;

    public aqix(SharedPreferences sharedPreferences) {
        this.f86184a = sharedPreferences;
        this.f86185b = sharedPreferences.edit();
    }

    /* renamed from: a */
    public final void mo47898a() {
        this.f86185b.apply();
    }

    /* renamed from: b */
    public final boolean mo47901b(String str, boolean z) {
        return this.f86184a.getBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo47899a(String str, boolean z) {
        this.f86185b.putBoolean(str, z);
    }

    /* renamed from: b */
    public final byte[] mo47902b() {
        String string = this.f86184a.getString("sessionToken", null);
        if (string != null) {
            return Base64.decode(string, 2);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo47900a(byte[] bArr) {
        this.f86185b.putString("sessionToken", Base64.encodeToString(bArr, 2));
    }
}
