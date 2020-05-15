package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.util.Set;

/* renamed from: amwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amwf {

    /* renamed from: a */
    public final ContentResolver f76168a;

    /* renamed from: b */
    public final Account f76169b;

    /* renamed from: c */
    public Set f76170c;

    public amwf(ContentResolver contentResolver, Account account) {
        this.f76168a = contentResolver;
        this.f76169b = account;
    }

    /* renamed from: a */
    static String m63521a() {
        String str = cfxe.m143374m() ? "account_type != \"com.google\" AND (sourceid IS NULL AND sync1 IS NULL AND sync2 IS NULL AND sync3 IS NULL AND sync4 IS NULL ) " : "account_type != \"com.google\"";
        return cfxe.m143373l() ? str.concat(" AND (data_set IS NULL ) ") : str;
    }

    /* renamed from: a */
    public static void m63522a(String str, int i, anaz anaz) {
        if (i > 0 && cfvk.f185780a.mo6606a().mo82928S()) {
            if (anaz != null && cfwd.f185832a.mo6606a().mo82823a()) {
                ((anbh) anaz).f76555o += i;
                return;
            }
            almk.m61263a();
            ammr ammr = (ammr) amnu.f75540w.mo74144da();
            if (ammr.f164950c) {
                ammr.mo74035c();
                ammr.f164950c = false;
            }
            amnu amnu = (amnu) ammr.f164949b;
            amnu.f75542a |= 8;
            amnu.f75546e = 80;
            bxvd da = amnm.f75511h.mo74144da();
            ammx ammx = (ammx) amnk.f75488o.mo74144da();
            if (ammx.f164950c) {
                ammx.mo74035c();
                ammx.f164950c = false;
            }
            amnk amnk = (amnk) ammx.f164949b;
            amnk.f75490a |= 4;
            amnk.f75494e = i;
            amnk amnk2 = (amnk) ammx.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            amnm amnm = (amnm) da.f164949b;
            amnk2.getClass();
            amnm.f75518f = amnk2;
            amnm.f75514b |= 2;
            if (ammr.f164950c) {
                ammr.mo74035c();
                ammr.f164950c = false;
            }
            amnu amnu2 = (amnu) ammr.f164949b;
            amnm amnm2 = (amnm) da.mo74062i();
            amnm2.getClass();
            amnu2.f75555n = amnm2;
            amnu2.f75542a |= 2048;
            bxvd da2 = amoh.f75593x.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            amoh amoh = (amoh) da2.f164949b;
            amnu amnu3 = (amnu) ammr.mo74062i();
            amnu3.getClass();
            amoh.f75598d = amnu3;
            amoh.f75595a |= 4;
            alml.m61288a(str, da2);
        }
    }

    /* renamed from: a */
    public final int mo41479a(Uri uri, ContentValues contentValues, String str) {
        ContentResolver contentResolver = this.f76168a;
        String[] strArr = amvt.f76137a;
        return contentResolver.update(uri, contentValues, str, null);
    }
}
