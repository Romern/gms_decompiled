package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: caux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caux {

    /* renamed from: a */
    public final String f176085a;

    /* renamed from: b */
    public final long[] f176086b;

    /* renamed from: c */
    public final File[] f176087c;

    /* renamed from: d */
    public final File[] f176088d;

    /* renamed from: e */
    public boolean f176089e;

    /* renamed from: f */
    public cauw f176090f;

    /* renamed from: g */
    public long f176091g;

    /* renamed from: h */
    final /* synthetic */ cauz f176092h;

    public caux(cauz cauz, String str) {
        this.f176092h = cauz;
        this.f176085a = str;
        int i = cauz.f176098d;
        this.f176086b = new long[i];
        this.f176087c = new File[i];
        this.f176088d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < cauz.f176098d; i2++) {
            sb.append(i2);
            this.f176087c[i2] = new File(cauz.f176097c, sb.toString());
            sb.append(".tmp");
            this.f176088d[i2] = new File(cauz.f176097c, sb.toString());
            sb.setLength(length);
        }
    }

    /* renamed from: a */
    public static final IOException m127263a(String[] strArr) {
        String valueOf = String.valueOf(Arrays.toString(strArr));
        throw new IOException(valueOf.length() == 0 ? new String("unexpected journal line: ") : "unexpected journal line: ".concat(valueOf));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cauy mo74935a() {
        ciqr ciqr;
        if (Thread.holdsLock(this.f176092h)) {
            ciqr[] ciqrArr = new ciqr[this.f176092h.f176098d];
            long[] jArr = (long[]) this.f176086b.clone();
            int i = 0;
            int i2 = 0;
            while (i2 < this.f176092h.f176098d) {
                try {
                    ciqrArr[i2] = ciqh.m150832a(this.f176087c[i2]);
                    i2++;
                } catch (FileNotFoundException e) {
                    while (i < this.f176092h.f176098d && (ciqr = ciqrArr[i]) != null) {
                        cavk.m127310a(ciqr);
                        i++;
                    }
                    return null;
                }
            }
            return new cauy(ciqrArr);
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo74936a(cipv cipv) {
        long[] jArr = this.f176086b;
        for (long j : jArr) {
            cipv.mo86316h(32);
            cipv.mo86320i(j);
        }
    }
}
