package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.util.concurrent.CountDownLatch;

/* renamed from: bfys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfys extends bfyv {

    /* renamed from: a */
    public final CountDownLatch f115731a = new CountDownLatch(1);

    public bfys(Object obj) {
        super(ErrorInfo.TYPE_SDU_COMMUNICATIONERROR, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62422a() {
        this.f115731a.countDown();
    }
}
