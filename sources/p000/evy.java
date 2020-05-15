package p000;

import android.content.DialogInterface;

/* renamed from: evy */
final /* synthetic */ class evy implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final ewf f15908a;

    /* renamed from: b */
    private final String f15909b;

    public evy(ewf ewf, String str) {
        this.f15908a = ewf;
        this.f15909b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ewf ewf = this.f15908a;
        String str = this.f15909b;
        sdo.m34977c(str);
        ewf.mo10550a(ewf.m11222b(str), 3);
    }
}
