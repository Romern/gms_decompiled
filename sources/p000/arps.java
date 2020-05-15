package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.p065ui.TargetChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: arps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arps extends Fragment {

    /* renamed from: a */
    public static final Logger f88090a = ascp.m73787a("D2D", "UI", "TargetResourcesFragment");

    /* renamed from: b */
    public arez f88091b = null;

    /* renamed from: c */
    public boolean f88092c;

    /* renamed from: d */
    public String f88093d;

    /* renamed from: e */
    public Bundle f88094e;

    /* renamed from: f */
    public int f88095f = 1;

    /* renamed from: g */
    public final arow f88096g = new arow(Looper.getMainLooper());

    /* renamed from: h */
    public boolean f88097h = false;

    /* renamed from: i */
    public final armc f88098i = new armc();

    /* renamed from: j */
    public boolean f88099j;

    /* renamed from: k */
    public arwt f88100k;

    /* renamed from: l */
    public srl f88101l;

    /* renamed from: m */
    public final long f88102m = ascn.m73780a();

    /* renamed from: n */
    private Bundle f88103n;

    /* renamed from: o */
    private final areb f88104o = new arpp(this);

    /* renamed from: a */
    public final void mo48738a() {
        mo48740b();
        this.f88098i.mo48630a(13);
        this.f88096g.mo48707b(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo48740b() {
        if (this.f88091b != null) {
            this.f88092c = false;
            f88090a.logVerbose("Disabling target mode.", new Object[0]);
            arez arez = this.f88091b;
            arez.mo48476a("target_nearby_api");
            roz b = rpa.m34196b();
            b.f43472a = ares.f87546a;
            arez.mo24732b(b.mo24977a()).mo50373a(arpo.f88083a);
            return;
        }
        f88090a.mo25420f("Invalid connectionless client state.", new Object[0]);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f88103n = bundle;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            this.f88100k.mo48888a(3, i2);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f88101l != null) {
            new adzt(Looper.getMainLooper()).post(new arpr(this, activity));
        }
        this.f88100k = new arwt(activity, null, this.f88103n);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (bundle != null) {
            f88090a.mo25412b("Activity was destroyed. Unable to recover state", new Object[0]);
        } else {
            mo48739a(getActivity());
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        mo48740b();
    }

    public final void onPause() {
        super.onPause();
        this.f88100k.mo48891b();
    }

    public final void onResume() {
        super.onResume();
        this.f88100k.mo48887a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f88100k.mo48889a(bundle);
    }

    public final void onStart() {
        super.onStart();
        this.f88096g.mo48723a((arok) getActivity());
    }

    public final void onStop() {
        super.onStop();
        this.f88096g.mo48723a(null);
    }

    /* renamed from: a */
    public final void mo48739a(Context context) {
        long j;
        long j2;
        if (!this.f88092c) {
            this.f88091b = aqxc.m72188a(context);
            TargetChimeraActivity targetChimeraActivity = (TargetChimeraActivity) getActivity();
            boolean z = false;
            if (targetChimeraActivity != null && targetChimeraActivity.mo59132h()) {
                z = true;
            }
            aqys aqys = new aqys();
            aqys.f87114a = 1;
            aqys.f87115b = !z ? 4 : 5;
            aqys.f87120g = cgqs.f187523a.mo6606a().mo84298K();
            aqys.f87121h = this.f88102m;
            aqys.f87123j = cgqs.f187523a.mo6606a().mo84322h();
            aqys.f87122i = cgqs.m146606l();
            araa araa = new araa();
            araa.mo48319a(1, cgqs.f187523a.mo6606a().mo84319e());
            araa.mo48319a(3, true);
            araa.mo48319a(5, cgps.m146493e());
            araa.mo48319a(8, z);
            araa.mo48319a(9, z);
            aqys.f87124k = araa;
            if (cgou.m146382g() && targetChimeraActivity != null) {
                aqxq aqxq = new aqxq();
                aqxq.f87045a = arns.m73194a(targetChimeraActivity.getApplicationContext()).f135131g;
                aqys.f87125l = aqxq.mo48210a();
            }
            araa araa2 = aqys.f87124k;
            if (araa2 != null) {
                j2 = araa2.f87187a;
                j = araa2.f87188b;
            } else {
                j2 = 0;
                j = 0;
            }
            BootstrapOptions bootstrapOptions = new BootstrapOptions(aqys.f87114a, aqys.f87115b, false, aqys.f87117d, (byte) 0, aqys.f87119f, null, aqys.f87120g, aqys.f87121h, aqys.f87122i, aqys.f87123j, j2, rfi.f42869b, j, null, aqys.f87125l);
            arez arez = this.f88091b;
            areb areb = this.f88104o;
            roz b = rpa.m34196b();
            b.f43472a = new areo(arez, bootstrapOptions, areb);
            aucb b2 = arez.mo24732b(b.mo24977a());
            b2.mo50373a(new arer(arez));
            b2.mo50372a(new arpi(this));
            b2.mo50373a(new arpj(this));
            b2.mo50371a(arpk.f88079a);
            aucb b3 = b2.mo50382b(new arpl(this));
            b3.mo50373a(new arpm(this));
            b3.mo50372a(arpn.f88082a);
        }
    }
}
