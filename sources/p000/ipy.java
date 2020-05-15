package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ipy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ipy {

    /* renamed from: a */
    public final Object f21538a = new Object();

    /* renamed from: b */
    public final SharedPreferences f21539b;

    /* renamed from: c */
    private final int f21540c;

    public ipy(Context context, String str) {
        this.f21539b = context.getSharedPreferences("com.google.android.gms.auth.cryptauth.datastore.sharedpreferences.RegisteredDeviceSyncProperties", 0);
        this.f21540c = str.hashCode();
    }

    /* renamed from: a */
    public final int mo13243a() {
        return (int) this.f21539b.getLong(mo13244a("CONSECUTIVE_FAILURES", "NUM_CONSECUTIVE_FAILURES"), 1);
    }

    /* renamed from: b */
    public final void mo13246b(String str) {
        synchronized (this.f21538a) {
            this.f21539b.edit().remove(mo13244a("SYNCED_ENCRYPTED_METADATA", str)).commit();
        }
    }

    /* renamed from: a */
    public final String mo13244a(String str, String str2) {
        int i = this.f21540c;
        StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final byte[] mo13245a(String str) {
        String string = this.f21539b.getString(mo13244a("METADATA", str), null);
        if (string != null) {
            try {
                return sqd.m35971c(string);
            } catch (IllegalArgumentException e) {
            }
        }
        return null;
    }
}
