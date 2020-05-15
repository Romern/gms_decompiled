package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbx extends abbz {

    /* renamed from: a */
    final /* synthetic */ Bundle f57029a;

    /* renamed from: b */
    final /* synthetic */ long f57030b;

    /* renamed from: c */
    final /* synthetic */ GoogleHelp f57031c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abbx(rkb rkb, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(rkb);
        this.f57029a = bundle;
        this.f57030b = j;
        this.f57031c = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31997a(abci abci) {
        try {
            abci.mo32011a(this.f57029a, this.f57030b, this.f57031c, new abbw(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async help psd failed!", e);
            mo17719d(abca.f57032a);
        }
    }
}
