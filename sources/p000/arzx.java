package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: arzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arzx {

    /* renamed from: a */
    public final Account f88548a;

    /* renamed from: b */
    public final int f88549b;

    /* renamed from: c */
    public final int f88550c;

    /* renamed from: d */
    public final int f88551d;

    /* renamed from: e */
    public final boolean f88552e;

    /* renamed from: f */
    public final boolean f88553f;

    public arzx(Account account, int i, int i2, int i3, boolean z, boolean z2) {
        this.f88548a = account;
        this.f88549b = i;
        this.f88550c = i2;
        this.f88551d = i3;
        this.f88552e = z;
        this.f88553f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof arzx) {
            arzx arzx = (arzx) obj;
            if (this.f88549b == arzx.f88549b && this.f88550c == arzx.f88550c && this.f88551d == arzx.f88551d && this.f88552e == arzx.f88552e && this.f88553f == arzx.f88553f && bmxi.m108538a(this.f88548a, arzx.f88548a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f88548a, Integer.valueOf(this.f88549b), Integer.valueOf(this.f88550c), Integer.valueOf(this.f88551d), Boolean.valueOf(this.f88552e), Boolean.valueOf(this.f88553f)});
    }
}
