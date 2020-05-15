package com.google.android.gms.fido.authenticator.autoenroll;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FidoEnrollmentIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f31633a = new sek(new String[]{"FidoEnrollmentIntentOperation"}, (short[]) null);

    /* renamed from: b */
    private final Context f31634b;

    /* renamed from: c */
    private final xwj f31635c;

    /* renamed from: d */
    private final xbk f31636d;

    /* renamed from: e */
    private final xbx f31637e;

    /* renamed from: f */
    private final xwn f31638f;

    public FidoEnrollmentIntentOperation() {
        this.f31634b = this;
        this.f31635c = xwj.m43507a(xwi.FIDO_AUTOENROLLMENT_V1);
        this.f31636d = new xbk(this);
        this.f31637e = new xbx(this);
        this.f31638f = xwm.m43525a();
    }

    /* renamed from: a */
    public static void m23414a(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoEnrollmentIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"), 0, 134217728);
        skc skc = new skc(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long longValue = ((Long) xmn.f52761k.mo58455c()).longValue();
        long j = longValue / 2;
        double random = Math.random();
        double d = (double) longValue;
        Double.isNaN(d);
        skc.mo25675a("FidoEnrollmentIntentOperation", 2, elapsedRealtime + j + ((long) (random * d)), pendingIntent, str);
    }

    public final void onHandleIntent(Intent intent) {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        f31633a.mo25412b("Received %s event", intent.getAction());
        if (!intent.getAction().equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE")) {
            f31633a.mo25418e("Intent action %s is not FIDO enrollment", intent.getAction());
            return;
        }
        m23414a(this.f31634b, getPackageName());
        if (((Boolean) xmn.f52757g.mo58455c()).booleanValue()) {
            if (!((Boolean) xmn.f52759i.mo58455c()).booleanValue()) {
                countDownLatch = new CountDownLatch(0);
            } else {
                try {
                    Set<String> a = this.f31636d.mo29610a(xka.SOFTWARE_KEY);
                    CountDownLatch countDownLatch3 = new CountDownLatch(a.size());
                    for (String str : a) {
                        this.f31637e.mo29622a(str, xka.SOFTWARE_KEY, new xbq(this, countDownLatch3));
                    }
                    countDownLatch = countDownLatch3;
                } catch (xbn e) {
                    f31633a.mo25417e("Encountered an issue with the database", e, new Object[0]);
                    mo18635a(wzu.KEY_TYPE_SOFTWARE, e);
                    countDownLatch = new CountDownLatch(0);
                }
            }
            if (!((Boolean) xmn.f52760j.mo58455c()).booleanValue()) {
                countDownLatch2 = new CountDownLatch(0);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (!this.f31634b.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    countDownLatch2 = new CountDownLatch(0);
                } else {
                    try {
                        Set<String> a2 = this.f31636d.mo29610a(xka.STRONGBOX_KEY);
                        CountDownLatch countDownLatch4 = new CountDownLatch(a2.size());
                        for (String str2 : a2) {
                            this.f31637e.mo29622a(str2, xka.STRONGBOX_KEY, new xbp(this, countDownLatch4));
                        }
                        countDownLatch2 = countDownLatch4;
                    } catch (xbn e2) {
                        f31633a.mo25417e("Encountered an issue with the database", e2, new Object[0]);
                        mo18635a(wzu.KEY_TYPE_STRONGBOX, e2);
                        countDownLatch2 = new CountDownLatch(0);
                    }
                }
            }
            if (((Boolean) xmn.f52758h.mo58455c()).booleanValue()) {
                if (!((KeyguardManager) this.f31634b.getSystemService("keyguard")).isDeviceSecure()) {
                    f31633a.mo25412b("Screen lock is not enabled on device, not enrolling hardware-backed keys", new Object[0]);
                } else {
                    try {
                        Set a3 = this.f31636d.mo29610a(xka.ANDROID_KEYSTORE);
                        if (a3.isEmpty()) {
                            f31633a.mo25412b("All existing accounts have KeyStore keys enrolled. No enrollment is needed", new Object[0]);
                        } else {
                            FidoEnrollmentPersistentIntentOperation.m23417a(this.f31634b, a3);
                        }
                    } catch (xbn e3) {
                        f31633a.mo25417e("Encountered an issue with the database", e3, new Object[0]);
                        mo18635a(wzu.KEY_TYPE_KEYSTORE, e3);
                    }
                }
            }
            try {
                countDownLatch.await(300000, TimeUnit.MILLISECONDS);
                countDownLatch2.await(300000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e4) {
                f31633a.mo25417e("Software or StrongBox key enrollments timed out or got interrupted", e4, new Object[0]);
            }
        } else {
            f31633a.mo25418e("Fido auto enrollment is disabled", new Object[0]);
        }
    }

    FidoEnrollmentIntentOperation(Context context, xwj xwj, xbk xbk, xbx xbx, xwn xwn) {
        this.f31634b = context;
        this.f31635c = xwj;
        this.f31636d = xbk;
        this.f31637e = xbx;
        this.f31638f = xwn;
    }

    /* renamed from: a */
    public final void mo18634a(wzu wzu) {
        this.f31638f.mo30193a(this.f31635c, wzs.EVENT_TYPE_ENROLLMENT_SUCCESS, wzu, 2, null);
    }

    /* renamed from: a */
    public final void mo18635a(wzu wzu, Exception exc) {
        this.f31638f.mo30193a(this.f31635c, wzs.EVENT_TYPE_ENROLLMENT_ERROR, wzu, 2, exc);
    }
}
