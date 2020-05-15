package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: aend */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aend extends rjl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        aemi aemi;
        String str;
        aemi aemi2 = (aemi) obj;
        if (aemi2 == null) {
            aemi = new aemh().mo34328a();
        } else {
            aemi = aemi2;
        }
        String packageName = context.getPackageName();
        String str2 = aemi.f63519a;
        if (str2 == null) {
            str = packageName;
        } else {
            str = str2;
        }
        return new aene(context, looper, sat, rjz, rka, str, aemi);
    }
}
