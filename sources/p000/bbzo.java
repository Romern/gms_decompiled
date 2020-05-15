package p000;

import android.content.ContentValues;

/* renamed from: bbzo */
final /* synthetic */ class bbzo implements Runnable {

    /* renamed from: a */
    private final bcas f103816a;

    /* renamed from: b */
    private final ContentValues f103817b;

    /* renamed from: c */
    private final String f103818c;

    /* renamed from: d */
    private final String[] f103819d;

    public bbzo(bcas bcas, ContentValues contentValues, String str, String[] strArr) {
        this.f103816a = bcas;
        this.f103817b = contentValues;
        this.f103818c = str;
        this.f103819d = strArr;
    }

    public final void run() {
        bcas bcas = this.f103816a;
        bcas.f103908c.mo54674a(bcas.mo56655d("messages"), this.f103817b, this.f103818c, this.f103819d);
    }
}
