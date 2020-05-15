package com.google.android.gms.common.app;

import android.content.Context;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SignalHandler {

    /* renamed from: a */
    public static boolean f30144a;

    /* renamed from: b */
    public Context f30145b;

    public SignalHandler(Context context) {
        this.f30145b = context;
    }

    public static native boolean installShushSignalHandlers(String str, int i, int i2, int i3, boolean z);
}
