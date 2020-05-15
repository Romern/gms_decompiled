package com.google.android.gms.ads.internal.webview;

import android.webkit.ConsoleMessage;

/* renamed from: com.google.android.gms.ads.internal.webview.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final /* synthetic */ class C0697g {

    /* renamed from: a */
    static final /* synthetic */ int[] f9043a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        f9043a = iArr;
        try {
            iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f9043a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f9043a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            f9043a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f9043a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
    }
}
