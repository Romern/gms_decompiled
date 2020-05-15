package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: awew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awew implements awpj {

    /* renamed from: a */
    public final SharedPreferences f94251a;

    /* renamed from: b */
    private final int f94252b = 4;

    /* renamed from: c */
    private final Context f94253c;

    /* renamed from: a */
    public static final String m79827a(byte[] bArr, String str, int i, String str2, String str3, ArrayList arrayList) {
        bxvd da = byab.f165222h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byab byab = (byab) da.f164949b;
        str.getClass();
        int i2 = byab.f165224a | 2;
        byab.f165224a = i2;
        byab.f165226c = str;
        byab.f165224a = i2 | 4;
        byab.f165227d = i;
        bxtx a = bxtx.m123261a(bArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byab byab2 = (byab) da.f164949b;
        a.getClass();
        int i3 = byab2.f165224a | 1;
        byab2.f165224a = i3;
        byab2.f165225b = a;
        str3.getClass();
        int i4 = i3 | 8;
        byab2.f165224a = i4;
        byab2.f165228e = str3;
        str2.getClass();
        byab2.f165224a = i4 | 16;
        byab2.f165229f = str2;
        if (!byab2.f165230g.mo73666a()) {
            byab2.f165230g = bxvk.m124019a(byab2.f165230g);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            byab2.f165230g.mo74153d(((blwq) arrayList.get(i5)).f127969e);
        }
        return bjvp.m104734a((byab) da.mo74062i());
    }

    public awew(Context context) {
        this.f94253c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.wallet.buyflow.InitializationTemplateCache", 4);
        this.f94251a = sharedPreferences;
        if (sharedPreferences.getInt("VERSION", this.f94252b) < this.f94252b) {
            this.f94251a.edit().clear().apply();
        }
        this.f94251a.edit().putInt("VERSION", this.f94252b).apply();
    }

    /* renamed from: a */
    public final blxz mo52085a(String str) {
        String string = this.f94251a.getString(str, null);
        if (string != null) {
            try {
                return (blxz) bjvp.m104732a(string, (bxxk) blxz.f128176e.mo74142c(7));
            } catch (IllegalArgumentException e) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final blxz mo52086a(byte[] bArr, BuyFlowConfig buyFlowConfig, String str, ArrayList arrayList) {
        ApplicationParameters applicationParameters = buyFlowConfig.f110418b;
        String str2 = applicationParameters.f110407b.name;
        int i = applicationParameters.f110406a;
        String str3 = buyFlowConfig.f110419c;
        blxz a = mo52085a(m79827a(bArr, str2, i, str3, str, arrayList));
        if (a == null) {
            return null;
        }
        if (((blxs) a.f128181d.get(0)).f128138g >= System.currentTimeMillis()) {
            return a;
        }
        byte[][] bArr2 = {bArr};
        SharedPreferences.Editor edit = this.f94251a.edit();
        edit.remove(m79827a(bArr2[0], str2, i, str3, str, arrayList));
        edit.apply();
        return null;
    }

    /* renamed from: a */
    public final HashSet mo52087a(String str, int i, String str2) {
        HashSet hashSet = new HashSet();
        for (String str3 : this.f94251a.getAll().keySet()) {
            if (!"VERSION".equals(str3)) {
                byab byab = (byab) bjvp.m104732a(str3, (bxxk) byab.f165222h.mo74142c(7));
                if (sdg.m34949a(byab.f165226c, str) && byab.f165227d == i && sdg.m34949a(byab.f165229f, str2)) {
                    hashSet.add(byab);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo52088a() {
        blxz blxz;
        Set<String> keySet = this.f94251a.getAll().keySet();
        SharedPreferences.Editor edit = this.f94251a.edit();
        for (String str : keySet) {
            if (!"VERSION".equals(str)) {
                blxz = mo52085a(str);
            } else {
                blxz = null;
            }
            if (blxz != null && ((blxs) blxz.f128181d.get(0)).f128138g < System.currentTimeMillis()) {
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
