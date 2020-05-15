package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: cci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cci {

    /* renamed from: a */
    public final String f6479a;

    /* renamed from: b */
    public final long[] f6480b;

    /* renamed from: c */
    File[] f6481c;

    /* renamed from: d */
    File[] f6482d;

    /* renamed from: e */
    public boolean f6483e;

    /* renamed from: f */
    public cch f6484f;

    /* renamed from: g */
    final /* synthetic */ cck f6485g;

    public cci(cck cck, String str) {
        this.f6485g = cck;
        this.f6479a = str;
        int i = cck.f6490d;
        this.f6480b = new long[i];
        this.f6481c = new File[i];
        this.f6482d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < cck.f6490d; i2 = 1) {
            sb.append(0);
            this.f6481c[0] = new File(cck.f6487a, sb.toString());
            sb.append(".tmp");
            this.f6482d[0] = new File(cck.f6487a, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public static final IOException m3940a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }

    /* renamed from: b */
    public final File mo3702b() {
        return this.f6481c[0];
    }

    /* renamed from: c */
    public final File mo3703c() {
        return this.f6482d[0];
    }

    /* renamed from: a */
    public final String mo3701a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.f6480b;
        for (long j : jArr) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
