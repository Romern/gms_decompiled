package p000;

import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

/* renamed from: beqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqk {

    /* renamed from: a */
    public final DecimalFormatSymbols f112050a;

    /* renamed from: b */
    public final ArrayList f112051b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f112052c = new ArrayList();

    /* renamed from: d */
    public boolean f112053d;

    /* renamed from: e */
    private final char f112054e;

    public beqk(DecimalFormatSymbols decimalFormatSymbols) {
        this.f112050a = decimalFormatSymbols;
        this.f112054e = decimalFormatSymbols.getDecimalSeparator();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo60931a(String str) {
        this.f112051b.clear();
        this.f112052c.clear();
        this.f112053d = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == this.f112054e) {
                mo60932a();
            } else if (charAt >= '0' && charAt <= '9') {
                mo60933a(charAt - '0');
            }
        }
    }

    /* renamed from: a */
    public final boolean mo60932a() {
        if (this.f112053d) {
            return false;
        }
        this.f112053d = true;
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f112051b.isEmpty()) {
            ArrayList arrayList = this.f112051b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(((Integer) arrayList.get(i)).toString());
            }
        } else {
            sb.append('0');
        }
        if (this.f112053d) {
            sb.append(this.f112054e);
        }
        ArrayList arrayList2 = this.f112052c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            sb.append(((Integer) arrayList2.get(i2)).toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo60933a(int i) {
        boolean z;
        boolean z2;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (i <= 9) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108588a(z2);
        if (this.f112053d) {
            if (this.f112052c.size() < 2) {
                this.f112052c.add(Integer.valueOf(i));
                return true;
            }
        } else if ((!this.f112051b.isEmpty() || i > 0) && this.f112051b.size() < 4) {
            this.f112051b.add(Integer.valueOf(i));
            return true;
        }
        return false;
    }
}
