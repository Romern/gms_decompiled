package p000;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ajgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajgu {

    /* renamed from: a */
    public final Map f70592a = new HashMap();

    /* renamed from: b */
    public final Context f70593b;

    /* renamed from: c */
    public final buqh f70594c;

    /* renamed from: d */
    public ajgt f70595d;

    /* renamed from: e */
    private long f70596e;

    /* renamed from: f */
    private final ajat f70597f;

    public ajgu(Context context) {
        this.f70593b = context;
        this.f70597f = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70596e = SystemClock.elapsedRealtime();
        this.f70594c = (buqh) ahgz.m55754a(context, buqh.class);
    }

    /* renamed from: b */
    public static boolean m58687b(ahfv ahfv) {
        return ahfv != null && !TextUtils.isEmpty(ahfv.mo36407a());
    }

    /* renamed from: a */
    public final void mo38618a() {
        this.f70594c.mo72984b();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byym byym = this.f70597f.f70278f.f168926i;
        if (byym == null) {
            byym = byym.f168972f;
        }
        if (elapsedRealtime - this.f70596e >= byym.f168975b) {
            this.f70596e = elapsedRealtime;
            Iterator it = this.f70592a.values().iterator();
            while (it.hasNext()) {
                if (elapsedRealtime > ((ajgv) it.next()).f70598a) {
                    it.remove();
                }
            }
            ajgt ajgt = this.f70595d;
            if (ajgt != null && elapsedRealtime > ajgt.f70591d) {
                mo38621b();
            }
        }
    }

    /* renamed from: b */
    public final void mo38621b() {
        this.f70595d = null;
    }

    /* renamed from: a */
    public final void mo38619a(ahfv ahfv) {
        this.f70594c.mo72984b();
        this.f70592a.put(ahfv, new ajgv(ahfv, ((ajat) ahgz.m55754a(this.f70593b, ajat.class)).f70278f));
    }

    /* renamed from: a */
    public final void mo38620a(ahfv ahfv, byzy byzy) {
        this.f70594c.mo72984b();
        if (this.f70592a.containsKey(ahfv)) {
            ajgv ajgv = (ajgv) this.f70592a.get(ahfv);
            if (byzy != null && byzy.f169195c.size() != 0) {
                bxwc bxwc = byzy.f169195c;
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    byzz byzz = (byzz) bxwc.get(i);
                    long currentTimeMillis = System.currentTimeMillis();
                    bxvd bxvd = (bxvd) byzz.mo74142c(5);
                    bxvd.mo73625a((bxvk) byzz);
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    byzz byzz2 = (byzz) bxvd.f164949b;
                    byzz byzz3 = byzz.f169196e;
                    byzz2.f169198a |= 4;
                    byzz2.f169201d = currentTimeMillis;
                    byzz byzz4 = (byzz) bxvd.mo74062i();
                    bzbu bzbu = bzbu.TOKEN_MEDIUM_UNKNOWN;
                    bzbu a = bzbu.m125627a(byzz4.f169199b);
                    if (a == null) {
                        a = bzbu.TOKEN_MEDIUM_UNKNOWN;
                    }
                    int ordinal = a.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ajgv.mo38623a(ajgv.f70602e);
                            ajgv.f70602e.add(byzz4);
                        } else if (ordinal == 3 || ordinal == 6) {
                            ajgv.mo38623a(ajgv.f70601d);
                            ajgv.f70601d.add(byzz4);
                        } else if (ordinal != 8) {
                        }
                    }
                    ajgv.mo38623a(ajgv.f70600c);
                    ajgv.f70600c.add(byzz4);
                }
            }
        }
    }
}
