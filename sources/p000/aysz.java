package p000;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.Arrays;

/* renamed from: aysz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aysz {

    /* renamed from: a */
    private final Object[] f98438a;

    public aysz(Object... objArr) {
        this.f98438a = objArr;
    }

    /* renamed from: a */
    public void mo54307a() {
        throw new RuntimeException("Not implemented");
    }

    /* renamed from: c */
    public void mo54319c() {
    }

    public final boolean equals(Object obj) {
        if (obj == null || !aysz.class.isInstance(obj)) {
            return false;
        }
        return Arrays.equals(this.f98438a, ((aysz) obj).f98438a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f98438a);
    }

    public final String toString() {
        return bmxr.m108543a('-').mo66876a(this.f98438a);
    }

    /* renamed from: a */
    public void mo54405a(aytb aytb) {
        try {
            mo54307a();
        } catch (BluetoothException e) {
            aytb.mo54413a(this, e);
        }
    }
}
