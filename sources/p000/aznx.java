package p000;

import android.content.Context;
import android.database.Cursor;
import android.util.LruCache;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: aznx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aznx {

    /* renamed from: a */
    public final Context f99758a;

    /* renamed from: b */
    public Activity f99759b;

    /* renamed from: c */
    public azcb f99760c;

    /* renamed from: d */
    public final azmy f99761d;

    /* renamed from: e */
    public Map f99762e;

    /* renamed from: f */
    public Map f99763f;

    /* renamed from: g */
    public azmz f99764g = new azmz(0, null, -1, null, null, null);

    /* renamed from: h */
    public final LruCache f99765h = new LruCache(20);

    /* renamed from: i */
    public final Map f99766i;

    /* renamed from: j */
    public aznf f99767j;

    /* renamed from: k */
    private final aznz f99768k;

    /* renamed from: l */
    private final aznj f99769l;

    /* renamed from: m */
    private final aznd f99770m;

    /* renamed from: n */
    private final azni f99771n;

    /* renamed from: o */
    private final azng f99772o;

    protected aznx(Activity activity, azcb azcb, azmy azmy, Map map, aznj aznj, aznz aznz) {
        azmy azmy2 = azmy;
        this.f99758a = activity.getApplicationContext();
        this.f99759b = activity;
        this.f99760c = azcb;
        this.f99761d = azmy2;
        this.f99768k = aznz;
        this.f99769l = aznj;
        this.f99766i = new TreeMap();
        this.f99762e = map;
        this.f99763f = this.f99760c.mo54596i();
        this.f99770m = new aznd(this.f99758a, aznz);
        this.f99771n = new azni();
        Integer num = this.f99760c.f98954d;
        this.f99767j = new aznf(azmy2, (num == null ? Integer.valueOf(C1133kh.m17843b(this.f99758a, C0126R.color.ms_read_receipt)) : num).intValue());
        this.f99772o = new azng();
    }

    /* renamed from: b */
    static final int m85878b(Cursor cursor) {
        String string = cursor.getString(9);
        cursor.getInt(3);
        int i = cursor.getInt(5);
        if (azoy.m85984a(string)) {
            return 0;
        }
        if (azoy.m85987c(string)) {
            return ((long) i) != -2 ? 1 : 4;
        }
        if (azoy.m85994j(string) || azoy.m85995k(string)) {
            return 3;
        }
        return 4;
    }

    /* renamed from: a */
    public final aznk mo55101a(int i) {
        aznf aznf;
        aznf aznf2;
        int i2 = i;
        if (i2 == 0) {
            aznt aznt = new aznt(this.f99759b, this.f99760c, this.f99761d, this.f99768k, this.f99764g, this.f99770m, this.f99771n, this.f99767j, this.f99772o);
            this.f99766i.put(Integer.valueOf(i), new WeakReference(aznt));
            return aznt;
        } else if (i2 == 1) {
            Activity activity = this.f99759b;
            azcb azcb = this.f99760c;
            azmy azmy = this.f99761d;
            aznz aznz = this.f99768k;
            azmz azmz = this.f99764g;
            LruCache lruCache = this.f99765h;
            aznd aznd = this.f99770m;
            azni azni = this.f99771n;
            if (!cfeo.m138881l()) {
                aznf = this.f99767j;
            } else {
                aznf = null;
            }
            aznr aznr = new aznr(activity, azcb, azmy, aznz, azmz, lruCache, aznd, azni, aznf, this.f99772o);
            this.f99766i.put(Integer.valueOf(i), new WeakReference(aznr));
            return aznr;
        } else if (i2 == 3) {
            aznu aznu = new aznu(this.f99759b, this.f99760c, this.f99761d, this.f99765h, this.f99762e, this.f99763f, this.f99764g, this.f99768k);
            this.f99766i.put(Integer.valueOf(i), new WeakReference(aznu));
            return aznu;
        } else if (i2 != 4) {
            return null;
        } else {
            Activity activity2 = this.f99759b;
            azcb azcb2 = this.f99760c;
            azmy azmy2 = this.f99761d;
            aznz aznz2 = this.f99768k;
            azmz azmz2 = this.f99764g;
            LruCache lruCache2 = this.f99765h;
            Map map = this.f99762e;
            aznd aznd2 = this.f99770m;
            azni azni2 = this.f99771n;
            if (!cfeo.m138881l()) {
                aznf2 = this.f99767j;
            } else {
                aznf2 = null;
            }
            aznw aznw = new aznw(activity2, azcb2, azmy2, aznz2, azmz2, lruCache2, map, aznd2, azni2, aznf2, this.f99769l, this.f99772o);
            this.f99766i.put(Integer.valueOf(i), new WeakReference(aznw));
            return aznw;
        }
    }

    /* renamed from: a */
    public final aznk mo55102a(Cursor cursor) {
        int b = m85878b(cursor);
        WeakReference weakReference = (WeakReference) this.f99766i.get(Integer.valueOf(b));
        if (weakReference == null || weakReference.get() == null) {
            return mo55101a(b);
        }
        return (aznk) weakReference.get();
    }
}
