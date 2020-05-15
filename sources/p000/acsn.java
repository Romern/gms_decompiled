package p000;

import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: acsn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acsn implements Closeable {

    /* renamed from: a */
    public final abzo f60686a;

    /* renamed from: b */
    public final abqv f60687b;

    /* renamed from: c */
    public final NativeIndex f60688c;

    /* renamed from: d */
    public final bdry f60689d;

    /* renamed from: e */
    public final Executor f60690e;

    /* renamed from: f */
    public final abym f60691f;

    public acsn(abzo abzo, abqv abqv, NativeIndex nativeIndex, bdry bdry, abym abym, Executor executor) {
        this.f60686a = abzo;
        this.f60687b = abqv;
        this.f60688c = nativeIndex;
        this.f60689d = bdry;
        this.f60691f = abym;
        this.f60690e = executor;
    }

    public final void close() {
        this.f60689d.close();
    }
}
