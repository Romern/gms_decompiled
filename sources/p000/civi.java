package p000;

import java.util.List;

/* renamed from: civi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civi extends Exception {
    public civi() {
    }

    public civi(String str) {
        super(str);
    }

    public civi(String str, List list) {
        super(str, (Throwable) list.get(0));
    }

    public civi(Throwable th) {
        super(th);
    }
}
