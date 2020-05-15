package p000;

import android.widget.SectionIndexer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: vnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnw implements SectionIndexer {

    /* renamed from: a */
    private final String[] f49604a;

    /* renamed from: b */
    private final int[] f49605b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    public vnw(List list, List list2) {
        boolean z;
        int size = list2.size();
        this.f49604a = new String[size];
        this.f49605b = new int[size];
        if (size != 0) {
            Iterator it = list.iterator();
            vnx vnx = (vnx) it.next();
            boolean z2 = false;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z3 = true;
                if (i >= size) {
                    break;
                }
                vnx vnx2 = (vnx) list2.get(i);
                int i4 = vnx2.f49607b;
                this.f49604a[i] = vnx2.f49606a;
                this.f49605b[i] = i3;
                i3 = (i2 == 0 ? i3 + 1 : i3) + i4;
                i2 += i4;
                sdo.m34971a(i2 > vnx.f49607b ? false : z3, (Object) "a fast scroller group should never \"straddle\" two display groups");
                if (i2 == vnx.f49607b) {
                    vnx = it.hasNext() ? (vnx) it.next() : null;
                    i2 = 0;
                }
                i++;
            }
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34970a(z);
            sdo.m34970a(vnx == null ? true : z2);
        }
    }

    public final int getPositionForSection(int i) {
        return this.f49605b[i];
    }

    public final int getSectionForPosition(int i) {
        int binarySearch = Arrays.binarySearch(this.f49605b, i);
        return binarySearch < 0 ? (-binarySearch) - 2 : binarySearch;
    }

    public final Object[] getSections() {
        return this.f49604a;
    }
}
