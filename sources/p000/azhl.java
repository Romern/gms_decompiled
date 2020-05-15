package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: azhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azhl {

    /* renamed from: a */
    private static WeakReference f99387a = new WeakReference(null);

    /* renamed from: b */
    private final Context f99388b;

    /* renamed from: c */
    private final TelephonyManager f99389c;

    public azhl(Context context) {
        this.f99388b = context;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        this.f99389c = telephonyManager;
        if (telephonyManager == null) {
            azoj.m85933c("RegProtoBuilder", "Cannot access telephony service.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static synchronized azhl m85713a(Context context) {
        azhl azhl;
        synchronized (azhl.class) {
            azhl = (azhl) f99387a.get();
            if (azhl == null) {
                azhl = new azhl(context);
                f99387a = new WeakReference(azhl);
            }
        }
        return azhl;
    }

    /* renamed from: a */
    private static final void m85714a(Context context, cblc cblc) {
        azeg.m85519a();
        int[] b = azeg.m85520b(context);
        if (!cfeo.f183719a.mo6606a().mo80970ad() || !TextUtils.equals(azdl.m85412a(context).f99088a.getString("capability_list_unique_string", null), azpi.m86067a(b))) {
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cbld cbld = cbld.f177471h;
            ((cbld) cblc.f164949b).f177478f = GeneratedMessageLite.m124028dc();
            cblc.mo75236a(bqcn.m112586b(b));
        }
    }

    /* renamed from: a */
    public static final void m85715a(Context context, cblc cblc, String str, long j) {
        if (cfeo.m138888s()) {
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("ID", str);
            }
            hashMap.put("APP_NAME", cfeo.m138878i());
            if (j > 0) {
                hashMap.put("ISSUED_AT", String.valueOf(j));
            }
            m85716a(context, hashMap, cblc);
        }
    }

    /* renamed from: a */
    public static final void m85716a(Context context, Map map, cblc cblc) {
        String a = azob.m85899a(context).mo55113a("tachyon_registration", map);
        if (a != null) {
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cbld cbld = cbld.f177471h;
            a.getClass();
            ((cbld) cblc.f164949b).f177476d = a;
        }
    }

    /* renamed from: a */
    public final bmxv mo54926a(Context context, long j, civt civt) {
        KeyPair keyPair;
        civt civt2;
        azox.m85982b();
        azod.m85906a();
        String b = azod.m85907b(context, "466216207879");
        if (b == null) {
            return bmvz.f131120a;
        }
        if (azdl.m85412a(context).f99088a.getInt("tachyon_idkey_version", 0) == 1) {
            civt2 = azbw.m85224a(context, azdl.m85412a(context).mo54789k(), azdl.m85412a(context).mo54790l());
            keyPair = null;
        } else {
            keyPair = azbw.m85225a(azdl.m85412a(context).mo54789k(), azdl.m85412a(context).mo54790l());
            civt2 = null;
        }
        return bmxv.m108566b(mo54929a(context, azfn.m85574a(azdl.m85412a(context).mo54738a(), "MS"), b, j, civt2, keyPair, civt));
    }

    /* renamed from: a */
    public final bmxv mo54927a(Context context, LocalEntityId localEntityId, long j) {
        byte[] bArr;
        byte[] bArr2;
        bxvd da = cblf.f177482m.mo74144da();
        azcs a = azcv.m85357a(context).mo54689a(localEntityId);
        byte[] bArr3 = null;
        if (a != null) {
            bArr = a.f99002a;
        } else {
            bArr = null;
        }
        cbmo a2 = azfn.m85575a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblf cblf = (cblf) da.f164949b;
        cblf.f177486c = j;
        cblf.f177487d = 2;
        azct c = azcv.m85357a(context).mo54699c(localEntityId);
        if (c != null) {
            bArr2 = c.f99008e;
        } else {
            bArr2 = null;
        }
        if (c != null) {
            bArr3 = c.f99007d;
        }
        civt a3 = azbw.m85224a(context, bArr2, bArr3);
        if (a3 != null) {
            byte[][] bArr4 = {azbw.m85229a(azpi.m86073a(azbw.m85231b(a2.f177657b.getKey()))), azbw.m85229a(azbw.m85227a(((cblf) da.f164949b).f177486c))};
            byte[] bArr5 = new byte[52];
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                byte[] bArr6 = bArr4[i2];
                int length = bArr6.length;
                System.arraycopy(bArr6, 0, bArr5, i, length);
                i += length;
            }
            ByteString a4 = ByteString.m123261a(azbw.m85230a(bArr5, a3));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a4.getClass();
            ((cblf) da.f164949b).f177488e = a4;
        }
        cblc cblc = (cblc) cbld.f177471h.mo74144da();
        byte[] d = azot.m85972d(context, this.f99389c);
        if (d != null) {
            ByteString a5 = ByteString.m123261a(d);
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            a5.getClass();
            ((cbld) cblc.f164949b).f177479g = a5;
        }
        m85714a(context, cblc);
        azod.m85906a();
        String b = azod.m85907b(context, "466216207879");
        if (b != null) {
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            b.getClass();
            ((cbld) cblc.f164949b).f177474b = b;
        }
        long P = cfeo.m138859P();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - azdl.m85412a(context).mo54779h() > P) {
            String a6 = azot.m85961a(context, this.f99389c);
            if (!TextUtils.isEmpty(a6)) {
                cbma a7 = azfn.m85574a(a6, cfeo.m138878i());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a7.getClass();
                ((cblf) da.f164949b).f177493j = a7;
            }
            bxvd da2 = cblz.f177587c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cblz) da2.f164949b).f177589a = 1;
            if (b != null) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                b.getClass();
                ((cblz) da2.f164949b).f177590b = b;
            }
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cblz cblz = (cblz) da2.mo74062i();
            cblz.getClass();
            ((cbld) cblc.f164949b).f177473a = cblz;
            azdl.m85412a(context).mo54740a(currentTimeMillis);
        }
        byte[] k = a2.f177657b.getKey();
        if (cfeo.m138888s()) {
            HashMap hashMap = new HashMap();
            hashMap.put("REQUEST_ID", azbw.m85231b(k));
            m85716a(context, hashMap, cblc);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbld cbld = (cbld) cblc.mo74062i();
        cbld.getClass();
        ((cblf) da.f164949b).f177489f = cbld;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((cblf) da.f164949b).f177484a = a2;
        return bmxv.m108566b((cblf) da.mo74062i());
    }

    /* renamed from: a */
    public final cbkz mo54928a() {
        String str;
        beat b;
        int i;
        Context context = this.f99388b;
        TelephonyManager telephonyManager = this.f99389c;
        String b2 = azot.m85968b(context, telephonyManager);
        if (TextUtils.isEmpty(b2) || (b = azot.m85967b(b2, azot.m85963a(telephonyManager))) == null || (i = b.f106841a) <= 0) {
            str = null;
        } else {
            StringBuilder sb = new StringBuilder(12);
            sb.append("+");
            sb.append(i);
            str = sb.toString();
        }
        if (str != null && str.length() == 2) {
            bxvd da = cbkz.f177457c.mo74144da();
            String upperCase = str.toUpperCase(Locale.US);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbkz cbkz = (cbkz) da.f164949b;
            upperCase.getClass();
            cbkz.f177460b = upperCase;
            cbkz.f177459a = cbky.m127954a(3);
            return (cbkz) da.mo74062i();
        }
        String a = ryv.m34681a(this.f99388b, "device_country", null);
        if (a == null || a.length() != 2) {
            String b3 = azot.m85969b(this.f99389c);
            if (TextUtils.isEmpty(b3)) {
                return null;
            }
            bxvd da2 = cbkz.f177457c.mo74144da();
            String upperCase2 = b3.toUpperCase(Locale.US);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cbkz cbkz2 = (cbkz) da2.f164949b;
            upperCase2.getClass();
            cbkz2.f177460b = upperCase2;
            cbkz2.f177459a = cbky.m127954a(4);
            return (cbkz) da2.mo74062i();
        }
        bxvd da3 = cbkz.f177457c.mo74144da();
        String upperCase3 = a.toUpperCase(Locale.US);
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        cbkz cbkz3 = (cbkz) da3.f164949b;
        upperCase3.getClass();
        cbkz3.f177460b = upperCase3;
        cbkz3.f177459a = cbky.m127954a(4);
        return (cbkz) da3.mo74062i();
    }

    /* renamed from: a */
    public final cblf mo54929a(Context context, cbma cbma, String str, long j, civt civt, KeyPair keyPair, civt civt2) {
        cbkz a;
        int i;
        Context context2 = context;
        String str2 = str;
        civt civt3 = civt;
        KeyPair keyPair2 = keyPair;
        civt civt4 = civt2;
        bxvd da = cblf.f177482m.mo74144da();
        cbmo a2 = azfn.m85575a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cblf cblf = (cblf) da.f164949b;
        a2.getClass();
        cblf.f177484a = a2;
        cbma.getClass();
        cblf.f177485b = cbma;
        cblf.f177486c = j;
        str.getClass();
        cblf.f177490g = str2;
        if (civt4 != null) {
            bxvd da2 = cbml.f177642c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((cbml) da2.f164949b).f177644a = cipl.m150696a(3);
            ByteString a3 = ByteString.m123261a(civt4.f191540a.mo86595a());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            a3.getClass();
            ((cbml) da2.f164949b).f177645b = a3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cbml cbml = (cbml) da2.mo74062i();
            cbml.getClass();
            ((cblf) da.f164949b).f177494k = cbml;
        }
        if (civt3 != null) {
            try {
                cblf cblf2 = (cblf) da.mo74062i();
                byte[] a4 = azbw.m85226a(cipg.m150690a(2));
                byte[] a5 = azbw.m85226a(cipg.m150690a(2));
                cbml cbml2 = cblf2.f177494k;
                if (cbml2 != null) {
                    int i2 = cbml2.f177644a;
                    if (i2 != 0) {
                        i = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
                    } else {
                        i = 2;
                    }
                    if (i == 0) {
                        i = 1;
                    }
                    a4 = azbw.m85229a(azbw.m85226a(cipl.m150696a(i)));
                    cbml cbml3 = cblf2.f177494k;
                    if (cbml3 == null) {
                        cbml3 = cbml.f177642c;
                    }
                    a5 = azbw.m85229a(cbml3.f177645b.getKey());
                }
                byte[][] bArr = new byte[9][];
                cbma cbma2 = cblf2.f177485b;
                if (cbma2 == null) {
                    cbma2 = cbma.f177591f;
                }
                bArr[0] = azbw.m85229a(cbma2.f177595c.getBytes("UTF-8"));
                cbma cbma3 = cblf2.f177485b;
                if (cbma3 == null) {
                    cbma3 = cbma.f177591f;
                }
                int b = cipg.m150691b(cbma3.f177593a);
                if (b == 0) {
                    b = 1;
                }
                bArr[1] = azbw.m85229a(azbw.m85226a(cipg.m150690a(b)));
                cbma cbma4 = cblf2.f177485b;
                if (cbma4 == null) {
                    cbma4 = cbma.f177591f;
                }
                bArr[2] = azbw.m85229a(cbma4.f177594b.getBytes("UTF-8"));
                bArr[3] = azbw.m85229a(cblf2.f177490g.getBytes("UTF-8"));
                bArr[4] = azbw.m85229a(cblf2.f177491h.getKey());
                bArr[5] = azbw.m85229a(cblf2.f177492i.getBytes("UTF-8"));
                bArr[6] = a4;
                bArr[7] = a5;
                bArr[8] = azbw.m85229a(azbw.m85227a(cblf2.f177486c));
                int i3 = 0;
                for (int i4 = 0; i4 < 9; i4++) {
                    i3 += bArr[i4].length;
                }
                byte[] bArr2 = new byte[i3];
                int i5 = 0;
                for (int i6 = 0; i6 < 9; i6++) {
                    byte[] bArr3 = bArr[i6];
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i5, length);
                    i5 += length;
                }
                ByteString a6 = ByteString.m123261a(azbw.m85230a(bArr2, civt3));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a6.getClass();
                ((cblf) da.f164949b).f177488e = a6;
            } catch (UnsupportedEncodingException e) {
                azoj.m85931a("RegProtoBuilder", e, "Failed to sign request", new Object[0]);
            }
        } else if (keyPair2 == null) {
            azoj.m85933c("RegProtoBuilder", "current idKey is broken, can't sign request", new Object[0]);
        } else {
            try {
                cblf cblf3 = (cblf) da.mo74062i();
                cbml cbml4 = cblf3.f177494k;
                byte[] k = cbml4 != null ? cbml4.f177645b.getKey() : new byte[0];
                Locale locale = Locale.US;
                Object[] objArr = new Object[8];
                cbma cbma5 = cblf3.f177485b;
                if (cbma5 == null) {
                    cbma5 = cbma.f177591f;
                }
                objArr[0] = cbma5.f177595c;
                cbma cbma6 = cblf3.f177485b;
                if (cbma6 == null) {
                    cbma6 = cbma.f177591f;
                }
                int b2 = cipg.m150691b(cbma6.f177593a);
                if (b2 == 0) {
                    b2 = 1;
                }
                objArr[1] = Integer.valueOf(cipg.m150690a(b2));
                cbma cbma7 = cblf3.f177485b;
                if (cbma7 == null) {
                    cbma7 = cbma.f177591f;
                }
                objArr[2] = cbma7.f177594b;
                objArr[3] = cblf3.f177490g;
                objArr[4] = Base64.encodeToString(cblf3.f177491h.getKey(), 2);
                objArr[5] = cblf3.f177492i;
                objArr[6] = Base64.encodeToString(k, 2);
                objArr[7] = Long.valueOf(cblf3.f177486c);
                ByteString a7 = ByteString.m123261a(azbw.m85228a(String.format(locale, "%s:%d:%s:%s:%s:%s:%s:%d", objArr), keyPair2));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a7.getClass();
                ((cblf) da.f164949b).f177488e = a7;
            } catch (UnsupportedEncodingException e2) {
                azoj.m85931a("RegProtoBuilder", e2, "Failed to sign request", new Object[0]);
            }
        }
        cblc cblc = (cblc) cbld.f177471h.mo74144da();
        byte[] d = azot.m85972d(context2, this.f99389c);
        if (d != null) {
            ByteString a8 = ByteString.m123261a(d);
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            a8.getClass();
            ((cbld) cblc.f164949b).f177479g = a8;
        }
        m85714a(context2, cblc);
        if (cblc.f164950c) {
            cblc.mo74035c();
            cblc.f164950c = false;
        }
        str.getClass();
        ((cbld) cblc.f164949b).f177474b = str2;
        if (civt4 != null) {
            bxvd da3 = cbml.f177642c.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            ((cbml) da3.f164949b).f177644a = cipl.m150696a(3);
            ByteString a9 = ByteString.m123261a(civt4.f191540a.mo86595a());
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            a9.getClass();
            ((cbml) da3.f164949b).f177645b = a9;
            cbml cbml5 = (cbml) da3.mo74062i();
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cbml5.getClass();
            ((cbld) cblc.f164949b).f177475c = cbml5;
        }
        long P = cfeo.m138859P();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - azdl.m85412a(context).mo54779h() > P) {
            String a10 = azot.m85961a(context2, this.f99389c);
            if (!TextUtils.isEmpty(a10)) {
                cbma a11 = azfn.m85574a(a10, cfeo.m138878i());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a11.getClass();
                ((cblf) da.f164949b).f177493j = a11;
            }
            bxvd da4 = cblz.f177587c.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            ((cblz) da4.f164949b).f177589a = 1;
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            str.getClass();
            ((cblz) da4.f164949b).f177590b = str2;
            cblz cblz = (cblz) da4.mo74062i();
            if (cblc.f164950c) {
                cblc.mo74035c();
                cblc.f164950c = false;
            }
            cblz.getClass();
            ((cbld) cblc.f164949b).f177473a = cblz;
            azdl.m85412a(context).mo54740a(currentTimeMillis);
        }
        if (cfeo.f183719a.mo6606a().mo80936W()) {
            cblf cblf4 = (cblf) da.f164949b;
            cbma cbma8 = cblf4.f177485b;
            m85715a(context2, cblc, cbma8 != null ? cbma8.f177594b : null, cblf4.f177486c);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cbld cbld = (cbld) cblc.mo74062i();
        cbld.getClass();
        ((cblf) da.f164949b).f177489f = cbld;
        if (cfeo.m138875f() && (a = mo54928a()) != null) {
            ByteString aL = a.mo73639aL();
            bxvd da5 = cble.f177480a.mo74144da();
            if (aL != null && !aL.mo73779j()) {
                try {
                    bxuc h = aL.mo73764h();
                    da5.mo73626a(h);
                    h.mo73787a(0);
                } catch (bxwf e3) {
                    throw e3;
                } catch (IOException e4) {
                    throw new RuntimeException(da5.mo73636c("ByteString"), e4);
                } catch (bxwf e5) {
                    azoj.m85933c("ProtoUtil", "invalid data.", new Object[0]);
                }
            }
            cble cble = (cble) da5.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cble.getClass();
            ((cblf) da.f164949b).f177495l = cble;
        }
        String valueOf = String.valueOf(da);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("request:");
        sb.append(valueOf);
        sb.toString();
        return (cblf) da.mo74062i();
    }
}
