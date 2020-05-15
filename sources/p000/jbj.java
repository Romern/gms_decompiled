package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.auth.folsom.recovery.KeyRecoveryIntentOperation;

/* renamed from: jbj */
public final /* synthetic */ class jbj implements Runnable {

    /* renamed from: a */
    private final KeyRecoveryIntentOperation f22104a;

    /* renamed from: b */
    private final Bundle f22105b;

    /* renamed from: c */
    private final PendingIntent f22106c;

    public jbj(KeyRecoveryIntentOperation keyRecoveryIntentOperation, Bundle bundle, PendingIntent pendingIntent) {
        this.f22104a = keyRecoveryIntentOperation;
        this.f22105b = bundle;
        this.f22106c = pendingIntent;
    }

    public final void run() {
        int i;
        KeyRecoveryIntentOperation keyRecoveryIntentOperation = this.f22104a;
        Bundle bundle = this.f22105b;
        PendingIntent pendingIntent = this.f22106c;
        try {
            jbi jbi = new jbi(keyRecoveryIntentOperation, jbk.m16462a(bundle));
            try {
                KeyRecoveryIntentOperation.f10913a.mo25414c("Sending start recovery request to VaultService", new Object[0]);
                int i2 = 10;
                try {
                    bqmv a = jbi.mo13560a();
                    switch (a.f141269a) {
                        case 0:
                            i2 = 2;
                            break;
                        case 1:
                            i2 = 3;
                            break;
                        case 2:
                            i2 = 4;
                            break;
                        case 3:
                            i2 = 5;
                            break;
                        case 4:
                            i2 = 6;
                            break;
                        case 5:
                            i2 = 7;
                            break;
                        case 6:
                            i2 = 8;
                            break;
                        case 7:
                            i2 = 9;
                            break;
                        case 8:
                            break;
                        case 9:
                            i2 = 11;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    if (i2 == 0) {
                        i2 = 1;
                    }
                    Logger Logger = KeyRecoveryIntentOperation.f10913a;
                    Object[] objArr = new Object[1];
                    if (i2 != 1) {
                        int i3 = i2 - 2;
                        objArr[0] = Integer.toString(i3);
                        Logger.mo25414c("OpenVault result %s", objArr);
                        if (i2 == 3) {
                            jbi.mo13561b();
                        }
                        bxun bxun = a.f141271c;
                        if (bxun == null) {
                            bxun = bxun.f164861c;
                        }
                        switch (i3) {
                            case 1:
                                i = 2;
                                break;
                            case 2:
                                i = 3;
                                break;
                            case 3:
                                i = 4;
                                break;
                            case 4:
                                i = 5;
                                break;
                            case 5:
                                i = 6;
                                break;
                            case 6:
                                i = 7;
                                break;
                            case 7:
                                i = 8;
                                break;
                            case 8:
                                i = 9;
                                break;
                            default:
                                i = 1;
                                break;
                        }
                        keyRecoveryIntentOperation.mo7710a(pendingIntent, i, bxun);
                        jbi.close();
                        return;
                    }
                    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
                } catch (eic e) {
                    KeyRecoveryIntentOperation.f10913a.mo25417e("Network exception while performing recovery", e, new Object[0]);
                    keyRecoveryIntentOperation.mo7709a(pendingIntent, 10);
                } catch (jbl e2) {
                    KeyRecoveryIntentOperation.f10913a.mo25417e("Exception while performing recovery", e2, new Object[0]);
                    keyRecoveryIntentOperation.mo7709a(pendingIntent, e2.f22116a);
                }
            } catch (jbl e3) {
                jbl jbl = e3;
                KeyRecoveryIntentOperation.f10913a.mo25417e("Recovery Exception", jbl, new Object[0]);
                keyRecoveryIntentOperation.mo7709a(pendingIntent, jbl.f22116a);
            } catch (Throwable th) {
                Throwable th2 = th;
                try {
                    jbi.close();
                } catch (Throwable th3) {
                    bqye.m113761a(th2, th3);
                }
                throw th2;
            }
        } catch (jbl e4) {
            KeyRecoveryIntentOperation.f10913a.mo25417e("Exception creating recoveryData", e4, new Object[0]);
            keyRecoveryIntentOperation.mo7709a(pendingIntent, e4.f22116a);
        }
    }
}
