package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: bict */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bict implements bhrm {

    /* renamed from: a */
    public final bidf f120238a;

    /* renamed from: b */
    public final Executor f120239b;

    /* renamed from: c */
    public final Executor f120240c;

    /* renamed from: d */
    public final bicx f120241d;

    /* renamed from: e */
    public final bhva f120242e;

    /* renamed from: f */
    public final bhwm f120243f;

    /* renamed from: g */
    public final bhqw f120244g;

    /* renamed from: h */
    public final bicy f120245h;

    /* renamed from: i */
    private final Executor f120246i;

    /* renamed from: j */
    private final Context f120247j;

    /* renamed from: k */
    private bhup f120248k = null;

    /* renamed from: l */
    private bhup f120249l = null;

    public bict(Context context, bidf bidf, Executor executor, biak biak, Executor executor2, Executor executor3, bqgj bqgj, biam biam, bibq bibq, qws qws) {
        this.f120238a = bidf;
        this.f120244g = new bhqw(biam, bibq, biak);
        this.f120239b = executor;
        this.f120240c = executor2;
        this.f120246i = executor3;
        this.f120247j = context;
        boolean d = sre.m36084d(context);
        this.f120245h = new bicy(d);
        this.f120241d = new bicx((ConnectivityManager) context.getSystemService("connectivity"), new bhpt(context, qws, 2, bqgj), d, ModuleManager.get(context).getCurrentModule().moduleVersion, new bicu(context));
        this.f120242e = new bhva();
        C1245ok okVar = new C1245ok();
        try {
            bvmr bvmr = ((bvmq) GeneratedMessageLite.m124014a(bvmq.f156775b, srz.m36178b(context.getResources().getAssets().open("on_the_go_model_parameters")))).f156777a;
            if (bvmr == null) {
                bvmr = bvmr.f156779b;
            }
            for (bvmp bvmp : bvmr.f156781a) {
                okVar.put(bvmp.f156772a, Float.valueOf((float) bvmp.f156773b));
            }
        } catch (IOException e) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", String.format("%s: %s\n%s", "?", "Error loading model weights from on_the_go_model_parameters", Log.getStackTraceString(e)));
            }
        }
        this.f120243f = new bhwm(okVar);
    }

    /* renamed from: a */
    public final bhup mo64188a() {
        if (cgfo.f186741a.mo6606a().mo83611b()) {
            bioi.m102657a("Using MDD for weights download");
            if (this.f120249l == null) {
                bioi.m102657a("Using MDD for weights download - recreating MDD manager");
                this.f120249l = new bhpy(this.f120245h, this.f120241d, this.f120246i, "default_inference_model", this.f120247j);
                bhup bhup = this.f120248k;
                if (!(bhup == null || ((bhux) bhup).f119666b == -1)) {
                    ((bhpy) this.f120249l).mo64150e();
                    this.f120248k.mo64145b();
                }
                this.f120248k = null;
                this.f120246i.execute(new bicr(this.f120247j));
            }
            return this.f120249l;
        }
        bioi.m102657a("Not using MDD for weights download");
        if (this.f120248k == null) {
            bioi.m102657a("Recreating Classic manager.");
            this.f120248k = new bhux(this.f120245h, this.f120244g, new bhuy(new bics(this.f120247j)), this.f120241d, this.f120246i, this.f120247j.getCacheDir());
            bhup bhup2 = this.f120249l;
            if (!(bhup2 == null || ((bhpy) bhup2).f119284b == -1)) {
                this.f120248k.mo64142a();
                this.f120249l.mo64145b();
            }
            this.f120249l = null;
        }
        return this.f120248k;
    }
}
