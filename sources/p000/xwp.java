package p000;

import android.content.Context;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: xwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xwp extends xwh implements xws {

    /* renamed from: e */
    private static final sek f53303e = new sek(new String[]{"ClearCutU2fEventLogger"}, (short[]) null);

    /* renamed from: d */
    private List f53304d;

    public xwp(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m43552a(xwj xwj, Transport transport, Integer num) {
        int i;
        bxvd da = xar.f51817d.mo74144da();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xar xar = (xar) da.f164949b;
        xar.f51819a |= 1;
        xar.f51820b = i;
        xan a = xwh.m43503a(transport);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xar xar2 = (xar) da.f164949b;
        xar2.f51821c = a.f51798g;
        xar2.f51819a |= 2;
        xar xar3 = (xar) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        int i2 = xwj.f53295a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        int i3 = xab.f51679a | 1;
        xab.f51679a = i3;
        xab.f51680b = i2;
        xab.f51681c = 2;
        int i4 = i3 | 2;
        xab.f51679a = i4;
        xar3.getClass();
        xab.f51684f = xar3;
        xab.f51679a = i4 | 16;
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    private final void m43553a(xwj xwj, String str, Set set, List list, int i) {
        boolean z;
        String str2 = str;
        List list2 = list;
        int i2 = i;
        bmxy.m108581a(str);
        bmxy.m108581a(set);
        if (i2 == 6) {
            z = true;
        } else {
            z = i2 == 2;
        }
        bmxy.m108588a(z);
        bxvd da = xap.f51804g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xap xap = (xap) da.f164949b;
        str.getClass();
        xap.f51806a |= 1;
        xap.f51807b = str2;
        List<xan> a = xwh.m43502a(set);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xap xap2 = (xap) da.f164949b;
        if (!xap2.f51809d.mo73666a()) {
            xap2.f51809d = bxvk.m124019a(xap2.f51809d);
        }
        for (xan xan : a) {
            xap2.f51809d.mo74153d(xan.f51798g);
        }
        int i3 = this.f53280c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xap xap3 = (xap) da.f164949b;
        int i4 = xap3.f51806a | 2;
        xap3.f51806a = i4;
        xap3.f51810e = i3;
        String str3 = this.f53279b;
        str3.getClass();
        xap3.f51806a = i4 | 4;
        xap3.f51811f = str3;
        this.f53304d = list2;
        if (list2 != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f53304d.size());
            List list3 = this.f53304d;
            int size = list3.size();
            for (int i5 = 0; i5 < size; i5++) {
                RegisteredKey registeredKey = (RegisteredKey) list3.get(i5);
                bxvd da2 = xao.f51799d.mo74144da();
                List<xan> a2 = xwh.m43502a(registeredKey.f31934a.f31913d);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                xao xao = (xao) da2.f164949b;
                if (!xao.f51802b.mo73666a()) {
                    xao.f51802b = bxvk.m124019a(xao.f51802b);
                }
                for (xan xan2 : a2) {
                    xao.f51802b.mo74153d(xan2.f51798g);
                }
                if ("com.google.android.gms".equalsIgnoreCase(str2)) {
                    bxtx a3 = bxtx.m123261a(xid.m42997a().digest(registeredKey.f31934a.f31911b));
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    xao xao2 = (xao) da2.f164949b;
                    a3.getClass();
                    xao2.f51801a |= 1;
                    xao2.f51803c = a3;
                }
                arrayList.add((xao) da2.mo74062i());
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            xap xap4 = (xap) da.f164949b;
            if (!xap4.f51808c.mo73666a()) {
                xap4.f51808c = bxvk.m124021a(xap4.f51808c);
            }
            bxsy.m123078a(arrayList, xap4.f51808c);
        }
        bxvd da3 = xab.f51677u.mo74144da();
        int i6 = xwj.f53295a;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        xab xab = (xab) da3.f164949b;
        int i7 = 1 | xab.f51679a;
        xab.f51679a = i7;
        xab.f51680b = i6;
        xab.f51681c = i2 - 1;
        xab.f51679a = 2 | i7;
        xap xap5 = (xap) da.mo74062i();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        xab xab2 = (xab) da3.f164949b;
        xap5.getClass();
        xab2.f51683e = xap5;
        xab2.f51679a |= 8;
        mo30187a((xab) da3.mo74062i());
    }

    /* renamed from: a */
    public final void mo30198a(xwj xwj, int i, String str) {
        bmxy.m108581a(xwj);
        bxvd da = xaq.f51812d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        xaq xaq = (xaq) da.f164949b;
        xaq.f51814a |= 1;
        xaq.f51815b = i;
        if (str != null && str.length() > 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            xaq xaq2 = (xaq) da.f164949b;
            str.getClass();
            xaq2.f51814a |= 2;
            xaq2.f51816c = str;
        }
        bxvd da2 = xab.f51677u.mo74144da();
        int i2 = xwj.f53295a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        int i3 = xab.f51679a | 1;
        xab.f51679a = i3;
        xab.f51680b = i2;
        xab.f51681c = 3;
        xab.f51679a = i3 | 2;
        xaq xaq3 = (xaq) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab2 = (xab) da2.f164949b;
        xaq3.getClass();
        xab2.f51685g = xaq3;
        xab2.f51679a |= 32;
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30199a(xwj xwj, Transport transport) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(transport);
        m43552a(xwj, transport, (Integer) null);
    }

    /* renamed from: a */
    public final void mo30200a(xwj xwj, SignResponseData signResponseData, Transport transport) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(signResponseData);
        bmxy.m108581a(transport);
        byte[] bArr = signResponseData.f31945a;
        int i = 0;
        while (true) {
            if (i < this.f53304d.size()) {
                if (Arrays.equals(((RegisteredKey) this.f53304d.get(i)).f31934a.f31911b, bArr)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            sek sek = f53303e;
            String valueOf = String.valueOf(boan.f132472f.mo68794a(bArr));
            sek.mo25418e(valueOf.length() == 0 ? new String("Unexpected Key Handle in SignResponseData: ") : "Unexpected Key Handle in SignResponseData: ".concat(valueOf), new Object[0]);
            return;
        }
        m43552a(xwj, transport, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo30201a(xwj xwj, String str, RegisterRequestParams registerRequestParams, Set set) {
        bmxy.m108581a(str);
        bmxy.m108581a(registerRequestParams);
        bmxy.m108581a(set);
        m43553a(xwj, str, set, registerRequestParams.f31927e, 6);
    }

    /* renamed from: a */
    public final void mo30202a(xwj xwj, String str, SignRequestParams signRequestParams, Set set) {
        bmxy.m108581a(str);
        bmxy.m108581a(signRequestParams);
        bmxy.m108581a(set);
        m43553a(xwj, str, set, signRequestParams.f31941e, 2);
    }

    /* renamed from: a */
    public final void mo30184a(xwj xwj, Throwable th) {
        mo30185a(xwj, th, 1);
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
        int i = xwj.f53295a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        int i2 = xab.f51679a | 1;
        xab.f51679a = i2;
        xab.f51680b = i;
        xab.f51681c = 101;
        int i3 = i2 | 2;
        xab.f51679a = i3;
        xah2.getClass();
        xab.f51690l = xah2;
        xab.f51679a = i3 | 1024;
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30203a(xwj xwj, xle xle) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xle);
        bxvd da = wzl.f51607f.mo74144da();
        byte b = xle.f52646a & 255;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzl wzl = (wzl) da.f164949b;
        int i = wzl.f51609a | 1;
        wzl.f51609a = i;
        wzl.f51610b = b;
        byte b2 = xle.f52647b;
        int i2 = i | 2;
        wzl.f51609a = i2;
        wzl.f51611c = b2 & 255;
        byte b3 = xle.f52648c;
        int i3 = i2 | 4;
        wzl.f51609a = i3;
        wzl.f51612d = b3 & 255;
        byte b4 = xle.f52649d;
        wzl.f51609a = i3 | 8;
        wzl.f51613e = b4;
        wzl wzl2 = (wzl) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        int i4 = xwj.f53295a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        int i5 = xab.f51679a | 1;
        xab.f51679a = i5;
        xab.f51680b = i4;
        xab.f51681c = 50;
        int i6 = i5 | 2;
        xab.f51679a = i6;
        wzl2.getClass();
        xab.f51687i = wzl2;
        xab.f51679a = i6 | 128;
        mo30187a((xab) da2.mo74062i());
    }

    /* renamed from: a */
    public final void mo30204a(xwj xwj, xlf xlf) {
        bmxy.m108581a(xwj);
        bmxy.m108581a(xlf);
        bxvd da = wzm.f51614c.mo74144da();
        char c = (char) xlf.f52655a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        wzm wzm = (wzm) da.f164949b;
        wzm.f51616a |= 1;
        wzm.f51617b = c;
        wzm wzm2 = (wzm) da.mo74062i();
        bxvd da2 = xab.f51677u.mo74144da();
        int i = xwj.f53295a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        xab xab = (xab) da2.f164949b;
        int i2 = xab.f51679a | 1;
        xab.f51679a = i2;
        xab.f51680b = i;
        xab.f51681c = 51;
        int i3 = i2 | 2;
        xab.f51679a = i3;
        wzm2.getClass();
        xab.f51688j = wzm2;
        xab.f51679a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        mo30187a((xab) da2.mo74062i());
    }
}
