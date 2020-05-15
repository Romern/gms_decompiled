package p000;

/* renamed from: camn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class camn extends Exception {

    /* renamed from: a */
    private final Throwable f175307a;

    public camn() {
        this.f175307a = null;
    }

    public final Throwable getCause() {
        return this.f175307a;
    }

    public final String toString() {
        String str;
        String valueOf = String.valueOf(super.toString());
        Throwable th = this.f175307a;
        if (th != null) {
            String valueOf2 = String.valueOf(th.toString());
            str = valueOf2.length() == 0 ? new String(" ") : " ".concat(valueOf2);
        } else {
            str = "";
        }
        String valueOf3 = String.valueOf(str);
        return valueOf3.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf3);
    }

    public camn(String str) {
        super(str);
        this.f175307a = null;
    }

    public camn(String str, Throwable th) {
        super(str);
        this.f175307a = th;
    }
}
