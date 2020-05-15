package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: rnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rnb implements rnv, rlu {

    /* renamed from: a */
    public final Lock f43347a;

    /* renamed from: b */
    public final Condition f43348b;

    /* renamed from: c */
    public final Context f43349c;

    /* renamed from: d */
    public final rfj f43350d;

    /* renamed from: e */
    public final rna f43351e;

    /* renamed from: f */
    final Map f43352f;

    /* renamed from: g */
    final Map f43353g = new HashMap();

    /* renamed from: h */
    final sat f43354h;

    /* renamed from: i */
    final Map f43355i;

    /* renamed from: j */
    public volatile rmy f43356j;

    /* renamed from: k */
    int f43357k;

    /* renamed from: l */
    final rmx f43358l;

    /* renamed from: m */
    final rnu f43359m;

    /* renamed from: n */
    final rjl f43360n;

    /* renamed from: o */
    private ConnectionResult f43361o = null;

    public rnb(Context context, rmx rmx, Lock lock, Looper looper, rfj rfj, Map map, sat sat, Map map2, rjl rjl, ArrayList arrayList, rnu rnu) {
        this.f43349c = context;
        this.f43347a = lock;
        this.f43350d = rfj;
        this.f43352f = map;
        this.f43354h = sat;
        this.f43355i = map2;
        this.f43360n = rjl;
        this.f43358l = rmx;
        this.f43359m = rnu;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((rlt) arrayList.get(i)).f43248b = this;
        }
        this.f43351e = new rna(this, looper);
        this.f43348b = lock.newCondition();
        this.f43356j = new rmt(this);
    }

    /* renamed from: a */
    public final ConnectionResult mo24876a(long j, TimeUnit timeUnit) {
        mo24878a();
        long nanos = timeUnit.toNanos(j);
        while (mo24886e()) {
            if (nanos > 0) {
                try {
                    nanos = this.f43348b.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            } else {
                mo24884c();
                return new ConnectionResult(14, null);
            }
        }
        if (mo24885d()) {
            return ConnectionResult.f30063a;
        }
        ConnectionResult connectionResult = this.f43361o;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: a */
    public final boolean mo24881a(ico ico) {
        return false;
    }

    /* renamed from: b */
    public final ConnectionResult mo24882b() {
        mo24878a();
        while (mo24886e()) {
            try {
                this.f43348b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (mo24885d()) {
            return ConnectionResult.f30063a;
        }
        ConnectionResult connectionResult = this.f43361o;
        return connectionResult == null ? new ConnectionResult(13, null) : connectionResult;
    }

    /* renamed from: c */
    public final void mo24884c() {
        if (this.f43356j.mo24898b()) {
            this.f43353g.clear();
        }
    }

    /* renamed from: d */
    public final boolean mo24885d() {
        return this.f43356j instanceof rmh;
    }

    /* renamed from: e */
    public final boolean mo24886e() {
        return this.f43356j instanceof rms;
    }

    /* renamed from: f */
    public final void mo24887f() {
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f43347a.lock();
        try {
            this.f43356j.mo24895a(bundle);
        } finally {
            this.f43347a.unlock();
        }
    }

    /* renamed from: b */
    public final rle mo24883b(rle rle) {
        rle.mo17721f();
        return this.f43356j.mo24892a(rle);
    }

    /* renamed from: a */
    public final rle mo24877a(rle rle) {
        rle.mo17721f();
        this.f43356j.mo24897b(rle);
        return rle;
    }

    /* renamed from: a */
    public final void mo24878a() {
        this.f43356j.mo24899c();
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f43347a.lock();
        try {
            this.f43356j.mo24894a(i);
        } finally {
            this.f43347a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24919a(ConnectionResult connectionResult) {
        this.f43347a.lock();
        try {
            this.f43361o = connectionResult;
            this.f43356j = new rmt(this);
            this.f43356j.mo24893a();
            this.f43348b.signalAll();
        } finally {
            this.f43347a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo24880a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append((CharSequence) "mState=").println(this.f43356j);
        for (rjo rjo : this.f43355i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) rjo.f43149a).println(":");
            ((rjm) this.f43352f.get(rjo.mo24653a())).mo24645a(concat, printWriter);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24920a(rmz rmz) {
        this.f43351e.sendMessage(this.f43351e.obtainMessage(1, rmz));
    }
}
