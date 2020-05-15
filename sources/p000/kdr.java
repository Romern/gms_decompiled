package p000;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Pair;
import android.view.autofill.AutofillValue;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.data.Credential;
import com.google.android.gms.autofill.fill.FillField;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: kdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kdr extends kdn {

    /* renamed from: b */
    private static final bnic f23896b = bnic.m109492a(kpb.USERNAME, kpb.PASSWORD, kpb.NEW_USERNAME, kpb.NEW_PASSWORD);

    /* renamed from: c */
    private final lrc f23897c;

    /* renamed from: d */
    private final kpk f23898d;

    /* renamed from: e */
    private final lhi f23899e;

    /* renamed from: f */
    private final Context f23900f;

    /* renamed from: g */
    private final bmxv f23901g;

    public kdr(lrc lrc, kpk kpk, lhi lhi, Context context) {
        bmvz bmvz = bmvz.f131120a;
        this.f23897c = lrc;
        this.f23898d = kpk;
        this.f23899e = lhi;
        this.f23900f = context;
        this.f23901g = bmvz;
    }

    /* renamed from: a */
    private static Pair m17690a(Iterable iterable) {
        String a;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kef kef = (kef) it.next();
            AutofillValue autofillValue = kef.f23923b;
            if (autofillValue != null && autofillValue.isText() && (a = kdm.m17673a(autofillValue.getTextValue())) != null) {
                return Pair.create(a, kef.f23922a);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m17691b() {
        bmxv bmxv = this.f23901g;
        BiometricManager biometricManager = (BiometricManager) this.f23900f.getSystemService(BiometricManager.class);
        bmxv.mo66812a(biometricManager);
        if (biometricManager == null || biometricManager.canAuthenticate() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Class mo14410a() {
        return Credential.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bnhe mo14409a(Object obj, FillForm fillForm) {
        String str;
        boolean z;
        boolean z2;
        CharSequence charSequence;
        boolean z3;
        FillForm fillForm2 = fillForm;
        Credential credential = (Credential) obj;
        if (!credential.f11611d.contains(fillForm2.f11643c)) {
            return bnoj.f131912b;
        }
        kcz kcz = this.f23898d.mo14764a(credential.f11610c).f24746b;
        if (kcz == null && (credential.f11610c instanceof kck)) {
            kcz = kda.m17662a();
        }
        if (credential.mo7927b() && credential.mo7926a()) {
            bnha h = bnhe.m109414h();
            kpj a = this.f23898d.mo14764a(credential.f11610c);
            String str2 = credential.f11608a;
            kdj kdj = credential.f11609b;
            kqo a2 = kqo.m18353a(lqy.m19556b(str2));
            if (!fillForm2.mo7949a(kpb.USERNAME) || fillForm2.mo7949a(kpb.PASSWORD)) {
                if (kcz != null) {
                    str = bmzh.m108674a("•", kdj.f23889a.length());
                } else {
                    str = a.f24745a;
                }
                bnre i = fillForm2.mo7950b(kpb.USERNAME).listIterator();
                while (i.hasNext()) {
                    FillField fillField = (FillField) i.next();
                    kqt b = kqk.m18332b(str2);
                    if (ccit.m129945b()) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (m17691b() && this.f23899e.mo15094n()) {
                            z2 = true;
                            h.mo67695b(fillField, new kqc(b, str2, str, kcz, a2, z2));
                            i = i;
                            a2 = a2;
                        }
                    }
                    z2 = false;
                    h.mo67695b(fillField, new kqc(b, str2, str, kcz, a2, z2));
                    i = i;
                    a2 = a2;
                }
                bnre i3 = fillForm2.mo7950b(kpb.PASSWORD).listIterator();
                while (i3.hasNext()) {
                    FillField fillField2 = (FillField) i3.next();
                    kqt b2 = kqk.m18332b(kdj.f23889a);
                    kqo kqo = kqo.f24804a;
                    if (ccit.m129945b()) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (m17691b() && this.f23899e.mo15094n()) {
                            z = true;
                            h.mo67695b(fillField2, new kqc(b2, str2, str, kcz, kqo, z));
                        }
                    }
                    z = false;
                    h.mo67695b(fillField2, new kqc(b2, str2, str, kcz, kqo, z));
                }
            } else {
                if (kcz == null) {
                    charSequence = a.f24745a;
                } else {
                    charSequence = null;
                }
                bnre i5 = fillForm2.mo7950b(kpb.USERNAME).listIterator();
                while (i5.hasNext()) {
                    FillField fillField3 = (FillField) i5.next();
                    kqt b3 = kqk.m18332b(str2);
                    if (ccit.m129945b() && this.f23899e.mo15094n()) {
                        int i6 = Build.VERSION.SDK_INT;
                        if (m17691b()) {
                            z3 = true;
                            h.mo67695b(fillField3, new kqc(b3, str2, charSequence, kcz, a2, z3));
                        }
                    }
                    z3 = false;
                    h.mo67695b(fillField3, new kqc(b3, str2, charSequence, kcz, a2, z3));
                }
            }
            return h.mo67618b();
        } else if (!credential.mo7927b() || !cckb.f179223a.mo6606a().mo76171a()) {
            return bnoj.f131912b;
        } else {
            bnha h2 = bnhe.m109414h();
            kpj a3 = this.f23898d.mo14764a(credential.f11610c);
            kdj kdj2 = credential.f11609b;
            CharSequence b4 = this.f23897c.mo15386b(C0126R.string.autofill_dataset_password_primary);
            CharSequence charSequence2 = a3.f24745a;
            bnre i7 = fillForm2.mo7950b(kpb.PASSWORD).listIterator();
            while (i7.hasNext()) {
                h2.mo67695b((FillField) i7.next(), new kqc(kqk.m18332b(kdj2.f23889a), b4, charSequence2, kcz, kqo.f24804a));
            }
            return h2.mo67618b();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14411a(bnht bnht) {
        Pair a = m17690a(bnfi.m109236a(bnht.mo67692g(kpb.NEW_USERNAME), bnht.mo67692g(kpb.USERNAME)));
        Pair a2 = m17690a(bnfi.m109236a(bnht.mo67692g(kpb.NEW_PASSWORD), bnht.mo67692g(kpb.PASSWORD)));
        if (a != null && a2 != null && ((kcv) a.second).equals(a2.second)) {
            return new Credential((String) a.first, new kdj((String) a2.first), (kcv) a2.second);
        }
        if (a == null && a2 != null) {
            return new Credential("", new kdj((String) a2.first), (kcv) a2.second);
        }
        if (a2 == null && a != null) {
            return new Credential((String) a.first, new kdj(""), (kcv) a.second);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo14412a(bnic bnic) {
        return !Collections.disjoint(bnic, f23896b);
    }
}
