package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: abmu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abmu {

    /* renamed from: a */
    public abmt f57710a;

    /* renamed from: b */
    public final Object f57711b = new Object();

    /* renamed from: c */
    private volatile boolean f57712c = false;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo32219a(Context context) {
        eoa.m10826b("Herrevad", "updateListenState", new Object[0]);
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            eoa.m10824a("Herrevad", "TelephonyManager is null", new Object[0]);
            return;
        }
        synchronized (this.f57711b) {
            if (this.f57710a != null) {
                int i = Build.VERSION.SDK_INT;
                if (abme.m47898a()) {
                    if (!this.f57712c) {
                        telephonyManager.listen(this.f57710a, 4194304);
                        this.f57712c = true;
                    }
                } else if (this.f57712c) {
                    telephonyManager.listen(this.f57710a, 0);
                    this.f57712c = false;
                }
            }
        }
    }
}
