package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: smv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class smv implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: c */
    public static final /* synthetic */ int f44776c = 0;

    /* renamed from: d */
    private static smv f44777d;

    /* renamed from: a */
    public final sqj f44778a;

    /* renamed from: b */
    protected boolean f44779b;

    /* renamed from: e */
    private final Context f44780e;

    /* renamed from: f */
    private final sqh f44781f = smu.f44775a;

    private smv(Context context) {
        this.f44780e = context;
        this.f44779b = false;
        this.f44778a = new sqj(new C1592sms(context), "radio_activity", this.f44781f, snp.m35703a(1, 10), cdna.f181280a.mo6606a().mo77935f(), TimeUnit.MILLISECONDS, (int) cdna.f181280a.mo6606a().mo77934e());
    }

    /* renamed from: a */
    public static smv m35679a() {
        ConnectivityManager f;
        if (cdna.m134125f()) {
            int i = Build.VERSION.SDK_INT;
            if (f44777d == null) {
                smv smv = new smv(rpr.m34216b());
                f44777d = smv;
                int i2 = Build.VERSION.SDK_INT;
                if (!smv.f44779b && (f = ssk.m36242f(smv.f44780e)) != null) {
                    f.addDefaultNetworkActiveListener(smv);
                    smv.f44779b = true;
                }
            }
        } else {
            smv smv2 = f44777d;
            if (smv2 != null) {
                smv2.mo25761b();
                f44777d = null;
            }
        }
        return f44777d;
    }

    public final void onNetworkActive() {
        if (!cdna.m134125f()) {
            mo25761b();
            return;
        }
        NetworkInfo d = ssk.m36240d(this.f44780e);
        if (d == null) {
            Log.w("WLRadioListnr", "NetworkInfo was null");
        } else {
            this.f44778a.mo25972a(new smt(System.currentTimeMillis(), d.getType()));
        }
    }

    /* renamed from: b */
    public final void mo25761b() {
        ConnectivityManager f;
        int i = Build.VERSION.SDK_INT;
        if (this.f44779b && (f = ssk.m36242f(this.f44780e)) != null) {
            f.removeDefaultNetworkActiveListener(this);
            this.f44779b = false;
        }
    }
}
