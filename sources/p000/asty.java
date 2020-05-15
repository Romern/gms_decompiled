package p000;

import android.content.Context;

/* renamed from: asty */
final /* synthetic */ class asty implements Runnable {

    /* renamed from: a */
    private final asuc f89723a;

    /* renamed from: b */
    private final Context f89724b;

    /* renamed from: c */
    private final String f89725c;

    /* renamed from: d */
    private final long f89726d;

    /* renamed from: e */
    private final String f89727e;

    public asty(asuc asuc, Context context, String str, long j, String str2) {
        this.f89723a = asuc;
        this.f89724b = context;
        this.f89725c = str;
        this.f89726d = j;
        this.f89727e = str2;
    }

    public final void run() {
        this.f89723a.mo49506b(this.f89724b, this.f89725c, this.f89726d, this.f89727e);
    }
}
