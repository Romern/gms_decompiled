package p000;

import android.content.Context;

/* renamed from: bent */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bent extends benw {

    /* renamed from: a */
    public final Context f111892a;

    /* renamed from: b */
    public final String f111893b;

    /* renamed from: c */
    public final ayte f111894c;

    /* renamed from: d */
    public final boolean f111895d;

    public bent(Context context, String str, ayte ayte, boolean z) {
        this.f111892a = context;
        this.f111893b = str;
        this.f111894c = ayte;
        this.f111895d = z;
    }

    /* renamed from: a */
    public final Context mo60827a() {
        return this.f111892a;
    }

    /* renamed from: b */
    public final String mo60828b() {
        return this.f111893b;
    }

    /* renamed from: c */
    public final ayte mo60829c() {
        return this.f111894c;
    }

    /* renamed from: d */
    public final boolean mo60830d() {
        return this.f111895d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof benw) {
            benw benw = (benw) obj;
            return this.f111892a.equals(benw.mo60827a()) && this.f111893b.equals(benw.mo60828b()) && this.f111894c.equals(benw.mo60829c()) && this.f111895d == benw.mo60830d();
        }
    }

    public final int hashCode() {
        return ((((((this.f111892a.hashCode() ^ 1000003) * 1000003) ^ this.f111893b.hashCode()) * 1000003) ^ this.f111894c.hashCode()) * 1000003) ^ (!this.f111895d ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f111892a);
        String str = this.f111893b;
        String valueOf2 = String.valueOf(this.f111894c);
        boolean z = this.f111895d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("GcConfig{context=");
        sb.append(valueOf);
        sb.append(", domain=");
        sb.append(str);
        sb.append(", clock=");
        sb.append(valueOf2);
        sb.append(", useLegacyDataStore=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
