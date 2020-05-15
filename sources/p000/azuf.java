package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* renamed from: azuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azuf extends azug {

    /* renamed from: a */
    public static final bnic f100042a = bnic.m109492a("getContact", "getConversation", "isFeatureEnabled", "getMessagesForConversation");

    /* renamed from: b */
    public final Context f100043b;

    /* renamed from: c */
    public final azue f100044c;

    /* renamed from: d */
    public final azwo f100045d;

    public azuf(Context context, String str, azqr azqr, azue azue, azwo azwo) {
        super(str, azqr);
        this.f100044c = azue;
        this.f100045d = azwo;
        this.f100043b = context.getApplicationContext();
    }

    @JavascriptInterface
    public String callNativeMethod(String str) {
        String callNativeMethod = super.callNativeMethod(str);
        if (cfgs.m139383C()) {
            new soa(9, new azud(this, str)).start();
        }
        return callNativeMethod;
    }
}
