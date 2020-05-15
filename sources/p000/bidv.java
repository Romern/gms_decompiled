package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.common.util.PackageResetHelper;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.places.service.PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: bidv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bidv {

    /* renamed from: a */
    public final Context f120326a;

    /* renamed from: b */
    public final HandlerThread f120327b;

    /* renamed from: c */
    public final Handler f120328c = new adzt(this.f120327b.getLooper());

    /* renamed from: d */
    public final bqgj f120329d;

    /* renamed from: e */
    public final bqgj f120330e;

    /* renamed from: f */
    public final bhri f120331f;

    /* renamed from: g */
    public final biak f120332g;

    /* renamed from: h */
    public final bigx f120333h;

    /* renamed from: i */
    public final PackageResetHelper f120334i;

    /* renamed from: j */
    public final PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver f120335j;

    /* renamed from: k */
    public final bhqy f120336k;

    /* renamed from: l */
    public final bqgj f120337l;

    /* renamed from: m */
    public final bqgj f120338m;

    /* renamed from: n */
    private final bhqg f120339n;

    /* renamed from: o */
    private final bhpt f120340o;

    /* renamed from: p */
    private final bict f120341p;

    /* renamed from: q */
    private final bhyi f120342q;

    /* renamed from: r */
    private final Executor f120343r;

    public bidv(Context context, bhrb bhrb) {
        bhyv bhyv;
        Context context2 = context;
        this.f120326a = context2;
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        HandlerThread handlerThread = new HandlerThread("Places");
        this.f120327b = handlerThread;
        handlerThread.start();
        bqgj a = snp.m35702a(10);
        this.f120337l = a;
        if (a instanceof soc) {
            ((soc) a).setRejectedExecutionHandler(discardPolicy);
        }
        bqgj a2 = snp.m35702a(10);
        if (a2 instanceof soc) {
            ((soc) a2).setRejectedExecutionHandler(discardPolicy);
        }
        this.f120332g = new biak(this.f120328c, a2);
        bqgj b = snp.m35704b(10);
        this.f120329d = b;
        if (b instanceof soc) {
            ((soc) b).setRejectedExecutionHandler(discardPolicy);
        }
        bqgj b2 = snp.m35704b(10);
        this.f120330e = b2;
        if (b2 instanceof soc) {
            ((soc) b2).setRejectedExecutionHandler(discardPolicy);
        }
        bidf bidf = new bidf();
        this.f120339n = new bhqg(this.f120326a, new sty(this.f120328c));
        qws qws = new qws(context.getApplicationContext(), "LE", null);
        bhpt bhpt = new bhpt(context2, qws, 1, this.f120337l);
        this.f120340o = bhpt;
        biam a3 = biam.m101859a(context2, PlacesParams.f79571a, bhpt);
        bibq a4 = bibq.m101917a(context2, PlacesParams.f79571a, this.f120340o);
        this.f120333h = new bigx(context2, this.f120328c);
        this.f120343r = new bidq(this);
        bqgj b3 = snp.m35704b(10);
        this.f120338m = b3;
        if (b3 instanceof soc) {
            ((soc) b3).setRejectedExecutionHandler(discardPolicy);
        }
        bict bict = new bict(context, bidf, this.f120343r, this.f120332g, this.f120330e, this.f120329d, this.f120337l, a3, a4, qws);
        this.f120341p = bict;
        Context context3 = this.f120326a;
        Handler handler = this.f120328c;
        bqgj bqgj = this.f120329d;
        bhuj.m101556a(new bhxj());
        this.f120336k = new bhsi(bict, new bicw(context3, bict, bqgj, handler), new bhrp(bict));
        bicz bicz = new bicz(context2, this.f120333h, this.f120336k, this.f120341p.f120241d);
        if (!cgfr.f186745a.mo6606a().mo83626a()) {
            bhyv = new bhzb(this.f120338m, this.f120343r);
        } else if (cgfr.f186745a.mo6606a().mo83633h()) {
            bhyv = new bhzk(context.getCacheDir(), this.f120338m, this.f120343r);
        } else {
            bhyv = new bhyt(this.f120338m, this.f120343r);
        }
        this.f120342q = new bhyi(a3, bhyv, this.f120332g);
        this.f120331f = new bhri(context2, this.f120328c, new bhpw(new bhxl(this.f120326a, this.f120328c, this.f120333h, this.f120341p.f120243f, a3, a4, this.f120332g, this.f120339n, this.f120342q, this.f120340o), bicz, new bicm()), bhrb);
        PackageResetHelper packageResetHelper = new PackageResetHelper(this.f120326a, this.f120331f, false);
        this.f120334i = packageResetHelper;
        packageResetHelper.mo17934a(this.f120328c);
        PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver placeDetectionServiceImpl$FlagChangeBroadCastReceiver = new PlaceDetectionServiceImpl$FlagChangeBroadCastReceiver(bicz);
        this.f120335j = placeDetectionServiceImpl$FlagChangeBroadCastReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        intentFilter.addAction("com.google.android.gms.phenotype.COMMITTED");
        this.f120326a.registerReceiver(placeDetectionServiceImpl$FlagChangeBroadCastReceiver, intentFilter);
    }

    /* renamed from: a */
    public final void mo64559a(Runnable runnable) {
        this.f120328c.post(runnable);
    }
}
