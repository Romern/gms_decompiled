package p000;

import android.accounts.Account;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: awfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awfx {

    /* renamed from: a */
    private static final awfw f94284a = new awfw();

    /* renamed from: a */
    public static akoz m79876a(Activity activity) {
        BuyFlowConfig h;
        akoz akoz = new akoz(activity);
        if ((activity instanceof awcl) && (h = ((awcl) activity).mo51881h()) != null) {
            int i = h.f110418b.f110410e;
            if (i == 2) {
                akoz.mo39624a(1);
            } else if (i != 3) {
                akoz.mo39624a(0);
            } else {
                akoz.mo39624a(2);
            }
        }
        return akoz;
    }

    /* renamed from: a */
    public static bmaj m79877a(Context context, byte[] bArr, BuyFlowConfig buyFlowConfig, String str, boolean z, boolean z2) {
        int[] iArr;
        awfq awfq;
        ArrayList arrayList;
        xnn xnn;
        boolean z3;
        bmcv a;
        int length;
        Context context2 = context;
        BuyFlowConfig buyFlowConfig2 = buyFlowConfig;
        ArrayList arrayList2 = new ArrayList(2);
        String str2 = (String) awjl.f94540b.mo58455c();
        if (!TextUtils.isEmpty(str2)) {
            arrayList2.add(str2);
        }
        String str3 = (String) awjl.f94541c.mo58455c();
        if (!TextUtils.isEmpty(str3)) {
            arrayList2.add(str3);
        }
        int a2 = awft.m79871a(context);
        boolean booleanValue = ((Boolean) awjl.f94543e.mo58455c()).booleanValue();
        int[][] iArr2 = new int[2][];
        iArr2[0] = m79882a();
        String c = chjw.f188695a.mo6606a().mo85291c();
        if (!c.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (String str4 : c.split(Pattern.quote(","), -1)) {
                String trim = str4.trim();
                if (!trim.isEmpty()) {
                    try {
                        arrayList3.add(Integer.valueOf(Integer.parseInt(trim)));
                    } catch (NumberFormatException e) {
                    }
                }
            }
            iArr = bjyu.m104930a(arrayList3);
        } else {
            iArr = null;
        }
        iArr2[1] = iArr;
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            int[] iArr3 = iArr2[i2];
            i += iArr3 != null ? iArr3.length : 0;
        }
        int[] copyOf = Arrays.copyOf(iArr2[0], i);
        int length2 = iArr2[0].length;
        for (char c2 = 1; c2 < 2; c2 = 2) {
            int[] iArr4 = iArr2[1];
            if (!(iArr4 == null || (length = iArr4.length) == 0)) {
                System.arraycopy(iArr4, 0, copyOf, length2, length);
                length2 += length;
            }
        }
        awfw awfw = f94284a;
        if (chgr.m148702b()) {
            awfq = awfq.m79857a(context2, buyFlowConfig2);
        } else {
            awfq = null;
        }
        if (!chiy.f188669a.mo6606a().mo85271a()) {
            arrayList = null;
        } else {
            if (buyFlowConfig2 != null) {
                ApplicationParameters applicationParameters = buyFlowConfig2.f110418b;
                byah a3 = new awwo(context2).mo52680a(applicationParameters.f110406a, applicationParameters.f110407b);
                awfr a4 = awfr.m79859a(context2, buyFlowConfig2);
                ArrayList arrayList4 = new ArrayList();
                int[] iArr5 = {1, 2, 3};
                int i3 = 0;
                for (int i4 = 3; i3 < i4; i4 = 3) {
                    int i5 = iArr5[i3];
                    if (!(i5 == 1 || (a = awgh.m79897a(a3, i5)) == null || !a4.mo52105a(i5))) {
                        arrayList4.add(a.f128755d);
                    }
                    i3++;
                }
                if (!arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                }
            }
            arrayList = null;
        }
        if (chjw.f188695a.mo6606a().mo85292d()) {
            xnn = wzk.m42526a(context);
        } else {
            xnn = null;
        }
        long a5 = chjw.f188695a.mo6606a().mo85289a();
        if (rfi.f42868a.mo24590b(context2) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return bjvn.m104711a(context.getApplicationContext(), bArr, z3, a2, str, booleanValue, z, arrayList2, copyOf, z2, awfw, awfq, arrayList, xnn, a5);
    }

    /* renamed from: a */
    public static bmaj m79878a(byte[] bArr) {
        bxvd da = bmaj.f128452m.mo74144da();
        if (bArr != null && bArr.length > 0) {
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmaj bmaj = (bmaj) da.f164949b;
            a.getClass();
            bmaj.f128454a |= 1;
            bmaj.f128457d = a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmaj bmaj2 = (bmaj) da.f164949b;
        bmaj2.f128454a |= 128;
        bmaj2.f128463j = false;
        return (bmaj) da.mo74062i();
    }

    /* renamed from: a */
    public static bmqf m79879a(Context context, int i, int i2, int i3, int i4) {
        bxvd da = bmqf.f130370r.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmqf bmqf = (bmqf) da.f164949b;
        bmqf.f130372a |= 8;
        bmqf.f130378g = false;
        String string = context.getString(C0126R.string.wallet_uic_exp_date, "/");
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmqf bmqf2 = (bmqf) da.f164949b;
        string.getClass();
        bmqf2.f130372a |= 32;
        bmqf2.f130380i = string;
        bxvd da2 = bmpe.f130279k.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bmpe bmpe = (bmpe) da2.f164949b;
        bmpe.f130282b = 2;
        bmpe.f130281a |= 1;
        bxvd da3 = blxc.f128037e.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        blxc blxc = (blxc) da3.f164949b;
        int i5 = blxc.f128039a | 2;
        blxc.f128039a = i5;
        blxc.f128041c = i;
        blxc.f128039a = i5 | 1;
        blxc.f128040b = i2;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bmpe bmpe2 = (bmpe) da2.f164949b;
        blxc blxc2 = (blxc) da3.mo74062i();
        blxc2.getClass();
        bmpe2.f130283c = blxc2;
        bmpe2.f130281a |= 2;
        bxvd da4 = blxc.f128037e.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        blxc blxc3 = (blxc) da4.f164949b;
        int i6 = blxc3.f128039a | 2;
        blxc3.f128039a = i6;
        blxc3.f128041c = i3;
        blxc3.f128039a = i6 | 1;
        blxc3.f128040b = i4;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bmpe bmpe3 = (bmpe) da2.f164949b;
        blxc blxc4 = (blxc) da4.mo74062i();
        blxc4.getClass();
        bmpe3.f130284d = blxc4;
        bmpe3.f130281a |= 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmqf bmqf3 = (bmqf) da.f164949b;
        bmpe bmpe4 = (bmpe) da2.mo74062i();
        bmpe4.getClass();
        bmqf3.f130374c = bmpe4;
        bmqf3.f130373b = 16;
        return (bmqf) da.mo74062i();
    }

    /* renamed from: a */
    public static bwhf m79880a(Context context, int i) {
        boolean z;
        boolean z2;
        bxvd da = bwhf.f159500e.mo74144da();
        if (bjvb.f123375a == null) {
            if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            bjvb.f123375a = Boolean.valueOf(z2);
        }
        boolean z3 = !bjvb.f123375a.booleanValue();
        if (bjvn.f123388a == null || SystemClock.elapsedRealtime() - bjvn.f123389b >= ((long) ((Integer) bjwe.f123500u.mo54082a()).intValue())) {
            Context applicationContext = context.getApplicationContext();
            bjvl bjvl = new bjvl();
            bjvn.f123388a = Boolean.valueOf(ahi.m752a(applicationContext, "com.android.chrome", bjvl));
            if (bjvn.f123388a.booleanValue()) {
                applicationContext.unbindService(bjvl);
            }
            bjvn.f123389b = SystemClock.elapsedRealtime();
            z = bjvn.f123388a.booleanValue();
        } else {
            z = bjvn.f123388a.booleanValue();
        }
        ArrayList arrayList = new ArrayList(2);
        if (z3) {
            arrayList.add(bmkf.FULLSCREEN);
        }
        if (z) {
            arrayList.add(bmkf.CHROME_CUSTOM_TAB);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwhf bwhf = (bwhf) da.f164949b;
        if (!bwhf.f159504c.mo73666a()) {
            bwhf.f159504c = GeneratedMessageLite.m124019a(bwhf.f159504c);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bwhf.f159504c.mo74153d(((bmkf) arrayList.get(i2)).f129800d);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{C0126R.attr.uicFdlAppCode});
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        String uri = Uri.parse(String.format(Locale.US, "https://%1$s.app.goo.gl/?link=http%%3A%%2F%%2Funused.google.com&apn=%2$s&al=google-orchestration%%3A%%2F%%2Freturn", string, context.getPackageName())).toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwhf bwhf2 = (bwhf) da.f164949b;
        uri.getClass();
        bwhf2.f159502a |= 1;
        bwhf2.f159503b = uri;
        return (bwhf) da.mo74062i();
    }

    /* renamed from: a */
    public static boolean m79881a(Account account) {
        return account != null && !TextUtils.isEmpty(account.name) && !"noAccount".equals(account.name) && "com.google".equalsIgnoreCase(account.type);
    }

    /* renamed from: a */
    public static int[] m79882a() {
        ArrayList arrayList = new ArrayList();
        int a = (int) cdmb.f181220a.mo6606a().mo77879a();
        if (a != 0) {
            arrayList.add(Integer.valueOf(a));
        }
        int b = (int) cdmb.f181220a.mo6606a().mo77880b();
        if (b != 0) {
            arrayList.add(Integer.valueOf(b));
        }
        return bjyu.m104930a(arrayList);
    }
}
