package p000;

import android.accounts.Account;
import android.content.Context;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.SignatureException;
import java.util.ArrayList;

/* renamed from: jty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jty {

    /* renamed from: a */
    public final jul f23209a;

    /* renamed from: b */
    private final byqy f23210b;

    public jty(jul jul, byqy byqy) {
        bmxy.m108581a(jul);
        this.f23209a = jul;
        bmxy.m108581a(byqy);
        this.f23210b = byqy;
    }

    /* renamed from: a */
    public final void mo14095a(byte[] bArr) {
        Account a;
        try {
            try {
                jus jus = (jus) bxvk.m124016a(jus.f23257h, this.f23210b.mo74478b(bArr), bxus.m123744c());
                jul jul = this.f23209a;
                if ((jus.f23259a & 8) != 0) {
                    SourceChimeraActivity sourceChimeraActivity = jul.f23233b;
                    bzwt bzwt = jus.f23263e;
                    if (bzwt == null) {
                        bzwt = bzwt.f171675d;
                    }
                    grx grx = new grx(jul.f23233b);
                    grm grm = new grm(sourceChimeraActivity);
                    bsae bsae = bzwt.f171678b;
                    if (bsae == null) {
                        bsae = bsae.f143833b;
                    }
                    ArrayList arrayList = new ArrayList(bsae.f143835a.size());
                    for (int i = 0; i < bsae.f143835a.size(); i++) {
                        brzo a2 = sourceChimeraActivity.mo7851a((brzs) bsae.f143835a.get(i), grm, grx);
                        if (a2 == null) {
                            sek sek = SourceChimeraActivity.f11265a;
                            String valueOf = String.valueOf(((brzs) bsae.f143835a.get(i)).f143782b);
                            sek.mo25418e(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), new Object[0]);
                        } else {
                            arrayList.add(a2);
                        }
                    }
                    if (arrayList.size() == 0) {
                        SourceChimeraActivity.f11265a.mo25418e("No assertion infos returned!", new Object[0]);
                        sourceChimeraActivity.mo7853a((int) C0126R.string.common_something_went_wrong);
                        return;
                    }
                    bsaf bsaf = bsaf.f143836a;
                    brzx brzx = (brzx) brzy.f143803j.mo74144da();
                    String c = cbxv.m128865c();
                    if (brzx.f164950c) {
                        brzx.mo74035c();
                        brzx.f164950c = false;
                    }
                    brzy brzy = (brzy) brzx.f164949b;
                    c.getClass();
                    int i2 = brzy.f143805a | 32;
                    brzy.f143805a = i2;
                    brzy.f143811g = c;
                    brzy.f143810f = 3;
                    int i3 = i2 | 16;
                    brzy.f143805a = i3;
                    brzy.f143807c = 1;
                    int i4 = i3 | 1;
                    brzy.f143805a = i4;
                    bsaf.getClass();
                    brzy.f143808d = bsaf;
                    brzy.f143805a = i4 | 2;
                    brzx.mo70093a(arrayList);
                    brzy brzy2 = (brzy) brzx.mo74062i();
                    bxvd da = bzww.f171685e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzww bzww = (bzww) da.f164949b;
                    brzy2.getClass();
                    bzww.f171688b = brzy2;
                    bzww.f171687a |= 1;
                    String str = null;
                    if (!(Settings.Secure.getInt(sourceChimeraActivity.getContentResolver(), "backup_enabled", 0) == 0 || (a = new lsp(sourceChimeraActivity).mo19591a()) == null)) {
                        str = a.name;
                    }
                    if (str != null) {
                        SourceChimeraActivity.f11265a.mo25414c("Backup account found.", new Object[0]);
                        if (SourceChimeraActivity.f11265a.mo19637a(3)) {
                            SourceChimeraActivity.f11265a.mo25412b(str.length() == 0 ? new String("Backup enabled with account: ") : "Backup enabled with account: ".concat(str), new Object[0]);
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzww bzww2 = (bzww) da.f164949b;
                        str.getClass();
                        bzww2.f171687a |= 2;
                        bzww2.f171689c = str;
                    } else {
                        SourceChimeraActivity.f11265a.mo25414c("Backup account not found.", new Object[0]);
                    }
                    String hexString = Long.toHexString(spn.m35843a((Context) sourceChimeraActivity));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzww bzww3 = (bzww) da.f164949b;
                    hexString.getClass();
                    bzww3.f171687a |= 4;
                    bzww3.f171690d = hexString;
                    bxvd da2 = jus.f23257h.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    jus.m17350a((jus) da2.f164949b);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    jus jus2 = (jus) da2.f164949b;
                    bzww bzww4 = (bzww) da.mo74062i();
                    bzww4.getClass();
                    jus2.f23264f = bzww4;
                    jus2.f23259a |= 32;
                    try {
                        sourceChimeraActivity.f11284s.mo14097a((jus) da2.mo74062i());
                    } catch (IOException e) {
                        SourceChimeraActivity.f11265a.mo25410a((Throwable) e);
                    }
                } else if (jus.f23265g.size() != 0) {
                    SourceChimeraActivity sourceChimeraActivity2 = jul.f23233b;
                    bxwc bxwc = jus.f23265g;
                    String str2 = jul.f23232a;
                    sek sek2 = SourceChimeraActivity.f11265a;
                    sourceChimeraActivity2.runOnUiThread(new jub(sourceChimeraActivity2, bxwc, str2));
                    try {
                        sourceChimeraActivity2.f11284s.mo14096a();
                    } catch (IOException e2) {
                        SourceChimeraActivity.f11265a.mo25410a((Throwable) e2);
                    }
                    sourceChimeraActivity2.finish();
                }
            } catch (bxwf e3) {
                jua.f23219a.mo25410a((Throwable) e3);
            }
        } catch (SignatureException e4) {
            jua.f23219a.mo25410a((Throwable) e4);
        }
    }
}
