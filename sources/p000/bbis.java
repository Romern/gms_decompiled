package p000;

import java.util.Random;

/* renamed from: bbis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbis implements batu {

    /* renamed from: a */
    private final Random f102751a = new Random();

    /* renamed from: a */
    public final boolean mo35048a(long j) {
        return j > 0 && j <= 2147483647L && this.f102751a.nextInt((int) j) == 0;
    }
}
