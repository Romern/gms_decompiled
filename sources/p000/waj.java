package p000;

import android.content.Context;

/* renamed from: waj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class waj implements wap {
    /* renamed from: a */
    public final wao mo29006a(Context context, String str, wan wan) {
        int i;
        wao wao = new wao();
        wao.f50350a = wan.mo29004a(context, str);
        int a = wan.mo29005a(context, str, true);
        wao.f50351b = a;
        int i2 = wao.f50350a;
        if (i2 == 0 && a == 0) {
            i = 0;
        } else if (a < i2) {
            i = -1;
        } else {
            wao.f50352c = 1;
            return wao;
        }
        wao.f50352c = i;
        return wao;
    }
}
