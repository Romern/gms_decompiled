package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.internal.PlaceEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: aepd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepd {

    /* renamed from: f */
    public static final aepd f63579f = new aepd(1, null, Collections.emptyList(), -1, null);

    /* renamed from: g */
    public static final aepd f63580g = new aepd(2, null, Collections.emptyList(), -1, null);

    /* renamed from: a */
    public final int f63581a;

    /* renamed from: b */
    public final Status f63582b;

    /* renamed from: c */
    public final List f63583c;

    /* renamed from: d */
    public final int f63584d;

    /* renamed from: e */
    public final aelh f63585e;

    public aepd(int i, Status status, List list, int i2, aelh aelh) {
        this.f63581a = i;
        this.f63582b = status;
        this.f63583c = list;
        this.f63584d = i2;
        this.f63585e = aelh;
    }

    /* renamed from: a */
    public static aepd m52332a(aekx aekx) {
        ArrayList arrayList;
        int i;
        Status bo = aekx.mo7183bo();
        if (bo.mo17710c()) {
            ArrayList arrayList2 = new ArrayList(aekx.mo24660a());
            Iterator it = aekx.iterator();
            while (it.hasNext()) {
                aekw aekw = (aekw) it.next();
                if (aekw.mo34282d() != null && aekw.mo34282d().length() > 0) {
                    arrayList2.add((aekw) aekw.mo7556bF());
                }
            }
            arrayList = arrayList2;
            i = 5;
        } else {
            arrayList = Collections.emptyList();
            i = 4;
        }
        return new aepd(i, bo, arrayList, -1, null);
    }

    /* renamed from: a */
    public final boolean mo34415a() {
        int i = this.f63581a;
        return i == 6 || i == 7 || i == 8;
    }

    /* renamed from: a */
    public static aepd m52333a(aepd aepd, int i) {
        return new aepd(6, null, aepd.f63583c, i, null);
    }

    /* renamed from: a */
    public static aepd m52334a(aepd aepd, aeli aeli) {
        PlaceEntity placeEntity;
        int i;
        if (aepd.f63581a != 6) {
            return aepd;
        }
        Status status = aeli.f63490b;
        if (!status.mo17710c() || aeli.mo24660a() != 1) {
            placeEntity = null;
            i = 7;
        } else {
            placeEntity = ((aeoj) aeli.mo24661a(0)).mo7556bF();
            i = 8;
        }
        return new aepd(i, status, aepd.f63583c, aepd.f63584d, placeEntity);
    }
}
