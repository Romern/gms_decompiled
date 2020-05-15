package p000;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;

/* renamed from: aqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqd extends aqf {

    /* renamed from: a */
    public apz f1979a;

    /* renamed from: b */
    public SliceItem f1980b;

    /* renamed from: c */
    public SliceItem f1981c;

    /* renamed from: d */
    public Slice f1982d;

    /* renamed from: e */
    public final ArrayList f1983e = new ArrayList();

    public aqd(apg apg) {
        super(apg, null);
    }

    /* renamed from: a */
    public final void mo2295a(apg apg) {
        Slice slice = this.f1982d;
        if (slice != null) {
            apg.mo2263a(slice);
        }
        SliceItem sliceItem = this.f1980b;
        if (sliceItem != null) {
            apg.mo2265a(sliceItem);
        }
        SliceItem sliceItem2 = this.f1981c;
        if (sliceItem2 != null) {
            apg.mo2265a(sliceItem2);
        }
        for (int i = 0; i < this.f1983e.size(); i++) {
            apg.mo2263a((Slice) this.f1983e.get(i));
        }
        apz apz = this.f1979a;
        if (apz != null) {
            apz.mo2287a(apg);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo2296a() {
        return (this.f1980b == null && this.f1981c == null) ? false : true;
    }
}
