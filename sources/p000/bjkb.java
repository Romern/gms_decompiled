package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: bjkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjkb {

    /* renamed from: a */
    public final C1246ol f122849a = new C1246ol();

    /* renamed from: b */
    public final C1246ol f122850b = new C1246ol();

    /* renamed from: c */
    public final ArrayList f122851c = new ArrayList();

    /* renamed from: d */
    public final List f122852d;

    public bjkb(List list) {
        this.f122852d = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bjjz mo65332a(int i) {
        if (this.f122850b.mo15645e(i)) {
            return (bjjz) this.f122850b.mo15646f(i);
        }
        if (this.f122849a.mo15645e(i)) {
            bjjz a = mo65333a((bwxs) this.f122849a.mo15646f(i));
            this.f122850b.mo15637a(i, a);
            return a;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Unknown property class id: %d", Integer.valueOf(i)));
    }

    /* renamed from: a */
    public final bjjz mo65333a(bwxs bwxs) {
        return new bjjz(this, bwxs);
    }

    /* renamed from: a */
    public final void mo65334a(bjjz bjjz) {
        bjjz.mo65322d();
        this.f122851c.remove(bjjz);
    }

    /* renamed from: a */
    public final void mo65335a(bwzd bwzd) {
        boolean z = false;
        for (Map.Entry entry : Collections.unmodifiableMap(bwzd.f161577a).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            this.f122849a.mo15637a(intValue, (bwxs) entry.getValue());
            bjjz bjjz = (bjjz) this.f122850b.mo15646f(intValue);
            if (bjjz != null) {
                if (!z) {
                    ArrayList arrayList = bjjz.f122841d;
                    if (arrayList == null) {
                        z = false;
                    } else if (arrayList.isEmpty()) {
                        z = false;
                    }
                    bjjz.mo65322d();
                    this.f122850b.mo15636a(intValue);
                }
                z = true;
                bjjz.mo65322d();
                this.f122850b.mo15636a(intValue);
            }
        }
        if (z) {
            ArrayList arrayList2 = this.f122851c;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((bjjz) arrayList2.get(i)).mo65321c();
            }
            int c = this.f122850b.mo15640c();
            ArrayList arrayList3 = new ArrayList(c);
            for (int i2 = 0; i2 < c; i2++) {
                arrayList3.add((bjjz) this.f122850b.mo15641c(i2));
            }
            int size2 = arrayList3.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((bjjz) arrayList3.get(i3)).mo65321c();
            }
        }
    }
}
