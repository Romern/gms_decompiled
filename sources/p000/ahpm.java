package p000;

import java.util.Arrays;

/* renamed from: ahpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahpm {

    /* renamed from: a */
    final ahkv f67731a;

    /* renamed from: b */
    final String f67732b;

    /* renamed from: c */
    final byte[] f67733c;

    /* renamed from: d */
    public final /* synthetic */ ahpz f67734d;

    public ahpm(ahpz ahpz, ahkv ahkv, String str) {
        this.f67734d = ahpz;
        this.f67731a = ahkv;
        this.f67732b = str;
        this.f67733c = ahpz.m56332a(str);
    }

    /* renamed from: a */
    public final boolean mo36950a(ahro ahro) {
        if (ahro == null) {
            srn srn = ahkm.f67363a;
            return false;
        } else if (ahro.f67889b != this.f67734d.mo36959h()) {
            srn srn2 = ahkm.f67363a;
            return false;
        } else if (Arrays.equals(ahro.f67891d, this.f67733c)) {
            return true;
        } else {
            srn srn3 = ahkm.f67363a;
            ahkm.m55981a(this.f67733c);
            ahkm.m55981a(ahro.f67891d);
            return false;
        }
    }
}
