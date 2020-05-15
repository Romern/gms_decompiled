package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SynchronizedUpdateBoundService extends BoundService {
    /* renamed from: a */
    public static byte[] m22416a(int i) {
        bxvd da = aylv.f97937c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aylv aylv = (aylv) da.f164949b;
        aylv.f97940b = i - 1;
        aylv.f97939a |= 1;
        return ((aylv) da.mo74062i()).mo73642k();
    }

    public final IBinder onBind(Intent intent) {
        return new enf(this);
    }
}
