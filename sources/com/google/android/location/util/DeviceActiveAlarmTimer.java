package com.google.android.location.util;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeviceActiveAlarmTimer extends spb {

    /* renamed from: b */
    public final spf f150955b;

    /* renamed from: c */
    public boolean f150956c;

    /* renamed from: d */
    public long f150957d;

    /* renamed from: e */
    public boolean f150958e;

    /* renamed from: f */
    public long f150959f;

    /* renamed from: g */
    private final bhbg f150960g;

    /* renamed from: h */
    private Handler f150961h;

    /* renamed from: i */
    private String f150962i;

    /* renamed from: j */
    private spb f150963j;

    /* renamed from: k */
    private int f150964k;

    /* renamed from: l */
    private Collection f150965l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceActiveAlarmTimer(Context context, Looper looper) {
        super("context");
        spf a = spf.m35821a(context);
        bhbg bhbg = new bhbg(context);
        this.f150955b = a;
        this.f150960g = bhbg;
        this.f150961h = new adzt(looper);
    }

    /* renamed from: f */
    private final void m117387f() {
        this.f150956c = false;
        this.f150963j = null;
        this.f150965l = null;
        bhbg bhbg = this.f150960g;
        int i = Build.VERSION.SDK_INT;
        if (bhbg.f118236f != null) {
            bhbg.f118231a.unregisterReceiver(bhbg.f118233c);
            bhbg.f118236f = null;
        }
    }

    /* renamed from: a */
    public final void mo25922a() {
        if (this.f150956c) {
            mo70958d();
        }
    }

    /* renamed from: b */
    public final void mo70956b() {
        if (this.f150956c) {
            this.f150955b.mo25932a(this);
            m117387f();
        }
    }

    /* renamed from: c */
    public final long mo70957c() {
        if (this.f150956c) {
            return !this.f150958e ? this.f150957d - (SystemClock.elapsedRealtime() - this.f150959f) : this.f150957d;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: d */
    public final void mo70958d() {
        spb spb = this.f150963j;
        m117387f();
        if (spb != null) {
            spb.mo25922a();
        }
    }

    /* renamed from: a */
    public final void mo70955a(long j, Collection collection, String str, spb spb) {
        if (!this.f150956c) {
            bhbg bhbg = this.f150960g;
            Handler handler = this.f150961h;
            int i = Build.VERSION.SDK_INT;
            bhbg.f118235e = bhbg.mo63518a();
            if (bhbg.f118236f == null) {
                bhbg.f118231a.registerReceiver(bhbg.f118233c, bhbg.f118234d, null, handler);
            }
            bhbg.f118236f = this;
            this.f150958e = this.f150960g.mo63518a();
        } else {
            this.f150955b.mo25932a(this);
        }
        this.f150956c = true;
        this.f150965l = collection;
        this.f150964k = 3;
        this.f150962i = str;
        this.f150963j = spb;
        this.f150957d = j;
        if (!this.f150958e) {
            mo70959e();
        }
    }

    /* renamed from: e */
    public final void mo70959e() {
        this.f150959f = SystemClock.elapsedRealtime();
        if (this.f150957d > 0) {
            this.f150955b.mo25930a(this.f150962i, this.f150964k, SystemClock.elapsedRealtime() + this.f150957d, this, this.f150961h, saq.m34797a(this.f150965l));
        } else {
            mo70958d();
        }
    }
}
