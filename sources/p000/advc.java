package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: advc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class advc {

    /* renamed from: a */
    public final List f62788a;

    /* renamed from: b */
    private final bsjj f62789b;

    /* renamed from: c */
    private final bmxv f62790c;

    private advc(bsjj bsjj, List list, bmxv bmxv) {
        this.f62789b = bsjj;
        this.f62788a = list;
        this.f62790c = bmxv;
    }

    /* renamed from: a */
    public static advc m51228a(String str, String str2) {
        bmxv bmxv;
        bsjk bsjk;
        bxvd bxvd;
        bngx bngx;
        if (str != null) {
            bsjk = adxt.m51334a().mo33880a(str);
            bmxv = m51229b(str, str2);
        } else {
            adxt a = adxt.m51334a();
            bmxv a2 = adwg.m51268a();
            if (!a2.mo66813a()) {
                bngx = bngx.m109376e();
            } else {
                bngs j = bngx.m109377j();
                Account[] accountArr = (Account[]) a2.mo66814b();
                boolean z = true;
                for (Account account : accountArr) {
                    bsix a3 = a.mo33878a(account);
                    j.mo67668c(adxs.m51331a(account.name, adxt.m51335a(a3)));
                    z &= a3.f144768d;
                }
                if (!z) {
                    adxt.m51338b();
                }
                bngx = j.mo67664a();
            }
            adxs adxs = (adxs) bnjd.m109589b(bngx, adxs.m51331a(null, bsjk.f144805d));
            bmxv b = m51229b(adxs.mo33871a(), str2);
            bsjk = adxs.mo33872b();
            bmxv = b;
        }
        bsjj bsjj = bsjk.f144808b;
        if (bsjj == null) {
            bxvd = bsjj.f144799e.mo74144da();
            float c = (float) ceqz.f183340a.mo6606a().mo79663c();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bsjj) bxvd.f164949b).f144801a = c;
            float d = (float) ceqz.f183340a.mo6606a().mo79664d();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((bsjj) bxvd.f164949b).f144802b = d;
        } else {
            bxvd = bsjj.f144799e.mo74141a(bsjj);
        }
        if (((bsjj) bxvd.f164949b).f144803c.size() == 0) {
            bxvd da = bsji.f144795c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsji) da.f164949b).f144797a = 2;
            float e = (float) ceqz.f183340a.mo6606a().mo79665e();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsji) da.f164949b).f144798b = e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bsjj bsjj2 = (bsjj) bxvd.f164949b;
            bsji bsji = (bsji) da.mo74062i();
            bsji.getClass();
            if (!bsjj2.f144803c.mo73666a()) {
                bsjj2.f144803c = bxvk.m124021a(bsjj2.f144803c);
            }
            bsjj2.f144803c.add(bsji);
        }
        return new advc((bsjj) bxvd.mo74062i(), bsjk.f144807a, bmxv);
    }

    /* renamed from: b */
    private static bmxv m51229b(String str, String str2) {
        if (str == null || !cere.m138102c()) {
            return bmvz.f131120a;
        }
        adxl.m51314a();
        bmxv a = adwg.m51269a(str);
        if (a.mo66813a()) {
            return adxl.m51316a((Account) a.mo66814b(), str2);
        }
        throw new aaaj(5, str.length() == 0 ? new String("Account is not available: ") : "Account is not available: ".concat(str));
    }

    /* renamed from: a */
    public final float mo33849a(float f, int i) {
        return f < 0.0f ? i != 2 ? this.f62789b.f144802b : this.f62789b.f144801a : f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, adwe]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.ArrayList, adwd]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo33850a(aduq aduq) {
        if (this.f62790c.mo66813a()) {
            bsjf bsjf = (bsjf) this.f62790c.mo66814b();
            bxwc bxwc = this.f62789b.f144803c;
            bsja bsja = (bsja) bsjd.f144778e.mo74144da();
            String valueOf = String.valueOf(cere.m138103d());
            String valueOf2 = String.valueOf(bsjf.f144787b);
            String str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
            if (bsja.f164950c) {
                bsja.mo74035c();
                bsja.f164950c = false;
            }
            str.getClass();
            ((bsjd) bsja.f164949b).f144780a = str;
            bsja.mo70627a(bxwc);
            ArrayList a = bnkn.m109661a();
            bxwc bxwc2 = bsjf.f144786a;
            int size = bxwc2.size();
            for (int i = 0; i < size; i++) {
                Locale a2 = adwl.m51283a((String) bxwc2.get(i));
                if (!bnjd.m109592c((Iterable) a, (bmxz) new adwe(a2))) {
                    a.add(a2);
                }
            }
            int[] a3 = adwf.m51267a(a.size());
            for (int i2 = 0; i2 < a.size(); i2++) {
                bxvd da = bsjc.f144774c.mo74144da();
                String a4 = adwl.m51282a((Locale) a.get(i2));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsjc bsjc = (bsjc) da.f164949b;
                a4.getClass();
                bsjc.f144776a = a4;
                bsjc.f144777b = a3[i2];
                bsja.mo70626a(da);
            }
            aduq.mo33837a((bsjd) bsja.mo74062i());
        }
        bxwc bxwc3 = this.f62789b.f144803c;
        bsja bsja2 = (bsja) bsjd.f144778e.mo74144da();
        String c = ceqz.m138034c();
        if (bsja2.f164950c) {
            bsja2.mo74035c();
            bsja2.f164950c = false;
        }
        c.getClass();
        ((bsjd) bsja2.f164949b).f144780a = c;
        bsja2.mo70627a(bxwc3);
        ArrayList a5 = bnkn.m109661a();
        bnre i3 = adwg.m51270b().listIterator();
        while (i3.hasNext()) {
            Locale locale = (Locale) i3.next();
            if (!bnjd.m109592c((Iterable) a5, (bmxz) new adwd(locale))) {
                a5.add(locale);
            }
        }
        int[] a6 = adwf.m51267a(a5.size());
        for (int i4 = 0; i4 < a5.size(); i4++) {
            bxvd da2 = bsjc.f144774c.mo74144da();
            String a7 = adwl.m51282a((Locale) a5.get(i4));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsjc bsjc2 = (bsjc) da2.f164949b;
            a7.getClass();
            bsjc2.f144776a = a7;
            bsjc2.f144777b = a6[i4];
            bsja2.mo70626a(da2);
        }
        aduq.mo33837a((bsjd) bsja2.mo74062i());
    }
}
