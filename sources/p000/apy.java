package p000;

import android.content.Context;
import android.net.Uri;

/* renamed from: apy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apy extends aqa {

    /* renamed from: a */
    public aqb f1969a;

    public apy(Context context, Uri uri) {
        super(context, uri);
        this.f1969a.mo2294b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final aqf mo2284a() {
        if (mo2291a(apn.f1937c)) {
            return new aqe(this.f1972b, apn.f1937c);
        }
        if (mo2291a(apn.f1936b)) {
            return new aqe(this.f1972b, apn.f1936b);
        }
        if (mo2291a(apn.f1935a)) {
            return new aqc(this.f1972b, apn.f1935a);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo2285a(aqf aqf) {
        this.f1969a = (aqb) aqf;
    }
}
