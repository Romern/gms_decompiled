package p000;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: ccl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ccl extends ByteArrayOutputStream {

    /* renamed from: a */
    final /* synthetic */ ccm f6501a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ccl(ccm ccm, int i) {
        super(i);
        this.f6501a = ccm;
    }

    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, this.f6501a.f6502a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
