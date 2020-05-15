package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: abbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abbr extends abbz {

    /* renamed from: a */
    final /* synthetic */ Bundle f57013a;

    /* renamed from: b */
    final /* synthetic */ long f57014b;

    /* renamed from: c */
    final /* synthetic */ GoogleHelp f57015c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abbr(rkb rkb, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(rkb);
        this.f57013a = bundle;
        this.f57014b = j;
        this.f57015c = googleHelp;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31997a(abci abci) {
        try {
            abci.mo32017b(this.f57013a, this.f57014b, this.f57015c, new abbq(this));
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            mo17719d(abca.f57032a);
        }
    }
}
