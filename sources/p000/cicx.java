package p000;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: cicx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cicx extends chzx {

    /* renamed from: b */
    public static final Logger f189860b = Logger.getLogger(cicx.class.getName());

    /* renamed from: c */
    private static final ReferenceQueue f189861c = new ReferenceQueue();

    /* renamed from: d */
    private static final ConcurrentMap f189862d = new ConcurrentHashMap();

    /* renamed from: e */
    private final cicw f189863e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cicx(chsz chsz) {
        super(chsz);
        ReferenceQueue referenceQueue = f189861c;
        ConcurrentMap concurrentMap = f189862d;
        this.f189863e = new cicw(this, chsz, referenceQueue, concurrentMap);
    }

    /* renamed from: c */
    public final chsz mo85624c() {
        cicw cicw = this.f189863e;
        int i = cicw.f189852a;
        cicw.mo85968a();
        chsz chsz = this.f189623a;
        ((cicv) chsz).mo85965p();
        return chsz;
    }

    /* renamed from: e */
    public final chsz mo85626e() {
        cicw cicw = this.f189863e;
        int i = cicw.f189852a;
        cicw.mo85968a();
        chsz chsz = this.f189623a;
        ((cicv) chsz).mo85966q();
        return chsz;
    }
}
