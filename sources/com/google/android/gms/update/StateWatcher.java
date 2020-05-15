package com.google.android.gms.update;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class StateWatcher extends aacn {

    /* renamed from: a */
    public final Context f109452a;

    /* renamed from: b */
    public int f109453b = 0;

    /* renamed from: c */
    private final Runnable f109454c;

    /* renamed from: d */
    private boolean f109455d = false;

    /* renamed from: e */
    private int f109456e = 100;

    /* renamed from: f */
    private boolean f109457f = false;

    public StateWatcher(Context context, Runnable runnable) {
        super("ota");
        this.f109452a = context;
        this.f109454c = runnable;
        this.f109453b = context.getSharedPreferences("update", 0).getInt("battery_state", 0);
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        int i;
        boolean z;
        boolean z2;
        String action = intent.getAction();
        boolean z3 = true;
        boolean z4 = false;
        if (action.equals("android.intent.action.BATTERY_CHANGED")) {
            this.f109456e = intent.getIntExtra("level", -1);
            if (intent.getIntExtra("plugged", 0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f109457f = z2;
        }
        if (this.f109457f) {
            i = this.f109456e < ((Long) avlw.f93342c.mo51364a()).intValue() ? 1 : 0;
        } else {
            i = this.f109456e < ((Long) avlw.f93341b.mo51364a()).intValue() ? 2 : 0;
        }
        if (i != this.f109453b) {
            this.f109453b = i;
            z = true;
        } else {
            z = false;
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            boolean z5 = this.f109455d;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                Log.w("StateWatcher", "couldn't get connectivity manager");
                z4 = z5;
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isRoaming()) {
                    z4 = true;
                }
            }
            if (z4 != this.f109455d) {
                this.f109455d = z4;
                if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE") || z3) {
                    this.f109454c.run();
                }
                return;
            }
        }
        z3 = z;
        if (action.equals("com.google.android.checkin.CHECKIN_COMPLETE")) {
            return;
        }
        this.f109454c.run();
    }
}
