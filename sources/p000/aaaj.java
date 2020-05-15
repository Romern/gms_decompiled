package p000;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;

/* renamed from: aaaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aaaj extends Exception {

    /* renamed from: a */
    public final Status f27843a;

    /* renamed from: b */
    public boolean f27844b;

    public aaaj(int i, String str) {
        this(i, str, null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27843a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("OperationException[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public aaaj(int i, String str, PendingIntent pendingIntent, Throwable th) {
        super(str, th);
        this.f27844b = false;
        this.f27843a = new Status(i, str, pendingIntent);
    }

    public aaaj(int i, String str, byte[] bArr) {
        super(str);
        this.f27844b = false;
        this.f27843a = new Status(i, str, null);
    }
}
