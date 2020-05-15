package p000;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: abol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abol {

    /* renamed from: a */
    public boss f57792a;

    /* renamed from: b */
    public int f57793b;

    /* renamed from: c */
    public int f57794c;

    /* renamed from: d */
    public int f57795d;

    /* renamed from: e */
    public int f57796e;

    /* renamed from: f */
    public volatile boolean f57797f = false;

    /* renamed from: g */
    public abok f57798g;

    /* renamed from: h */
    public final Object f57799h = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo32243a(Context context) {
        TelephonyManager telephonyManager;
        if (context != null) {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } else {
            int i = eoa.f15378a;
            telephonyManager = null;
        }
        if (telephonyManager == null) {
            eoa.m10824a("Herrevad", "TelephonyManager is null", new Object[0]);
            return;
        }
        synchronized (this.f57799h) {
            if (this.f57798g == null) {
                int i2 = eoa.f15378a;
                return;
            }
            if (!cekn.m137072c()) {
                int i3 = Build.VERSION.SDK_INT;
            } else if (abme.m47898a()) {
                if (!this.f57797f) {
                    this.f57792a = null;
                    this.f57793b = -1;
                    this.f57794c = -1;
                    this.f57795d = -1;
                    this.f57796e = -1;
                    if (cekn.m137072c()) {
                        telephonyManager.listen(this.f57798g, 225);
                    } else {
                        telephonyManager.listen(this.f57798g, 1);
                    }
                    this.f57797f = true;
                    int i4 = eoa.f15378a;
                }
            }
            if (this.f57797f) {
                telephonyManager.listen(this.f57798g, 0);
                this.f57797f = false;
                int i5 = eoa.f15378a;
            }
        }
    }

    /* renamed from: b */
    public final boss mo32245b() {
        boss boss;
        synchronized (this.f57799h) {
            boss = this.f57797f ? this.f57792a : null;
        }
        return boss;
    }

    /* renamed from: c */
    public final int mo32246c() {
        int i;
        synchronized (this.f57799h) {
            i = this.f57797f ? this.f57796e : -1;
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo32244a() {
        boolean z;
        synchronized (this.f57799h) {
            z = this.f57797f;
        }
        return z;
    }
}
