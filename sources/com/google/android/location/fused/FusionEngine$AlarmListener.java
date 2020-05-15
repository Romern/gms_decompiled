package com.google.android.location.fused;

import android.os.Build;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FusionEngine$AlarmListener extends spb {

    /* renamed from: b */
    final /* synthetic */ bfqs f150717b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FusionEngine$AlarmListener(bfqs bfqs) {
        super("location");
        this.f150717b = bfqs;
    }

    /* renamed from: a */
    public final void mo25922a() {
        int i = Build.VERSION.SDK_INT;
        this.f150717b.mo62161f();
        this.f150717b.mo62157c();
    }
}
