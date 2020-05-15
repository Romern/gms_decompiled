package p000;

import android.content.Context;

/* renamed from: bils */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bils {

    /* renamed from: a */
    public final rkb f120857a;

    /* renamed from: b */
    public final rkb f120858b;

    /* renamed from: c */
    public final rkb f120859c;

    /* renamed from: d */
    public int f120860d;

    /* renamed from: e */
    final rjy f120861e;

    /* renamed from: f */
    final rjy f120862f;

    /* renamed from: g */
    final rjy f120863g;

    public bils(Context context, String str, String str2, String str3) {
        aemh aemh = new aemh();
        aemh.f63517c = 1;
        m102537a(aemh, str, str2);
        aemi a = aemh.mo34328a();
        rjy rjy = new rjy(context.getApplicationContext());
        rjy.mo24778a(str3);
        rjy.mo24780a(aema.f63501a, a);
        rjy.mo24780a(aema.f63502b, a);
        this.f120861e = rjy;
        this.f120857a = rjy.mo24784b();
        aemh aemh2 = new aemh();
        aemh2.f63517c = 0;
        m102537a(aemh2, str, str2);
        aemi a2 = aemh2.mo34328a();
        rjy rjy2 = new rjy(context.getApplicationContext());
        rjy2.mo24778a(str3);
        rjy2.mo24780a(aema.f63501a, a2);
        this.f120862f = rjy2;
        this.f120858b = rjy2.mo24784b();
        rjy rjy3 = new rjy(context.getApplicationContext());
        rjy3.mo24779a(aeie.f63411a);
        this.f120863g = rjy3;
        this.f120859c = rjy3.mo24784b();
    }

    /* renamed from: a */
    static void m102537a(aemh aemh, String str, String str2) {
        if (str.equals("com.google.android.gms")) {
            aemh.f63516b = str2;
        } else {
            aemh.f63515a = str;
        }
    }
}
