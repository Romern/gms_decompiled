package p000;

import android.app.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: asmn */
public final /* synthetic */ class asmn implements roo {

    /* renamed from: a */
    private final Activity f89252a;

    /* renamed from: b */
    private final int f89253b;

    /* renamed from: c */
    private final asxx f89254c;

    public asmn(Activity activity, int i, asxx asxx) {
        this.f89252a = activity;
        this.f89253b = i;
        this.f89254c = asxx;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Activity activity = this.f89252a;
        int i = this.f89253b;
        asxx asxx = this.f89254c;
        ((aswj) ((aswp) obj).mo25289B()).mo49557a(asxx.f89900a, new aswo(activity, i));
        rpc.m34201a(Status.f30107a, (aucf) obj2);
    }
}
