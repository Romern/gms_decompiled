package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: vlf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class vlf extends deu implements rjz, rka {

    /* renamed from: d */
    private static final sbw f49435d = new sbw("BaseActivity", "");

    /* renamed from: b */
    public rkb f49436b;

    /* renamed from: c */
    protected String f49437c;

    /* renamed from: a */
    public final void mo7244a(int i) {
        f49435d.mo25366a("BaseActivity", "GoogleApiClient connections suspended");
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18324e() {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        f49435d.mo25366a("BaseActivity", "GoogleApiClient connected");
        mo18324e();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f49437c = getIntent().getStringExtra("accountName");
        if (this.f49436b == null) {
            rjy rjy = new rjy(this);
            rjy.mo24779a(twn.f46757c);
            rjy.mo24777a(twn.f46755a);
            rjy.mo24777a(twn.f46756b);
            rjy.mo24781a((rjz) this);
            rjy.mo24782a((rka) this);
            rjy.mo24778a(this.f49437c);
            this.f49436b = rjy.mo24784b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        String str = this.f49437c;
        if (str != null && voo.m40936a(voo.m40938a(this), str) == -1) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BaseIsRestart", true);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        this.f49436b.mo24801e();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        this.f49436b.mo24803g();
        super.onStop();
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        f49435d.mo25368a("BaseActivity", "Connection failed: %d", Integer.valueOf(connectionResult.f30065c));
        rfi.f42868a.mo24579a(getContainerActivity(), connectionResult.f30065c, 0).show();
    }
}
