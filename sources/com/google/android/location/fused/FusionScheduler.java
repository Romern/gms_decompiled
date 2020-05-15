package com.google.android.location.fused;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusionScheduler extends aacn implements std, aerc {

    /* renamed from: q */
    private static final long f150718q = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: a */
    public final bfve f150719a;

    /* renamed from: b */
    public final bfvh f150720b;

    /* renamed from: c */
    public final bfvr f150721c;

    /* renamed from: d */
    public final bfvg f150722d;

    /* renamed from: e */
    public final bfvf f150723e;

    /* renamed from: f */
    public final bfut f150724f;

    /* renamed from: g */
    public final bfuu f150725g;

    /* renamed from: h */
    public final bfvn f150726h;

    /* renamed from: i */
    public final ste f150727i;

    /* renamed from: j */
    public final aeri f150728j;

    /* renamed from: k */
    public final Context f150729k;

    /* renamed from: l */
    public final Handler f150730l;

    /* renamed from: m */
    public int f150731m = 63;

    /* renamed from: n */
    public Collection f150732n = Collections.emptyList();

    /* renamed from: o */
    public boolean f150733o;

    /* renamed from: p */
    public boolean f150734p;

    /* renamed from: r */
    private final bfrn f150735r = new bfrn();

    /* renamed from: s */
    private final bfrn f150736s = new bfrn();

    /* renamed from: t */
    private final bfrn f150737t = new bfrn();

    /* renamed from: u */
    private boolean f150738u = true;

    public FusionScheduler(bfve bfve, bfvh bfvh, bfvr bfvr, bfvg bfvg, bfvf bfvf, bfut bfut, bfuu bfuu, bfvn bfvn, ste ste, aeri aeri, Context context, Looper looper) {
        super("location");
        this.f150730l = new adzt(looper);
        this.f150719a = bfve;
        this.f150720b = bfvh;
        this.f150721c = bfvr;
        this.f150722d = bfvg;
        this.f150723e = bfvf;
        this.f150724f = bfut;
        this.f150725g = bfuu;
        this.f150726h = bfvn;
        this.f150729k = context;
        this.f150727i = ste;
        this.f150728j = aeri;
        this.f150733o = false;
        this.f150734p = false;
    }

    /* renamed from: a */
    private final boolean m117214a(int i) {
        return (i & this.f150731m) != 0;
    }

    /* renamed from: c */
    private final boolean m117215c() {
        return cevw.m138324i() && this.f150734p && this.f150735r.f115038f < Long.MAX_VALUE;
    }

    /* renamed from: cp */
    public final void mo26065cp() {
        if (this.f150733o && !this.f150734p) {
            this.f150734p = true;
            if (cevw.m138324i()) {
                mo70866a(false);
            }
        }
    }

    /* renamed from: cq */
    public final void mo26066cq() {
        if (this.f150733o && this.f150734p) {
            this.f150734p = false;
            if (cevw.m138324i()) {
                mo70866a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo9721a(int i, int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (cevw.f183465a.mo6606a().mo80261x4ecc0320()) {
            this.f150721c.mo62321a(z);
            this.f150721c.mo62324f();
            this.f150724f.mo62321a(z);
            this.f150724f.mo62324f();
            this.f150726h.mo62321a(z);
            this.f150726h.mo62324f();
        }
        mo70866a(false);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if ("com.google.android.location.internal.server.ACTION_RESTARTED".equals(intent.getAction())) {
            this.f150722d.mo62311c();
            this.f150723e.mo62311c();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0257  */
    /* renamed from: a */
    public final void mo70866a(boolean z) {
        boolean z2;
        boolean z3;
        long j;
        bfrn bfrn;
        long j2;
        bfrn bfrn2;
        long j3;
        Iterable iterable = this.f150732n;
        if (!aeri.m52437b(this.f150729k)) {
            iterable = bnjd.m109586b(iterable, bfrn.f115037e);
        }
        this.f150735r.mo62182a(bnjd.m109586b(iterable, bfrn.f115034b));
        this.f150736s.mo62182a(bnjd.m109586b(iterable, bfrn.f115035c));
        this.f150737t.mo62182a(bnjd.m109586b(iterable, bfrn.f115036d));
        if (!this.f150738u) {
            bfrn bfrn3 = this.f150737t;
            if (bfrn3.f115038f < Long.MAX_VALUE) {
                bfrn bfrn4 = this.f150736s;
                if (bfrn4.f115038f > 300000) {
                    bfrn4.f115038f = 300000;
                    bfrn4.f115039g = Math.max(300000L, Math.min(bfrn4.f115039g, bfrn3.f115039g));
                    bfrn bfrn5 = this.f150736s;
                    bfrn bfrn6 = this.f150737t;
                    Collection collection = bfrn6.f115043k;
                    Collection collection2 = bfrn6.f115044l;
                    bfrn5.f115043k.clear();
                    bfrn5.f115043k.addAll(collection);
                    bfrn5.f115044l.clear();
                    bfrn5.f115044l.addAll(collection2);
                    this.f150737t.mo62181a();
                }
            }
        }
        long j4 = this.f150736s.f115038f;
        bfrn bfrn7 = this.f150737t;
        if (j4 <= bfrn7.f115038f) {
            bfrn7.mo62181a();
        }
        bfrn bfrn8 = this.f150735r;
        long j5 = bfrn8.f115038f;
        if (this.f150733o && j5 < Long.MAX_VALUE && m117214a(4)) {
            this.f150719a.mo62308a(j5);
            this.f150719a.mo62320a(bfrn8.f115043k);
            this.f150719a.mo62322b(bfrn8.f115042j);
            bfve bfve = this.f150719a;
            bfve.f115403s = z;
            bfve.mo62309b();
            if (m117214a(64)) {
                this.f150725g.mo62309b();
            }
        } else {
            this.f150719a.mo62323e();
            this.f150725g.mo62323e();
        }
        bfrn bfrn9 = this.f150735r;
        boolean z4 = false;
        if (!this.f150733o || !cevw.f183465a.mo6606a().flpUsePdr() || ((cevw.f183465a.mo6606a().flpEnablePdrOnlyWhenScreenIsOn() && !this.f150734p) || bfrn9.f115038f >= Long.MAX_VALUE || !m117214a(8) || bfrn9.f115038f > f150718q)) {
            this.f150721c.mo62323e();
            z2 = false;
        } else {
            this.f150721c.mo62322b(bfrn9.f115042j);
            this.f150721c.mo62320a(bfrn9.f115043k);
            this.f150721c.mo62309b();
            z2 = true;
        }
        bfrn bfrn10 = this.f150735r;
        if (!this.f150733o || bfrn10.f115038f >= Long.MAX_VALUE || !m117214a(16)) {
            this.f150724f.mo62323e();
        } else {
            if (z2 && m117215c()) {
                j3 = cevw.f183465a.mo6606a().flpMinArScreenOnHighAccuracyIntervalMs();
            } else {
                j3 = cevw.f183465a.mo6606a().flpMinArScreenOfOrNoHighAccuracyIntervalMs();
            }
            this.f150721c.mo62322b(bfrn10.f115042j);
            this.f150724f.mo62308a(Math.max(bfrn10.f115038f, j3));
            bfut bfut = this.f150724f;
            bfut.f115403s = z;
            bfut.mo62320a(bfrn10.f115043k);
            this.f150724f.mo62309b();
        }
        boolean z5 = this.f150735r.f115038f < Long.MAX_VALUE && this.f150719a.f115429v;
        bfrn bfrn11 = this.f150736s;
        this.f150722d.mo62322b(bfrn11.f115042j);
        if (!m117214a(1) && (!m117215c() || !m117214a(32))) {
            if (m117214a(2)) {
                z3 = true;
            } else if (z5) {
                z3 = false;
            }
            j = bfrn11.f115038f;
            if (this.f150733o && j < Long.MAX_VALUE && z3) {
                this.f150722d.mo62308a(j);
                this.f150722d.mo62310b(Math.max(j, bfrn11.f115039g));
                this.f150722d.mo62312d();
                bfvg bfvg = this.f150722d;
                bfvg.f115403s = z;
                bfvg.mo62320a(bfrn11.f115043k);
                this.f150722d.mo62309b();
            } else {
                this.f150722d.mo62323e();
            }
            bfrn = this.f150737t;
            this.f150723e.mo62322b(!bfrn.f115042j || this.f150736s.f115042j);
            if (m117214a(2)) {
                z4 = true;
            } else if (!z5) {
                z4 = true;
            }
            j2 = bfrn.f115038f;
            if (this.f150733o && j2 < Long.MAX_VALUE && z4) {
                this.f150723e.mo62308a(j2);
                this.f150723e.mo62310b(Math.max(j2, bfrn.f115039g));
                this.f150723e.mo62312d();
                bfvf bfvf = this.f150723e;
                bfvf.f115403s = z;
                bfvf.mo62320a(bfrn.f115043k);
                this.f150723e.mo62309b();
            } else {
                this.f150723e.mo62323e();
            }
            bfrn2 = this.f150736s;
            if (cevw.m138320e() && this.f150733o && bfrn2.f115038f < Long.MAX_VALUE && m117214a(128)) {
                this.f150726h.mo62320a(bfrn2.f115043k);
                this.f150726h.mo62309b();
                return;
            }
            this.f150726h.mo62323e();
        }
        z3 = true;
        j = bfrn11.f115038f;
        if (this.f150733o) {
            this.f150722d.mo62308a(j);
            this.f150722d.mo62310b(Math.max(j, bfrn11.f115039g));
            this.f150722d.mo62312d();
            bfvg bfvg2 = this.f150722d;
            bfvg2.f115403s = z;
            bfvg2.mo62320a(bfrn11.f115043k);
            this.f150722d.mo62309b();
            bfrn = this.f150737t;
            this.f150723e.mo62322b(!bfrn.f115042j || this.f150736s.f115042j);
            if (m117214a(2)) {
            }
            j2 = bfrn.f115038f;
            if (this.f150733o) {
                this.f150723e.mo62308a(j2);
                this.f150723e.mo62310b(Math.max(j2, bfrn.f115039g));
                this.f150723e.mo62312d();
                bfvf bfvf2 = this.f150723e;
                bfvf2.f115403s = z;
                bfvf2.mo62320a(bfrn.f115043k);
                this.f150723e.mo62309b();
                bfrn2 = this.f150736s;
                if (cevw.m138320e()) {
                    this.f150726h.mo62320a(bfrn2.f115043k);
                    this.f150726h.mo62309b();
                    return;
                }
                this.f150726h.mo62323e();
            }
            this.f150723e.mo62323e();
            bfrn2 = this.f150736s;
            if (cevw.m138320e()) {
            }
            this.f150726h.mo62323e();
        }
        this.f150722d.mo62323e();
        bfrn = this.f150737t;
        this.f150723e.mo62322b(!bfrn.f115042j || this.f150736s.f115042j);
        if (m117214a(2)) {
        }
        j2 = bfrn.f115038f;
        if (this.f150733o) {
        }
        this.f150723e.mo62323e();
        bfrn2 = this.f150736s;
        if (cevw.m138320e()) {
        }
        this.f150726h.mo62323e();
    }
}
