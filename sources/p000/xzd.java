package p000;

import android.nfc.Tag;
import android.os.Vibrator;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.ResponseData;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: xzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xzd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Tag f53422a;

    /* renamed from: b */
    final /* synthetic */ xzg f53423b;

    public xzd(xzg xzg, Tag tag) {
        this.f53423b = xzg;
        this.f53422a = tag;
    }

    public final void run() {
        xlc xlc;
        try {
            xzg xzg = this.f53423b;
            com.google.android.gms.fido.communication.channel.nfc.Tag a = com.google.android.gms.fido.communication.channel.nfc.Tag.m23434a(this.f53422a);
            xzg.f53440m = xzg.mo30283a(a);
            try {
                xzg.f53429n.mo25414c("Tag discovered: %s.", a);
                xkx a2 = a.mo18640a();
                if (a2 != null) {
                    xlc = new xlc(xhu.f52320a, a2);
                    xlc.mo29890b().get();
                    xzg.f53436i.mo30186a(xzg.f53431d, xag.TYPE_NFC_U2F_TAG_DISCOVERED);
                    xzf xzf = xzg.f53435h;
                    xzf.sendMessage(xzf.obtainMessage(xzg.hashCode(), xzg.f53427a));
                    ResponseData a3 = ((xfl) xfu.m42833a(xzg.f53431d, xlc, xzg.f53436i)).mo29706a(xzg.f53434g);
                    if (xzg.f53440m) {
                        xzg.f53429n.mo25412b("Remove the NDEF tag on the NFC security key", new Object[0]);
                        xle a4 = xle.m43131a(Byte.MIN_VALUE, (byte) -92, 2);
                        a4.mo29894a((byte) 0);
                        a4.f52650e = true;
                        a4.f52649d = 12;
                        a4.mo29895a(xfl.f52126a);
                        xlf a5 = xlf.m43136a(a2.mo29885a(a4.mo29896a()));
                        if (a5.f52655a != -28672) {
                            xfl.f52128c.mo25416d(String.format("Failed to select NDEF: 0x%02x", Short.valueOf(a5.f52655a)), new Object[0]);
                        } else {
                            xle a6 = xle.m43131a((byte) 0, (byte) -42, 2);
                            a6.mo29895a(xfl.f52127b);
                            xlf a7 = xlf.m43136a(a2.mo29885a(a6.mo29896a()));
                            if (a7.f52655a != -28672) {
                                xfl.f52128c.mo25416d(String.format("Failed to write empty NDEF: 0x%02x", Short.valueOf(a7.f52655a)), new Object[0]);
                            }
                        }
                    }
                    ((Vibrator) xzg.f53430c.getSystemService("vibrator")).vibrate(cdwr.m135183c());
                    xlc.mo29891c().get();
                    xzg.f53432e.mo30061a(Transport.NFC, a3);
                    return;
                }
                xzg.f53429n.mo25414c("No ISO-DEP tag touch detected", new Object[0]);
                xzg.f53436i.mo30186a(xzg.f53431d, xag.TYPE_NFC_NON_U2F_TAG_DISCOVERED);
                throw new IOException();
            } catch (xfv e) {
                xzg.f53429n.mo25417e("Error when communicating with the security key.", e, new Object[0]);
                if (e.f52149a != 28416 || !((Boolean) xmn.f52771u.mo58455c()).booleanValue()) {
                    xzg.f53432e.mo30061a(Transport.NFC, e.mo29712a());
                    return;
                }
                int i = xzg.f53437j + 1;
                xzg.f53437j = i;
                if (i >= ((Integer) xmn.f52772v.mo58455c()).intValue()) {
                    xzg.f53433f.mo30295a(3, new NfcViewOptions(false, true));
                }
            } catch (InterruptedException | ExecutionException e2) {
                if (((Boolean) xmn.f52771u.mo58455c()).booleanValue()) {
                    int i2 = xzg.f53437j + 1;
                    xzg.f53437j = i2;
                    if (i2 < ((Integer) xmn.f52772v.mo58455c()).intValue()) {
                        xzg.f53432e.mo30061a(Transport.NFC, new ErrorResponseData(ErrorCode.OTHER_ERROR));
                    } else {
                        xzg.f53433f.mo30295a(3, new NfcViewOptions(false, true));
                    }
                }
            } catch (Throwable th) {
                xlc.mo29891c().get();
                throw th;
            }
        } catch (IOException e3) {
            xzf xzf2 = this.f53423b.f53435h;
            xzf2.sendMessage(xzf2.obtainMessage(hashCode(), xzg.f53428b));
            xzg.f53429n.mo25417e("Error when handling the discovered tag", e3, new Object[0]);
            xzg xzg2 = this.f53423b;
            xzg2.f53436i.mo30184a(xzg2.f53431d, e3);
        }
    }
}
