package p000;

import java.io.Closeable;

/* renamed from: abne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abne implements Closeable {

    /* renamed from: a */
    final bljb f57726a;

    /* renamed from: b */
    final qxo f57727b;

    /* renamed from: c */
    private final String f57728c;

    private abne(String str) {
        bljb bljb;
        if (cekq.f182858a.mo6606a().mo79238b()) {
            bljb = blkh.m107281a(str);
        } else {
            bljb = null;
        }
        this.f57726a = bljb;
        if (cekq.f182858a.mo6606a().mo79239c()) {
            this.f57727b = abnd.m47944b(str);
            this.f57728c = str;
            return;
        }
        this.f57727b = null;
        this.f57728c = null;
    }

    /* renamed from: a */
    public static abne m47947a(String str) {
        return new abne(str);
    }

    public final void close() {
        bljb bljb = this.f57726a;
        if (bljb != null) {
            bljb.close();
        }
        qxo qxo = this.f57727b;
        if (qxo != null) {
            qxo.mo24371b();
            Object[] objArr = {this.f57728c, Long.valueOf(this.f57727b.mo24370a())};
            int i = eoa.f15378a;
        }
    }
}
