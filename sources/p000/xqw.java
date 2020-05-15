package p000;

import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.List;

/* renamed from: xqw */
final /* synthetic */ class xqw implements bmxz {

    /* renamed from: a */
    static final bmxz f52948a = new xqw();

    private xqw() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        int i = xqy.f52953a;
        List list = publicKeyCredentialDescriptor.f31777b;
        return list != null && list.size() == 1 && publicKeyCredentialDescriptor.f31777b.contains(Transport.INTERNAL);
    }
}
