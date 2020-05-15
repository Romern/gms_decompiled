package p000;

import android.os.Bundle;

/* renamed from: agie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agie {

    /* renamed from: a */
    public final String f65574a;

    /* renamed from: b */
    public final String f65575b;

    /* renamed from: c */
    public final long f65576c;

    /* renamed from: d */
    public final Bundle f65577d;

    public agie(String str, String str2, Bundle bundle, long j) {
        this.f65574a = str;
        this.f65575b = str2;
        this.f65577d = bundle;
        this.f65576c = j;
    }

    public final String toString() {
        String str = this.f65575b;
        String str2 = this.f65574a;
        String valueOf = String.valueOf(this.f65577d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
