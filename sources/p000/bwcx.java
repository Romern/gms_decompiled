package p000;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: bwcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcx implements bwcg {

    /* renamed from: a */
    public bwcf f158870a;

    /* renamed from: b */
    public int f158871b;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.zip.GZIPInputStream], assign insn: 0x002d: CONSTRUCTOR  (r0v8 ? I:java.util.zip.GZIPInputStream) = (r6v1 bwcf) call: java.util.zip.GZIPInputStream.<init>(java.io.InputStream):void type: CONSTRUCTOR */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public bwcx(String str, int i, bwcf bwcf) {
        if (i > 0) {
            this.f158871b = i;
        } else {
            this.f158871b = 0;
        }
        if (str != null) {
            int length = str.length();
            while (length > 0) {
                int i2 = length - 1;
                int lastIndexOf = str.lastIndexOf(44, i2);
                String substring = str.substring(lastIndexOf + 1, i2 + 1);
                if (substring.equals("g")) {
                    bwcf = new GZIPInputStream(bwcf);
                    length = lastIndexOf;
                } else if (!substring.equals("n")) {
                    String valueOf = String.valueOf(substring);
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("unrecognised encoding: ") : "unrecognised encoding: ".concat(valueOf));
                } else {
                    length = lastIndexOf;
                }
            }
            if (i > 0) {
                this.f158870a = new bwcf(bwcf, this.f158871b);
            } else {
                this.f158870a = new bwcf(bwcf, Integer.MAX_VALUE);
            }
        }
    }

    /* renamed from: a */
    public final int mo73458a() {
        throw null;
    }

    /* renamed from: b */
    public final InputStream mo73459b() {
        throw null;
    }
}
