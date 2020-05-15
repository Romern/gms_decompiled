package p000;

import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/* renamed from: bgyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyz {

    /* renamed from: a */
    public final Integer f118143a;

    /* renamed from: b */
    public final Integer f118144b;

    /* renamed from: c */
    public final List f118145c;

    public bgyz(AccountConfig accountConfig) {
        List list;
        if (accountConfig != null) {
            this.f118143a = Integer.valueOf(accountConfig.mo70904a());
            this.f118144b = Integer.valueOf(accountConfig.mo70906b());
            list = accountConfig.mo70909e();
        } else {
            list = null;
            this.f118143a = null;
            this.f118144b = null;
        }
        this.f118145c = list;
    }

    /* renamed from: a */
    public static String m100435a(Integer num, Integer num2) {
        if (bxbl.m122538a(num, num2)) {
            return String.valueOf(num2);
        }
        String valueOf = String.valueOf(num);
        String valueOf2 = String.valueOf(num2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" -> ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgyz) {
            bgyz bgyz = (bgyz) obj;
            if (!bxbl.m122538a(this.f118143a, bgyz.f118143a) || !bxbl.m122538a(this.f118144b, bgyz.f118144b) || !bxbl.m122538a(this.f118145c, bgyz.f118145c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118143a, this.f118144b, this.f118145c});
    }

    /* renamed from: a */
    public final String mo63454a() {
        if (this.f118145c == null) {
            return "null";
        }
        TreeSet treeSet = new TreeSet();
        for (InactiveReason inactiveReason : this.f118145c) {
            treeSet.add(inactiveReason.f150918c);
        }
        return treeSet.toString();
    }
}
