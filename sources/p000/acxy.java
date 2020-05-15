package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.SecretKey;

/* renamed from: acxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acxy {

    /* renamed from: a */
    public SecretKey f61065a;

    /* renamed from: b */
    public SecretKey f61066b;

    /* renamed from: c */
    private final SharedPreferences f61067c;

    /* renamed from: d */
    private final String f61068d;

    /* renamed from: e */
    private final acyd f61069e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public acxy(SharedPreferences sharedPreferences, acyd acyd, String str) {
        sdo.checkIfNull(sharedPreferences, "Preferences must not be null.");
        this.f61067c = sharedPreferences;
        sdo.checkIfNull(acyd, "Secret key wrapper must not be null.");
        this.f61069e = acyd;
        sdo.m34969a(str, (Object) "Secret key wrapper must not be null.");
        this.f61068d = str;
    }

    /* renamed from: a */
    public final SecretKey mo33227a(String str) {
        String string = this.f61067c.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            return this.f61069e.mo33236a(Base64.decode(string, 10), this.f61068d);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo33228a(String str, SecretKey secretKey) {
        this.f61067c.edit().putString(str, Base64.encodeToString(this.f61069e.mo33237a(secretKey), 10)).commit();
    }
}
