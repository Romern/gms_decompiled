package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;

/* renamed from: hgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hgj extends adcf {

    /* renamed from: a */
    public static final sek f19703a = ght.m13172b("SaveAccountLinkingTokenControllerFragment");

    /* renamed from: b */
    public hgl f19704b;

    /* renamed from: c */
    public aczc f19705c;

    /* renamed from: d */
    public SaveAccountLinkingTokenRequest f19706d;

    /* renamed from: e */
    public String f19707e;

    /* renamed from: f */
    public String f19708f;

    /* renamed from: g */
    public bmzi f19709g;

    /* renamed from: h */
    public Account f19710h;

    /* renamed from: i */
    public hdz f19711i;

    /* renamed from: j */
    public hvd f19712j;

    /* renamed from: k */
    public bqgj f19713k;

    /* renamed from: l */
    public String f19714l;

    /* renamed from: m */
    private hqv f19715m;

    /* renamed from: n */
    private qws f19716n;

    /* renamed from: a */
    public static hgj m14325a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putString("session_id", str2);
        hgj hgj = new hgj();
        hgj.setArguments(bundle);
        return hgj;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f19711i.mo12423b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 200) {
            return;
        }
        if (i2 == -1 && intent != null) {
            this.f19704b.mo12456a(2);
            String stringExtra = intent.getStringExtra("extra_token");
            this.f19714l = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.f19711i.mo12426d();
                mo12455a(new hgk(Status.f30111e, bmvz.f131120a));
                return;
            }
            this.f19711i.mo12425c();
            return;
        }
        mo12455a(new hgk(Status.f30111e, bmvz.f131120a));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        Bundle arguments = getArguments();
        this.f19708f = arguments.getString("session_id");
        this.f19707e = arguments.getString("calling_package");
        Context context = getContext();
        this.f19713k = sne.m35694a(1, 9);
        Context applicationContext = context.getApplicationContext();
        hvb a = hvc.m14893a();
        a.f20471a = this.f19708f;
        this.f19712j = hva.m14891a(applicationContext, a.mo12751a());
        this.f19716n = new qws(context.getApplicationContext(), "IDENTITY_GMSCORE", null);
        this.f19709g = new hfw(this);
        Activity activity = getActivity();
        this.f19704b = (hgl) adcj.m50161a(activity).mo3444a(hgl.class);
        this.f19715m = (hqv) adcj.m50161a(activity).mo3444a(hqv.class);
        this.f19705c = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        this.f19715m.f20259a.mo2445a(this, new hfx(this));
        this.f19705c.f61123d.mo2445a(this, new hfy(this));
        this.f19704b.f19721e.mo2445a(this, new hfz(this));
        hdy a2 = hdz.m14237a();
        a2.f19553a = adcv.SAVE_ACCOUNT_LINKING_TOKEN_ACCOUNT_CHOOSER;
        a2.mo12419a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_ACCOUNT_CHOOSER, new hga(this));
        a2.mo12419a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_REAUTH_ACCOUNT, new hgb(this));
        a2.mo12419a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_EXTERNAL_CONSENT, new hgc(this));
        a2.mo12419a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_SAVE_TOKEN, new hgd(this));
        a2.f19554b = new hge(this);
        a2.f19555c = new hgf(this);
        a2.mo12420a(this.f19716n, this.f19708f, hgg.f19700a);
        this.f19711i = a2.mo12418a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ bqgg mo12454a(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        if (saveAccountLinkingTokenRequest == null) {
            return bqga.m112777a((Throwable) adbe.m50108a("Timed out", 8));
        }
        this.f19706d = saveAccountLinkingTokenRequest;
        try {
            startIntentSenderForResult(saveAccountLinkingTokenRequest.f10239a.getIntentSender(), BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, null, 0, 0, 0, Bundle.EMPTY);
            return this.f19711i.mo12421a(adcv.SAVE_ACCOUNT_LINKING_TOKEN_SAVE_TOKEN);
        } catch (IntentSender.SendIntentException e) {
            f19703a.mo25417e("Launching the external Consent PendingIntent failed", e, new Object[0]);
            return bqga.m112777a((Throwable) adbe.m50108a("Launching the external Consent PendingIntent failed", 8));
        }
    }

    /* renamed from: a */
    public final void mo12455a(hgk hgk) {
        this.f19704b.mo12457a(hgk);
    }
}
