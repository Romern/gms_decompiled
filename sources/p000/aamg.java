package p000;

import android.app.ActivityManager;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: aamg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamg {

    /* renamed from: a */
    private Set f28454a = Collections.emptySet();

    /* renamed from: b */
    private Set f28455b = Collections.emptySet();

    /* renamed from: c */
    private int f28456c;

    /* renamed from: a */
    private static final String m21510a(Collection collection) {
        return TextUtils.join(",", collection);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c6  */
    /* renamed from: a */
    public final boolean mo17014a(C1245ok okVar, int i) {
        int i2;
        List<Object> b = aajg.m21341b();
        C1225nr nrVar = new C1225nr();
        C1225nr nrVar2 = new C1225nr();
        boolean z = false;
        if (aajg.m21339a() && aajg.f28258a) {
            try {
                Integer num = (Integer) aajg.f28259b.invoke(ActivityManager.class, new Object[0]);
                if (num != null) {
                    i2 = num.intValue();
                    int b2 = aajg.m21340b(i2);
                    for (Object obj : b) {
                        int a = aajg.m21333a(obj);
                        if (!aajg.m21345d(a)) {
                            nrVar.add(Integer.valueOf(a));
                        } else if (a != b2) {
                            nrVar2.add(Integer.valueOf(a));
                        }
                    }
                    if (i != -1) {
                        nrVar.add(Integer.valueOf(aajg.m21340b(i)));
                    }
                    if (!nrVar.equals(this.f28454a) || !nrVar2.equals(this.f28455b) || this.f28456c != b2) {
                        z = true;
                    }
                    this.f28454a = nrVar;
                    this.f28455b = nrVar2;
                    this.f28456c = b2;
                    okVar.put("u:f", Integer.toString(b2));
                    if (!this.f28455b.isEmpty()) {
                        okVar.put("u:b", m21510a(this.f28455b));
                    }
                    if (!this.f28454a.isEmpty()) {
                        okVar.put("u:s", m21510a(this.f28454a));
                    }
                    return z;
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() == 0) {
                    new String("Error in getCurrentUser: ");
                } else {
                    "Error in getCurrentUser: ".concat(valueOf);
                }
                i2 = 0;
            }
        }
        i2 = 0;
        int b22 = aajg.m21340b(i2);
        while (r0.hasNext()) {
        }
        if (i != -1) {
        }
        z = true;
        this.f28454a = nrVar;
        this.f28455b = nrVar2;
        this.f28456c = b22;
        okVar.put("u:f", Integer.toString(b22));
        if (!this.f28455b.isEmpty()) {
        }
        if (!this.f28454a.isEmpty()) {
        }
        return z;
    }
}
