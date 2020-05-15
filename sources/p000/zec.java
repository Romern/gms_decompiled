package p000;

import android.content.Context;
import java.util.List;

/* renamed from: zec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zec implements zgg {

    /* renamed from: a */
    private final Context f55006a;

    /* renamed from: b */
    private final zgg f55007b;

    /* renamed from: c */
    private final String f55008c;

    /* renamed from: d */
    private final Object f55009d = new Object();

    /* renamed from: e */
    private int f55010e = Integer.MAX_VALUE;

    public zec(Context context, zgg zgg, String str) {
        this.f55006a = context;
        this.f55007b = zgg;
        this.f55008c = str;
    }

    /* renamed from: a */
    public final void mo30949a(List list) {
        this.f55007b.mo30949a(list);
        if (!list.isEmpty()) {
            synchronized (this.f55009d) {
                int i = ((caaw) ((cadn) bnjd.m109595d(list)).f172704d.get(0)).f172382b;
                int i2 = i - this.f55010e;
                if (i2 < 0) {
                    this.f55010e = i;
                } else if (i2 >= ((int) ceab.f182124a.mo6606a().mo78658i())) {
                    this.f55010e = i;
                    zvm.m46573b(this.f55006a, this.f55008c, cadu.SIGNIFICANT_STEPS);
                }
            }
        }
    }
}
