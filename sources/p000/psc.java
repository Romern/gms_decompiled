package p000;

import com.google.android.gms.cast.MediaQueueItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: psc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class psc extends psl {

    /* renamed from: a */
    final /* synthetic */ psd f40127a;

    public psc(psd psd) {
        this.f40127a = psd;
    }

    /* renamed from: a */
    public final void mo23277a() {
        long d = this.f40127a.mo23592d();
        psd psd = this.f40127a;
        if (d != psd.f40129b) {
            psd.f40129b = d;
            psd.mo23589a();
            psd psd2 = this.f40127a;
            if (psd2.f40129b != 0) {
                psd2.mo23590b();
            }
        }
    }

    /* renamed from: b */
    public final void mo23587b(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.f40127a.f40133f.remove(Integer.valueOf(i2));
            int i3 = this.f40127a.f40132e.get(i2, -1);
            if (i3 != -1) {
                arrayList.add(Integer.valueOf(i3));
                i++;
            } else {
                this.f40127a.mo23590b();
                return;
            }
        }
        Collections.sort(arrayList);
        this.f40127a.mo23594f();
        psd psd = this.f40127a;
        ptk.m31237a(arrayList);
        psd.mo23597i();
        this.f40127a.mo23595g();
    }

    /* renamed from: c */
    public final void mo23588c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.f40127a.f40133f.remove(Integer.valueOf(i2));
            int i3 = this.f40127a.f40132e.get(i2, -1);
            if (i3 != -1) {
                this.f40127a.f40132e.delete(i2);
                arrayList.add(Integer.valueOf(i3));
                i++;
            } else {
                this.f40127a.mo23590b();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            this.f40127a.mo23594f();
            this.f40127a.f40131d.removeAll(ptk.m31231a(iArr));
            this.f40127a.mo23593e();
            psd psd = this.f40127a;
            ptk.m31237a(arrayList);
            Iterator it = psd.f40138k.iterator();
            if (!it.hasNext()) {
                this.f40127a.mo23595g();
            } else {
                psb psb = (psb) it.next();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo23584a(int[] iArr) {
        List a = ptk.m31231a(iArr);
        if (!this.f40127a.f40131d.equals(a)) {
            this.f40127a.mo23594f();
            this.f40127a.f40133f.evictAll();
            this.f40127a.f40134g.clear();
            psd psd = this.f40127a;
            psd.f40131d = a;
            psd.mo23593e();
            this.f40127a.mo23596h();
            this.f40127a.mo23595g();
        }
    }

    /* renamed from: a */
    public final void mo23585a(int[] iArr, int i) {
        int i2;
        if (i != 0) {
            i2 = this.f40127a.f40132e.get(i, -1);
            if (i2 == -1) {
                this.f40127a.mo23590b();
                return;
            }
        } else {
            i2 = this.f40127a.f40131d.size();
        }
        this.f40127a.mo23594f();
        this.f40127a.f40131d.addAll(i2, ptk.m31231a(iArr));
        this.f40127a.mo23593e();
        Iterator it = this.f40127a.f40138k.iterator();
        if (!it.hasNext()) {
            this.f40127a.mo23595g();
        } else {
            psb psb = (psb) it.next();
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo23586a(MediaQueueItem[] mediaQueueItemArr) {
        HashSet hashSet = new HashSet();
        this.f40127a.f40134g.clear();
        int length = mediaQueueItemArr.length;
        int i = 0;
        while (i < length) {
            MediaQueueItem mediaQueueItem = mediaQueueItemArr[i];
            int i2 = mediaQueueItem.f29801b;
            this.f40127a.f40133f.put(Integer.valueOf(i2), mediaQueueItem);
            int i3 = this.f40127a.f40132e.get(i2, -1);
            if (i3 != -1) {
                hashSet.add(Integer.valueOf(i3));
                i++;
            } else {
                this.f40127a.mo23590b();
                return;
            }
        }
        List list = this.f40127a.f40134g;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = this.f40127a.f40132e.get(((Integer) list.get(i4)).intValue(), -1);
            if (i5 != -1) {
                hashSet.add(Integer.valueOf(i5));
            }
        }
        this.f40127a.f40134g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f40127a.mo23594f();
        psd psd = this.f40127a;
        ptk.m31237a(arrayList);
        psd.mo23597i();
        this.f40127a.mo23595g();
    }
}
