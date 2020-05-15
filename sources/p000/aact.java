package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: aact */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aact extends rjl {
    /* renamed from: a */
    public final int mo16731a() {
        return 1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        aacv aacv;
        aacv aacv2 = (aacv) obj;
        if (aacv2 == null) {
            aacv = new aacu().mo16732a();
        } else {
            aacv = aacv2;
        }
        return new aaef(context, looper, sat, aacv, rjz, rka);
    }
}
