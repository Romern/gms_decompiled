package p000;

import android.content.Context;

/* renamed from: aznm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aznm implements azea {

    /* renamed from: a */
    private final int f99725a;

    /* renamed from: b */
    private final aznn f99726b;

    /* renamed from: c */
    private final Context f99727c;

    /* renamed from: d */
    private final String f99728d;

    /* renamed from: e */
    private final int f99729e;

    /* renamed from: f */
    private final String f99730f;

    public aznm(int i, aznn aznn, Context context, String str, int i2, String str2) {
        this.f99725a = i;
        this.f99726b = aznn;
        this.f99728d = str;
        this.f99727c = context.getApplicationContext();
        this.f99729e = i2;
        this.f99730f = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo54816a(azcx azcx) {
        aznn aznn;
        int i;
        azda azda = (azda) azcx;
        new Object[1][0] = azda.f99026d;
        this.f99726b.f99732b.setVisibility(8);
        if (this.f99728d.equals(azda.f99026d) && (aznn = this.f99726b).f99737g == (i = this.f99725a)) {
            Context context = this.f99727c;
            String str = this.f99728d;
            int i2 = this.f99729e;
            new aznq(i, aznn, context, str, i2, i2, this.f99730f).start();
        }
    }

    /* renamed from: d */
    public final void mo54817d() {
        this.f99726b.f99732b.setVisibility(8);
        this.f99726b.f99735e.setVisibility(0);
    }
}
