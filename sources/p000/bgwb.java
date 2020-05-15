package p000;

import android.accounts.Account;
import com.google.android.gms.location.reporting.Deletion;
import com.google.android.ulr.ApiDeleteHistoryOperation;
import com.google.android.ulr.ApiSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bgwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgwb {

    /* renamed from: a */
    public final Long f117793a;

    /* renamed from: b */
    public final Boolean f117794b;

    /* renamed from: c */
    public final String f117795c;

    /* renamed from: d */
    public final Boolean f117796d;

    /* renamed from: e */
    public final String f117797e;

    /* renamed from: f */
    public final int f117798f;

    /* renamed from: g */
    public final int f117799g;

    /* renamed from: h */
    public final int f117800h;

    /* renamed from: i */
    public final Boolean f117801i = null;

    /* renamed from: j */
    public final int f117802j;

    /* renamed from: k */
    private final List f117803k;

    public bgwb(bgwa bgwa) {
        this.f117793a = bgwa.f117783a;
        this.f117794b = bgwa.f117784b;
        this.f117795c = bgwa.f117785c;
        this.f117796d = bgwa.f117786d;
        this.f117797e = bgwa.f117787e;
        this.f117798f = bgwa.f117788f;
        this.f117799g = bgwa.f117789g;
        this.f117800h = bgwa.f117790h;
        this.f117803k = bgwa.f117791i;
        this.f117802j = bgwa.f117792j;
    }

    /* renamed from: a */
    public static int m100148a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown account type: ");
        sb.append(i);
        String sb2 = sb.toString();
        bgur.m100021b("GCoreUlr", sb2, new Exception(sb2));
        return 0;
    }

    /* renamed from: b */
    public final List mo63273b() {
        return Collections.unmodifiableList(this.f117803k);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bgwb) {
            bgwb bgwb = (bgwb) obj;
            if (bxbl.m122538a(this.f117793a, bgwb.f117793a) && bxbl.m122538a(this.f117794b, bgwb.f117794b) && bxbl.m122538a(this.f117795c, bgwb.f117795c) && bxbl.m122538a(this.f117796d, bgwb.f117796d) && bxbl.m122538a(this.f117797e, bgwb.f117797e) && bxbl.m122538a(this.f117803k, bgwb.f117803k)) {
                Boolean bool = bgwb.f117801i;
                if (bxbl.m122538a(null, null) && this.f117798f == bgwb.f117798f && this.f117799g == bgwb.f117799g && this.f117800h == bgwb.f117800h && this.f117802j == bgwb.f117802j) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f117793a, this.f117794b, this.f117796d, Integer.valueOf(this.f117798f), Integer.valueOf(this.f117799g), Integer.valueOf(this.f117800h), this.f117803k, null, Integer.valueOf(this.f117802j)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f117793a);
        String valueOf2 = String.valueOf(this.f117794b);
        String str = this.f117795c;
        String valueOf3 = String.valueOf(this.f117796d);
        String str2 = this.f117797e;
        int i = this.f117798f;
        int i2 = this.f117799g;
        int i3 = this.f117800h;
        String valueOf4 = String.valueOf(this.f117803k);
        String valueOf5 = String.valueOf((Object) null);
        int i4 = this.f117802j;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(str).length();
        int length4 = String.valueOf(valueOf3).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 242 + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("GetSettingsResults{mModMillis=");
        sb.append(valueOf);
        sb.append(", mReportingEnabled=");
        sb.append(valueOf2);
        sb.append(", mReportingSource=");
        sb.append(str);
        sb.append(", mHistoryEnabled=");
        sb.append(valueOf3);
        sb.append(", mHistorySource=");
        sb.append(str2);
        sb.append(", mUserRestriction=");
        sb.append(i);
        sb.append(", mSource=");
        sb.append(i2);
        sb.append(", mConcurrencyType=");
        sb.append(i3);
        sb.append(", mDeletions=");
        sb.append(valueOf4);
        sb.append(", mPrimaryDevice=");
        sb.append(valueOf5);
        sb.append(", mAccountType=");
        sb.append(i4);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static bgwa m100149a() {
        return new bgwa();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a4, code lost:
        if (r4 != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        if (p000.chcs.m148241m() != false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    public static bgwb m100150a(Account account, bvxn bvxn) {
        int i;
        bvxn bvxn2 = bvxn;
        int a = bvxk.m121565a(bvxn2.f158071f);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        int i3 = 2;
        if (a == 2) {
            String valueOf = String.valueOf(bvxn);
            String a2 = aeqm.m52397a(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(a2).length());
            sb.append("Server reports: ");
            sb.append(valueOf);
            sb.append(" for ");
            sb.append(a2);
            bgur.m100020b("GCoreUlr", sb.toString());
        }
        if ((bvxn2.f158066a & 8) != 0) {
            boolean b = chcm.m148188b();
            int a3 = bvxm.m121567a(bvxn2.f158070e);
            if (a3 == 0) {
                a3 = 1;
            }
            switch (a3 - 1) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                default:
                    i = -1;
                    break;
                case 8:
                case 9:
                    if (chcs.m148227C()) {
                        i = 0;
                        break;
                    } else {
                        i = -1;
                        break;
                    }
                case 10:
                    if (chcs.m148241m()) {
                        i = 0;
                        break;
                    } else {
                        i = -1;
                        break;
                    }
                case 11:
                    if (chcs.m148226B()) {
                        i = 0;
                        break;
                    } else {
                        i = -1;
                        break;
                    }
                case 12:
                    if (b) {
                        i = 0;
                        break;
                    } else {
                        i = -1;
                        break;
                    }
            }
            int a4 = bvxm.m121567a(bvxn2.f158070e);
            if (a4 == 0) {
                a4 = 1;
            }
            switch (a4 - 1) {
                case 8:
                    i3 = 1;
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    if (!chcs.m148226B()) {
                        i3 = 0;
                        break;
                    }
                    break;
                case 12:
                    break;
                default:
                    i3 = 0;
                    break;
            }
        } else {
            i3 = 0;
            i = 0;
        }
        bgwa a5 = m100149a();
        a5.f117783a = Long.valueOf(bvxn2.f158067b);
        a5.f117784b = Boolean.valueOf(bvxn2.f158069d);
        a5.f117786d = Boolean.valueOf(bvxn2.f158068c);
        a5.f117788f = i;
        a5.f117789g = a - 1;
        int a6 = bvxi.m121563a(bvxn2.f158072g);
        if (a6 != 0) {
            i2 = a6;
        }
        a5.f117790h = i2;
        bxwc bxwc = bvxn2.f158073h;
        ArrayList arrayList = new ArrayList();
        if (bxwc != null) {
            int size = bxwc.size();
            for (int i4 = 0; i4 < size; i4++) {
                bvwc bvwc = (bvwc) bxwc.get(i4);
                arrayList.add(new Deletion(account, bvwc.f157907b, bvwc.f157908c, bvwc.f157906a));
            }
        }
        a5.mo63272a(arrayList);
        a5.f117792j = i3;
        return a5.mo63271a();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0187, code lost:
        if (r8 != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018e, code lost:
        if (p000.chcs.m148226B() != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0195, code lost:
        if (p000.chcs.m148241m() != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0199, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        if (p000.chcs.m148227C() == false) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x013f, code lost:
        if (r1 != 2) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0143, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x014a  */
    /* renamed from: a */
    public static bgwb m100151a(Account account, ApiSettings apiSettings) {
        int i;
        int i2;
        String b;
        int i3;
        String str;
        ArrayList deleteOperations;
        char c;
        char c2;
        ApiSettings apiSettings2 = apiSettings;
        String str2 = (String) apiSettings2.f44540b.get("source");
        int i4 = 1;
        if (str2 == null || "success".equals(str2)) {
            i = 0;
        } else if ("noData".equals(str2)) {
            i = 1;
        } else if ("restricted".equals(str2)) {
            i = 2;
        } else if (!"concurrentUpdate".equals(str2)) {
            if (str2.length() == 0) {
                new String("Unknown source from server: ");
            } else {
                "Unknown source from server: ".concat(str2);
            }
            i = -1;
        } else {
            i = 3;
        }
        if (i == 1) {
            String valueOf = String.valueOf(apiSettings);
            String a = aeqm.m52397a(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21 + String.valueOf(a).length());
            sb.append("Server reports: ");
            sb.append(valueOf);
            sb.append(" for ");
            sb.append(a);
            bgur.m100020b("GCoreUlr", sb.toString());
        }
        boolean b2 = chcm.m148188b();
        String b3 = apiSettings.mo71591b();
        if (b3 != null) {
            switch (b3.hashCode()) {
                case -2062891781:
                    if (b3.equals("ageUnder13")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2056159669:
                    if (b3.equals("ageUnknown")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -2026577620:
                    if (b3.equals("accountDeleted")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1847287406:
                    if (b3.equals("eponaRestricted")) {
                        c2 = 8;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -953793114:
                    if (b3.equals("accountPurged")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -470435171:
                    if (b3.equals("legalCountry")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 888226288:
                    if (b3.equals("unicornAllowed")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 910836953:
                    if (b3.equals("supervisedMemberRestricted")) {
                        c2 = 9;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 947761710:
                    if (b3.equals("unicornParentOnly")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1396332441:
                    if (b3.equals("griffinParentOnly")) {
                        c2 = 10;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2114381265:
                    if (b3.equals("dasherPolicy")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 4;
                    break;
                case 4:
                    i2 = 5;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                case 7:
                    break;
                case 8:
                    if (chcs.m148241m()) {
                        i2 = 0;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 9:
                    if (chcs.m148226B()) {
                        i2 = 0;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                case 10:
                    if (b2) {
                        i2 = 0;
                        break;
                    } else {
                        i2 = -1;
                        break;
                    }
                default:
                    i2 = -1;
                    break;
            }
            b = apiSettings.mo71591b();
            if (b != null) {
                switch (b.hashCode()) {
                    case -1847287406:
                        if (b.equals("eponaRestricted")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 888226288:
                        if (b.equals("unicornAllowed")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 910836953:
                        if (b.equals("supervisedMemberRestricted")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 947761710:
                        if (b.equals("unicornParentOnly")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1396332441:
                        if (b.equals("griffinParentOnly")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    i3 = 0;
                                }
                            }
                        }
                        i3 = 2;
                    }
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                bgwa a2 = m100149a();
                a2.f117783a = (Long) apiSettings2.f44540b.get("lastModifiedTimestampMs");
                a2.f117784b = (Boolean) apiSettings2.f44540b.get("reportingEnabled");
                a2.f117786d = (Boolean) apiSettings2.f44540b.get("historyEnabled");
                a2.f117788f = i2;
                a2.f117789g = i;
                str = (String) apiSettings2.f44540b.get("concurrencyType");
                if (str == null) {
                    i4 = 0;
                } else if (!"settingsChanged".equals(str)) {
                    if (!"deviceTagUnknown".equals(str)) {
                        String str3 = str.length() == 0 ? new String("Unknown concurrencyType from server: ") : "Unknown concurrencyType from server: ".concat(str);
                        bgur.m100021b("GCoreUlr", str3, new IllegalArgumentException(str3));
                        i4 = -1;
                    } else {
                        i4 = 2;
                    }
                }
                a2.f117790h = i4;
                deleteOperations = apiSettings.getDeleteOperations();
                ArrayList arrayList = new ArrayList();
                if (deleteOperations != null) {
                    int size = deleteOperations.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        ApiDeleteHistoryOperation apiDeleteHistoryOperation = (ApiDeleteHistoryOperation) deleteOperations.get(i5);
                        arrayList.add(new Deletion(account, ((Long) apiDeleteHistoryOperation.f44540b.get("firstTimestampMs")).longValue(), ((Long) apiDeleteHistoryOperation.f44540b.get("lastTimestampMs")).longValue(), ((Long) apiDeleteHistoryOperation.f44540b.get("operationTimestamp")).longValue()));
                    }
                }
                a2.mo63272a(arrayList);
                a2.f117792j = i3;
                return a2.mo63271a();
            }
            i3 = 0;
            bgwa a22 = m100149a();
            a22.f117783a = (Long) apiSettings2.f44540b.get("lastModifiedTimestampMs");
            a22.f117784b = (Boolean) apiSettings2.f44540b.get("reportingEnabled");
            a22.f117786d = (Boolean) apiSettings2.f44540b.get("historyEnabled");
            a22.f117788f = i2;
            a22.f117789g = i;
            str = (String) apiSettings2.f44540b.get("concurrencyType");
            if (str == null) {
            }
            a22.f117790h = i4;
            deleteOperations = apiSettings.getDeleteOperations();
            ArrayList arrayList2 = new ArrayList();
            if (deleteOperations != null) {
            }
            a22.mo63272a(arrayList2);
            a22.f117792j = i3;
            return a22.mo63271a();
        }
        i2 = 0;
        b = apiSettings.mo71591b();
        if (b != null) {
        }
        i3 = 0;
        bgwa a222 = m100149a();
        a222.f117783a = (Long) apiSettings2.f44540b.get("lastModifiedTimestampMs");
        a222.f117784b = (Boolean) apiSettings2.f44540b.get("reportingEnabled");
        a222.f117786d = (Boolean) apiSettings2.f44540b.get("historyEnabled");
        a222.f117788f = i2;
        a222.f117789g = i;
        str = (String) apiSettings2.f44540b.get("concurrencyType");
        if (str == null) {
        }
        a222.f117790h = i4;
        deleteOperations = apiSettings.getDeleteOperations();
        ArrayList arrayList22 = new ArrayList();
        if (deleteOperations != null) {
        }
        a222.mo63272a(arrayList22);
        a222.f117792j = i3;
        return a222.mo63271a();
    }
}
