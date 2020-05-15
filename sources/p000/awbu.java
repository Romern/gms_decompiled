package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: awbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awbu implements rjf {

    /* renamed from: a */
    public final int f94150a;

    /* renamed from: b */
    public final int f94151b;

    /* renamed from: c */
    public final Account f94152c;

    /* renamed from: d */
    final boolean f94153d;

    public awbu() {
        this(new awbt());
    }

    /* renamed from: b */
    public final Account mo24205b() {
        return this.f94152c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof awbu)) {
            return false;
        }
        awbu awbu = (awbu) obj;
        return sdg.m34949a(Integer.valueOf(this.f94150a), Integer.valueOf(awbu.f94150a)) && sdg.m34949a(Integer.valueOf(this.f94151b), Integer.valueOf(awbu.f94151b)) && sdg.m34949a(this.f94152c, awbu.f94152c) && sdg.m34949a(Boolean.valueOf(this.f94153d), Boolean.valueOf(awbu.f94153d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f94150a), Integer.valueOf(this.f94151b), this.f94152c, Boolean.valueOf(this.f94153d)});
    }

    public awbu(awbt awbt) {
        this.f94150a = awbt.f94148a;
        this.f94151b = 1;
        this.f94153d = true;
        this.f94152c = awbt.f94149b;
    }
}
