package p000;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.herrevad.services.PassiveObservationChimeraService;

/* renamed from: abna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abna {

    /* renamed from: a */
    private boolean f57719a = false;

    /* renamed from: a */
    public final synchronized void mo32220a(Context context) {
        boolean z;
        boolean z2;
        boolean z3;
        if (!abme.m47898a() || !m47937b(context)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || this.f57719a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !this.f57719a) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z2) {
            PassiveObservationChimeraService.m66660a(context);
            this.f57719a = true;
        }
        if (z3) {
            PassiveObservationChimeraService.m66661b(context);
            this.f57719a = false;
        }
    }

    /* renamed from: b */
    public static boolean m47937b(Context context) {
        boolean z;
        if (!cekn.f182848a.mo6606a().mo79232e()) {
            int i = eoa.f15378a;
        } else if (((long) Build.VERSION.SDK_INT) < cekn.f182848a.mo6606a().mo79229b()) {
            new Object[1][0] = Integer.valueOf(Build.VERSION.SDK_INT);
            int i2 = eoa.f15378a;
        } else {
            String a = abme.m47896a(context, null);
            if (a != null) {
                z = false;
            } else {
                z = true;
            }
            new Object[1][0] = Boolean.valueOf(z);
            int i3 = eoa.f15378a;
            if (a == null) {
                return true;
            }
        }
        return false;
    }
}
