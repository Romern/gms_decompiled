package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.android.cast.JGCastService;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.security.snet.OperationLauncherIntentOperation;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: apub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apub extends apuj {

    /* renamed from: a */
    private final int f84901a = 1;

    /* renamed from: b */
    private final apga f84902b;

    /* renamed from: d */
    private final apua f84903d;

    static {
        apub.class.getSimpleName();
    }

    public apub(Context context, apga apga) {
        this(context, apga, apua.m71005a(context));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (this.f84901a != 1) {
            this.f84903d.mo47625a(this.f84902b);
            this.f84903d.mo47627c();
            if (!apuh.m71028b(context, "com.android.vending")) {
                mo47617b(new Status(12003));
            } else if (this.f84903d.mo47630f()) {
            } else {
                if (apuh.m71027b(context)) {
                    this.f84903d.mo47626a(new Status(0), 0);
                } else if (!apum.m71051c(context)) {
                    mo47617b(new Status(12003));
                } else if (apuh.m71020a(context) >= 80700200) {
                    Intent addFlags = new Intent("com.google.android.vending.verifier.REQUEST_CONSENT").setPackage("com.android.vending").addFlags(268435456);
                    int i = Build.VERSION.SDK_INT;
                    ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(addFlags, AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE);
                    if (resolveActivity != null) {
                        addFlags.setClassName("com.android.vending", resolveActivity.activityInfo.name);
                        int i2 = apuc.f84904b;
                        PendingIntent service = PendingIntent.getService(context, 0, IntentOperation.getStartIntent(context, OperationLauncherIntentOperation.class, "com.google.android.gms.security.apis.verifyapps.CONSENT_RESULT").putExtra("nonce", apua.m71005a(context).mo47628d()), JGCastService.FLAG_PRIVATE_DISPLAY);
                        this.f84903d.mo47624a(service);
                        addFlags.putExtra("consent_result_intent", service);
                    } else {
                        addFlags = null;
                    }
                    if (addFlags == null) {
                        mo47617b(new Status(12003));
                    } else {
                        mo47616a(context, addFlags);
                    }
                } else {
                    mo47617b(new Status(12003));
                }
            }
        } else {
            boolean b = apuh.m71027b(context);
            apga apga = this.f84902b;
            if (apga != null) {
                apga.mo47166a(new Status(0), b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo47617b(Status status) {
        apua.m71005a(this.f84919c).mo47626a(status, 1);
    }

    public apub(Context context, apga apga, apua apua) {
        super(context, "vappsprompt");
        this.f84902b = apga;
        this.f84903d = apua;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47616a(Context context, Intent intent) {
        if (!this.f84903d.mo47630f()) {
            this.f84903d.mo47629e();
            apue.m71014a(context).mo47621b(1);
            context.startActivity(intent);
        }
    }
}
