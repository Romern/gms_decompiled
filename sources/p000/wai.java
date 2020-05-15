package p000;

import android.content.Context;

/* renamed from: wai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wai implements wap {
    /* renamed from: a */
    public final wao mo29006a(Context context, String str, wan wan) {
        int i;
        wao wao = new wao();
        int a = wan.mo29004a(context, str);
        wao.f50350a = a;
        if (a != 0) {
            i = wan.mo29005a(context, str, false);
            wao.f50351b = i;
        } else {
            i = wan.mo29005a(context, str, true);
            wao.f50351b = i;
        }
        int i2 = wao.f50350a;
        if (i2 == 0 && i == 0) {
            wao.f50352c = 0;
        } else if (i2 >= i) {
            wao.f50352c = -1;
        } else {
            wao.f50352c = 1;
        }
        return wao;
    }
}
