package p000;

import java.security.MessageDigest;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: xtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtp implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f53078a;

    /* renamed from: b */
    final /* synthetic */ byte[] f53079b;

    /* renamed from: c */
    final /* synthetic */ xtq f53080c;

    public xtp(xtq xtq, List list, byte[] bArr) {
        this.f53080c = xtq;
        this.f53078a = list;
        this.f53079b = bArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        xjm xjm;
        List list = this.f53078a;
        int size = list.size();
        int i = 0;
        while (true) {
            xjm = null;
            if (i >= size) {
                break;
            }
            try {
                xjm = (xjm) bqga.m112780a((Future) ((bqgg) list.get(i)));
            } catch (ExecutionException e) {
                xtq.f53081b.mo25417e("Error using v2 credentials", e.getCause(), new Object[0]);
            }
            if (xjm != null && MessageDigest.isEqual(xjm.f52427b, this.f53079b) && !this.f53080c.f53082a.contains(xjm)) {
                break;
            }
            i++;
        }
        return xjm;
    }
}
