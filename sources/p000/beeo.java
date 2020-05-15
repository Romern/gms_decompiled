package p000;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: beeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beeo {

    /* renamed from: a */
    public final String f111430a;

    /* renamed from: b */
    public final long[] f111431b;

    /* renamed from: c */
    public boolean f111432c;

    /* renamed from: d */
    public been f111433d;

    /* renamed from: e */
    final /* synthetic */ beeq f111434e;

    public beeo(beeq beeq, String str) {
        this.f111434e = beeq;
        this.f111430a = str;
        this.f111431b = new long[beeq.f111440e];
    }

    /* renamed from: a */
    public static final IOException m94892a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }

    /* renamed from: b */
    public final File mo60614b(int i) {
        File file = this.f111434e.f111437b;
        String str = this.f111430a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".tmp");
        return new File(file, sb.toString());
    }

    /* renamed from: a */
    public final File mo60612a(int i) {
        File file = this.f111434e.f111437b;
        String str = this.f111430a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }

    /* renamed from: a */
    public final String mo60613a() {
        StringBuilder sb = new StringBuilder();
        long[] jArr = this.f111431b;
        for (long j : jArr) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
