package p000;

import android.os.SystemClock;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: aiyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiyo {

    /* renamed from: a */
    public final String f70083a;

    /* renamed from: b */
    public final aiyn f70084b;

    /* renamed from: c */
    public final MessageFilter f70085c;

    /* renamed from: d */
    public final Strategy f70086d;

    /* renamed from: e */
    public final long f70087e;

    /* renamed from: f */
    public ajdm f70088f;

    public aiyo(aiyn aiyn, MessageFilter messageFilter, Strategy strategy) {
        String valueOf = String.valueOf(UUID.randomUUID());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append("s#");
        sb.append(valueOf);
        this.f70083a = sb.toString();
        sdo.m34959a(messageFilter);
        this.f70085c = messageFilter;
        sdo.m34959a(aiyn);
        this.f70084b = aiyn;
        sdo.m34959a(strategy);
        this.f70086d = strategy;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a = ajdq.m58558a(this.f70086d);
        this.f70087e = !ajdq.m58560a(a) ? elapsedRealtime + a : Long.MAX_VALUE;
    }

    /* renamed from: a */
    public final boolean mo38280a() {
        return this.f70084b.f70081b != null;
    }

    /* renamed from: b */
    public final long mo38281b() {
        return ajdq.m58558a(this.f70086d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aiyo) {
            aiyo aiyo = (aiyo) obj;
            return this.f70087e == aiyo.f70087e && sdg.m34949a(this.f70084b, aiyo.f70084b) && sdg.m34949a(this.f70085c, aiyo.f70085c) && sdg.m34949a(this.f70086d, aiyo.f70086d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70084b, this.f70085c, this.f70086d});
    }

    public final String toString() {
        long elapsedRealtime = this.f70087e - SystemClock.elapsedRealtime();
        String str = this.f70083a;
        String valueOf = String.valueOf(this.f70084b);
        String valueOf2 = String.valueOf(this.f70086d);
        String valueOf3 = String.valueOf(this.f70085c);
        String valueOf4 = String.valueOf(!ajdq.m58560a(mo38281b()) ? Long.valueOf(elapsedRealtime) : "infinite");
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 66 + length2 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Subscription{id=");
        sb.append(str);
        sb.append(", listener=");
        sb.append(valueOf);
        sb.append(", strategy=");
        sb.append(valueOf2);
        sb.append(", filter=");
        sb.append(valueOf3);
        sb.append(", expiresInMillis=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
