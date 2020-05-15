package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.security.SecureRandom;

/* renamed from: awvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awvz {

    /* renamed from: a */
    private static SecureRandom f95203a;

    /* renamed from: a */
    public static blzf m81268a(byte[] bArr) {
        if (bArr != null) {
            return (blzf) bjvp.m104733a(bArr, (bxxk) blzf.f128337k.mo74142c(7));
        }
        return null;
    }

    /* renamed from: a */
    public static bmaj m81269a(bmaj bmaj) {
        blxa blxa;
        bxvd bxvd = (bxvd) bmaj.mo74142c(5);
        bxvd.mo73625a((bxvk) bmaj);
        bmaj bmaj2 = (bmaj) bxvd.f164949b;
        if (bmaj2.f128455b != 10) {
            blxa = blxa.f127989R;
        } else {
            blxa = (blxa) bmaj2.f128456c;
        }
        bxvd bxvd2 = (bxvd) blxa.mo74142c(5);
        bxvd2.mo73625a((bxvk) blxa);
        blwr blwr = (blwr) bxvd2;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa2 = (blxa) blwr.f164949b;
        bxvu bxvu = blxa.f127988L;
        blxa2.f128000J = null;
        blxa2.f128008b &= -2;
        int i = blxa2.f128007a & -2;
        blxa2.f128007a = i;
        blxa2.f128009c = 0;
        blxa2.f128007a = i & -5;
        blxa2.f128011e = blxa.f127989R.f128011e;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa3 = (blxa) blwr.f164949b;
        blxa3.f128007a &= -9;
        blxa3.f128012f = blxa.f127989R.f128012f;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa4 = (blxa) blwr.f164949b;
        blxa4.f128007a &= -8388609;
        blxa4.f127991A = blxa.f127989R.f127991A;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa5 = (blxa) blwr.f164949b;
        blxa5.f128007a &= -16777217;
        blxa5.f127992B = blxa.f127989R.f127992B;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa6 = (blxa) blwr.f164949b;
        blxa6.f128007a &= -33554433;
        blxa6.f127993C = blxa.f127989R.f127993C;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa7 = (blxa) blwr.f164949b;
        int i2 = blxa7.f128007a & -67108865;
        blxa7.f128007a = i2;
        blxa7.f127994D = false;
        int i3 = i2 & -134217729;
        blxa7.f128007a = i3;
        blxa7.f127995E = 0;
        int i4 = i3 & -268435457;
        blxa7.f128007a = i4;
        blxa7.f127996F = 0;
        int i5 = i4 & -257;
        blxa7.f128007a = i5;
        blxa7.f128016j = 0;
        int i6 = i5 & -536870913;
        blxa7.f128007a = i6;
        blxa7.f127997G = 0;
        int i7 = i6 & -1073741825;
        blxa7.f128007a = i7;
        blxa7.f127998H = 0;
        int i8 = i7 & Integer.MAX_VALUE;
        blxa7.f128007a = i8;
        blxa7.f127999I = false;
        blxa7.f128007a = i8 & -4194305;
        blxa7.f128031y = blxa.f127989R.f128031y;
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        ((blxa) blwr.f164949b).f128002M = bxvk.m124030de();
        if (blwr.f164950c) {
            blwr.mo74035c();
            blwr.f164950c = false;
        }
        blxa blxa8 = (blxa) blwr.f164949b;
        blxa8.f128008b &= -3;
        blxa8.f128003N = 0;
        blxa blxa9 = (blxa) blwr.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bmaj bmaj3 = (bmaj) bxvd.f164949b;
        bmaj bmaj4 = bmaj.f128452m;
        blxa9.getClass();
        bmaj3.f128456c = blxa9;
        bmaj3.f128455b = 10;
        return (bmaj) bxvd.mo74062i();
    }

    /* renamed from: a */
    public static bmaj m81270a(bmaj bmaj, BuyFlowConfig buyFlowConfig, Context context, boolean z) {
        return m81271a(bmaj.f128457d.mo73780k(), bmaj.f128463j, buyFlowConfig, context, z);
    }

    /* renamed from: a */
    public static bmaj m81271a(byte[] bArr, boolean z, BuyFlowConfig buyFlowConfig, Context context, boolean z2) {
        return awfx.m79877a(context, bArr, buyFlowConfig, buyFlowConfig.mo60046b(), z, z2);
    }

    /* renamed from: a */
    public static bwey m81272a(RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse, int i) {
        bxvd da = bwey.f159035i.mo74144da();
        String a = awjn.m80013a(retrieveInAppPaymentCredentialResponse.f108425a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwey bwey = (bwey) da.f164949b;
        a.getClass();
        bwey.f159037a |= 1;
        bwey.f159038b = a;
        byte[] bArr = retrieveInAppPaymentCredentialResponse.f108426b;
        if (bArr != null) {
            String encodeToString = Base64.encodeToString(bArr, 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwey bwey2 = (bwey) da.f164949b;
            encodeToString.getClass();
            int i2 = 2 | bwey2.f159037a;
            bwey2.f159037a = i2;
            bwey2.f159039c = encodeToString;
            bwey2.f159044h = i - 1;
            bwey2.f159037a = i2 | 64;
        }
        int i3 = retrieveInAppPaymentCredentialResponse.f108427c;
        bwey bwey3 = (bwey) da.f164949b;
        int i4 = bwey3.f159037a | 4;
        bwey3.f159037a = i4;
        bwey3.f159040d = i3;
        int i5 = retrieveInAppPaymentCredentialResponse.f108428d;
        bwey3.f159037a = i4 | 8;
        bwey3.f159041e = i5;
        if (!TextUtils.isEmpty(retrieveInAppPaymentCredentialResponse.f108429e)) {
            String a2 = awjn.m80013a(retrieveInAppPaymentCredentialResponse.f108429e);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwey bwey4 = (bwey) da.f164949b;
            a2.getClass();
            bwey4.f159037a |= 16;
            bwey4.f159042f = a2;
        }
        if (!TextUtils.isEmpty(retrieveInAppPaymentCredentialResponse.f108430f)) {
            String a3 = awjn.m80013a(retrieveInAppPaymentCredentialResponse.f108430f);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwey bwey5 = (bwey) da.f164949b;
            a3.getClass();
            bwey5.f159037a |= 32;
            bwey5.f159043g = a3;
        }
        return (bwey) da.mo74062i();
    }

    /* renamed from: a */
    public static synchronized SecureRandom m81273a() {
        SecureRandom secureRandom;
        synchronized (awvz.class) {
            if (f95203a == null) {
                f95203a = new SecureRandom();
            }
            secureRandom = f95203a;
        }
        return secureRandom;
    }
}
