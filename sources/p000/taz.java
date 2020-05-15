package p000;

import android.app.ProgressDialog;
import android.text.Html;
import android.text.TextUtils;
import com.google.android.gms.constellation.p038ui.ConstellationSettingsChimeraActivity;
import java.util.List;

/* renamed from: taz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class taz extends tdq {

    /* renamed from: a */
    Boolean f45591a = false;

    /* renamed from: b */
    final /* synthetic */ ConstellationSettingsChimeraActivity f45592b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public taz(ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity) {
        super(constellationSettingsChimeraActivity.f30547d);
        this.f45592b = constellationSettingsChimeraActivity;
        sek sek = ConstellationSettingsChimeraActivity.f30536b;
    }

    /* renamed from: a */
    public final void mo26345a() {
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45592b;
        sek sek = ConstellationSettingsChimeraActivity.f30536b;
        constellationSettingsChimeraActivity.f30549f = constellationSettingsChimeraActivity.f30559s.mo26292c();
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45592b;
        constellationSettingsChimeraActivity2.f30550j = constellationSettingsChimeraActivity2.f30559s.mo26300k();
        try {
            int i = 2;
            ConstellationSettingsChimeraActivity.f30536b.mo25412b("mConsented: %s, mAutomaticCostSetting : %s", Boolean.valueOf(this.f45592b.f30549f), Boolean.valueOf(this.f45592b.f30550j));
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity3 = this.f45592b;
            if (constellationSettingsChimeraActivity3.f30549f) {
                if (constellationSettingsChimeraActivity3.f30550j) {
                    i = 0;
                } else {
                    i = 1;
                }
            }
            constellationSettingsChimeraActivity3.f30553m = i;
            constellationSettingsChimeraActivity3.f30554n = i;
            List list = constellationSettingsChimeraActivity3.f30557q;
            szr.m36692a();
            list.addAll(szr.m36698c().keySet());
            this.f45591a = true;
        } catch (tdw e) {
            ConstellationSettingsChimeraActivity.f30536b.mo25417e("Error reading phone number and imsis", e, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo26346b() {
        String str;
        String str2;
        int i;
        if (this.f45591a.booleanValue()) {
            ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity = this.f45592b;
            sek sek = ConstellationSettingsChimeraActivity.f30536b;
            ProgressDialog progressDialog = constellationSettingsChimeraActivity.f30546c;
            if (progressDialog != null && progressDialog.isShowing()) {
                constellationSettingsChimeraActivity.f30546c.dismiss();
            }
            constellationSettingsChimeraActivity.f30566z.mo26406a(constellationSettingsChimeraActivity.f30537A, 31);
            ConstellationSettingsChimeraActivity.f30536b.mo25412b("Building settings page", new Object[0]);
            svf a = constellationSettingsChimeraActivity.f30560t.mo26094a(constellationSettingsChimeraActivity.f30563w.f177988a, 0);
            if (!constellationSettingsChimeraActivity.f30549f) {
                cbqd cbqd = constellationSettingsChimeraActivity.f30563w.f177989b;
                if (cbqd == null) {
                    cbqd = cbqd.f178006c;
                }
                str = cbqd.f178008a;
            } else {
                cbqd cbqd2 = constellationSettingsChimeraActivity.f30563w.f177990c;
                if (cbqd2 == null) {
                    cbqd2 = cbqd.f178006c;
                }
                str = cbqd2.f178008a;
            }
            if (constellationSettingsChimeraActivity.f30549f) {
                cbqd cbqd3 = constellationSettingsChimeraActivity.f30563w.f177990c;
                if (cbqd3 == null) {
                    cbqd3 = cbqd.f178006c;
                }
                str2 = cbqd3.f178009b;
            } else {
                cbqd cbqd4 = constellationSettingsChimeraActivity.f30563w.f177989b;
                if (cbqd4 == null) {
                    cbqd4 = cbqd.f178006c;
                }
                str2 = cbqd4.f178009b;
            }
            if (constellationSettingsChimeraActivity.f30549f && !constellationSettingsChimeraActivity.f30557q.isEmpty()) {
                List list = constellationSettingsChimeraActivity.f30557q;
                int size = list.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    String str3 = (String) list.get(i2);
                    svk svk = new svk(constellationSettingsChimeraActivity.f30558r);
                    teb a2 = teb.m36800a(constellationSettingsChimeraActivity.getApplicationContext());
                    if (!TextUtils.isEmpty(str3) && str3.replaceAll("\\D", "").length() >= 6) {
                        String a3 = a2.mo26416a();
                        int b = a2.f45718b.mo58491b(a3);
                        try {
                            beat a4 = a2.f45718b.mo58483a(str3, a3);
                            int i3 = 2;
                            if (b > 0 && a4.f106841a == b) {
                                i3 = 3;
                            }
                            str3 = C1211nd.m19661a().mo15492a(a2.f45718b.mo58486a(a4, i3), C1220nm.f26744a);
                        } catch (bean e) {
                            teb.f45717a.mo25418e("Exception trying to parse phone number", new Object[0]);
                        } catch (IllegalStateException e2) {
                            teb.f45717a.mo25418e("Failed to parse phone number.", new Object[0]);
                        }
                    }
                    svk.mo26085a(str3);
                    a.mo26149a((sui) svk);
                    svk.mo26086b(i);
                    i++;
                }
            } else {
                svk svk2 = new svk(constellationSettingsChimeraActivity.f30558r);
                svk2.mo26085a(str);
                if (!TextUtils.isEmpty(str2)) {
                    svk2.mo26105b(str2);
                }
                svk2.mo26104a(false);
                a.mo26149a((sui) svk2);
                svk2.mo26086b(0);
                i = 1;
            }
            if (constellationSettingsChimeraActivity.f30549f || !constellationSettingsChimeraActivity.f30563w.f177992e) {
                svk svk3 = new svk(constellationSettingsChimeraActivity.f30558r);
                cbqd cbqd5 = constellationSettingsChimeraActivity.f30563w.f177991d;
                if (cbqd5 == null) {
                    cbqd5 = cbqd.f178006c;
                }
                svk3.mo26085a(cbqd5.f178008a);
                cbqd cbqd6 = constellationSettingsChimeraActivity.f30563w.f177991d;
                if (cbqd6 == null) {
                    cbqd6 = cbqd.f178006c;
                }
                if (!cbqd6.f178009b.isEmpty()) {
                    cbqd cbqd7 = constellationSettingsChimeraActivity.f30563w.f177991d;
                    if (cbqd7 == null) {
                        cbqd7 = cbqd.f178006c;
                    }
                    svk3.mo26105b(cbqd7.f178009b);
                }
                a.mo26149a((sui) svk3);
                svk3.mo26086b(i);
                i++;
                svk3.mo26102a(new tan(constellationSettingsChimeraActivity));
            }
            svk svk4 = new svk(constellationSettingsChimeraActivity.f30558r);
            cbqd cbqd8 = constellationSettingsChimeraActivity.f30563w.f177998k;
            if (cbqd8 == null) {
                cbqd8 = cbqd.f178006c;
            }
            if (!cbqd8.f178008a.isEmpty()) {
                cbqd cbqd9 = constellationSettingsChimeraActivity.f30563w.f177998k;
                if (cbqd9 == null) {
                    cbqd9 = cbqd.f178006c;
                }
                svk4.mo26085a(Html.fromHtml(cbqd9.f178008a));
            }
            cbqd cbqd10 = constellationSettingsChimeraActivity.f30563w.f177998k;
            if (cbqd10 == null) {
                cbqd10 = cbqd.f178006c;
            }
            svk4.mo26105b(Html.fromHtml(cbqd10.f178009b));
            if (!constellationSettingsChimeraActivity.f30563w.f177999l.isEmpty()) {
                svk4.mo26102a(new tao(constellationSettingsChimeraActivity));
            }
            a.mo26149a((sui) svk4);
            svk4.mo26086b(i);
            return;
        }
        ConstellationSettingsChimeraActivity constellationSettingsChimeraActivity2 = this.f45592b;
        sek sek2 = ConstellationSettingsChimeraActivity.f30536b;
        constellationSettingsChimeraActivity2.mo17979e();
    }
}
