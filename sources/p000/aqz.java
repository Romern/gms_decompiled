package p000;

import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.List;

/* renamed from: aqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aqz {

    /* renamed from: f */
    public SliceItem f2043f;

    public aqz(Slice slice) {
        List c = slice.mo2046c();
        m1893a(new SliceItem(slice, "slice", null, (String[]) c.toArray(new String[c.size()])));
    }

    /* renamed from: a */
    private final void m1893a(SliceItem sliceItem) {
        this.f2043f = sliceItem;
        if ("slice".equals(sliceItem.f1657b) || "action".equals(sliceItem.f1657b)) {
            aqq.m1869a(sliceItem.mo2056f(), "int", "color", (String[]) null);
            aqq.m1869a(sliceItem.mo2056f(), "int", "layout_direction", (String[]) null);
        }
        aqq.m1872a(sliceItem, "text", "content_description");
    }

    /* renamed from: a */
    public boolean mo2306a() {
        return this.f2043f != null;
    }

    public aqz(SliceItem sliceItem) {
        if (sliceItem != null) {
            m1893a(sliceItem);
        }
    }
}
