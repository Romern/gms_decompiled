package p000;

import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.Arrays;

/* renamed from: bgyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyo {

    /* renamed from: a */
    public final AccountConfig f118089a;

    /* renamed from: b */
    public final bgyn f118090b;

    /* renamed from: c */
    public final long f118091c;

    public bgyo(AccountConfig accountConfig, bgyn bgyn, long j) {
        this.f118089a = accountConfig;
        this.f118090b = bgyn;
        this.f118091c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgyo) {
            bgyo bgyo = (bgyo) obj;
            if (this.f118091c == bgyo.f118091c && this.f118089a.equals(bgyo.f118089a) && this.f118090b == bgyo.f118090b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f118089a, this.f118090b, Long.valueOf(this.f118091c)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f118089a);
        String valueOf2 = String.valueOf(this.f118090b);
        long j = this.f118091c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64 + String.valueOf(valueOf2).length());
        sb.append("ActivationChange{account=");
        sb.append(valueOf);
        sb.append(", change=");
        sb.append(valueOf2);
        sb.append(", millis=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
