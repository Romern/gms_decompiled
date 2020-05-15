package com.google.android.gms.scheduler.standalone;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ReceiverBasedNetworkConstraintObserver extends aacn implements apkq {

    /* renamed from: a */
    private int f107343a;

    /* renamed from: b */
    private boolean f107344b = false;

    public ReceiverBasedNetworkConstraintObserver(Context context) {
        super("scheduler");
        if (m92340a()) {
            m92339a(context);
        }
    }

    /* renamed from: a */
    private final void m92339a(Context context) {
        context.getApplicationContext().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f107344b = true;
    }

    /* renamed from: a */
    private final boolean m92341a(int i) {
        return (this.f107343a & i) == i;
    }

    /* renamed from: a */
    private final boolean m92340a() {
        return this.f107343a != 0 || (ceea.f182428a.mo6606a().mo78916a() ^ true);
    }

    /* renamed from: a */
    public final synchronized void mo47371a(Context context, int i) {
        if (i == 7) {
            try {
                this.f107343a |= 1;
            } catch (Throwable th) {
                throw th;
            }
        } else if (i == 3) {
            this.f107343a |= 2;
        }
        if (!this.f107344b && m92340a()) {
            m92339a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007c, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo6253a(Context context, Intent intent) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (!(!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
            int i = Build.VERSION.SDK_INT;
            if (intent.getIntExtra("networkType", 8) == activeNetworkInfo.getType()) {
                synchronized (this) {
                    int i2 = this.f107343a;
                    if (m92341a(2) && activeNetworkInfo.isConnected()) {
                        this.f107343a &= -3;
                    }
                    if (m92341a(1) && !C1185me.m19630a(connectivityManager)) {
                        this.f107343a &= -2;
                    }
                    if (!m92340a()) {
                        context.getApplicationContext().unregisterReceiver(this);
                        this.f107344b = false;
                    }
                    if (i2 != this.f107343a) {
                        apht.m70315a().f84404d.mo16943a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47372a(PrintWriter printWriter) {
        apkp.m70538a(printWriter, this.f107343a);
    }
}
