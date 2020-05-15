package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.Conditions;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;

/* renamed from: bgyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgyh {

    /* renamed from: a */
    public final SharedPreferences f118032a;

    private bgyh(SharedPreferences sharedPreferences) {
        this.f118032a = sharedPreferences;
    }

    /* renamed from: b */
    public static String m100365b(Account account) {
        return bgyi.m100376a(account).f118035b;
    }

    /* renamed from: c */
    public static String m100366c(Account account) {
        return bgyi.m100376a(account).f118034a;
    }

    /* renamed from: d */
    public static String m100367d(Account account) {
        return bgyi.m100376a(account).f118040g;
    }

    /* renamed from: e */
    public static String m100368e(Account account) {
        return bgyi.m100376a(account).f118036c;
    }

    /* renamed from: f */
    public static String m100369f(Account account) {
        return bgyi.m100376a(account).f118037d;
    }

    /* renamed from: g */
    public static String m100370g(Account account) {
        return bgyi.m100376a(account).f118038e;
    }

    /* renamed from: h */
    public static String m100371h(Account account) {
        return bgyi.m100376a(account).f118039f;
    }

    /* renamed from: a */
    public static bgyh m100364a(Context context) {
        spn.m35873c();
        return new bgyh(context.getSharedPreferences("ULR_PERSISTENT_PREFS", 0));
    }

    /* renamed from: b */
    public final boolean mo63411b() {
        return this.f118032a.getBoolean("privateModeKey", false);
    }

    /* renamed from: a */
    public final ReportingConfig mo63408a() {
        byte[] bArr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        Long l;
        boolean z;
        Long l2;
        String str6 = null;
        String string = this.f118032a.getString("reportingConfig", null);
        if (string == null) {
            return null;
        }
        if (string.isEmpty()) {
            return null;
        }
        try {
            bArr = Base64.decode(string, 2);
        } catch (IllegalArgumentException e) {
            bgur.m100022b("GCoreUlr", e);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        try {
            bgvv bgvv = (bgvv) bxvk.m124016a(bgvv.f117752d, bArr, bxus.m123744c());
            ArrayList arrayList = new ArrayList();
            if ((2 & bgvv.f117754a) != 0) {
                bxwc bxwc = bgvv.f117755b;
                int size = bxwc.size();
                int i2 = 0;
                while (i2 < size) {
                    bgvg bgvg = (bgvg) bxwc.get(i2);
                    int i3 = bgvg.f117636a;
                    if ((i3 & 1) != 0) {
                        str = bgvg.f117637b;
                    } else {
                        str = str6;
                    }
                    if ((i3 & 2) != 0) {
                        str2 = bgvg.f117638c;
                    } else {
                        str2 = str6;
                    }
                    Account account = new Account(str, str2);
                    bgvk bgvk = bgvg.f117649n;
                    if (bgvk == null) {
                        bgvk = bgvk.f117667i;
                    }
                    Conditions a = Conditions.m117326a(bgvk);
                    boolean z2 = bgvg.f117639d;
                    long j = bgvg.f117640e;
                    boolean z3 = bgvg.f117641f;
                    boolean z4 = bgvg.f117643h;
                    int i4 = bgvg.f117636a;
                    if ((i4 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE) != 0) {
                        str3 = bgvg.f117654s;
                    } else {
                        str3 = null;
                    }
                    bxwc bxwc2 = bxwc;
                    boolean z5 = bgvg.f117644i;
                    if ((i4 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS) != 0) {
                        str4 = bgvg.f117655t;
                    } else {
                        str4 = null;
                    }
                    int i5 = size;
                    long j2 = bgvg.f117645j;
                    bgvv bgvv2 = bgvv;
                    int i6 = bgvg.f117646k;
                    int i7 = i2;
                    boolean z6 = bgvg.f117647l;
                    ArrayList arrayList2 = arrayList;
                    boolean z7 = bgvg.f117648m;
                    int i8 = bgvg.f117650o;
                    if ((i4 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT) != 0) {
                        i = i8;
                        str5 = bgvg.f117652q;
                    } else {
                        i = i8;
                        str5 = null;
                    }
                    if ((65536 & i4) != 0) {
                        z = z6;
                        l = Long.valueOf(bgvg.f117653r);
                    } else {
                        z = z6;
                        l = null;
                    }
                    if ((bgvg.f117636a & 1048576) != 0) {
                        l2 = Long.valueOf(bgvg.f117656u);
                    } else {
                        l2 = null;
                    }
                    arrayList2.add(new AccountConfig(account, z2, j, z3, z4, str3, z5, str4, j2, i6, z, z7, a, i, str5, l, l2, bgvg.f117657v, bgwb.m100148a(bgvg.f117658w)));
                    i2 = i7 + 1;
                    arrayList = arrayList2;
                    bxwc = bxwc2;
                    size = i5;
                    bgvv = bgvv2;
                    str6 = null;
                }
                ArrayList arrayList3 = arrayList;
                bgvk bgvk2 = bgvv.f117756c;
                if (bgvk2 == null) {
                    bgvk2 = bgvk.f117667i;
                }
                return new ReportingConfig(arrayList3, Conditions.m117326a(bgvk2));
            }
            bgur.m100024c("GCoreUlr", 23, "Received invalid proto");
            return null;
        } catch (bxwf e2) {
            bgur.m100022b("GCoreUlr", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final Integer mo63409a(Account account) {
        String c = m100366c(account);
        if (this.f118032a.contains(c)) {
            return Integer.valueOf(this.f118032a.getInt(c, 0));
        }
        if (!this.f118032a.contains("deviceTag")) {
            return null;
        }
        int i = this.f118032a.getInt("deviceTag", 0);
        SharedPreferences.Editor edit = this.f118032a.edit();
        edit.remove("deviceTag");
        edit.putInt(c, i);
        edit.apply();
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public final boolean mo63410a(int i, String str) {
        int i2 = this.f118032a.getInt(str, -1);
        if (i2 != -1 && i == i2) {
            return false;
        }
        SharedPreferences.Editor edit = this.f118032a.edit();
        edit.putInt(str, i);
        edit.apply();
        return true;
    }
}
