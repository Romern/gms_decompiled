package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LegacyBugReportChimeraService extends Service {

    /* renamed from: a */
    private final IBinder f31613a = new wxh(this);

    public final IBinder onBind(Intent intent) {
        return this.f31613a;
    }
}
