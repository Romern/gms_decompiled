package p000;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: behs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behs implements beez {
    private behs() {
    }

    /* renamed from: a */
    public static behs m95063a() {
        return new behs();
    }

    /* renamed from: b */
    public static final InputStream m95064b(beey beey) {
        beev beev;
        InputStream b = beey.f111468b.mo36264b(beey.f111472f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b);
        if (!beey.f111470d.isEmpty()) {
            List list = beey.f111470d;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                beia a = ((beib) list.get(i)).mo56097a();
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                beev = new beev(b, arrayList2);
            } else {
                beev = null;
            }
            if (beev != null) {
                arrayList.add(beev);
            }
        }
        List list2 = beey.f111469c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(((beid) list2.get(i2)).mo60716a(beey.f111471e, (InputStream) bnjd.m109595d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (beer beer : beey.f111473g) {
            beer.mo60627a(arrayList);
        }
        return (InputStream) arrayList.get(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        return m95064b(beey);
    }
}
