package p000;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: atsj */
final /* synthetic */ class atsj implements ayq {

    /* renamed from: a */
    private final atso f90769a;

    /* renamed from: b */
    private final bzua f90770b;

    public atsj(atso atso, bzua bzua) {
        this.f90769a = atso;
        this.f90770b = bzua;
    }

    /* renamed from: a */
    public final void mo2853a(Object obj) {
        String str;
        atso atso = this.f90769a;
        bzua bzua = this.f90770b;
        Throwable th = (Throwable) obj;
        String str2 = "";
        if (bzua.f171393a == 3) {
            str = (String) bzua.f171394b;
        } else {
            str = str2;
        }
        if (!str.isEmpty()) {
            ccd b = cbo.m3905b(atso.f90777c.getContext().getApplicationContext());
            if (bzua.f171393a == 3) {
                str2 = (String) bzua.f171394b;
            }
            cca a = b.mo3680a(Drawable.class);
            a.mo3675a(str2);
            a.mo3673a((ImageView) atso.f90777c);
        }
    }
}
