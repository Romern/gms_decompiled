package p000;

import com.google.android.gms.tapandpay.wear.WearProxyChimeraActivity;

/* renamed from: atyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyw extends awe {

    /* renamed from: a */
    final /* synthetic */ WearProxyChimeraActivity f91182a;

    public atyw(WearProxyChimeraActivity wearProxyChimeraActivity) {
        this.f91182a = wearProxyChimeraActivity;
    }

    /* renamed from: a */
    public final void mo2750a() {
        this.f91182a.setResult(2);
        this.f91182a.finish();
        String stringExtra = this.f91182a.getIntent().getStringExtra("nodeId");
        if (stringExtra != null) {
            auaa.m76633a(this.f91182a, stringExtra, auaa.m76623a(), this.f91182a.getIntent().getBooleanExtra("shouldCompressRpcs", false));
        }
    }
}
