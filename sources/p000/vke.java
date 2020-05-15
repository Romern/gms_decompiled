package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: vke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vke extends rtm {
    public vke(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: a */
    public final Object mo24661a(int i) {
        DataHolder dataHolder = this.f43665a;
        int a = dataHolder.mo17762a(i);
        int b = dataHolder.mo17767b("valueType", i, a);
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            dataHolder.mo17769c("value", i, a);
            dataHolder.mo17769c("refType", i, a);
            throw null;
        } else if (b == 2) {
            return vkd.m40629a(dataHolder.mo17769c("value", i, a));
        } else {
            if (b == 3) {
                return dataHolder.mo17769c("value", i, a);
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown object type: ");
            sb.append(b);
            throw new IllegalStateException(sb.toString());
        }
    }
}
