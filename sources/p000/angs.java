package p000;

import android.os.Build;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.phenotype.sync.HeterodyneSyncTaskChimeraService;
import java.util.Arrays;

/* renamed from: angs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class angs extends angl implements aaai {

    /* renamed from: a */
    private final aaag f76810a;

    /* renamed from: b */
    private final String f76811b;

    /* renamed from: c */
    private final rfz f76812c = rfz.m33557a(rpr.m34216b());

    public angs(aaag aaag, String str) {
        this.f76810a = aaag;
        this.f76811b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41821a() {
        if (!spn.m35869b()) {
            this.f76812c.mo24605a(this.f76811b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41823b() {
        mo41821a();
        if (!cgec.f186635a.mo6606a().mo83527h() && !ange.f76800a.contains(this.f76811b) && !Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu") && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            throw new SecurityException(String.valueOf(this.f76811b).concat(" is not authorized for debug operations"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41824c() {
        if (cgec.m144835j().f165797a.contains(this.f76811b)) {
            mo41821a();
        } else {
            mo41823b();
        }
    }

    /* renamed from: a */
    public final void mo41798a(angj angj) {
        mo41823b();
        this.f76810a.mo16658a(new anhf(angj));
    }

    /* renamed from: a */
    public final void mo41799a(angj angj, String str) {
        mo41822a(str);
        this.f76810a.mo16658a(new anig(angj, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41800a(angj angj, String str, int i, String[] strArr, byte[] bArr) {
        mo41822a(str);
        this.f76810a.mo16658a(new anht(angj, str, i, strArr, null, bArr, false, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41801a(angj angj, String str, int i, String[] strArr, byte[] bArr, String str2, String str3) {
        mo41822a(str);
        aaag aaag = this.f76810a;
        srn srn = HeterodyneSyncTaskChimeraService.f82139a;
        aaag.mo16658a(new anhv(angj, str, i, strArr, bArr, str2, str3, this.f76811b));
    }

    /* renamed from: c */
    public final void mo41818c(angj angj, String str) {
        mo41822a(str);
        this.f76810a.mo16658a(new anha(angj, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41802a(angj angj, String str, int i, String[] strArr, int[] iArr, byte[] bArr) {
        mo41821a();
        this.f76810a.mo16658a(new anht(angj, str, i, strArr, iArr, bArr, true, this.f76811b));
    }

    /* renamed from: b */
    public final void mo41813b(angj angj) {
        mo41821a();
        this.f76810a.mo16658a(new anhm(angj, this.f76811b));
    }

    /* renamed from: c */
    public final void mo41819c(angj angj, String str, String str2, String str3) {
        mo41823b();
        this.f76810a.mo16658a(new anho(angj, this.f76811b, str, str2, str3));
    }

    /* renamed from: a */
    public final void mo41803a(angj angj, String str, long j) {
        mo41821a();
        this.f76810a.mo16658a(new anie(angj, HeterodyneSyncTaskChimeraService.f82140m, str, j));
    }

    /* renamed from: b */
    public final void mo41814b(angj angj, String str) {
        String str2;
        String[] a = anhe.m64385a(str);
        if (a != null) {
            str2 = a[5];
        } else {
            str2 = null;
        }
        mo41822a(str2);
        this.f76810a.mo16658a(new angw(angj, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41804a(angj angj, String str, String str2) {
        mo41822a(str);
        this.f76810a.mo16658a(new anhc(angj, str, str2, null, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41805a(angj angj, String str, String str2, int i) {
        mo41822a(str);
        this.f76810a.mo16658a(new anhk(angj, str, str2, i, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41806a(angj angj, String str, String str2, String str3) {
        mo41822a(str);
        this.f76810a.mo16658a(new anhc(angj, str, str2, str3, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41807a(angj angj, String str, String str2, String str3, int i, int i2, String str4) {
        mo41824c();
        aaag aaag = this.f76810a;
        int i3 = angg.f76803a;
        aaag.mo16658a(new anic(angj, this.f76811b, str, str2, new Flag[]{new Flag(str3, str4, i2, i)}));
    }

    /* renamed from: b */
    public final void mo41815b(angj angj, String str, String str2) {
        mo41822a(str);
        aaag aaag = this.f76810a;
        String str3 = this.f76811b;
        aaag.mo16658a(new anhg(angj, str, str2, null, str3, str3));
    }

    /* renamed from: a */
    public final void mo41808a(angj angj, String str, String str2, String str3, String str4) {
        mo41822a(str);
        this.f76810a.mo16658a(new anhc(angj, str2, str3, str4, str, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41809a(angj angj, String str, String str2, Flag[] flagArr) {
        mo41824c();
        aaag aaag = this.f76810a;
        int i = angg.f76803a;
        aaag.mo16658a(new anic(angj, this.f76811b, str, str2, flagArr));
    }

    /* renamed from: b */
    public final void mo41816b(angj angj, String str, String str2, String str3) {
        mo41823b();
        aaag aaag = this.f76810a;
        int i = angg.f76803a;
        aaag.mo16658a(new angy(angj, this.f76811b, str, str2, str3));
    }

    /* renamed from: a */
    public final void mo41810a(angj angj, String str, byte[] bArr) {
        mo41822a(str);
        this.f76810a.mo16658a(new anhz(angj, str, bArr, this.f76811b));
    }

    /* renamed from: b */
    public final void mo41817b(angj angj, String str, String str2, String str3, String str4) {
        mo41821a();
        this.f76810a.mo16658a(new anhg(angj, str, str2, str3, str4, this.f76811b));
    }

    /* renamed from: a */
    public final void mo41811a(angj angj, byte[] bArr) {
        mo41823b();
        this.f76810a.mo16658a(new anib(angj, bArr));
    }

    /* renamed from: a */
    public final void mo41812a(angj angj, RegistrationInfo[] registrationInfoArr) {
        braj[] brajArr;
        mo41821a();
        aaag aaag = this.f76810a;
        if (registrationInfoArr != null) {
            brajArr = new braj[registrationInfoArr.length];
            for (int i = 0; i < registrationInfoArr.length; i++) {
                if (registrationInfoArr[i] != null) {
                    braf braf = (braf) braj.f142139l.mo74144da();
                    String str = registrationInfoArr[i].f82121g;
                    if (braf.f164950c) {
                        braf.mo74035c();
                        braf.f164950c = false;
                    }
                    braj braj = (braj) braf.f164949b;
                    str.getClass();
                    braj.f142142b = 7;
                    braj.f142143c = str;
                    braj.f142150j = 1;
                    int i2 = braj.f142141a | 64;
                    braj.f142141a = i2;
                    RegistrationInfo registrationInfo = registrationInfoArr[i];
                    String str2 = registrationInfo.f82115a;
                    if (str2 != null) {
                        str2.getClass();
                        i2 |= 1;
                        braj.f142141a = i2;
                        braj.f142144d = str2;
                    }
                    int i3 = registrationInfo.f82116b;
                    braj.f142141a = i2 | 2;
                    braj.f142145e = i3;
                    String[] strArr = registrationInfo.f82117c;
                    if (strArr != null && strArr.length > 0) {
                        braf.mo69472a(Arrays.asList(strArr));
                    }
                    byte[] bArr = registrationInfoArr[i].f82118d;
                    if (bArr != null && bArr.length > 0) {
                        bxtx a = bxtx.m123261a(bArr);
                        if (braf.f164950c) {
                            braf.mo74035c();
                            braf.f164950c = false;
                        }
                        braj braj2 = (braj) braf.f164949b;
                        a.getClass();
                        braj2.f142141a |= 4;
                        braj2.f142148h = a;
                    }
                    boolean z = registrationInfoArr[i].f82119e;
                    if (braf.f164950c) {
                        braf.mo74035c();
                        braf.f164950c = false;
                    }
                    braj braj3 = (braj) braf.f164949b;
                    braj3.f142141a |= 8;
                    braj3.f142149i = z;
                    int[] iArr = registrationInfoArr[i].f82120f;
                    if (iArr != null && (r7 = iArr.length) > 0) {
                        for (int i4 : iArr) {
                            braf.mo69471a(i4);
                        }
                    }
                    brajArr[i] = (braj) braf.mo74062i();
                }
            }
        } else {
            brajArr = null;
        }
        aaag.mo16658a(new anhq(angj, brajArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41822a(String str) {
        String str2;
        String str3;
        if (!spn.m35869b() && !this.f76812c.mo24610b(this.f76811b)) {
            int indexOf = str.indexOf(35);
            if (indexOf != -1) {
                str2 = str.substring(0, indexOf);
                str3 = str.substring(indexOf + 1);
            } else {
                str3 = null;
                str2 = str;
            }
            if (!ange.m64198a(cgch.m144746b(), str2)) {
                this.f76812c.mo24605a(this.f76811b);
            } else if (!this.f76811b.equals(str3)) {
                String str4 = this.f76811b;
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 33 + String.valueOf(str).length());
                sb.append(str4);
                sb.append(" is not authorized to operate on ");
                sb.append(str);
                throw new SecurityException(sb.toString());
            }
        }
    }
}
