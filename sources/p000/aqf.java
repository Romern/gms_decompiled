package p000;

import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import java.util.ArrayList;

/* renamed from: aqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aqf {

    /* renamed from: a */
    private final SliceSpec f1987a;

    /* renamed from: f */
    public apg f1988f;

    protected aqf(apg apg, SliceSpec sliceSpec) {
        this(apg, sliceSpec, null);
    }

    /* renamed from: a */
    protected static final ArrayList m1852a(int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (i != 0) {
            arrayList.add("no_tint");
        }
        if (i == 2 || i == 4) {
            arrayList.add("large");
        }
        if (i == 3 || i == 4) {
            arrayList.add("raw");
        }
        if (z) {
            arrayList.add("partial");
        }
        return arrayList;
    }

    /* renamed from: a */
    public abstract void mo2295a(apg apg);

    /* renamed from: c */
    public Slice mo2297c() {
        apg apg = this.f1988f;
        apg.f1925b = this.f1987a;
        mo2295a(apg);
        return this.f1988f.mo2257a();
    }

    protected aqf(apg apg, SliceSpec sliceSpec, byte[] bArr) {
        this.f1988f = apg;
        this.f1987a = sliceSpec;
    }
}
