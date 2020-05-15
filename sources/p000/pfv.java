package p000;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: pfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pfv extends rjx implements pep {

    /* renamed from: F */
    private static final rjo f39048F = new rjo("Cast.API_CXLESS", f39049H, ptw.f40216d);

    /* renamed from: H */
    private static final rjl f39049H = new pfm();

    /* renamed from: a */
    public static final ptx f39050a = new ptx("CastClient");

    /* renamed from: G */
    private final Object f39051G = new Object();

    /* renamed from: b */
    public final pfu f39052b = new pfu(this);

    /* renamed from: c */
    public final Handler f39053c;

    /* renamed from: d */
    public boolean f39054d;

    /* renamed from: e */
    public boolean f39055e;

    /* renamed from: f */
    aucf f39056f;

    /* renamed from: g */
    aucf f39057g;

    /* renamed from: h */
    public final AtomicLong f39058h;

    /* renamed from: i */
    public final Object f39059i = new Object();

    /* renamed from: j */
    public ApplicationMetadata f39060j;

    /* renamed from: k */
    public String f39061k;

    /* renamed from: l */
    public double f39062l;

    /* renamed from: m */
    public boolean f39063m;

    /* renamed from: n */
    public int f39064n;

    /* renamed from: o */
    public int f39065o;

    /* renamed from: p */
    public EqualizerSettings f39066p;

    /* renamed from: q */
    public final CastDevice f39067q;

    /* renamed from: r */
    final Map f39068r;

    /* renamed from: s */
    public final Map f39069s;

    /* renamed from: t */
    public final pel f39070t;

    /* renamed from: u */
    public final List f39071u = new ArrayList();

    /* renamed from: v */
    public int f39072v;

    public pfv(Context context, pek pek) {
        super(context, f39048F, pek, rjw.f43159a);
        sdo.m34966a(context, "context cannot be null");
        sdo.m34966a(pek, "CastOptions cannot be null");
        this.f39070t = pek.f38967b;
        this.f39067q = pek.f38966a;
        this.f39068r = new HashMap();
        this.f39069s = new HashMap();
        this.f39058h = new AtomicLong(0);
        this.f39072v = 1;
        mo23024e();
        this.f39053c = new adzt(this.f43163B);
    }

    /* renamed from: d */
    private static rjp m30302d(int i) {
        return rzy.m34725a(new Status(i));
    }

    /* renamed from: a */
    public final void mo23016a(int i) {
        synchronized (this.f39059i) {
            aucf aucf = this.f39056f;
            if (aucf != null) {
                aucf.mo50390a((Exception) m30302d(i));
            }
            this.f39056f = null;
        }
    }

    /* renamed from: b */
    public final void mo23020b() {
        f39050a.mo23670a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f39069s) {
            this.f39069s.clear();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: c */
    public final void mo23022c() {
        boolean z = true;
        if (this.f39072v == 1) {
            z = false;
        }
        sdo.m34971a(z, (Object) "Not active connection");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo23024e() {
        if (!this.f39067q.mo17496a(2048) && this.f39067q.mo17496a(4) && !this.f39067q.mo17496a(1)) {
            "Chromecast Audio".equals(this.f39067q.f29717e);
        }
    }

    /* renamed from: b */
    public final void mo23021b(int i) {
        synchronized (this.f39051G) {
            aucf aucf = this.f39057g;
            if (aucf != null) {
                if (i == 0) {
                    aucf.mo50391a(new Status(0));
                } else {
                    aucf.mo50390a((Exception) m30302d(i));
                }
                this.f39057g = null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: d */
    public final void mo23023d() {
        sdo.m34971a(this.f39072v == 2, (Object) "Not connected to device");
    }

    /* renamed from: a */
    public final void mo23017a(long j, int i) {
        aucf aucf;
        synchronized (this.f39068r) {
            Map map = this.f39068r;
            Long valueOf = Long.valueOf(j);
            aucf = (aucf) map.get(valueOf);
            this.f39068r.remove(valueOf);
        }
        if (aucf == null) {
            return;
        }
        if (i != 0) {
            aucf.mo50390a((Exception) m30302d(i));
        } else {
            aucf.mo50391a((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo23018a(aucf aucf) {
        synchronized (this.f39051G) {
            if (this.f39057g != null) {
                aucf.mo50390a((Exception) m30302d(2001));
            } else {
                this.f39057g = aucf;
            }
        }
    }

    /* renamed from: a */
    public final void mo22980a(peo peo) {
        sdo.m34959a(peo);
        this.f39071u.add(peo);
    }

    /* renamed from: a */
    public final void mo23019a(ptt ptt) {
        rob rob = mo24714a(ptt, "castDeviceControllerListenerKey").f43429b;
        sdo.m34966a(rob, "Key must not be null");
        mo24698a(rob);
    }

    /* renamed from: a */
    public final boolean mo22981a() {
        mo23023d();
        return this.f39063m;
    }
}
