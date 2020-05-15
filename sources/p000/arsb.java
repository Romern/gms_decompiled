package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.android.volley.RequestQueue;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import java.util.concurrent.ExecutorService;

/* renamed from: arsb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arsb extends Fragment {

    /* renamed from: a */
    public static final Logger f88212a = ascp.m73787a("MagicWand", "AssertionFragment");

    /* renamed from: b */
    public static final bqgj f88213b = bqgs.m112811a((ExecutorService) snp.m35704b(9));

    /* renamed from: c */
    public static final RequestQueue f88214c = rpr.m34216b().getRequestQueue();

    /* renamed from: d */
    public bqgg f88215d;

    /* renamed from: e */
    public aruc f88216e;

    /* renamed from: f */
    public arsa f88217f;

    /* renamed from: g */
    public Context f88218g;

    /* renamed from: h */
    public boolean f88219h;

    /* renamed from: i */
    private Handler f88220i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f88221j;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        f88212a.mo25412b("onAttach", new Object[0]);
        this.f88218g = activity.getApplicationContext();
        arsa arsa = (arsa) activity;
        this.f88217f = arsa;
        if (this.f88219h) {
            arsa.mo48784a();
        } else if (this.f88221j) {
            arsa.mo48785b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f88212a.mo25412b("onCreate", new Object[0]);
        setRetainInstance(true);
        sns sns = new sns("AccountBootstrapBackground", 9);
        sns.start();
        this.f88220i = new snr(sns);
        this.f88216e = new aruc(this.f88218g, this.f88220i);
    }

    public final void onDetach() {
        super.onDetach();
        f88212a.mo25412b("onDetach", new Object[0]);
        this.f88217f = null;
    }
}
