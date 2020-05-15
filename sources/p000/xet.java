package p000;

import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.os.Build;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: xet */
final /* synthetic */ class xet implements Callable {

    /* renamed from: a */
    private final xeu f52088a;

    public xet(xeu xeu) {
        this.f52088a = xeu;
    }

    public final Object call() {
        bnic bnic;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions;
        Attachment attachment;
        xeu xeu = this.f52088a;
        if (xez.m42800a(xeu.f52093e)) {
            RequestOptions requestOptions = xeu.f52093e;
            if (requestOptions instanceof BrowserPublicKeyCredentialCreationOptions) {
                publicKeyCredentialCreationOptions = ((BrowserPublicKeyCredentialCreationOptions) requestOptions).f31732a;
            } else if (requestOptions instanceof PublicKeyCredentialCreationOptions) {
                publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) requestOptions;
            } else {
                throw new IllegalArgumentException("Unrecognized requestOptions type");
            }
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = publicKeyCredentialCreationOptions.f31770g;
            bnic = (authenticatorSelectionCriteria == null || (attachment = authenticatorSelectionCriteria.f31729a) == null) ? xeu.f52089a : attachment == Attachment.CROSS_PLATFORM ? xeu.f52090b : xeu.f52091c;
        } else {
            RequestOptions requestOptions2 = xeu.f52093e;
            if (requestOptions2 instanceof BrowserPublicKeyCredentialRequestOptions) {
                publicKeyCredentialRequestOptions = ((BrowserPublicKeyCredentialRequestOptions) requestOptions2).f31734a;
            } else if (requestOptions2 instanceof PublicKeyCredentialRequestOptions) {
                publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) requestOptions2;
            } else {
                throw new IllegalArgumentException("Unrecognized requestOptions type");
            }
            List list = publicKeyCredentialRequestOptions.f31784d;
            if (list != null) {
                bnia bnia = new bnia();
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        bnic = bnia.mo67751a();
                        break;
                    }
                    List list2 = ((PublicKeyCredentialDescriptor) list.get(i)).f31777b;
                    if (list2 != null && !list2.isEmpty()) {
                        bnia.mo67752b((Iterable) list2);
                        i++;
                    }
                }
                bnic = xeu.f52089a;
            } else {
                bnic = xeu.f52089a;
            }
        }
        bnia j = bnic.m109500j();
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            int i2 = Build.VERSION.SDK_INT;
            j.mo67629b(Transport.BLUETOOTH_LOW_ENERGY);
        }
        if (xhy.m42973a(xeu.f52092d) != null) {
            j.mo67629b(Transport.NFC);
        }
        if (xeu.f52092d.getPackageManager().hasSystemFeature("android.hardware.usb.host")) {
            j.mo67629b(Transport.USB);
        }
        if (cdvt.f181821a.mo6606a().mo78383b()) {
            int i3 = Build.VERSION.SDK_INT;
            KeyguardManager keyguardManager = (KeyguardManager) xeu.f52092d.getSystemService("keyguard");
            if (keyguardManager != null && keyguardManager.isDeviceSecure()) {
                j.mo67629b(Transport.INTERNAL);
            }
        }
        return bnic.m109495a((Collection) bnpf.m110055b(bnic, j.mo67751a()));
    }
}
