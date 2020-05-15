package p000;

import java.util.Iterator;

/* renamed from: bfce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfce {

    /* renamed from: a */
    public final bezl f113378a;

    /* renamed from: b */
    public final bznt f113379b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.b(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.b(int, int):void
      bmxy.b(boolean, java.lang.Object):void */
    public bfce(bezl bezl, bznt bznt) {
        bznr bznr = bznr.values()[bznr.values().length - 1];
        bmxy.m108601b(true, (Object) "Enum cannot fit into a byte.");
        this.f113378a = bezl;
        this.f113379b = bznt;
    }

    /* renamed from: a */
    public static boolean m96330a(bznr bznr) {
        return bznr == bznr.CLUTTER_TREE || bznr == bznr.CLUTTER_BUILDING || bznr == bznr.CLUTTER_CORNER || bznr == bznr.CLUTTER_EDGE;
    }

    /* renamed from: b */
    public static int m96331b(bznr bznr) {
        if (bznr != bznr.CLUTTER_CORNER) {
            return bznr != bznr.CLUTTER_EDGE ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public final double mo61380a() {
        bezl bezl = this.f113378a;
        double d = (double) bezl.f113155a;
        double a = bezl.mo61294a();
        Double.isNaN(d);
        double d2 = d * a;
        double d3 = (double) this.f113378a.f113157c;
        Double.isNaN(d3);
        return d2 * d3;
    }

    /* renamed from: b */
    public final double mo61382b() {
        bezl bezl = this.f113378a;
        double d = (double) bezl.f113156b;
        double a = bezl.mo61294a();
        Double.isNaN(d);
        double d2 = d * a;
        double d3 = (double) this.f113378a.f113157c;
        Double.isNaN(d3);
        return d2 * d3;
    }

    /* renamed from: a */
    public final Iterator mo61381a(bnvk bnvk) {
        return new bfcd(this, bnvk);
    }
}
