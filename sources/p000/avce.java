package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

/* renamed from: avce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avce {

    /* renamed from: a */
    public static final int[] f92952a = {10, 9};

    /* renamed from: d */
    private static final Object f92953d = new Object();

    /* renamed from: e */
    private static avce f92954e;

    /* renamed from: b */
    public final SharedPreferences f92955b;

    /* renamed from: c */
    public final adyd f92956c;

    private avce(Context context, String str) {
        this.f92955b = context.getSharedPreferences(str, 0);
        this.f92956c = adyd.m51363a(context);
    }

    /* renamed from: a */
    private static int m78237a(int i) {
        if (i != 9) {
            return i != 10 ? -1 : 1;
        }
        return 2;
    }

    /* renamed from: c */
    public static String m78240c(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("opt-in-status-");
        sb.append(str);
        sb.append("-");
        sb.append(m78237a(i));
        return sb.toString();
    }

    /* renamed from: d */
    public static String m78241d(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
        sb.append("opt-in-timestamp-");
        sb.append(str);
        sb.append("-");
        sb.append(m78237a(i));
        return sb.toString();
    }

    /* renamed from: b */
    public final boolean mo51148b() {
        boolean z;
        synchronized (this.f92955b) {
            z = this.f92955b.getBoolean("is-migrated", false);
        }
        return z;
    }

    /* renamed from: a */
    public static avce m78238a(Context context) {
        avce avce;
        synchronized (f92953d) {
            if (f92954e == null) {
                f92954e = new avce(context.getApplicationContext(), "LockboxOptInSettings");
            }
            avce = f92954e;
        }
        return avce;
    }

    /* renamed from: b */
    public final boolean mo51149b(String str, int i) {
        boolean z;
        synchronized (this.f92955b) {
            z = this.f92955b.getBoolean(m78240c(str, i), mo51148b());
        }
        return z;
    }

    /* renamed from: c */
    public final void mo51150c() {
        boolean z;
        synchronized (this.f92955b) {
            synchronized (this.f92955b) {
                z = this.f92955b.getBoolean("is-account-renaming-migrated", false);
            }
            if (!z) {
                HashSet<String> hashSet = new HashSet();
                synchronized (this.f92955b) {
                    for (String str : this.f92955b.getAll().keySet()) {
                        if (str.startsWith("account-event-index-")) {
                            hashSet.add(str);
                        }
                    }
                }
                SharedPreferences.Editor edit = this.f92955b.edit();
                for (String str2 : hashSet) {
                    int i = this.f92955b.getInt(str2, -1);
                    String substring = str2.substring(20);
                    String a = m78239a(substring);
                    String valueOf = String.valueOf(substring);
                    String str3 = valueOf.length() == 0 ? new String("lockbox-account-event-index-") : "lockbox-account-event-index-".concat(valueOf);
                    edit.putInt(a, i);
                    edit.putInt(str3, i);
                    edit.remove(str2);
                }
                edit.putBoolean("is-account-renaming-migrated", true);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public static String m78239a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("udc-account-event-index-") : "udc-account-event-index-".concat(valueOf);
    }

    /* renamed from: a */
    public final Set mo51146a() {
        String str;
        HashSet hashSet = new HashSet();
        synchronized (this.f92955b) {
            for (String str2 : this.f92955b.getAll().keySet()) {
                if (str2.matches("^opt-in-status-.+-\\d+$")) {
                    str = str2.substring(14, str2.lastIndexOf(45));
                } else {
                    str = null;
                }
                if (str != null) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final boolean mo51147a(String str, int i) {
        boolean b;
        synchronized (this.f92955b) {
            b = mo51149b(str, i);
        }
        return b;
    }
}
