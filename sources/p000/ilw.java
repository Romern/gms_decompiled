package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

/* renamed from: ilw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ilw {

    /* renamed from: a */
    private ilq f21319a;

    public ilw() {
    }

    /* renamed from: a */
    public static final void m15682a(int i, ilq ilq) {
        if (!ilq.mo13124a(i)) {
            String[] a = ilq.f21308c.mo26175a(i);
            if (a != null) {
                for (String str : a) {
                    try {
                        PackageInfo b = ilq.f21308c.mo26176b(str, 0);
                        if (!(b == null || (b.applicationInfo.flags & 1) == 0)) {
                            int i2 = Build.VERSION.SDK_INT;
                            return;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.w("GLSActivity", String.format("Could not find package [%s]", str), e);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(38);
                sb.append("No known packages with uid ");
                sb.append(i);
                Log.w("GLSActivity", sb.toString());
            }
            throw new SecurityException(String.format("UID %s is not associated with a first party app!", Integer.valueOf(i)));
        }
    }

    @Deprecated
    /* renamed from: b */
    public final void mo13128b(int i) {
        sdo.m34959a(this.f21319a);
        m15682a(i, this.f21319a);
    }

    @Deprecated
    public ilw(ilq ilq) {
        this.f21319a = ilq;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo13127a(int i) {
        sdo.m34959a(this.f21319a);
        m15682a(i, this.f21319a);
    }
}
