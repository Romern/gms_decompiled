package com.google.android.gms.drive.networkcontrol;

import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ChangeReceiver extends aacn {

    /* renamed from: a */
    private static final sbw f31081a = new sbw("ChangeReceiver", "");

    /* renamed from: b */
    private final Context f31082b;

    /* renamed from: c */
    private final Set f31083c = new HashSet();

    /* renamed from: d */
    private ved f31084d;

    protected ChangeReceiver(Context context, String... strArr) {
        super("drive");
        this.f31082b = context;
        int length = strArr.length;
        if (length <= 0) {
            f31081a.mo25377c("ChangeReceiver", "At least one action must be defined in a ChangeReceiver.");
        }
        IntentFilter intentFilter = new IntentFilter();
        for (String str : strArr) {
            intentFilter.addAction(str);
        }
        this.f31082b.registerReceiver(this, intentFilter);
    }

    /* renamed from: a */
    public final synchronized void mo18281a(vec vec) {
        ved ved = this.f31084d;
        if (ved == null) {
            f31081a.mo25377c("ChangeReceiver", "The state must be updated before adding the first listener.");
        } else {
            vec.mo27005a(ved);
        }
        if (!this.f31083c.add(vec)) {
            f31081a.mo25377c("ChangeReceiver", "The listener is already registered.");
        }
    }

    /* renamed from: b */
    public final synchronized void mo18283b(vec vec) {
        if (!this.f31083c.remove(vec)) {
            f31081a.mo25377c("ChangeReceiver", "Ignoring request to remove unknown listener");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18282a(ved ved) {
        ArrayList arrayList;
        if (ved == null) {
            f31081a.mo25377c("ChangeReceiver", "The state cannot be null.");
            return;
        }
        synchronized (this) {
            ved ved2 = this.f31084d;
            if (ved2 != null) {
                if (ved2.equals(ved)) {
                    arrayList = null;
                }
            }
            this.f31084d = ved;
            arrayList = new ArrayList(this.f31083c);
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((vec) arrayList.get(i)).mo27005a(ved);
            }
        }
    }
}
