package p000;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: ivu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivu {

    /* renamed from: a */
    public static final String f21888a = ivu.class.getSimpleName();

    /* renamed from: h */
    private static ivu f21889h;

    /* renamed from: b */
    public final KeyguardManager f21890b;

    /* renamed from: c */
    public final ivs f21891c;

    /* renamed from: d */
    public final Object f21892d;

    /* renamed from: e */
    public final ivl f21893e;

    /* renamed from: f */
    public final List f21894f = new LinkedList();

    /* renamed from: g */
    public int f21895g;

    public ivu(Context context) {
        this.f21890b = (KeyguardManager) context.getSystemService("keyguard");
        this.f21891c = ivs.m16223a(context);
        this.f21893e = new ivl(context);
        this.f21892d = new Object();
        this.f21895g = 0;
    }

    /* renamed from: a */
    public static synchronized ivu m16228a(Context context) {
        ivu ivu;
        synchronized (ivu.class) {
            if (f21889h == null) {
                f21889h = new ivu(context.getApplicationContext());
            }
            ivu = f21889h;
        }
        return ivu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0015 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0016 A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001b A[Catch:{ all -> 0x0010 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0057 A[Catch:{ all -> 0x0010 }, DONT_GENERATE] */
    /* renamed from: a */
    public final void mo13377a(boolean z) {
        boolean z2;
        synchronized (this.f21892d) {
            int i = 1;
            if (!z) {
                try {
                    if (this.f21890b.inKeyguardRestrictedInputMode()) {
                        z2 = false;
                        if (!z2) {
                            i = 2;
                        }
                        if (i == this.f21895g) {
                            this.f21895g = i;
                            if (z2) {
                                for (ivt ivt : new ArrayList(this.f21894f)) {
                                    ivt.mo13357c();
                                }
                            } else {
                                for (ivt ivt2 : new ArrayList(this.f21894f)) {
                                    ivt2.mo13356b();
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z2 = true;
            if (!z2) {
            }
            if (i == this.f21895g) {
            }
        }
    }
}
