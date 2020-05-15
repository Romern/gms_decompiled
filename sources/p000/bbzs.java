package p000;

import android.content.ContentValues;

/* renamed from: bbzs */
final /* synthetic */ class bbzs implements Runnable {

    /* renamed from: a */
    private final bcas f103831a;

    /* renamed from: b */
    private final ContentValues f103832b;

    /* renamed from: c */
    private final String f103833c;

    /* renamed from: d */
    private final String[] f103834d;

    public bbzs(bcas bcas, ContentValues contentValues, String str, String[] strArr) {
        this.f103831a = bcas;
        this.f103832b = contentValues;
        this.f103833c = str;
        this.f103834d = strArr;
    }

    public final void run() {
        bcas bcas = this.f103831a;
        bcas.f103908c.mo54674a(bcas.mo56655d("messages"), this.f103832b, this.f103833c, this.f103834d);
    }
}
