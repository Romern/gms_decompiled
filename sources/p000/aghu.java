package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aghu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aghu extends agjv {

    /* renamed from: a */
    protected static final AtomicReference f65543a = new AtomicReference();

    /* renamed from: b */
    protected static final AtomicReference f65544b = new AtomicReference();

    /* renamed from: c */
    protected static final AtomicReference f65545c = new AtomicReference();

    public aghu(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    private static final String m54265a(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z;
        String str2;
        sdo.m34959a(strArr);
        sdo.m34959a(strArr2);
        sdo.m34959a(atomicReference);
        int i = 0;
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        while (i < strArr.length) {
            if (!agms.m54594b(str, strArr[i])) {
                i++;
            } else {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo35424b(String str) {
        if (str != null) {
            return mo35425b() ? m54265a(str, agjz.f65762b, agjz.f65761a, f65544b) : str;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo35426c(String str) {
        if (str == null) {
            return null;
        }
        if (!mo35425b()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m54265a(str, agka.f65766b, agka.f65765a, f65545c);
        }
        return "experiment_id(" + str + ")";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo35425b() {
        if (mo35537u().f65291a) {
            return this.f65756y.mo35497E().mo35441a(3);
        }
        return this.f65756y.mo35506j() && this.f65756y.mo35497E().mo35441a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo35421a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!mo35425b()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo35424b(str));
            sb.append("=");
            if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65493as)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                sb.append(obj instanceof Bundle ? mo35423a(new Object[]{obj}) : obj instanceof Object[] ? mo35423a((Object[]) obj) : obj instanceof ArrayList ? mo35423a(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo35422a(String str) {
        if (str != null) {
            return mo35425b() ? m54265a(str, agjy.f65759b, agjy.f65758a, f65543a) : str;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo35423a(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                str = mo35421a((Bundle) obj);
            } else {
                str = String.valueOf(obj);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
