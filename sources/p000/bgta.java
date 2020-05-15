package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: bgta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgta implements bgtk {

    /* renamed from: a */
    private final sqv f117470a;

    /* renamed from: b */
    private final bgsy f117471b;

    /* renamed from: c */
    private final List f117472c;

    /* renamed from: d */
    private int f117473d;

    public bgta(sqv sqv, List list, long[] jArr, bgsy bgsy) {
        this.f117470a = sqv;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new bgsz((bgsv) list.get(i)));
        }
        Collections.sort(arrayList, bgsu.f117460a);
        if (jArr != null) {
            Arrays.sort(jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((bgsz) arrayList.get(i3)).mo63141a(jArr[i2]);
                }
            }
        }
        this.f117472c = arrayList;
        this.f117471b = bgsy;
    }

    /* renamed from: a */
    public static bgta m99876a(String str, sqv sqv, bngx bngx, Executor executor) {
        long[] jArr;
        bgsy bgsy = new bgsy(executor, str);
        try {
            bgdv bgdv = (bgdv) bgsy.f117466b.mo60776a().get();
            jArr = new long[bgdv.f116184a.size()];
            for (int i = 0; i < bgdv.f116184a.size(); i++) {
                jArr[i] = bgdv.f116184a.mo74160a(i);
            }
            Arrays.sort(jArr);
        } catch (InterruptedException | ExecutionException e) {
            jArr = null;
        }
        Arrays.toString(jArr);
        return new bgta(sqv, bngx, jArr, bgsy);
    }

    /* renamed from: b */
    public final long mo63144b(Runnable runnable) {
        long a = mo63142a();
        if (a > 0) {
            return a;
        }
        mo63143a(runnable);
        return 0;
    }

    /* renamed from: a */
    public static bgta m99877a(String str, sqv sqv, String str2, Executor executor) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : bmyx.m108640a(',').mo66925c((CharSequence) str2)) {
            List c = bmyx.m108640a(':').mo66925c((CharSequence) str3);
            c.get(0);
            c.get(1);
            arrayList.add(new bgsv(Long.parseLong((String) c.get(0)), Integer.parseInt((String) c.get(1))));
        }
        return m99876a(str, sqv, bngx.m109368a((Collection) arrayList), executor);
    }

    /* renamed from: a */
    public final long mo63142a() {
        long j;
        long a = this.f117470a.mo20505a() / 1000;
        List list = this.f117472c;
        int size = list.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            bgsz bgsz = (bgsz) list.get(i);
            long j3 = a - bgsz.f117468b[bgsz.f117469c];
            long j4 = bgsz.f117467a.f117461a;
            if (j3 < j4) {
                j = j4 - j3;
            } else {
                j = 0;
            }
            j2 = Math.max(j2, j);
        }
        return j2;
    }

    /* renamed from: a */
    public final boolean mo63143a(Runnable runnable) {
        long a = this.f117470a.mo20505a() / 1000;
        List list = this.f117472c;
        int size = list.size();
        int i = 0;
        while (i < size) {
            bgsz bgsz = (bgsz) list.get(i);
            i++;
            if (a - bgsz.f117468b[bgsz.f117469c] < bgsz.f117467a.f117461a) {
                this.f117473d++;
                mo63142a();
                return false;
            }
        }
        List list2 = this.f117472c;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bgsz) list2.get(i2)).mo63141a(a);
        }
        runnable.run();
        if (!this.f117472c.isEmpty()) {
            bgsy bgsy = this.f117471b;
            long[] jArr = ((bgsz) this.f117472c.get(0)).f117468b;
            Arrays.toString(jArr);
            bxvd da = bgdv.f116182b.mo74144da();
            for (long j : jArr) {
                if (j > 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bgdv bgdv = (bgdv) da.f164949b;
                    if (!bgdv.f116184a.mo73666a()) {
                        bgdv.f116184a = GeneratedMessageLite.m124020a(bgdv.f116184a);
                    }
                    bgdv.f116184a.mo74161a(j);
                }
            }
            bqgg a2 = bgsy.f117466b.mo60778a(new bgsw((bgdv) da.mo74062i()), bgsy.f117465a);
            a2.mo741a(bljx.m107269a(new bgsx(a2)), bqfb.INSTANCE);
        }
        return true;
    }
}
