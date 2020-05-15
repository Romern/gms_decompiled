package p000;

import java.util.Locale;

/* renamed from: ayff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayff extends Exception {

    /* renamed from: a */
    public final int f97472a;

    public ayff(String str, int i) {
        super(String.format(Locale.US, "error: %s: ERRNO[%d]", str, Integer.valueOf(i)));
        this.f97472a = i;
    }
}
