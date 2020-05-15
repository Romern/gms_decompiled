package com.google.android.ads.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.ads.tasks.w */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0182w {

    /* renamed from: a */
    private final Map f7599a = new HashMap();

    /* renamed from: a */
    public final AtomicReference mo5040a(String str) {
        synchronized (this) {
            if (!this.f7599a.containsKey(str)) {
                this.f7599a.put(str, new AtomicReference());
            }
        }
        return (AtomicReference) this.f7599a.get(str);
    }
}
