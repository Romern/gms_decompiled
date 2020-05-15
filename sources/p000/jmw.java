package p000;

import java.util.List;

/* renamed from: jmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jmw extends jsl {

    /* renamed from: a */
    final /* synthetic */ jmx f22841a;

    public jmw(jmx jmx) {
        this.f22841a = jmx;
    }

    /* renamed from: a */
    public final void mo13884a(String str, int i, int i2, int i3) {
        jmu jmu = new jmu(str, i2, i3);
        jmx jmx = this.f22841a;
        int i4 = jmx.f22842c;
        List list = jmx.f22847b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((rod) list.get(i5)).mo24968a(jmu);
        }
    }

    /* renamed from: a */
    public final void mo13885a(String str, String str2, byte[] bArr) {
        jmv jmv = new jmv(str, str2, bArr);
        jmx jmx = this.f22841a;
        int i = jmx.f22842c;
        List list = jmx.f22847b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((rod) list.get(i2)).mo24968a(jmv);
        }
    }
}
