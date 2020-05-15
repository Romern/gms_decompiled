package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;

/* renamed from: bfrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfrw implements spw {

    /* renamed from: a */
    public final spx f115080a;

    /* renamed from: b */
    public final Object f115081b;

    /* renamed from: c */
    public volatile bfrv f115082c;

    /* renamed from: d */
    private final Handler f115083d;

    public bfrw(Context context, Handler handler) {
        this.f115083d = handler;
        int i = Build.VERSION.SDK_INT;
        spx a = spx.m35925a(context);
        this.f115080a = a;
        this.f115081b = a;
    }

    /* renamed from: a */
    public final void mo62192a(bfrv bfrv) {
        synchronized (this.f115081b) {
            if (this.f115082c == null) {
                int i = Build.VERSION.SDK_INT;
                this.f115080a.mo25956a("android:mock_location", this);
            }
            this.f115082c = bfrv;
        }
    }

    /* renamed from: v */
    public final void mo25951v(String str) {
        this.f115083d.post(new bfru(this));
    }
}
