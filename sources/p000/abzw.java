package p000;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: abzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzw {
    /* renamed from: a */
    public static bxxc m48732a(SharedPreferences sharedPreferences, String str, bxxk bxxk) {
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        try {
            return (bxxc) bxxk.mo73657a(Base64.decode(sharedPreferences.getString(str, null), 3));
        } catch (bxwf e) {
            absg.m48189a(e, "Corrupted Message");
            return null;
        }
    }
}
