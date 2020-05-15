package p000;

import android.content.Context;

/* renamed from: wag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wag implements wap {
    /* renamed from: a */
    public final wao mo29006a(Context context, String str, wan wan) {
        wao wao = new wao();
        int a = wan.mo29005a(context, str, true);
        wao.f50351b = a;
        if (a == 0) {
            int a2 = wan.mo29004a(context, str);
            wao.f50350a = a2;
            if (a2 != 0) {
                wao.f50352c = -1;
            }
        } else {
            wao.f50352c = 1;
        }
        return wao;
    }
}
