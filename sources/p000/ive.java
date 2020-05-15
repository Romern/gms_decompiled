package p000;

import java.util.Arrays;

/* renamed from: ive */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ive {

    /* renamed from: a */
    public static final bnhe f21856a;

    /* renamed from: c */
    public static final Logger f21857c = new Logger(new String[]{"EventIncomingMessage"}, (char[]) null);

    /* renamed from: b */
    public final int f21858b;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b("easy_unlock", 0);
        bnha.mo67695b("auto_lock", 1);
        f21856a = bnha.mo67618b();
    }

    public ive(int i) {
        this.f21858b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ive) && this.f21858b == ((ive) obj).f21858b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f21858b)});
    }
}
