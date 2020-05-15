package p000;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: behm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behm implements beez {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        beew beew;
        OutputStream e = beey.f111468b.mo36267e(beey.f111472f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(e);
        if (!beey.f111470d.isEmpty()) {
            List list = beey.f111470d;
            Uri uri = beey.f111471e;
            ArrayList arrayList2 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                behl b = ((beib) list.get(i)).mo56100b(uri);
                if (b != null) {
                    arrayList2.add(b);
                }
            }
            if (!arrayList2.isEmpty()) {
                beew = new beew(e, arrayList2);
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
            arrayList.add(((beid) list2.get(i2)).mo60718a((OutputStream) bnjd.m109595d(arrayList)));
        }
        Collections.reverse(arrayList);
        for (beer beer : beey.f111473g) {
            beer.mo60628b(arrayList);
        }
        return (OutputStream) arrayList.get(0);
    }
}
