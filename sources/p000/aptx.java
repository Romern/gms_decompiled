package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.HarmfulAppsInfo;
import java.util.concurrent.TimeUnit;

/* renamed from: aptx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aptx extends aaab {

    /* renamed from: a */
    public final aptw f84890a;

    /* renamed from: b */
    private final apga f84891b;

    /* renamed from: c */
    private final aptz f84892c;

    /* renamed from: d */
    private final int f84893d;

    static {
        aptx.class.getSimpleName();
    }

    public aptx(Context context, apga apga) {
        super(45, "listharmful");
        this.f84893d = apuh.m71020a(context);
        this.f84891b = apga;
        this.f84890a = new aptw(context, this.f84891b);
        this.f84892c = new aptz(context, this.f84891b, TimeUnit.HOURS.toMillis(1));
    }

    /* renamed from: a */
    public static final void m70998a(Context context, ServiceConnection serviceConnection) {
        skh.m35531a().mo25690a(context, new Intent("com.google.android.vending.verifier.ACTION_PACKAGE_VERIFICATION_API").setPackage("com.android.vending"), serviceConnection, 1);
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!apuh.m71028b(context, "com.android.vending")) {
            mo6503a(new Status(12003));
        } else if (this.f84893d < 80700200) {
            mo6503a(new Status(12003));
        } else if (!apuh.m71027b(context)) {
            mo6503a(new Status(12005));
        } else if (this.f84893d >= 80852100) {
            m70998a(context, this.f84892c.f84897c);
        } else {
            m70998a(context, this.f84890a.f84887c);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        apga apga = this.f84891b;
        if (apga != null) {
            try {
                apga.mo47169a(status, (HarmfulAppsInfo) null);
            } catch (RemoteException e) {
            }
        }
    }
}
