package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: aezn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezn {

    /* renamed from: b */
    public static HashSet f64043b;

    /* renamed from: c */
    public static final Object f64044c = new Object();

    /* renamed from: d */
    private static aezn f64045d;

    /* renamed from: a */
    public final SharedPreferences f64046a;

    public aezn(Context context, String str) {
        this.f64046a = context.getSharedPreferences(str, 4);
    }

    /* renamed from: a */
    public static aezn m52734a(Context context) {
        aezn aezn;
        synchronized (f64044c) {
            if (f64045d == null) {
                f64045d = new aezn(context.getApplicationContext(), "LockboxOptInSettings");
                f64043b = new HashSet();
            }
            aezn = f64045d;
        }
        return aezn;
    }

    /* renamed from: b */
    public static String m52735b(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("lockbox-account-event-index-") : "lockbox-account-event-index-".concat(valueOf);
    }

    /* renamed from: b */
    private final boolean m52736b(String str, int i) {
        boolean z;
        synchronized (this.f64046a) {
            z = this.f64046a.getBoolean("is-migrated", false);
        }
        return this.f64046a.getBoolean(aeym.m52688a(str, i), z);
    }

    /* renamed from: a */
    public final String mo34680a() {
        return this.f64046a.getString("signed-in-account", null);
    }

    /* renamed from: a */
    public final void mo34681a(String str) {
        LockboxOptInFlags lockboxOptInFlags;
        Iterator it;
        synchronized (this.f64046a) {
            lockboxOptInFlags = new LockboxOptInFlags(str, mo34683a(str, 1), mo34683a(str, 2));
        }
        synchronized (f64044c) {
            it = f64043b.iterator();
        }
        while (it.hasNext()) {
            aezf aezf = (aezf) it.next();
            try {
                Parcel bj = aezf.mo8529bj();
                dcl.m8165a(bj, lockboxOptInFlags);
                aezf.mo8530c(2, bj);
            } catch (RemoteException e) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final void mo34684b() {
        boolean z;
        synchronized (this.f64046a) {
            synchronized (this.f64046a) {
                z = this.f64046a.getBoolean("is-account-renaming-migrated", false);
            }
            if (!z) {
                HashSet<String> hashSet = new HashSet();
                for (String str : this.f64046a.getAll().keySet()) {
                    if (str.startsWith("account-event-index-")) {
                        hashSet.add(str);
                    }
                }
                SharedPreferences.Editor edit = this.f64046a.edit();
                for (String str2 : hashSet) {
                    int i = this.f64046a.getInt(str2, -1);
                    String substring = str2.substring(20);
                    String b = m52735b(substring);
                    String valueOf = String.valueOf(substring);
                    edit.putInt(valueOf.length() == 0 ? new String("udc-account-event-index-") : "udc-account-event-index-".concat(valueOf), i);
                    edit.putInt(b, i);
                    edit.remove(str2);
                }
                edit.putBoolean("is-account-renaming-migrated", true);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public final void mo34682a(String str, int i, boolean z) {
        synchronized (this.f64046a) {
            if (m52736b(str, i) != z) {
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = this.f64046a.edit();
                edit.putBoolean(aeym.m52688a(str, i), z);
                String num = Integer.toString(i);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(num).length());
                sb.append("opt-in-timestamp-");
                sb.append(str);
                sb.append("-");
                sb.append(num);
                edit.putLong(sb.toString(), currentTimeMillis);
                edit.apply();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo34683a(String str, int i) {
        boolean b;
        synchronized (this.f64046a) {
            b = m52736b(str, i);
        }
        return b;
    }
}
