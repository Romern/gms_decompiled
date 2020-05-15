package p000;

import android.app.PendingIntent;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwn implements Iterable, sqt {

    /* renamed from: d */
    private static final Comparator f115516d = new bfwm();

    /* renamed from: a */
    public final bfwh f115517a;

    /* renamed from: b */
    public final bfwk f115518b;

    /* renamed from: c */
    public final ArrayList f115519c;

    /* renamed from: e */
    private final int f115520e;

    public bfwn(int i, bfwk bfwk, ArrayList arrayList, bfwh bfwh) {
        this.f115520e = i;
        this.f115518b = bfwk;
        this.f115519c = arrayList;
        this.f115517a = bfwh;
    }

    /* renamed from: a */
    public final int mo62380a() {
        return this.f115519c.size();
    }

    /* renamed from: b */
    public final List mo62385b() {
        ArrayList arrayList = this.f115519c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f115517a.mo62367a(((bfwf) arrayList.get(i)).f115492j);
        }
        return new ArrayList(this.f115519c);
    }

    /* renamed from: c */
    public final String mo62386c() {
        return this.f115518b.f115511b;
    }

    public final Object clone() {
        int i = this.f115520e;
        bfwk bfwk = this.f115518b;
        return new bfwn(i, new bfwk(bfwk.f115510a, bfwk.f115511b), (ArrayList) this.f115519c.clone(), this.f115517a);
    }

    public final Iterator iterator() {
        return this.f115519c.iterator();
    }

    /* renamed from: j */
    public final int mo9757j() {
        return this.f115520e;
    }

    /* renamed from: k */
    public final String mo9758k() {
        return this.f115518b.f115510a;
    }

    /* renamed from: l */
    public final String mo9759l() {
        return null;
    }

    /* renamed from: m */
    public final String[] mo9760m() {
        return bfwj.f115501a;
    }

    /* renamed from: n */
    public final boolean mo9761n() {
        return false;
    }

    /* renamed from: a */
    public final List mo62381a(PendingIntent pendingIntent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f115519c.iterator();
        while (it.hasNext()) {
            bfwf bfwf = (bfwf) it.next();
            if (bfwf.f115484b.equals(pendingIntent)) {
                this.f115517a.mo62367a(bfwf.f115492j);
                arrayList.add(bfwf);
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo62382a(List list) {
        Iterator it = this.f115519c.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            bfwf bfwf = (bfwf) it.next();
            if (list.contains(bfwf.f115483a.f79438a)) {
                this.f115517a.mo62367a(bfwf.f115492j);
                arrayList.add(bfwf);
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo62383a(bfwf bfwf) {
        int binarySearch = Collections.binarySearch(this.f115519c, bfwf, f115516d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f115519c.add(binarySearch, bfwf);
        this.f115517a.mo62368a(bfwf.f115492j, bfwf);
    }

    /* renamed from: a */
    public final void mo62384a(PrintWriter printWriter) {
        printWriter.print("Package: ");
        printWriter.print(this.f115518b.f115510a);
        String str = this.f115518b.f115511b;
        if (str != null && !str.isEmpty()) {
            String valueOf = String.valueOf(this.f115518b.f115511b);
            printWriter.print(valueOf.length() == 0 ? new String("  Tag: ") : "  Tag: ".concat(valueOf));
        }
        printWriter.print(", count: ");
        printWriter.print(mo62380a());
        ArrayList arrayList = this.f115519c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            printWriter.print("\n    ");
            printWriter.print(((bfwf) arrayList.get(i)).toString());
        }
    }
}
