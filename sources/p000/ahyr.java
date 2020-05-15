package p000;

import android.content.Context;
import android.util.LruCache;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ahyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahyr {

    /* renamed from: a */
    public final AtomicInteger f68367a = new AtomicInteger(19729255);

    /* renamed from: b */
    public final LruCache f68368b = new LruCache((int) cfog.m141292t());

    /* renamed from: c */
    public final LruCache f68369c = new LruCache((int) cfog.m141292t());

    /* renamed from: d */
    public final Context f68370d;

    /* renamed from: e */
    public final ahyp f68371e;

    /* renamed from: f */
    public final ahys f68372f;

    /* renamed from: g */
    public final ahgp f68373g;

    /* renamed from: h */
    public final ahyo f68374h;

    /* renamed from: i */
    public final buqh f68375i;

    /* renamed from: j */
    public final ahsi f68376j;

    /* renamed from: k */
    public final burh f68377k;

    /* renamed from: l */
    public final sqv f68378l;

    public ahyr(Context context) {
        ahyp ahyp = new ahyp(context);
        ahys ahys = new ahys(context);
        ahyo ahyo = new ahyo(context);
        this.f68370d = context;
        this.f68373g = (ahgp) ahgz.m55754a(context, ahgp.class);
        this.f68371e = ahyp;
        this.f68372f = ahys;
        this.f68374h = ahyo;
        this.f68375i = (buqh) ahgz.m55754a(context, buqh.class);
        this.f68376j = (ahsi) ahgz.m55754a(context, ahsi.class);
        this.f68377k = (burh) ahgz.m55754a(context, burh.class);
        this.f68378l = (sqv) ahgz.m55754a(context, sqv.class);
    }

    /* renamed from: a */
    public final void mo37303a(int i) {
        srn srn = ahsd.f67925a;
        this.f68373g.mo36449a(i);
        this.f68371e.mo37298a(i, 6);
    }

    /* renamed from: a */
    public final void mo37304a(String str) {
        Integer num = (Integer) this.f68368b.get(str);
        srn srn = ahsd.f67925a;
        if (num != null) {
            this.f68371e.mo37301b(num.intValue());
            this.f68368b.remove(str);
        }
    }
}
