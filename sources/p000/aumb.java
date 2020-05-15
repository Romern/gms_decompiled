package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: aumb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumb extends rzt {

    /* renamed from: a */
    private final aumc f92069a;

    public aumb(Context context) {
        super(context, 85, new int[0]);
        aulz aulz;
        if (auma.m77295a(context, aulz.f92062a)) {
            synchronized (aulz.f92063b) {
                if (aulz.f92064c == null) {
                    aulz.f92064c = new aulz();
                }
                aulz = aulz.f92064c;
            }
            this.f92069a = aulz;
            return;
        }
        this.f92069a = new aulx(aurj.m77699a(), aulj.m77263a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        sbj.mo16678a(0, new auqg(this.f92069a, aurl.m77712a()), (Bundle) null);
    }
}
