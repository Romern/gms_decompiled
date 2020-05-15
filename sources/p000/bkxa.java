package p000;

import java.util.Arrays;

/* renamed from: bkxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkxa extends bkxf {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract char mo66404a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo66405a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo66406a(int i, bkxf bkxf, int i2) {
        return mo66404a(i) == ((bkxa) bkxf).mo66404a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bkxa)) {
            bkxa bkxa = (bkxa) obj;
            if (bkxa.mo66415b() == mo66415b()) {
                for (int i = 0; i < bkxa.mo66415b(); i++) {
                    if (bkxa.mo66404a(i) != mo66404a(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo66405a()});
    }
}
