package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: ahtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahtk extends ahtu {

    /* renamed from: b */
    private final Context f68001b;

    /* renamed from: c */
    private final cakp f68002c;

    /* renamed from: d */
    private final ClientContext f68003d;

    /* renamed from: e */
    private final int f68004e;

    public ahtk(Context context, cakp cakp, ClientContext clientContext, int i) {
        this.f68001b = context;
        this.f68002c = cakp;
        this.f68003d = clientContext;
        this.f68004e = i;
    }

    /* renamed from: a */
    public final Context mo37131a() {
        return this.f68001b;
    }

    /* renamed from: b */
    public final cakp mo37132b() {
        return this.f68002c;
    }

    /* renamed from: c */
    public final ClientContext mo37133c() {
        return this.f68003d;
    }

    /* renamed from: d */
    public final int mo37134d() {
        return this.f68004e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahtu) {
            ahtu ahtu = (ahtu) obj;
            return this.f68001b.equals(ahtu.mo37131a()) && this.f68002c.equals(ahtu.mo37132b()) && this.f68003d.equals(ahtu.mo37133c()) && this.f68004e == ahtu.mo37134d();
        }
    }

    public final int hashCode() {
        int hashCode = (this.f68001b.hashCode() ^ 1000003) * 1000003;
        cakp cakp = this.f68002c;
        int i = cakp.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(cakp).mo74216a(cakp);
            cakp.f164758ag = i;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f68003d.hashCode()) * 1000003) ^ this.f68004e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f68001b);
        String valueOf2 = String.valueOf(this.f68002c);
        String valueOf3 = String.valueOf(this.f68003d);
        int i = this.f68004e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 92 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FailedStoreAccessoryRequest{context=");
        sb.append(valueOf);
        sb.append(", request=");
        sb.append(valueOf2);
        sb.append(", clientContext=");
        sb.append(valueOf3);
        sb.append(", allowedAttempts=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
