package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: bqqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqqh implements bqnu {

    /* renamed from: a */
    private final SharedPreferences f141371a;

    /* renamed from: b */
    private final String f141372b;

    public bqqh(Context context, String str, String str2) {
        this.f141372b = str;
        this.f141371a = context.getApplicationContext().getSharedPreferences(str2, 0);
    }

    /* renamed from: a */
    public final bqsj mo6519a() {
        throw null;
    }

    /* renamed from: b */
    public final byte[] mo69326b() {
        try {
            String string = this.f141371a.getString(this.f141372b, null);
            if (string != null) {
                return bqvz.m113508a(string);
            }
            throw new IOException(String.format("can't read keyset; the pref value %s does not exist", this.f141372b));
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new IOException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f141372b), e);
        }
    }
}
