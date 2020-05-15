package p000;

import android.os.Build;

/* renamed from: lvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvn extends Logger {
    public lvn(String... strArr) {
        super("Backup", strArr);
    }

    /* renamed from: a */
    public final boolean mo19637a(int i) {
        boolean z;
        if (!ccmq.f179467a.mo6606a().mo76390a()) {
            if ("userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE)) {
                z = true;
            } else {
                z = false;
            }
            if (!ccmq.f179467a.mo6606a().mo76392c() || !z) {
                return super.mo19637a(i);
            }
        }
        return true;
    }
}
