package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: sju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sju extends Exception {

    /* renamed from: a */
    public final Status f44595a;

    public final String toString() {
        String valueOf = String.valueOf(this.f44595a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("OperationException[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public sju(String str) {
        super(str);
        this.f44595a = new Status(13, str, null);
    }

    public sju(String str, Throwable th) {
        super(str, th);
        this.f44595a = new Status(13, str, null);
    }
}
