package p000;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.chimera.PersistentIntentOperationService;

/* renamed from: qkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qkw extends dii {

    /* renamed from: f */
    private static volatile qkw f41626f = null;

    public qkw(ComponentName componentName) {
        super(componentName);
    }

    /* renamed from: b */
    public static qkw m32313b() {
        qkw qkw = f41626f;
        if (qkw == null) {
            synchronized (qkw.class) {
                qkw = f41626f;
                if (qkw == null) {
                    qkw qkw2 = new qkw(new ComponentName("com.google.android.gms", PersistentIntentOperationService.class.getName()));
                    f41626f = qkw2;
                    qkw = qkw2;
                }
            }
        }
        return qkw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo9095a(Context context, String str, long j) {
        String valueOf = String.valueOf(str);
        asfb asfb = new asfb(context, 1, valueOf.length() == 0 ? new String("IntentOp:") : "IntentOp:".concat(valueOf), null, "com.google.android.gms", str);
        asfb.mo49115a(false);
        asfb.mo49111a(j);
        return asfb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9097a(Object obj) {
        if (obj != null) {
            sdo.m34974b(obj instanceof asfb);
            asfb asfb = (asfb) obj;
            if (asfb.mo49124e()) {
                asfb.mo49120c();
            }
        }
    }
}
