package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.drive.networkcontrol.BatteryStateChangeReceiver;
import com.google.android.gms.drive.networkcontrol.ConnectivityChangeReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: vpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpu {

    /* renamed from: a */
    public static vpu f49741a;

    /* renamed from: A */
    public final ConnectivityChangeReceiver f49742A;

    /* renamed from: B */
    public final BatteryStateChangeReceiver f49743B;

    /* renamed from: C */
    public final uce f49744C;

    /* renamed from: D */
    public final vfd f49745D;

    /* renamed from: E */
    public final uqh f49746E;

    /* renamed from: F */
    public final sqv f49747F = srb.f45012a;

    /* renamed from: G */
    public final veg f49748G;

    /* renamed from: H */
    public final vdm f49749H;

    /* renamed from: I */
    private final ConnectivityManager f49750I;

    /* renamed from: J */
    private final ugf f49751J;

    /* renamed from: K */
    private final uql f49752K;

    /* renamed from: L */
    private final uqp f49753L;

    /* renamed from: M */
    private final Executor f49754M;

    /* renamed from: b */
    public final Context f49755b;

    /* renamed from: c */
    public final uhj f49756c;

    /* renamed from: d */
    public final uhn f49757d;

    /* renamed from: e */
    public final ubq f49758e;

    /* renamed from: f */
    public final uaj f49759f;

    /* renamed from: g */
    public final vff f49760g;

    /* renamed from: h */
    public final vpa f49761h;

    /* renamed from: i */
    public final vkv f49762i;

    /* renamed from: j */
    public final vcg f49763j;

    /* renamed from: k */
    public final uff f49764k;

    /* renamed from: l */
    public final uqu f49765l;

    /* renamed from: m */
    public final ubf f49766m;

    /* renamed from: n */
    public final ufu f49767n;

    /* renamed from: o */
    public final vfp f49768o;

    /* renamed from: p */
    public final ufe f49769p;

    /* renamed from: q */
    public final uex f49770q;

    /* renamed from: r */
    public final AtomicBoolean f49771r;

    /* renamed from: s */
    public final blbj f49772s;

    /* renamed from: t */
    public final ugl f49773t;

    /* renamed from: u */
    public final ugv f49774u;

    /* renamed from: v */
    public final uqe f49775v;

    /* renamed from: w */
    public final vic f49776w;

    /* renamed from: x */
    public final vcz f49777x;

    /* renamed from: y */
    public final vbd f49778y;

    /* renamed from: z */
    public final vbt f49779z;

    public vpu(Context context) {
        this.f49755b = context;
        this.f49750I = (ConnectivityManager) context.getSystemService("connectivity");
        this.f49748G = new veg(this.f49750I);
        this.f49760g = new vfg(context);
        this.f49761h = new vpa(context);
        this.f49754M = snp.m35704b(9);
        this.f49746E = new uqh();
        this.f49756c = new uhj(context, this.f49754M, this.f49760g);
        this.f49762i = new vkv(context);
        vdm vdm = new vdm(m41033a(context), context);
        this.f49749H = vdm;
        this.f49777x = new vdb(vdm.f49083a, vdm.f49084b);
        this.f49757d = new ugz(this.f49756c, this.f49754M);
        this.f49766m = new ubf(this.f49757d);
        this.f49753L = new uqp(context);
        this.f49765l = new uqu(this.f49756c, this.f49757d, this.f49753L, this.f49746E, this.f49777x, this.f49747F);
        this.f49752K = new uql();
        this.f49764k = new uff(this.f49756c, this.f49757d, this.f49747F, this.f49761h);
        this.f49775v = new uqe(context, this.f49765l, this.f49766m, this.f49752K, this.f49746E, this.f49753L, this.f49764k, this.f49747F, this.f49748G, this.f49777x, this.f49757d);
        this.f49769p = new ufe(context, this.f49757d, this.f49761h, this.f49764k, this.f49777x, this.f49747F);
        this.f49742A = new ConnectivityChangeReceiver(context, this.f49748G);
        this.f49743B = new BatteryStateChangeReceiver(context);
        this.f49744C = new ucf(this.f49757d);
        int i = Build.VERSION.SDK_INT;
        this.f49745D = new vfd(this.f49742A, new vev(this.f49750I), this.f49743B, this.f49744C, this.f49760g);
        uhn uhn = this.f49757d;
        uhj uhj = this.f49756c;
        veg veg = this.f49748G;
        uqe uqe = this.f49775v;
        this.f49759f = new uaj(context, this, uhn, uhj, veg, new uav(uqe, uhn), uqe, this.f49769p, this.f49747F, this.f49777x, this.f49745D);
        this.f49751J = new ugf(this.f49764k);
        this.f49758e = new ubp(this.f49759f, this.f49764k, this.f49747F, this.f49769p);
        this.f49767n = new ufu(context, this.f49751J, this.f49764k, this.f49757d, this.f49769p);
        this.f49778y = new vbd(this.f49757d, this.f49762i);
        this.f49779z = new vbt(this.f49762i, this.f49775v, this.f49756c, this.f49778y, context, this.f49769p);
        this.f49768o = new vfp(this.f49757d, this.f49767n, this.f49779z, this.f49775v, this.f49777x, this.f49745D);
        this.f49763j = new vcg(context, this.f49748G, this.f49747F, this.f49760g, this.f49768o, this.f49769p);
        this.f49770q = new uex(context.getApplicationContext(), this.f49757d, this.f49762i, snp.m35704b(9));
        this.f49771r = new AtomicBoolean(true);
        this.f49772s = new blbj(((Integer) twy.f46891r.mo58455c()).intValue(), ((Integer) twy.f46893t.mo58455c()).intValue(), ((Double) twy.f46890q.mo58455c()).doubleValue(), ((Integer) twy.f46891r.mo58455c()).intValue());
        this.f49773t = new ugl();
        this.f49774u = new ugv();
        this.f49776w = new vic(this);
    }

    /* renamed from: a */
    public static vdu m41033a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int intValue = ((Integer) twy.f46849ag.mo58455c()).intValue();
        if (intValue == 1) {
            return new vdq();
        }
        if (intValue != 2) {
            return new vds();
        }
        return new vdc(applicationContext);
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
    /* renamed from: a */
    public static vpu m41034a() {
        sdo.m34971a(f49741a != null, (Object) "Singletons not initialized");
        return f49741a;
    }
}
