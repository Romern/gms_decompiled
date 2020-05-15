package p000;

import android.util.Base64;

/* renamed from: ejb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ejb {
    /* renamed from: d */
    public static eja m10519d() {
        eja eja = new eja();
        eja.mo10189a(eie.DEFAULT);
        return eja;
    }

    /* renamed from: a */
    public abstract String mo10171a();

    /* renamed from: b */
    public abstract byte[] mo10172b();

    /* renamed from: c */
    public abstract eie mo10173c();

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo10171a();
        objArr[1] = mo10173c();
        if (mo10172b() != null) {
            str = Base64.encodeToString(mo10172b(), 2);
        } else {
            str = "";
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
