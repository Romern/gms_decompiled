package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FidoKeyValidityCheckPersistentIntentOperation extends IntentOperation implements xbz {

    /* renamed from: g */
    private static final sek f31655g = new sek(new String[]{"FidoKeyValidityCheckPersistentIntentOperation"}, (short[]) null);

    /* renamed from: a */
    private final Context f31656a;

    /* renamed from: b */
    private final xwj f31657b;

    /* renamed from: c */
    private final CountDownLatch f31658c;

    /* renamed from: d */
    private final xdx f31659d;

    /* renamed from: e */
    private final xbo f31660e;

    /* renamed from: f */
    private final xwn f31661f;

    public FidoKeyValidityCheckPersistentIntentOperation() {
        this.f31656a = this;
        this.f31657b = xwj.m43507a(xwi.FIDO_KEY_VALIDITY_CHECK_V1);
        this.f31658c = new CountDownLatch(1);
        this.f31659d = new xdx();
        this.f31660e = (xbo) xbo.f51879a.mo33309a();
        this.f31661f = xwm.m43525a();
    }

    /* renamed from: a */
    private final void m23421a(Throwable th) {
        this.f31661f.mo30193a(this.f31657b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_ERROR, wzu.KEY_TYPE_KEYSTORE, 2, th);
    }

    public final void onDestroy() {
    }

    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        sek sek = f31655g;
        String valueOf = String.valueOf(action);
        sek.mo25412b(valueOf.length() == 0 ? new String("Received action ") : "Received action ".concat(valueOf), new Object[0]);
        if (!action.equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_VALIDITY_CHECK")) {
            f31655g.mo25418e("Action %s is not supported", action);
            return;
        }
        xca xca = new xca(this.f31656a, this);
        xca.mo29625a();
        try {
            this.f31658c.await();
        } catch (InterruptedException e) {
            f31655g.mo25418e("The countdown latch is interrupted", new Object[0]);
        }
        xca.mo29626b();
    }

    /* renamed from: a */
    public final void mo18636a() {
        boolean z;
        f31655g.mo25412b("Received user presence action", new Object[0]);
        boolean z2 = true;
        try {
            boolean z3 = false;
            z = false;
            for (xjx xjx : this.f31660e.mo29612a()) {
                try {
                    if (!this.f31659d.mo29676b(xjx)) {
                        this.f31660e.mo29616a(xjx);
                        try {
                            this.f31659d.mo29672a(xjx);
                            z = true;
                        } catch (xma e) {
                            sek sek = f31655g;
                            String valueOf = String.valueOf(xjx.mo29848b());
                            sek.mo25418e(valueOf.length() == 0 ? new String("Error deleting credential ") : "Error deleting credential ".concat(valueOf), new Object[0]);
                            m23421a(e);
                            z3 = true;
                        }
                    }
                } catch (xbn e2) {
                    e = e2;
                    f31655g.mo25417e("Error interacting with the database", e, new Object[0]);
                    m23421a(e);
                    this.f31661f.mo30193a(this.f31657b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
                    this.f31658c.countDown();
                }
            }
            z2 = z3;
        } catch (xbn e3) {
            e = e3;
            z = false;
            f31655g.mo25417e("Error interacting with the database", e, new Object[0]);
            m23421a(e);
            this.f31661f.mo30193a(this.f31657b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
            this.f31658c.countDown();
        }
        if (z && !z2) {
            this.f31661f.mo30193a(this.f31657b, wzs.EVENT_TYPE_HARDWARE_KEY_INVALIDATION_SUCCESS, wzu.KEY_TYPE_KEYSTORE, 2, null);
        }
        this.f31658c.countDown();
    }

    FidoKeyValidityCheckPersistentIntentOperation(Context context, xwj xwj, CountDownLatch countDownLatch, xdx xdx, xbo xbo) {
        this.f31656a = context;
        this.f31657b = xwj;
        this.f31658c = countDownLatch;
        this.f31659d = xdx;
        this.f31660e = xbo;
        this.f31661f = xwm.m43525a();
    }
}
