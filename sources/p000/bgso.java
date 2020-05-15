package p000;

import android.content.Context;
import android.location.Location;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/* renamed from: bgso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgso extends bgtf {

    /* renamed from: a */
    private final Context f117444a;

    /* renamed from: b */
    private final Random f117445b;

    /* renamed from: c */
    private final bgsp f117446c;

    /* renamed from: d */
    private bgsn f117447d;

    /* renamed from: e */
    private bfoc f117448e;

    static {
        srn.m36125a("EAlert");
    }

    public bgso(Context context, Random random, bgsp bgsp) {
        super("EARegion");
        this.f117444a = context;
        this.f117445b = random;
        this.f117446c = bgsp;
    }

    /* renamed from: a */
    static void m99865a(Context context) {
        if (cevi.f183455a.mo6606a().alwaysCheckStaleFile()) {
            try {
                buil b = bfoc.m97398a(context, cevi.m138291f()).mo62030b(context);
                if (b != null && System.currentTimeMillis() - b.f153952b > cevi.m138296k()) {
                    bfoc.m97400c(context);
                }
            } catch (bfof e) {
            }
        }
    }

    /* renamed from: b */
    public final void mo63113b() {
        if (this.f117448e != null) {
            try {
                bfoc.m97400c(this.f117444a);
            } catch (bfof e) {
            }
            this.f117448e = null;
        }
        this.f117447d = null;
    }

    /* renamed from: a */
    public final void mo63111a() {
        this.f117447d = new bgsn(this.f117445b, (int) cevi.f183455a.mo6606a().numSupplementalRegions(), (int) cevi.m138297l());
        try {
            this.f117448e = bfoc.m97398a(this.f117444a, cevi.m138291f());
            this.f117482h.f117486b.mo63147a(6, 0);
            this.f117482h.f117486b.mo63147a(3, 0);
        } catch (bfof e) {
            this.f117482h.mo63154b();
        }
    }

    /* renamed from: a */
    public final boolean mo63112a(Message message) {
        ArrayList arrayList;
        int i = message.what;
        if (i == 3) {
            Location d = this.f117446c.mo63133d();
            if (d != null) {
                bgsn bgsn = this.f117447d;
                long a = ayvd.m84899a(ayvd.m84895a(d.getLatitude(), d.getLongitude()), bgsn.f117440b);
                if (a != bgsn.f117441c || (arrayList = bgsn.f117442d) == null) {
                    HashSet<Long> hashSet = new HashSet(bgsn.f117439a + 1);
                    hashSet.add(Long.valueOf(a));
                    while (hashSet.size() < bgsn.f117439a + 1) {
                        hashSet.add(Long.valueOf(ayvd.m84899a(ayvd.m84895a(bgsn.mo63136a(90.0d), bgsn.mo63136a(180.0d)), bgsn.f117440b)));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Long l : hashSet) {
                        String valueOf = String.valueOf(ayvd.m84918d(l.longValue()));
                        arrayList2.add(valueOf.length() == 0 ? new String("ea.") : "ea.".concat(valueOf));
                    }
                    arrayList2.toString();
                    bgsn.f117441c = a;
                    bgsn.f117442d = arrayList2;
                    arrayList = arrayList2;
                }
                try {
                    this.f117448e.mo62029a(this.f117444a, arrayList);
                } catch (bfof e) {
                }
            }
            this.f117482h.f117486b.mo63147a(3, cevi.f183455a.mo6606a().regionSupplierIntervalMillis());
            return true;
        } else if (i != 6) {
            return false;
        } else {
            m99865a(this.f117444a);
            this.f117482h.f117486b.mo63147a(6, cevi.m138296k());
            return true;
        }
    }
}
