package p000;

import android.content.Context;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: brhk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brhk {

    /* renamed from: b */
    private static WeakReference f142854b;

    /* renamed from: a */
    public final rjx f142855a;

    public brhk() {
    }

    /* renamed from: a */
    public static synchronized brhk m114021a(Context context) {
        brhk brhk;
        synchronized (brhk.class) {
            sdo.m34959a(context);
            if (f142854b != null) {
                brhk = (brhk) f142854b.get();
            } else {
                brhk = null;
            }
            if (brhk == null) {
                brhk = new brhk(context.getApplicationContext());
                f142854b = new WeakReference(brhk);
            }
        }
        return brhk;
    }

    public brhk(Context context) {
        this.f142855a = new rjx(context, brig.f142864a, Looper.getMainLooper(), new brhh());
    }
}
