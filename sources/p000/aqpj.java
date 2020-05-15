package p000;

import android.accounts.Account;
import java.util.Arrays;

/* renamed from: aqpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpj {

    /* renamed from: a */
    private final Account f86502a;

    /* renamed from: b */
    private final String f86503b;

    public aqpj(String str, Account account) {
        this.f86503b = str;
        this.f86502a = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqpj) {
            aqpj aqpj = (aqpj) obj;
            if (!bmxi.m108538a(this.f86502a, aqpj.f86502a) || !bmxi.m108538a(this.f86503b, aqpj.f86503b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f86502a, this.f86503b});
    }
}
