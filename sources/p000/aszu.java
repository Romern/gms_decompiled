package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tapandpay.firstparty.InStoreCvmConfig;

/* renamed from: aszu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aszu implements asqq {

    /* renamed from: a */
    public asqw f89926a;

    /* renamed from: b */
    private final InStoreCvmConfig f89927b;

    /* renamed from: c */
    private final atah f89928c;

    /* renamed from: d */
    private final atkm f89929d;

    /* renamed from: e */
    private final Context f89930e;

    public aszu(Context context, InStoreCvmConfig inStoreCvmConfig, asqw asqw) {
        this.f89927b = inStoreCvmConfig;
        this.f89928c = new atah(context);
        this.f89929d = new atkm(context);
        this.f89926a = asqw;
        this.f89930e = context;
    }

    /* renamed from: a */
    public static InStoreCvmConfig m75260a(int i) {
        if (i == 840 || i == 630) {
            asoa asoa = new asoa();
            asoa.f89282a = true;
            asoa.f89283b = 600;
            asoa.f89284c = 20;
            asoa.f89285d = 20;
            return asoa.mo49274a();
        }
        asoa asoa2 = new asoa();
        asoa2.f89282a = false;
        asoa2.f89283b = 180;
        asoa2.f89284c = 3;
        asoa2.f89285d = 2;
        return asoa2.mo49274a();
    }

    /* renamed from: d */
    private final synchronized boolean m75261d() {
        atae b;
        int i = this.f89927b.f108385b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        b = this.f89928c.mo49731b(i);
        this.f89926a.f89448l = SystemClock.elapsedRealtime() - elapsedRealtime;
        asqw asqw = this.f89926a;
        asqw.f89431H = b.f89942a;
        asqw.f89432I = b.f89943b;
        return b.mo49728a();
    }

    /* renamed from: b */
    public final synchronized boolean mo49383b() {
        boolean z;
        z = false;
        if (this.f89929d.mo50018d() >= this.f89927b.f108387d) {
            asqw asqw = this.f89926a;
            asqw.f89442f = true;
            asqw.f89431H = 5;
        } else if (m75261d()) {
            z = true;
        }
        this.f89926a.f89443g = !z;
        return z;
    }

    /* renamed from: c */
    public final boolean mo49384c() {
        return this.f89929d.mo50017c() && this.f89929d.mo50016b();
    }

    /* renamed from: a */
    public final boolean mo49382a() {
        boolean z;
        int d = this.f89929d.mo50018d();
        int i = this.f89927b.f108386c;
        boolean z2 = this.f89929d.f90420c.getBoolean("remote_lock_hold", false);
        if (!cgwn.f187872a.mo6606a().mo84615ac()) {
            z = this.f89929d.f90420c.getBoolean("was_password_sufficient", false);
        } else {
            z = asjk.m74229c(this.f89930e);
        }
        asqw asqw = this.f89926a;
        asqw.f89461y = z2;
        asqw.f89462z = !z;
        asqw.f89424A = this.f89928c.mo49729a();
        if (!this.f89927b.f108384a) {
            if (d >= i || z2 || !z) {
                return false;
            }
            return true;
        } else if (d >= i || z2 || !z || !m75261d()) {
            return false;
        } else {
            return true;
        }
    }
}
