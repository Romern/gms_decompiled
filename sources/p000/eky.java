package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: eky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class eky {

    /* renamed from: a */
    static final eky f15231a;

    static {
        ekx ekx = new ekx();
        ekx.f15227a = 10485760L;
        ekx.f15228b = Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        ekx.f15229c = 10000;
        ekx.f15230d = 604800000L;
        String str = ekx.f15227a == null ? " maxStorageSizeInBytes" : "";
        if (ekx.f15228b == null) {
            str = str.concat(" loadBatchSize");
        }
        if (ekx.f15229c == null) {
            str = String.valueOf(str).concat(" criticalSectionEnterTimeoutMs");
        }
        if (ekx.f15230d == null) {
            str = String.valueOf(str).concat(" eventCleanUpAge");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
        } else {
            f15231a = new eku(ekx.f15227a.longValue(), ekx.f15228b.intValue(), ekx.f15229c.intValue(), ekx.f15230d.longValue());
        }
    }

    /* renamed from: a */
    public abstract long mo10242a();

    /* renamed from: b */
    public abstract int mo10243b();

    /* renamed from: c */
    public abstract int mo10244c();

    /* renamed from: d */
    public abstract long mo10245d();
}
