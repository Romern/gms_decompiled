package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bxwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwn extends bxwp {

    /* renamed from: c */
    private static final Class f164999c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* renamed from: a */
    private static List m124110a(Object obj, long j, int i) {
        List list;
        List c = m124111c(obj, j);
        if (c.isEmpty()) {
            if (c instanceof bxwm) {
                list = new bxwl(i);
            } else if (!(c instanceof bxxl) || !(c instanceof bxwc)) {
                list = new ArrayList(i);
            } else {
                list = ((bxwc) c).mo73731c(i);
            }
            bxyx.m124506a(obj, j, list);
            return list;
        } else if (f164999c.isAssignableFrom(c.getClass())) {
            ArrayList arrayList = new ArrayList(c.size() + i);
            arrayList.addAll(c);
            bxyx.m124506a(obj, j, arrayList);
            return arrayList;
        } else if (c instanceof bxyr) {
            bxwl bxwl = new bxwl(c.size() + i);
            bxwl.addAll((bxyr) c);
            bxyx.m124506a(obj, j, bxwl);
            return bxwl;
        } else if (!(c instanceof bxxl) || !(c instanceof bxwc)) {
            return c;
        } else {
            bxwc bxwc = (bxwc) c;
            if (bxwc.mo73666a()) {
                return c;
            }
            bxwc c2 = bxwc.mo73731c(c.size() + i);
            bxyx.m124506a(obj, j, c2);
            return c2;
        }
    }

    /* renamed from: c */
    static List m124111c(Object obj, long j) {
        return (List) bxyx.m124518f(obj, j);
    }

    /* renamed from: b */
    public final void mo74197b(Object obj, long j) {
        Object obj2;
        List list = (List) bxyx.m124518f(obj, j);
        if (list instanceof bxwm) {
            obj2 = ((bxwm) list).mo74192e();
        } else if (f164999c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof bxxl) || !(list instanceof bxwc)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                bxwc bxwc = (bxwc) list;
                if (bxwc.mo73666a()) {
                    bxwc.mo73671b();
                    return;
                }
                return;
            }
        }
        bxyx.m124506a(obj, j, obj2);
    }

    /* renamed from: a */
    public final List mo74195a(Object obj, long j) {
        return m124110a(obj, j, 10);
    }

    /* renamed from: a */
    public final void mo74196a(Object obj, Object obj2, long j) {
        List c = m124111c(obj2, j);
        List a = m124110a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        bxyx.m124506a(obj, j, c);
    }
}
