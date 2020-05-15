package p000;

import android.content.Intent;
import android.os.Looper;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: hdc */
final /* synthetic */ class hdc implements C1247om {

    /* renamed from: a */
    private final hdf f19491a;

    public hdc(hdf hdf) {
        this.f19491a = hdf;
    }

    /* renamed from: a */
    public final Object mo12294a() {
        hdf hdf = this.f19491a;
        Intent a = aczv.m50061a(hdf.getContext().getApplicationContext(), hdf.f19511q, hdf.f19512r);
        bqga.m112781a(adam.m50082a((adcc) hdf.getActivity()).mo33291a(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, a), new hde(hdf), new sty(new adzt(Looper.getMainLooper())));
        return hdf.f19501g.mo12421a(adcq.CONSENT_RECORD_GRANTS);
    }
}
