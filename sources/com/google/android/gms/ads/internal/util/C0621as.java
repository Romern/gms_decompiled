package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.internal.util.as */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0621as {

    /* renamed from: a */
    private final Map f8936a = new WeakHashMap();

    public C0621as() {
        new C0620ar(this);
    }

    /* renamed from: a */
    public final synchronized void mo6796a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f8936a.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }
}
