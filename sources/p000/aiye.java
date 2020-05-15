package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.Strategy;
import java.security.MessageDigest;
import java.util.Date;

/* renamed from: aiye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiye {

    /* renamed from: a */
    public final String f70053a;

    /* renamed from: b */
    public final Message f70054b;

    /* renamed from: c */
    public final Strategy f70055c;

    /* renamed from: d */
    public final long f70056d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    public final ClientAppIdentifier f70057e;

    /* renamed from: f */
    public ajdm f70058f;

    public aiye(ClientAppIdentifier clientAppIdentifier, Message message, Strategy strategy) {
        this.f70053a = m58198a(clientAppIdentifier, message);
        this.f70054b = message;
        this.f70055c = strategy;
        this.f70057e = clientAppIdentifier;
    }

    public final String toString() {
        long a = mo38257a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        long j = this.f70056d;
        String valueOf = String.valueOf(this.f70057e);
        String str = this.f70053a;
        String valueOf2 = String.valueOf(this.f70055c);
        String valueOf3 = String.valueOf(new Date(j + (currentTimeMillis - elapsedRealtime2)));
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Publication{client=");
        sb.append(valueOf);
        sb.append(", id=");
        sb.append(str);
        sb.append(", strategy=");
        sb.append(valueOf2);
        sb.append(", startTime=");
        sb.append(valueOf3);
        sb.append(", expiresInMillis=");
        sb.append(a - elapsedRealtime);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static String m58198a(ClientAppIdentifier clientAppIdentifier, Message message) {
        MessageDigest b = spn.m35868b("SHA1");
        if (b != null) {
            b.update(clientAppIdentifier.f80669d.getBytes());
            String str = clientAppIdentifier.f80668c.f80724c;
            if (str != null) {
                b.update(str.getBytes());
            }
            b.update(message.f80678d.getBytes());
            b.update(message.f80677c.getBytes());
            b.update(message.f80676b);
            String valueOf = String.valueOf(sqd.m35972d(b.digest()));
            return valueOf.length() == 0 ? new String("p#") : "p#".concat(valueOf);
        }
        throw new IllegalStateException("No SHA1 implementation");
    }

    /* renamed from: a */
    public final long mo38257a() {
        return this.f70056d + ajdq.m58558a(this.f70055c);
    }
}
