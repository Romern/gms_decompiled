package p000;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: behw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behw implements beez {
    private behw() {
    }

    /* renamed from: a */
    public static behw m95072a() {
        return new behw();
    }

    /* renamed from: b */
    public static final OutputStream m95073b(beey beey) {
        beew beew;
        OutputStream c = beey.f111468b.mo36265c(beey.f111472f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c);
        if (!beey.f111470d.isEmpty()) {
            List list = beey.f111470d;
            Uri uri = beey.f111471e;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                behl a = ((beib) list.get(i)).mo56096a(uri);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
            if (!arrayList2.isEmpty()) {
                beew = new beew(c, arrayList2);
            } else {
                beew = null;
            }
            if (beew != null) {
                arrayList.add(beew);
            }
        }
        List list2 = beey.f111469c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(((beid) list2.get(i2)).mo60717a(beey.f111471e, (OutputStream) bnjd.m109595d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (beer beer : beey.f111473g) {
            beer.mo60628b(arrayList);
        }
        return (OutputStream) arrayList.get(0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        return m95073b(beey);
    }
}
