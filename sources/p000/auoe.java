package p000;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: auoe */
final /* synthetic */ class auoe implements Callable {

    /* renamed from: a */
    private final auol f92186a;

    /* renamed from: b */
    private final Object f92187b;

    /* renamed from: c */
    private final String f92188c;

    public auoe(auol auol, Object obj, String str) {
        this.f92186a = auol;
        this.f92187b = obj;
        this.f92188c = str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public final Object call() {
        auol auol = this.f92186a;
        Object obj = this.f92187b;
        String str = this.f92188c;
        synchronized (auol.f92195b) {
            auob auob = auol.f92198e;
            if (auob == null) {
                auol.f92192a.mo50711a("Failed to push value to SharedPreferenceService.Preference service is null.", new Object[0]).mo50706a();
                return null;
            } else if (obj != null) {
                try {
                    if (obj instanceof String) {
                        auob.mo50716a(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        auob.mo50718a(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof auok) {
                        auob.mo50717a(str, new ArrayList((auok) obj));
                    } else if (obj instanceof Long) {
                        auob.mo50715a(str, ((Long) obj).longValue());
                    } else if (!(obj instanceof Integer)) {
                        aunx aunx = auol.f92192a;
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(valueOf).length());
                        sb.append("Invalid type for preference value. Ignored. (key: ");
                        sb.append(str);
                        sb.append(" value: ");
                        sb.append(valueOf);
                        sb.append(").");
                        aunx.mo50711a(sb.toString(), new Object[0]).mo50706a();
                    } else {
                        auob.mo50714a(str, ((Integer) obj).intValue());
                    }
                } catch (RemoteException e) {
                    auol.f92192a.mo50710a("Failed to access preference service.", e, new Object[0]).mo50706a();
                }
            } else {
                auob.mo50719b(str);
            }
        }
        return null;
    }
}
