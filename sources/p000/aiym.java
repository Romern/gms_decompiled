package p000;

import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;

/* renamed from: aiym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiym {

    /* renamed from: a */
    public final Strategy f70075a;

    /* renamed from: b */
    public final MessageFilter f70076b;

    /* renamed from: c */
    public final aiyk f70077c;

    /* renamed from: d */
    public final boolean f70078d;

    /* renamed from: e */
    public final int f70079e;

    static {
        new aiyl().mo38273a();
    }

    public aiym(Strategy strategy, MessageFilter messageFilter, aiyk aiyk, boolean z, int i) {
        this.f70075a = strategy;
        this.f70076b = messageFilter;
        this.f70077c = aiyk;
        this.f70078d = z;
        this.f70079e = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f70075a);
        String valueOf2 = String.valueOf(this.f70076b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(valueOf2).length());
        sb.append("SubscribeOptions{strategy=");
        sb.append(valueOf);
        sb.append(", filter=");
        sb.append(valueOf2);
        sb.append('}');
        return sb.toString();
    }
}
