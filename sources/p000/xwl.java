package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;

/* renamed from: xwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xwl extends xwh implements xwn {

    /* renamed from: d */
    public static final /* synthetic */ int f53298d = 0;

    /* renamed from: g */
    private static final Logger f53299g = new Logger(new String[]{"ClearCutFido2EventLogger"}, (short[]) null);

    /* renamed from: e */
    private final xws f53300e;

    /* renamed from: f */
    private List f53301f;

    public xwl(Context context) {
        super(context);
        this.f53300e = xwr.m43574a(context);
    }

    /* renamed from: a */
    private static void m43510a(xwj xwj, bxvd bxvd) {
        int i = xwj.f53295a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        xab xab = (xab) bxvd.f164949b;
        xab xab2 = xab.f51677u;
        xab.f51679a |= 1;
        xab.f51680b = i;
        byte[] bArr = xwj.f53296b;
        if (bArr != null) {
            ByteString a = ByteString.m123261a(bArr);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            xab xab3 = (xab) bxvd.f164949b;
            a.getClass();
            xab3.f51679a |= 4;
            xab3.f51682d = a;
        }
    }

    /* renamed from: a */
    public final xws mo30188a() {
        return this.f53300e;
    }

    /* renamed from: a */
    private final void m43511a(xwj xwj, String str, List list, int i) {
        bmxy.m108581a(str);
        if (i != 152) {
            i = MfiClientException.TYPE_MFICLIENT_NOT_FOUND;
        }
        bmxy.m108588a(true);
        bxvd da = wzx.f51658f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzx wzx = (wzx) da.f164949b;
        str.getClass();
        int i2 = 1 | wzx.f51660a;
        wzx.f51660a = i2;
        wzx.f51661b = str;
        int i3 = this.f53280c;
        int i4 = i2 | 2;
        wzx.f51660a = i4;
        wzx.f51663d = i3;
        String str2 = this.f53279b;
        str2.getClass();
        wzx.f51660a = i4 | 4;
        wzx.f51664e = str2;
        this.f53301f = list;
        if (list != null && !list.isEmpty()) {
            for (int i5 = 0; i5 < list.size(); i5++) {
                bxvd da2 = wzw.f51655b.mo74144da();
                List<xan> a = xwh.m43502a(((PublicKeyCredentialDescriptor) list.get(i5)).f31777b);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                wzw wzw = (wzw) da2.f164949b;
                if (!wzw.f51657a.mo73666a()) {
                    wzw.f51657a = GeneratedMessageLite.m124019a(wzw.f51657a);
                }
                for (xan xan : a) {
                    wzw.f51657a.mo74153d(xan.f51798g);
                }
                wzw wzw2 = (wzw) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                wzx wzx2 = (wzx) da.f164949b;
                wzw2.getClass();
                if (!wzx2.f51662c.mo73666a()) {
                    wzx2.f51662c = GeneratedMessageLite.m124021a(wzx2.f51662c);
                }
                wzx2.f51662c.add(wzw2);
            }
        }
        bxvd da3 = xab.f51677u.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        xab xab = (xab) da3.f164949b;
        xab.f51681c = i - 1;
        xab.f51679a |= 2;
        wzx wzx3 = (wzx) da.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        xab xab2 = (xab) da3.f164949b;
        wzx3.getClass();
        xab2.f51691m = wzx3;
        xab2.f51679a |= 2048;
        m43510a(xwj, da3);
        mo30187a((xab) da3.mo74062i());
    }

    /* renamed from: a */
    private final void m43512a(xwj xwj, xpj xpj, Integer num) {
        int i;
        bxvd da = wzz.f51670e.mo74144da();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzz wzz = (wzz) da.f164949b;
        wzz.f51672a |= 1;
        wzz.f51673b = i;
        xke xke = xke.AUTHENTICATOR_MAKE_CREDENTIAL;
        xpj xpj2 = xpj.BLUETOOTH_LOW_ENERGY;
        int ordinal = xpj.ordinal();
        if (ordinal == 0) {
            xan xan = xan.TRANSPORT_BLE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzz wzz2 = (wzz) da.f164949b;
            wzz2.f51675d = xan.f51798g;
            wzz2.f51672a |= 4;
        } else if (ordinal == 1) {
            xan xan2 = xan.TRANSPORT_NFC;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzz wzz3 = (wzz) da.f164949b;
            wzz3.f51675d = xan2.f51798g;
            wzz3.f51672a |= 4;
        } else if (ordinal == 2) {
            xan xan3 = xan.TRANSPORT_USB;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzz wzz4 = (wzz) da.f164949b;
            wzz4.f51675d = xan3.f51798g;
            wzz4.f51672a |= 4;
        } else if (ordinal == 4) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzz wzz5 = (wzz) da.f164949b;
            wzz5.f51674c = 1;
            wzz5.f51672a |= 2;
        } else if (ordinal == 5) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzz wzz6 = (wzz) da.f164949b;
            wzz6.f51674c = 50;
            wzz6.f51672a |= 2;
        }
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED;
        xab.f51679a = 2 | xab.f51679a;
        wzz wzz7 = (wzz) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab2 = (xab) da2.f164949b;
        wzz7.getClass();
        xab2.f51692n = wzz7;
        xab2.f51679a |= 4096;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30189a(xwj xwj, int i, String str) {
        bmxy.m108581a(xwj);
        bxvd da = wzy.f51665d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzy wzy = (wzy) da.f164949b;
        wzy.f51667a |= 1;
        wzy.f51668b = i;
        if (str != null && !str.isEmpty()) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzy wzy2 = (wzy) da.f164949b;
            str.getClass();
            wzy2.f51667a |= 2;
            wzy2.f51669c = str;
        }
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = MfiClientException.TYPE_MFICLIENT_STARTED;
        xab.f51679a |= 2;
        wzy wzy3 = (wzy) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab2 = (xab) da2.f164949b;
        wzy3.getClass();
        xab2.f51693o = wzy3;
        xab2.f51679a |= 8192;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30190a(xwj xwj, AuthenticatorAssertionResponse authenticatorAssertionResponse, xpj xpj) {
        int i;
        bmxy.m108581a(xwj);
        bmxy.m108581a(authenticatorAssertionResponse);
        bmxy.m108581a(xpj);
        byte[] bArr = authenticatorAssertionResponse.f31719a;
        List list = this.f53301f;
        if (list != null) {
            i = bnjd.m109601g(list, new xwk(bArr));
        } else {
            i = -1;
        }
        if (i < 0) {
            Logger Logger = f53299g;
            String valueOf = String.valueOf(boan.f132472f.mo68794a(bArr));
            Logger.mo25418e(valueOf.length() == 0 ? new String("Unexpected CredentialID in AuthenticatorAssertionResponse:") : "Unexpected CredentialID in AuthenticatorAssertionResponse:".concat(valueOf), new Object[0]);
            return;
        }
        m43512a(xwj, xpj, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo30191a(xwj xwj, String str, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(str);
        bmxy.m108581a(publicKeyCredentialCreationOptions);
        Integer num = publicKeyCredentialCreationOptions.f31771h;
        boolean z = true;
        if (!(num == null || xwj.f53295a == num.intValue())) {
            z = false;
        }
        bmxy.m108588a(z);
        m43511a(xwj, str, publicKeyCredentialCreationOptions.f31769f, MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED);
    }

    /* renamed from: a */
    public final void mo30192a(xwj xwj, String str, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(str);
        bmxy.m108581a(publicKeyCredentialRequestOptions);
        Integer num = publicKeyCredentialRequestOptions.f31785e;
        boolean z = true;
        if (!(num == null || xwj.f53295a == num.intValue())) {
            z = false;
        }
        bmxy.m108588a(z);
        m43511a(xwj, str, publicKeyCredentialRequestOptions.f31784d, MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
    }

    /* renamed from: a */
    public final void mo30184a(xwj xwj, Throwable th) {
        mo30185a(xwj, th, 2);
    }

    /* renamed from: a */
    public final void mo30193a(xwj xwj, wzs wzs, wzu wzu, int i, Throwable th) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(wzs);
        bmxy.m108581a(wzu);
        bxvd da = wzv.f51646h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzv wzv = (wzv) da.f164949b;
        wzv.f51649b = wzs.f51637h;
        int i2 = wzv.f51648a | 1;
        wzv.f51648a = i2;
        wzv.f51650c = wzu.f51645f;
        int i3 = i2 | 2;
        wzv.f51648a = i3;
        if (i != 0) {
            int i4 = i3 | 4;
            wzv.f51648a = i4;
            wzv.f51651d = true;
            wzv.f51652e = i - 1;
            wzv.f51648a = i4 | 8;
        }
        if (th != null) {
            String a = bdih.m90858a(th);
            String valueOf = String.valueOf(th.getMessage());
            StringBuilder sb = new StringBuilder(valueOf.length() == 0 ? new String("") : "".concat(valueOf));
            while (th.getCause() != null) {
                th = th.getCause();
                sb.append(" > ");
                String valueOf2 = String.valueOf(th.getMessage());
                sb.append(valueOf2.length() == 0 ? new String("") : "".concat(valueOf2));
            }
            String sb2 = sb.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            wzv wzv2 = (wzv) da.f164949b;
            sb2.getClass();
            int i5 = wzv2.f51648a | 16;
            wzv2.f51648a = i5;
            wzv2.f51653f = sb2;
            a.getClass();
            wzv2.f51648a = i5 | 32;
            wzv2.f51654g = a;
        }
        wzv wzv3 = (wzv) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = 400;
        int i6 = xab.f51679a | 2;
        xab.f51679a = i6;
        wzv3.getClass();
        xab.f51698t = wzv3;
        xab.f51679a = 262144 | i6;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30186a(xwj xwj, xag xag) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xag);
        bxvd da = xah.f51741c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xah xah = (xah) da.f164949b;
        xah.f51744b = xag.f51740H;
        xah.f51743a |= 1;
        xah xah2 = (xah) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = 101;
        int i = xab.f51679a | 2;
        xab.f51679a = i;
        xah2.getClass();
        xab.f51694p = xah2;
        xab.f51679a = i | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30194a(xwj xwj, xaj xaj) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xaj);
        bxvd da = xak.f51785c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xak xak = (xak) da.f164949b;
        xak.f51788b = xaj.f51784L;
        xak.f51787a |= 1;
        xak xak2 = (xak) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = 300;
        int i = xab.f51679a | 2;
        xab.f51679a = i;
        xak2.getClass();
        xab.f51697s = xak2;
        xab.f51679a = 131072 | i;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30195a(xwj xwj, xkf xkf) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xkf);
        bxvd da = wzo.f51619c.mo74144da();
        bmxy.m108581a(xkf);
        xke xke = xke.AUTHENTICATOR_MAKE_CREDENTIAL;
        xpj xpj = xpj.BLUETOOTH_LOW_ENERGY;
        int ordinal = xkf.mo29860a().ordinal();
        int i = 5;
        if (ordinal == 0) {
            i = 2;
        } else if (ordinal == 1) {
            i = 3;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                xkl xkl = (xkl) xkf;
                throw null;
            } else if (ordinal == 4) {
                i = 11;
            } else if (ordinal != 5) {
                String valueOf = String.valueOf(xkf.mo29860a().name());
                throw new RuntimeException(valueOf.length() == 0 ? new String("Invalid Ctap2Command type provided: ") : "Invalid Ctap2Command type provided: ".concat(valueOf));
            } else {
                i = 4;
            }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzo wzo = (wzo) da.f164949b;
        wzo.f51622b = i - 1;
        wzo.f51621a |= 1;
        wzo wzo2 = (wzo) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = BaseMfiEventCallback.TYPE_UNKNOWN_ERROR;
        int i2 = xab.f51679a | 2;
        xab.f51679a = i2;
        wzo2.getClass();
        xab.f51695q = wzo2;
        xab.f51679a = 32768 | i2;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30196a(xwj xwj, xkg xkg) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xkg);
        bxvd da = wzp.f51623c.mo74144da();
        ByteString a = ByteString.m123261a(new byte[]{xkg.f52499a.f52553Z});
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzp wzp = (wzp) da.f164949b;
        a.getClass();
        wzp.f51625a = 1 | wzp.f51625a;
        wzp.f51626b = a;
        wzp wzp2 = (wzp) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        xab.f51681c = ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR;
        int i = xab.f51679a | 2;
        xab.f51679a = i;
        wzp2.getClass();
        xab.f51696r = wzp2;
        xab.f51679a = 65536 | i;
        m43510a(xwj, da2);
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30197a(xwj xwj, xpj xpj) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xpj);
        m43512a(xwj, xpj, (Integer) null);
    }
}
