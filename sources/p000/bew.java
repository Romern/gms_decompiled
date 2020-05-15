package p000;

import android.util.Log;

/* renamed from: bew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bew {
    /* renamed from: a */
    protected static final void m2863a(int i) {
        String valueOf = String.valueOf(String.valueOf(i));
        Log.i("core-hceclient", valueOf.length() == 0 ? new String("Secure Component Status::") : "Secure Component Status::".concat(valueOf));
        if (i < 0) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Secure Component Status::");
            sb.append(i);
            throw new bfq(sb.toString());
        }
    }

    /* renamed from: b */
    protected static final int m2864b(int i) {
        return i + i + 1024;
    }

    /* renamed from: a */
    public abstract void mo3074a();
}
