package p000;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ahgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahgz {

    /* renamed from: a */
    private static final Object f67202a = new Object();

    /* renamed from: b */
    private final Context f67203b;

    /* renamed from: c */
    private final String f67204c;

    /* renamed from: d */
    private final Map f67205d = new HashMap();

    /* renamed from: e */
    private final ArrayList f67206e = new ArrayList();

    /* renamed from: a */
    public static ahgz m55753a(Context context) {
        ahgz ahgz;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        Context context2 = context;
        do {
            if (context2 instanceof ahha) {
                ahgz = ((ahha) context2).mo7339a();
                if (ahgz == null) {
                    String valueOf = String.valueOf(context2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                    sb.append("LocatorContext must not return null Locator: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ahgz = null;
            }
            if (ahgz != null) {
                return ahgz;
            }
            if (context2 == applicationContext) {
                z = true;
            } else {
                z = false;
            }
            z2 |= z;
            if (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context).getBaseContext();
                if (context2 == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z2) {
                context2 = applicationContext;
                continue;
            } else {
                context2 = null;
                continue;
            }
        } while (context2 != null);
        return null;
    }

    /* renamed from: b */
    public static Object m55755b(Context context, Class cls) {
        ahgz a = m55753a(context);
        if (a != null) {
            return a.mo36477b(cls);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return r0;
     */
    /* renamed from: c */
    private final synchronized Object m55756c(Class cls) {
        if (this.f67203b != null) {
            Object obj = this.f67205d.get(cls);
            if (obj == null) {
                int size = this.f67206e.size();
                for (int i = 0; i < size; i++) {
                    ((ahhb) this.f67206e.get(i)).mo36478a(this.f67203b, cls, this);
                }
                Object obj2 = this.f67205d.get(cls);
                if (obj2 == null) {
                    this.f67205d.put(cls, f67202a);
                }
            } else if (obj != f67202a) {
                return obj;
            } else {
                return null;
            }
        } else {
            throw new IllegalStateException("Locator not initialized yet.");
        }
    }

    public ahgz(Context context) {
        this.f67203b = context;
        this.f67204c = context.getClass().getName();
    }

    /* renamed from: b */
    public final Object mo36477b(Class cls) {
        Object c = m55756c(cls);
        if (c != null) {
            return c;
        }
        return null;
    }

    /* renamed from: a */
    public static Object m55754a(Context context, Class cls) {
        ahgz a = m55753a(context);
        if (a != null) {
            return a.mo36473a(cls);
        }
        String valueOf = String.valueOf(context);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("No locator found in context ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final Object mo36473a(Class cls) {
        Object b = mo36477b(cls);
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Unbound type: " + cls.getName() + "\nSearched locators:\n" + this.f67204c);
    }

    /* renamed from: a */
    public final synchronized void mo36474a() {
        for (Class cls : this.f67205d.keySet()) {
            Object obj = this.f67205d.get(cls);
            if (obj != f67202a) {
                ArrayList arrayList = this.f67206e;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ahhb) arrayList.get(i)).mo36479a(cls, obj);
                }
            }
        }
        this.f67205d.clear();
    }

    /* renamed from: a */
    public final synchronized void mo36475a(ahhb ahhb) {
        this.f67206e.add(ahhb);
    }

    /* renamed from: a */
    public final synchronized void mo36476a(Class cls, Object obj) {
        Object obj2 = this.f67205d.get(cls);
        if (obj2 != null) {
            if (obj2 == f67202a) {
                bnsl bnsl = (bnsl) ahfp.f67119a.mo68388c();
                bnsl.mo68432a("ahgz", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Bind call too late - someone already tried to get: %s", cls);
            } else {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Duplicate binding: ");
                sb.append(valueOf);
                throw new ahgy(sb.toString());
            }
        }
        this.f67205d.put(cls, obj);
    }
}
