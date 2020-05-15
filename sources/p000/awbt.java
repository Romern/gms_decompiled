package p000;

import android.accounts.Account;
import java.util.Locale;

/* renamed from: awbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awbt {

    /* renamed from: a */
    public int f94148a = 3;

    /* renamed from: b */
    public Account f94149b;

    /* renamed from: a */
    public final awbu mo51834a() {
        return new awbu(this);
    }

    /* renamed from: a */
    public final void mo51835a(int i) {
        if (i == 0 || i == 2 || i == 1 || i == 23 || i == 3) {
            this.f94148a = i;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Invalid environment value %d", Integer.valueOf(i)));
    }
}
