package com.google.android.gms.plus.service;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.ClientContext;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class PlusChimeraService extends Service {

    /* renamed from: a */
    public static final SparseArray f82609a;

    /* renamed from: b */
    public static final String[] f82610b = new String[0];

    static {
        SparseArray sparseArray = new SparseArray();
        f82609a = sparseArray;
        sparseArray.put(0, "all");
    }

    /* renamed from: a */
    public static IBinder m68556a(String str, Context context, ClientContext clientContext, ClientContext clientContext2, aoav aoav) {
        if ("com.google.android.gms.plus.service.START".equals(str)) {
            return new antw(context, clientContext, clientContext2);
        }
        if ("com.google.android.gms.plus.service.internal.START".equals(str)) {
            return new antp(context, clientContext, clientContext2);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
    }

    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.gms.plus.service.START".equals(action) || "com.google.android.gms.plus.service.internal.START".equals(action)) {
            return new aoax(this, action, this);
        }
        return null;
    }

    /* renamed from: a */
    public static void m68557a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            throw new SecurityException("Calling uid not permitted.");
        }
    }
}
