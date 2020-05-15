package p000;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: hdz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hdz {

    /* renamed from: a */
    public final Runnable f19560a;

    /* renamed from: b */
    public final C1228nu f19561b;

    /* renamed from: c */
    public final List f19562c = new ArrayList();

    /* renamed from: d */
    public Object f19563d;

    /* renamed from: e */
    private final Object f19564e;

    /* renamed from: f */
    private final bnhe f19565f;

    /* renamed from: g */
    private final qws f19566g;

    /* renamed from: h */
    private final String f19567h;

    /* renamed from: i */
    private final sqe f19568i;

    /* renamed from: j */
    private final Executor f19569j = new sty(new adzt(Looper.getMainLooper()));

    /* renamed from: k */
    private boolean f19570k;

    /* renamed from: l */
    private long f19571l;

    /* renamed from: m */
    private bqgy f19572m;

    /* renamed from: n */
    private final Object f19573n = new Object();

    /* renamed from: o */
    private bqgy f19574o;

    public hdz(Object obj, Map map, Runnable runnable, C1228nu nuVar, qws qws, String str, sqe sqe) {
        bmxy.m108581a(obj);
        this.f19564e = obj;
        bmxy.m108581a(map);
        this.f19565f = bnhe.m109413a(map);
        bmxy.m108581a(runnable);
        this.f19560a = runnable;
        bmxy.m108581a(nuVar);
        this.f19561b = nuVar;
        bmxy.m108581a(qws);
        this.f19566g = qws;
        bmxy.m108581a(str);
        this.f19567h = str;
        bmxy.m108581a(sqe);
        this.f19568i = sqe;
    }

    /* renamed from: a */
    public static hdy m14237a() {
        return new hdy();
    }

    /* renamed from: c */
    public static final bqgg m14238c(Object obj) {
        return bqga.m112775a(bmxv.m108566b(obj));
    }

    /* renamed from: g */
    public static final bqgg m14239g() {
        return bqga.m112775a(bmvz.f131120a);
    }

    /* renamed from: b */
    public final void mo12423b() {
        if (!this.f19570k) {
            this.f19570k = true;
            this.f19563d = this.f19564e;
            mo12428f();
        }
    }

    /* renamed from: d */
    public final void mo12426d() {
        synchronized (this.f19573n) {
            boolean z = true;
            if (this.f19572m == null && this.f19574o == null) {
                z = false;
            }
            bmxy.m108601b(z, "The flow has been aborted, or the current step cannot be aborted since it's not a step that waits for other events to happen (see #createWaitingNextStep() and #createUnknownNextStep() for details).");
            this.f19572m = null;
            this.f19574o = null;
            this.f19562c.add(this.f19563d);
            mo12422a(this.f19563d, false);
        }
    }

    /* renamed from: e */
    public final bqgg mo12427e() {
        bqgy c;
        synchronized (this.f19573n) {
            c = bqgy.m112818c();
            this.f19574o = c;
        }
        return c;
    }

    /* renamed from: f */
    public final void mo12428f() {
        if (this.f19565f.containsKey(this.f19563d)) {
            this.f19571l = System.currentTimeMillis();
            bqga.m112781a((bqgg) ((C1247om) this.f19565f.get(this.f19563d)).mo12294a(), new hdx(this), this.f19569j);
            return;
        }
        String valueOf = String.valueOf(this.f19563d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Unrecognized step: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    public final void mo12424b(Object obj) {
        boolean z;
        bqgy bqgy = this.f19574o;
        synchronized (this.f19573n) {
            if (this.f19574o != null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "There is no unknown next step future to set.");
            this.f19574o = null;
        }
        bqgy.mo69138b(bmxv.m108567c(obj));
    }

    /* renamed from: c */
    public final void mo12425c() {
        bqgy bqgy;
        boolean z;
        synchronized (this.f19573n) {
            bqgy = this.f19572m;
            if (bqgy != null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "There flow has been resumed, or the current step cannot be resumed since it's not a step that waits for other events to happen (see #createWaitingNextStep() for details).");
            this.f19572m = null;
        }
        bqgy.mo69138b((Object) null);
    }

    /* renamed from: a */
    public final bqgg mo12421a(Object obj) {
        bqgg a;
        synchronized (this.f19573n) {
            bqgy c = bqgy.m112818c();
            this.f19572m = c;
            a = adax.m50093a(c, bmxv.m108566b(obj));
        }
        return a;
    }

    /* renamed from: a */
    public final void mo12422a(Object obj, boolean z) {
        bxvd da = bomo.f133678j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomo bomo = (bomo) da.f164949b;
        bomo.f133680a |= 128;
        bomo.f133688i = z;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19571l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bomo bomo2 = (bomo) da.f164949b;
        bomo2.f133680a |= 64;
        bomo2.f133687h = elapsedRealtime;
        this.f19568i.mo12349a(da, obj);
        bxvd da2 = bong.f133782r.mo74144da();
        String str = this.f19567h;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bong bong = (bong) da2.f164949b;
        str.getClass();
        int i = bong.f133784a | 2;
        bong.f133784a = i;
        bong.f133786c = str;
        bong.f133785b = 5;
        bong.f133784a = i | 1;
        bomo bomo3 = (bomo) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bong bong2 = (bong) da2.f164949b;
        bomo3.getClass();
        bong2.f133790g = bomo3;
        bong2.f133784a |= 32;
        this.f19566g.mo24333a((bong) da2.mo74062i()).mo24327b();
    }
}
