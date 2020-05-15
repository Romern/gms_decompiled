package p000;

import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: avni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avni {

    /* renamed from: a */
    public final String f93507a;

    /* renamed from: b */
    public final avte f93508b;

    /* renamed from: c */
    public final boolean f93509c;

    /* renamed from: d */
    public final Callable f93510d;

    public avni(String str, avte avte) {
        this(str, avte, false, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avni) {
            avni avni = (avni) obj;
            if (!this.f93507a.equals(avni.f93507a) || !this.f93508b.equals(avni.f93508b) || this.f93509c != avni.f93509c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f93507a, this.f93508b, Boolean.valueOf(this.f93509c)});
    }

    public avni(String str, avte avte, boolean z, Callable callable) {
        this.f93507a = str;
        this.f93508b = avte;
        this.f93509c = z;
        this.f93510d = callable;
    }

    public avni(String str, avte avte, byte[] bArr) {
        this(str, avte, true, null);
    }
}
