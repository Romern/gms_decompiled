package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: assr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assr extends assu {

    /* renamed from: a */
    public final List f89614a = new ArrayList();

    public assr(int i) {
        super(i);
        if (!m74716b(i)) {
            throw new assx(i);
        }
    }

    /* renamed from: a */
    public final int mo49436a() {
        List list = this.f89614a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((assu) list.get(i2)).mo49451f();
        }
        return i;
    }

    /* renamed from: b */
    public final bmxv mo49439b(int... iArr) {
        bmxv b = bmxv.m108566b(this);
        for (int i : iArr) {
            b = bnjd.m109599f(((assu) b.mo66814b()).mo49448c().mo49440b(), new assq(i));
            if (!b.mo66813a()) {
                break;
            }
        }
        return b;
    }

    public final String toString() {
        bmxr a = bmxr.m108544a(",");
        String a2 = bmxr.m108544a(",").mo66874a((Iterable) this.f89614a);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 2);
        sb.append("[");
        sb.append(a2);
        sb.append("]");
        String upperCase = a.mo66876a((Object[]) new String[]{mo49450e(), Integer.toHexString(mo49436a()), sb.toString()}).toUpperCase(Locale.US);
        StringBuilder sb2 = new StringBuilder(String.valueOf(upperCase).length() + 2);
        sb2.append("(");
        sb2.append(upperCase);
        sb2.append(")");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo49437a(byte[] bArr, int i) {
        List list = this.f89614a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = ((assu) list.get(i2)).mo49447c(bArr, i);
        }
        return i;
    }

    /* renamed from: a */
    public final assu mo49438a(int... iArr) {
        assu assu = this;
        for (int i : iArr) {
            assu = (assu) bnjd.m109597e(assu.mo49448c().mo49440b(), new assp(i));
        }
        return assu;
    }

    /* renamed from: b */
    public final List mo49440b() {
        return Collections.unmodifiableList(this.f89614a);
    }
}
