package p000;

import android.net.wifi.RttManager;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bgkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgkb implements RttManager.RttListener {

    /* renamed from: c */
    public static final /* synthetic */ int f116679c = 0;

    /* renamed from: a */
    final /* synthetic */ bgkc f116680a;

    /* renamed from: b */
    final /* synthetic */ bges f116681b;

    public bgkb(bgkc bgkc, bges bges) {
        this.f116680a = bgkc;
        this.f116681b = bges;
    }

    /* renamed from: a */
    private final void m99184a(bfnz[] bfnzArr) {
        try {
            this.f116680a.f116687f.execute(new bgka(this.f116681b, bfnzArr));
        } catch (RejectedExecutionException e) {
        }
    }

    public final void onAborted() {
        m99184a(new bfnz[0]);
    }

    public final void onFailure(int i, String str) {
        m99184a(new bfnz[0]);
    }

    public final void onSuccess(RttManager.RttResult[] rttResultArr) {
        bfnz a;
        bgkx bgkx = bgkx.f116729g;
        int length = rttResultArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (RttManager.RttResult rttResult : rttResultArr) {
            if (!(rttResult == null || rttResult.status != 0 || (a = bgkx.mo62953a(rttResult)) == null)) {
                arrayList.add(a);
            }
        }
        m99184a((bfnz[]) arrayList.toArray(new bfnz[arrayList.size()]));
    }
}
