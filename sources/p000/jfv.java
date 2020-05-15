package p000;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import com.google.android.gms.auth.managed.intentoperations.RevokePasswordRequirementsIntentOperation;

/* renamed from: jfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jfv {

    /* renamed from: a */
    private static final Logger f22398a = ght.m13171a("AuthManaged", "PasswordComplexityCheckerImpl");

    /* renamed from: b */
    private static jfv f22399b;

    /* renamed from: c */
    private final jhn f22400c;

    private jfv(jhn jhn) {
        this.f22400c = jhn;
    }

    /* renamed from: a */
    public static synchronized jfv m16651a() {
        jfv a;
        synchronized (jfv.class) {
            a = m16652a(jho.m16722b());
        }
        return a;
    }

    /* renamed from: b */
    private static final DevicePolicyManager m16653b(Context context) {
        return (DevicePolicyManager) context.getSystemService("device_policy");
    }

    /* renamed from: a */
    public static synchronized jfv m16652a(jhn jhn) {
        jfv jfv;
        synchronized (jfv.class) {
            if (f22399b == null) {
                f22399b = new jfv(jhn);
            }
            jfv = f22399b;
        }
        return jfv;
    }

    /* renamed from: a */
    public final synchronized void mo13706a(Context context) {
        int a = this.f22400c.mo13746a();
        if (a != 1) {
            Logger Logger = f22398a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a);
            Logger.mo25416d(sb.toString(), new Object[0]);
        } else if (!this.f22400c.mo13749a(context)) {
            f22398a.mo25416d("Device admin not active.", new Object[0]);
        } else {
            this.f22400c.mo13747a(m16653b(context));
            ((jho) this.f22400c).mo13751c(context).mo25668a(RevokePasswordRequirementsIntentOperation.m6702a(context));
        }
    }

    /* renamed from: a */
    public final synchronized void mo13707a(Context context, int i) {
        jfu jfu;
        int a = this.f22400c.mo13746a();
        if (a != 1) {
            Logger Logger = f22398a;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Device incompatible. Reason: ");
            sb.append(a);
            Logger.mo25416d(sb.toString(), new Object[0]);
        } else if (!this.f22400c.mo13749a(context)) {
            f22398a.mo25416d("Device admin not active.", new Object[0]);
        } else {
            jft[] jftArr = jft.f22387a;
            int length = jftArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    jfu = new jfu(0, 0);
                    break;
                }
                jft jft = jftArr[i2];
                if (jft.f22394b == i) {
                    jfu = (jfu) jft.f22395c.get(0);
                    break;
                }
                i2++;
            }
            ((jho) this.f22400c).mo13751c(context).mo25675a("PasswordComplexityRevokeAlarm", 1, 300000 + System.currentTimeMillis(), RevokePasswordRequirementsIntentOperation.m6702a(context), (String) null);
            this.f22400c.mo13748a(m16653b(context), jfu.f22396a, jfu.f22397b);
        }
    }
}
