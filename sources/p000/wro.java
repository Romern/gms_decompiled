package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: wro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wro extends becg {

    /* renamed from: a */
    public static wro f51196a;

    /* renamed from: b */
    private static final bnic f51197b = bnic.m109495a((Collection) cdti.m134924b().f181708a);

    /* renamed from: c */
    private static final bnic f51198c;

    /* renamed from: d */
    private static final bnic f51199d = bnic.m109495a((Collection) cdti.m134924b().f181710c);

    /* renamed from: e */
    private static final bnic f51200e = bnic.m109495a((Collection) cdti.m134924b().f181711d);

    static {
        bxwc bxwc = cdti.m134924b().f181709b;
        ArrayList arrayList = new ArrayList();
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((cdtm) bxwc.get(i)).f181705a);
        }
        f51198c = bnic.m109495a((Collection) arrayList);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29318a(String str) {
        Uri parse = Uri.parse(str);
        if (!parse.isAbsolute() || !parse.isHierarchical()) {
            return false;
        }
        if (f51197b.contains(parse.getHost())) {
            if (f51198c.contains(parse.getPathSegments())) {
                return false;
            }
            return true;
        } else if (f51199d.contains(parse.getHost())) {
            return true;
        } else {
            String uri = parse.toString();
            bnrd a = f51200e.iterator();
            while (a.hasNext()) {
                if (uri.startsWith((String) a.next())) {
                    return true;
                }
            }
            return false;
        }
    }
}
