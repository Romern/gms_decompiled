package p000;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.Arrays;

/* renamed from: xwk */
final /* synthetic */ class xwk implements bmxz {

    /* renamed from: a */
    private final byte[] f53297a;

    public xwk(byte[] bArr) {
        this.f53297a = bArr;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        byte[] bArr = this.f53297a;
        int i = xwl.f53298d;
        return Arrays.equals(((PublicKeyCredentialDescriptor) obj).f31776a, bArr);
    }
}
