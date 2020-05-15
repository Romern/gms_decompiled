package p000;

import android.widget.GridLayout;

/* renamed from: bjki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjki {
    /* renamed from: a */
    public static GridLayout.Spec m103771a(bwwy bwwy, bwxf bwxf) {
        GridLayout.Alignment alignment;
        bwwy bwwy2 = bwwy.ALIGNMENT_UNKNOWN;
        switch (bwwy.ordinal()) {
            case 2:
                alignment = GridLayout.START;
                break;
            case 3:
                alignment = GridLayout.END;
                break;
            case 4:
                alignment = GridLayout.CENTER;
                break;
            case 5:
            case 6:
                alignment = GridLayout.BASELINE;
                break;
            case 7:
                throw new IllegalArgumentException("Stretch not yet supported");
            default:
                alignment = null;
                break;
        }
        int i = bwxf.f161342a;
        int i2 = i & 1;
        int i3 = i & 2;
        if (i2 != 0 && alignment != null && i3 != 0) {
            return GridLayout.spec(bwxf.f161343b, bwxf.f161344c, alignment);
        }
        if (i2 != 0 && alignment != null) {
            return GridLayout.spec(bwxf.f161343b, alignment);
        }
        if (i2 != 0 && i3 != 0) {
            return GridLayout.spec(bwxf.f161343b, bwxf.f161344c);
        }
        if (i2 != 0) {
            return GridLayout.spec(bwxf.f161343b);
        }
        return GridLayout.spec(Integer.MIN_VALUE);
    }
}
