package p000;

import android.util.Log;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Map;

/* renamed from: audg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audg {

    /* renamed from: b */
    private static final Map f91415b = new HashMap();

    /* renamed from: a */
    public final String f91416a;

    private audg(String str, String str2) {
        this.f91416a = str2.length() == 0 ? new String(str) : str.concat(str2);
    }

    /* renamed from: a */
    public static audg m76790a(String str) {
        audg audg;
        synchronized (f91415b) {
            audg = (audg) f91415b.get(str);
            if (audg == null) {
                audg = new audg(str, " - ");
                f91415b.put(str, audg);
            }
        }
        return audg;
    }

    /* renamed from: c */
    private static String m76791c(String str, Object... objArr) {
        try {
            return String.format(str, objArr);
        } catch (IllegalFormatException e) {
            return "";
        }
    }

    /* renamed from: b */
    public final void mo50423b(String str) {
        if (Log.isLoggable("TelephonySpam", 4)) {
            String valueOf = String.valueOf(this.f91416a);
            String valueOf2 = String.valueOf(str);
            Log.i("TelephonySpam", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        }
    }

    /* renamed from: b */
    public final void mo50424b(String str, Object... objArr) {
        if (Log.isLoggable("TelephonySpam", 6)) {
            String valueOf = String.valueOf(this.f91416a);
            Log.e("TelephonySpam", m76791c(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), objArr));
        }
    }

    /* renamed from: c */
    public final void mo50425c(String str) {
        if (Log.isLoggable("TelephonySpam", 6)) {
            String valueOf = String.valueOf(this.f91416a);
            String valueOf2 = String.valueOf(str);
            Log.e("TelephonySpam", valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
        }
    }

    /* renamed from: a */
    public final void mo50422a(String str, Object... objArr) {
        if (Log.isLoggable("TelephonySpam", 4)) {
            String valueOf = String.valueOf(this.f91416a);
            Log.i("TelephonySpam", m76791c(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), objArr));
        }
    }
}
