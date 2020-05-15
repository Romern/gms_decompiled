package p000;

import android.content.Intent;

/* renamed from: ues */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ues extends Exception {

    /* renamed from: a */
    public Intent f47368a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ues(Exception exc, Intent intent) {
        super(r0.length() == 0 ? new String("Authorization failed: ") : "Authorization failed: ".concat(r0), exc);
        String valueOf = String.valueOf(exc.getMessage());
        this.f47368a = intent;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ues(String str) {
        super(r3.length() == 0 ? new String("Authorization failed: ") : "Authorization failed: ".concat(r3));
        String valueOf = String.valueOf(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ues(String str, Exception exc) {
        super(r3.length() == 0 ? new String("Authorization failed: ") : "Authorization failed: ".concat(r3), exc);
        String valueOf = String.valueOf(str);
    }
}
