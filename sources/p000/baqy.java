package p000;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: baqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqy {

    /* renamed from: h */
    public static final /* synthetic */ int f101576h = 0;

    /* renamed from: i */
    private static final EnumMap f101577i;

    /* renamed from: a */
    public final cayo f101578a;

    /* renamed from: b */
    public final Object f101579b = new Object();

    /* renamed from: c */
    public baqx f101580c = baqx.NO_RESULT;

    /* renamed from: d */
    public volatile bqgg f101581d = null;

    /* renamed from: e */
    public int f101582e = 0;

    /* renamed from: f */
    public final AtomicLong f101583f = new AtomicLong(0);

    /* renamed from: g */
    public final List f101584g = new ArrayList();

    /* renamed from: j */
    private long f101585j = -1;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [baqx, java.util.EnumSet]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    static {
        EnumMap enumMap = new EnumMap(baqx.class);
        f101577i = enumMap;
        enumMap.put((Enum) baqx.NO_RESULT, (Object) EnumSet.of(baqx.PENDING_FIRST_GOOD));
        f101577i.put((Enum) baqx.PENDING_FIRST_GOOD, (Object) EnumSet.of(baqx.BAD_RESULT, baqx.GOOD_RESULT));
        f101577i.put((Enum) baqx.BAD_RESULT, (Object) EnumSet.of(baqx.PENDING_FIRST_GOOD));
        f101577i.put((Enum) baqx.GOOD_RESULT, (Object) EnumSet.noneOf(baqx.class));
    }

    public baqy(cayo cayo) {
        this.f101578a = cayo;
    }

    /* renamed from: a */
    public final void mo55892a(baqx baqx) {
        bmxy.m108597a(((EnumSet) f101577i.get(this.f101580c)).contains(baqx), "Cannot transition from %s to %s", this.f101580c, baqx);
        this.f101580c = baqx;
    }

    /* renamed from: a */
    public final void mo55893a(bqgg bqgg) {
        synchronized (this.f101579b) {
            baqx baqx = baqx.NO_RESULT;
            int ordinal = this.f101580c.ordinal();
            if (ordinal == 0 || ordinal == 2) {
                this.f101581d = bqgy.m112818c();
                mo55892a(baqx.PENDING_FIRST_GOOD);
            }
            this.f101582e++;
            try {
                this.f101580c.mo55891a(this);
            } catch (Throwable th) {
                this.f101582e--;
                throw th;
            }
        }
        bqgg.mo741a(new baqw(this, bqgg), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final boolean mo55894a(Object obj, long j) {
        if (j <= this.f101585j) {
            return false;
        }
        this.f101581d = bqga.m112775a(obj);
        this.f101585j = j;
        return true;
    }
}
