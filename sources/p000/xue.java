package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: xue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xue implements Runnable {

    /* renamed from: a */
    public final xtt f53140a;

    /* renamed from: b */
    private final xwj f53141b;

    /* renamed from: c */
    private final xeh f53142c;

    /* renamed from: d */
    private final xdx f53143d;

    /* renamed from: e */
    private final bmxv f53144e;

    /* renamed from: f */
    private final xkn f53145f;

    /* renamed from: g */
    private final xwn f53146g;

    public xue(Context context, xwj xwj, xeh xeh, xdx xdx, bmxv bmxv, xdy xdy, xkn xkn, xwn xwn, xtt xtt) {
        sdo.m34959a(context);
        this.f53141b = xwj;
        sdo.m34959a(xeh);
        this.f53142c = xeh;
        sdo.m34959a(xdx);
        this.f53143d = xdx;
        sdo.m34959a(bmxv);
        this.f53144e = bmxv;
        sdo.m34959a(xdy);
        sdo.m34959a(xkn);
        this.f53145f = xkn;
        sdo.m34959a(xwn);
        this.f53146g = xwn;
        sdo.m34959a(xtt);
        this.f53140a = xtt;
    }

    /* renamed from: a */
    private final void m43411a(xkg xkg) {
        new adzt(Looper.getMainLooper()).post(new xud(this, xkg));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01bc A[SYNTHETIC] */
    public final void run() {
        Object obj;
        xkg xkg;
        List list = this.f53145f.f52572j;
        if (list != null && !list.isEmpty()) {
            List list2 = this.f53145f.f52572j;
            int size = list2.size();
            int i = 0;
            while (i < size) {
                PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) list2.get(i);
                try {
                    byte[] bArr = publicKeyCredentialDescriptor.f31776a;
                    if (bArr.length != 32) {
                        obj = xjz.m43074a("google.com", new xkb(bArr));
                    } else {
                        obj = xjy.m43070a(new xkb(bArr));
                    }
                    xka xka = xka.SOFTWARE_KEY;
                    if (this.f53144e.mo66813a()) {
                        xka = ((xjx) this.f53144e.mo66814b()).mo29847a();
                    }
                    if (this.f53144e.mo66813a() && !obj.equals(this.f53144e.mo66814b())) {
                        i++;
                    } else {
                        xwj xwj = this.f53141b;
                        xeh xeh = this.f53142c;
                        xdx xdx = this.f53143d;
                        xkn xkn = this.f53145f;
                        byte[] bArr2 = xkn.f52571i;
                        String str = xkn.f52570h;
                        xkb xkb = new xkb(xka, publicKeyCredentialDescriptor.f31776a);
                        xwn xwn = this.f53146g;
                        sdo.m34966a(xwj, "Session context cannot be null");
                        sdo.m34966a(bArr2, "Client data hash cannot be null");
                        sdo.m34966a((Object) str, (Object) "Relying party identifier cannot be null");
                        sdo.m34966a(xkb, "Key handle cannot be null");
                        sdo.m34966a(xwn, "Event logger cannot be null");
                        try {
                            if (sdg.m34949a(xkb.mo29856b(), xka.SOFTWARE_KEY) || sdg.m34949a(xkb.mo29856b(), xka.STRONGBOX_KEY)) {
                                if (!xdx.mo29673a(str, xkb)) {
                                    if (xkb.mo29857c().length == 32) {
                                        if (!str.equals("google.com")) {
                                        }
                                    }
                                    sek sek = xdy.f52039a;
                                    String a = boan.f132472f.mo68794a(xkb.mo29857c());
                                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 61 + String.valueOf(str).length());
                                    sb.append("The key handle ");
                                    sb.append(a);
                                    sb.append(" registered with rpId ");
                                    sb.append(str);
                                    sb.append(" is not in this KeyStore");
                                    sek.mo25418e(sb.toString(), new Object[0]);
                                    xwn.mo30185a(xwj, new IllegalArgumentException("The key handle provided for the specified rpId was not located on the device"), 53);
                                    xkg = new xkg(xkj.CTAP2_ERR_INVALID_CREDENTIAL, null);
                                    if (sdg.m34949a(xkg.f52499a, xkj.CTAP1_ERR_SUCCESS)) {
                                        i++;
                                    } else {
                                        m43411a(xkg);
                                        return;
                                    }
                                }
                                long b = xdx.mo29675b(str, xkb);
                                MessageDigest a2 = xid.m42997a();
                                a2.update(str.getBytes(StandardCharsets.UTF_8));
                                byte[] a3 = new xlq(a2.digest(), (byte) 1, b, null).mo29917a();
                                byte[][] bArr3 = new byte[2][];
                                try {
                                    bArr3[0] = a3;
                                    bArr3[1] = bArr2;
                                    Pair a4 = new xdh(xwj, xeh, xdx).mo29679a(str, xkb, bqce.m112562a(bArr3), xwn);
                                    xkj xkj = xkj.CTAP1_ERR_SUCCESS;
                                    xkr xkr = new xkr();
                                    xkr.f52578a = new PublicKeyCredentialDescriptor(PublicKeyCredentialType.PUBLIC_KEY.f31794b, xkb.mo29857c(), null);
                                    xkr.mo29872a(a3);
                                    xkr.mo29873b((byte[]) a4.first);
                                    xkg = new xkg(xkj, xkr.mo29871a());
                                } catch (xma e) {
                                    e = e;
                                } catch (InterruptedException e2) {
                                    e = e2;
                                }
                                if (sdg.m34949a(xkg.f52499a, xkj.CTAP1_ERR_SUCCESS)) {
                                }
                            } else {
                                xwn.mo30185a(xwj, new IllegalArgumentException("The provided key handle was not a software or StrongBox key"), 53);
                                xkg = new xkg(xkj.CTAP2_ERR_INVALID_CREDENTIAL, null);
                                if (sdg.m34949a(xkg.f52499a, xkj.CTAP1_ERR_SUCCESS)) {
                                }
                            }
                        } catch (InterruptedException | xma e3) {
                            e = e3;
                            xwn.mo30185a(xwj, e, 53);
                            xkg = new xkg(xkj.CTAP1_ERR_OTHER, null);
                            if (sdg.m34949a(xkg.f52499a, xkj.CTAP1_ERR_SUCCESS)) {
                            }
                        }
                    }
                } catch (xma e4) {
                }
            }
            m43411a(new xkg(xkj.CTAP2_ERR_NO_CREDENTIALS, null));
            return;
        }
        m43411a(new xkg(xkj.CTAP1_ERR_INVALID_PARAMETER, null));
    }
}
