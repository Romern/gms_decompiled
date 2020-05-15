package p000;

import android.content.Context;

/* renamed from: aksb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aksb {

    /* renamed from: a */
    private final qws f72549a;

    public aksb(Context context, String str) {
        this.f72549a = new qws(context, "PAYMENTS_OCR", str);
    }

    /* renamed from: a */
    public final void mo39750a(botq botq) {
        qwo a = this.f72549a.mo24335a(botq.serializeToBytes());
        int a2 = boti.m111527a(botq.f134862d);
        if (a2 == 0) {
            a2 = 1;
        }
        a.mo24328b(a2 - 1);
        a.mo24327b();
    }
}
