package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FidoEnrollmentPersistentIntentOperation extends IntentOperation implements xbz {

    /* renamed from: d */
    public static final sek f31639d = new sek(new String[]{"FidoEnrollmentPersistentIntentOperation"}, (short[]) null);

    /* renamed from: a */
    public final xwj f31640a;

    /* renamed from: b */
    public final xwn f31641b;

    /* renamed from: c */
    public CountDownLatch f31642c;

    /* renamed from: e */
    private final xca f31643e;

    /* renamed from: f */
    private final xbx f31644f;

    /* renamed from: g */
    private ArrayList f31645g;

    public FidoEnrollmentPersistentIntentOperation() {
        this.f31640a = xwj.m43507a(xwi.FIDO_AUTOENROLLMENT_V1);
        this.f31643e = new xca(this, this);
        this.f31644f = new xbx(this);
        this.f31641b = xwm.m43525a();
    }

    /* renamed from: a */
    public static void m23417a(Context context, Set set) {
        if (set != null && !set.isEmpty()) {
            Intent startIntent = IntentOperation.getStartIntent(context, FidoEnrollmentPersistentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT");
            startIntent.putStringArrayListExtra("extra_accounts", new ArrayList(set));
            context.startService(startIntent);
            return;
        }
        f31639d.mo25412b("Account list is empty. No need to start FIDO key enrollment", new Object[0]);
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        sek sek = f31639d;
        String valueOf = String.valueOf(action);
        sek.mo25412b(valueOf.length() == 0 ? new String("Received action ") : "Received action ".concat(valueOf), new Object[0]);
        if (action.equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT")) {
            this.f31645g = intent.getStringArrayListExtra("extra_accounts");
            if (this.f31642c == null) {
                this.f31642c = new CountDownLatch(this.f31645g.size());
            }
            this.f31643e.mo29625a();
            try {
                this.f31642c.await(24, TimeUnit.HOURS);
            } catch (InterruptedException e) {
                f31639d.mo25418e("The countdown latch is interrupted", new Object[0]);
            }
            this.f31643e.mo29626b();
            return;
        }
        f31639d.mo25418e("Action %s is not supported", action);
    }

    FidoEnrollmentPersistentIntentOperation(xwj xwj, xca xca, CountDownLatch countDownLatch, xbx xbx, xwn xwn) {
        this.f31640a = xwj;
        bmxy.m108581a(xca);
        this.f31643e = xca;
        bmxy.m108581a(countDownLatch);
        this.f31642c = countDownLatch;
        bmxy.m108581a(xbx);
        this.f31644f = xbx;
        this.f31641b = xwn;
    }

    /* renamed from: a */
    public final void mo18636a() {
        ArrayList arrayList = this.f31645g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sek sek = f31639d;
            String valueOf = String.valueOf(str);
            sek.mo25412b(valueOf.length() == 0 ? new String("Start FIDO key enrollment for account ") : "Start FIDO key enrollment for account ".concat(valueOf), new Object[0]);
            this.f31644f.mo29622a(str, xka.ANDROID_KEYSTORE, new xbr(this));
        }
    }
}
