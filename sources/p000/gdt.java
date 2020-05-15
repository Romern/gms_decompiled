package p000;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Arrays;

/* renamed from: gdt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gdt {

    /* renamed from: d */
    protected final IInterface f17980d;

    /* renamed from: e */
    public final String f17981e;

    public gdt(IInterface iInterface, String str) {
        this.f17980d = iInterface;
        this.f17981e = str;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof gdt)) {
            try {
                IInterface iInterface = this.f17980d;
                IInterface iInterface2 = ((gdt) obj).f17980d;
                if (iInterface == iInterface2) {
                    return true;
                }
                if (iInterface == null) {
                    return false;
                }
                if (iInterface2 == null || iInterface.asBinder() != iInterface2.asBinder()) {
                    return false;
                }
                return true;
            } catch (ClassCastException e) {
            }
        }
        return false;
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[1];
        IInterface iInterface = this.f17980d;
        if (iInterface != null) {
            iBinder = iInterface.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        return Arrays.hashCode(objArr);
    }
}
