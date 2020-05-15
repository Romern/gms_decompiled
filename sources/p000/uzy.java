package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: uzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzy {

    /* renamed from: a */
    public final uzx f48788a;

    /* renamed from: b */
    public final long f48789b;

    /* renamed from: c */
    private final String f48790c;

    private uzy(uzx uzx, String str, long j) {
        boolean z = true;
        if (j <= 0 && str != null) {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(uzx);
        this.f48788a = uzx;
        this.f48790c = str;
        this.f48789b = j;
    }

    /* renamed from: a */
    public static uzy m39860a(uzx uzx, String str, long j) {
        return new uzy(uzx, str, j);
    }

    /* renamed from: b */
    public final boolean mo28147b() {
        return this.f48789b > 0;
    }

    /* renamed from: c */
    public final boolean mo28148c() {
        return mo28147b() && this.f48790c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            uzy uzy = (uzy) obj;
            return sdg.m34949a(this.f48788a, uzy.f48788a) && sdg.m34949a(this.f48790c, uzy.f48790c) && this.f48789b == uzy.f48789b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48788a, this.f48790c, Long.valueOf(this.f48789b)});
    }

    public final String toString() {
        return String.format(Locale.US, "FeedState[feed=%s, nextPageToken=%s, numPagesRetrieved=%d]", this.f48788a, this.f48790c, Long.valueOf(this.f48789b));
    }

    /* renamed from: a */
    public static uzy m39861a(uzy uzy, String str) {
        return new uzy(uzy.f48788a, str, uzy.f48789b + 1);
    }

    /* renamed from: a */
    public final String mo28146a() {
        boolean z = false;
        if ((!mo28147b() || mo28148c()) == (this.f48790c == null)) {
            z = true;
        }
        sdo.m34974b(z);
        return this.f48790c;
    }
}
