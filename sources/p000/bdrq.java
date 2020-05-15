package p000;

import android.accounts.Account;
import java.io.File;

/* renamed from: bdrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdrq extends bdsf {

    /* renamed from: a */
    public final File f106316a;

    /* renamed from: b */
    public final bdqu f106317b;

    /* renamed from: c */
    public final Account f106318c;

    /* renamed from: d */
    public final int f106319d;

    /* renamed from: e */
    public final int f106320e;

    /* renamed from: f */
    public final int f106321f;

    /* renamed from: g */
    public final int f106322g;

    /* renamed from: h */
    public final int f106323h;

    public bdrq(File file, bdqu bdqu, Account account, int i, int i2, int i3, int i4, int i5) {
        this.f106316a = file;
        this.f106317b = bdqu;
        this.f106318c = account;
        this.f106319d = i;
        this.f106320e = i2;
        this.f106321f = i3;
        this.f106322g = i4;
        this.f106323h = i5;
    }

    /* renamed from: a */
    public final File mo58317a() {
        return this.f106316a;
    }

    /* renamed from: b */
    public final bdqu mo58318b() {
        return this.f106317b;
    }

    /* renamed from: c */
    public final Account mo58319c() {
        return this.f106318c;
    }

    /* renamed from: d */
    public final int mo58320d() {
        return this.f106319d;
    }

    /* renamed from: e */
    public final int mo58321e() {
        return this.f106320e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdsf) {
            bdsf bdsf = (bdsf) obj;
            return this.f106316a.equals(bdsf.mo58317a()) && this.f106317b.equals(bdsf.mo58318b()) && this.f106318c.equals(bdsf.mo58319c()) && this.f106319d == bdsf.mo58320d() && this.f106320e == bdsf.mo58321e() && this.f106321f == bdsf.mo58323f() && this.f106322g == bdsf.mo58324g() && this.f106323h == bdsf.mo58325h();
        }
    }

    /* renamed from: f */
    public final int mo58323f() {
        return this.f106321f;
    }

    /* renamed from: g */
    public final int mo58324g() {
        return this.f106322g;
    }

    /* renamed from: h */
    public final int mo58325h() {
        return this.f106323h;
    }

    public final int hashCode() {
        return ((((((((((((((this.f106316a.hashCode() ^ 1000003) * 1000003) ^ this.f106317b.hashCode()) * 1000003) ^ this.f106318c.hashCode()) * 1000003) ^ this.f106319d) * 1000003) ^ this.f106320e) * 1000003) ^ this.f106321f) * 1000003) ^ this.f106322g) * 1000003) ^ this.f106323h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f106316a);
        String valueOf2 = String.valueOf(this.f106317b);
        String valueOf3 = String.valueOf(this.f106318c);
        int i = this.f106319d;
        int i2 = this.f106320e;
        int i3 = this.f106321f;
        int i4 = this.f106322g;
        int i5 = this.f106323h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 188 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("Options{storageDirectory=");
        sb.append(valueOf);
        sb.append(", applicationId=");
        sb.append(valueOf2);
        sb.append(", account=");
        sb.append(valueOf3);
        sb.append(", corpus=");
        sb.append(i);
        sb.append(", datatype=");
        sb.append(i2);
        sb.append(", deviceTtlSec=");
        sb.append(i3);
        sb.append(", pushPayloadMaxCount=");
        sb.append(i4);
        sb.append(", pushPayloadMaxAgeDays=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
