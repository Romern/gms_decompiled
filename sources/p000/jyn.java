package p000;

import android.os.AsyncTask;
import android.os.SystemClock;

/* renamed from: jyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jyn extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ jyp f23534a;

    /* renamed from: b */
    private vvq f23535b;

    public jyn(jyp jyp) {
        this.f23534a = jyp;
    }

    /* renamed from: a */
    public final void mo14230a() {
        vvq vvq = this.f23535b;
        if (vvq != null) {
            vvq.mo28907b();
            this.f23535b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        jyp jyp = this.f23534a;
        Logger Logger = jyp.f23538a;
        this.f23535b = vvp.m41462a(jyp.f23540c, jyp.f23539b);
        jyp.f23538a.mo25412b("init: %sms", Long.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
        return this.f23535b;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
        mo14230a();
    }
}
