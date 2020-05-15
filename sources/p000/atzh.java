package p000;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;

/* renamed from: atzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class atzh extends atxz implements atze {

    /* renamed from: a */
    private final String f91221a;

    /* renamed from: c */
    private final Handler f91222c;

    /* renamed from: d */
    private final boolean f91223d;

    /* renamed from: e */
    private final rjx f91224e;

    public atzh(rjx rjx, String str, Handler handler, boolean z) {
        this.f91224e = rjx;
        this.f91221a = str;
        this.f91222c = handler;
        this.f91223d = z;
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
    }

    /* renamed from: a */
    public final void mo50310a(Context context) {
    }

    /* renamed from: a */
    public void mo50137a(Context context, String str) {
    }

    /* renamed from: a */
    public final void mo50311a(Message message) {
        this.f91224e.mo24694a(this.f91221a, "/tapandpay/proxy", auai.m76649a(auaa.m76629a(message), this.f91223d));
    }

    /* renamed from: a */
    public final void mo50326a(String str, Bundle bundle) {
        auai.m76648a(bundle);
        if ("serviceResponse".equals(str)) {
            Message obtain = Message.obtain((Handler) null, bundle.getInt("what"));
            obtain.setData(bundle.getBundle("data"));
            this.f91222c.handleMessage(obtain);
        }
    }
}
