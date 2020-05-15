package p000;

import android.net.ConnectivityManager;
import android.os.Build;

/* renamed from: aamz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamz {

    /* renamed from: a */
    private final ConnectivityManager f28516a;

    /* renamed from: b */
    private int f28517b = 2;

    /* renamed from: c */
    private int f28518c = 2;

    public aamz(ConnectivityManager connectivityManager) {
        this.f28516a = connectivityManager;
    }

    /* renamed from: a */
    public static boolean m21600a(int i) {
        return i == 3 || i == 4;
    }

    /* renamed from: b */
    public final synchronized int mo17085b() {
        return this.f28517b;
    }

    /* renamed from: b */
    public final synchronized void mo17086b(int i) {
        this.f28518c = this.f28517b;
        this.f28517b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        return 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        return 2;
     */
    /* renamed from: a */
    public final synchronized int mo17083a(boolean z, int i) {
        if (z) {
            if (this.f28517b == 2) {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = Build.VERSION.SDK_INT;
                if (this.f28516a.getRestrictBackgroundStatus() == 1 && i == 1) {
                    return this.f28518c == 3 ? 4 : 3;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo17084a() {
        return m21600a(this.f28517b);
    }
}
