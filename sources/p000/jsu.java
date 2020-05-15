package p000;

import java.util.List;

/* renamed from: jsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jsu extends jsl {

    /* renamed from: a */
    final /* synthetic */ jsv f23156a;

    public jsu(jsv jsv) {
        this.f23156a = jsv;
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        jss jss = new jss(str, i2, i3);
        jsv jsv = this.f23156a;
        int i4 = jsv.f23157b;
        List list = jsv.f23158a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((rod) list.get(i5)).mo24968a(jss);
        }
    }

    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
        jst jst = new jst(str, str2, bArr);
        jsv jsv = this.f23156a;
        int i = jsv.f23157b;
        List list = jsv.f23158a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((rod) list.get(i2)).mo24968a(jst);
        }
    }
}
