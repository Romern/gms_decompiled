package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;

/* renamed from: ankq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ankq extends rjl {
    /* renamed from: a */
    public final int mo16731a() {
        return 2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        anks anks = (anks) obj;
        if (anks == null) {
            anks = new anks();
        }
        return new anty(context, looper, sat, new PlusSession(sat.mo25320b().name, stc.m36283a(sat.f43965c), (String[]) anks.f77030a.toArray(new String[0]), new String[0], context.getPackageName(), context.getPackageName(), null, new PlusCommonExtras()), rjz, rka);
    }
}
