package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: abfn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfn extends aayk {

    /* renamed from: a */
    private final aasm f57347a;

    /* renamed from: l */
    private final String f57348l;

    public abfn(Context context, HelpConfig helpConfig, aasm aasm, String str, bqgj bqgj) {
        super(context, helpConfig, bqgj);
        this.f57347a = aasm;
        this.f57348l = str;
    }

    /* renamed from: a */
    public static aasm m47620a(aasf aasf, aasm aasm, boolean z, bqgj bqgj) {
        String str;
        sdo.m34973b("Must be called from a worker thread.");
        HelpConfig g = aasf.mo18626g();
        aasm aasm2 = null;
        if (g != null && !TextUtils.isEmpty(g.mo43230e())) {
            if (z) {
                aasf.mo18630k();
                str = aazt.m47337b((Context) aasf);
            } else {
                str = null;
            }
            aasf.mo18630k();
            try {
                aays k = new abfn((Context) aasf, g, aasm, str, bqgj).mo31910k();
                if (k.f56842a == 304) {
                    aasm2 = aasm.f56487a;
                } else if (!k.mo31912a()) {
                    int i = k.f56842a;
                    StringBuilder sb = new StringBuilder(81);
                    sb.append("Received non-success status code when fetching Rendering API response ");
                    sb.append(i);
                    Log.e("gH_RenderingApiUtils", sb.toString());
                } else {
                    byte[] bArr = k.f56844c;
                    if (bArr != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr, aata.m46958a(k.f56843b)));
                            if (!jSONObject.has("validation_error") || jSONObject.getJSONArray("validation_error").length() <= 0) {
                                aasm2 = aasm.m46891a(jSONObject, aasm);
                            }
                        } catch (UnsupportedEncodingException | JSONException e) {
                            Log.e("gH_RenderingApiUtils", "Parsing leaf content response data failed.", e);
                        }
                    }
                }
                if (aasm2 != null) {
                    aasm2.f56503m = aasm.f56503m;
                }
                return aasm2;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        String valueOf = String.valueOf(ceeg.m136421z());
        String valueOf2 = String.valueOf(String.format(ceeg.m136395A(), this.f56831d.mo43230e()));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) cefz.f182622a.mo6606a().mo79097e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final byte[] mo29522d() {
        bxvd da = bzpk.f170916n.mo74144da();
        String a = abfm.m47619a(this.f56831d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk = (bzpk) da.f164949b;
        a.getClass();
        int i = 2;
        int i2 = bzpk.f170918a | 2;
        bzpk.f170918a = i2;
        bzpk.f170920c = a;
        String str = this.f56831d.f78828c;
        if (str != null) {
            str.getClass();
            bzpk.f170918a = i2 | 32;
            bzpk.f170925h = str;
        }
        boolean z = aayi.m47270b() && aayi.m47271b(this.f56830c, C0126R.attr.gh_isInDarkMode);
        aasm aasm = this.f57347a;
        aasm.f56503m = z;
        String uri = z ? Uri.parse(aasm.f56497g).buildUpon().appendQueryParameter("dark", "1").build().toString() : aasm.f56497g;
        String a2 = aasw.m46952a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk2 = (bzpk) da.f164949b;
        a2.getClass();
        int i3 = bzpk2.f170918a | 16;
        bzpk2.f170918a = i3;
        bzpk2.f170924g = a2;
        bzpk2.f170921d = 1;
        int i4 = i3 | 4;
        bzpk2.f170918a = i4;
        uri.getClass();
        bzpk2.f170918a = i4 | 1;
        bzpk2.f170919b = uri;
        if (ceeg.f182447a.mo6606a().mo78975aP()) {
            Uri parse = Uri.parse(uri);
            if (aasm.m46896a().contains(parse.getHost())) {
                String uri2 = parse.buildUpon().scheme(null).authority(null).build().toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzpk bzpk3 = (bzpk) da.f164949b;
                uri2.getClass();
                bzpk3.f170918a |= 1;
                bzpk3.f170919b = uri2;
            }
        }
        abeo j = super.mo31908j();
        abep abep = j.f57265b;
        if (abep == null) {
            abep = abep.f57271d;
        }
        String str2 = abep.f57274b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk4 = (bzpk) da.f164949b;
        str2.getClass();
        bzpk4.f170918a |= 64;
        bzpk4.f170926i = str2;
        if (aaya.m47228a(cehs.m136872b()) && this.f56831d.mo43209D() && !TextUtils.isEmpty(this.f56831d.f78823W)) {
            String str3 = this.f56831d.f78823W;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzpk bzpk5 = (bzpk) da.f164949b;
            str3.getClass();
            bzpk5.f170918a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bzpk5.f170928k = str3;
            if (aaya.m47229b(ceih.m136917b())) {
                int i5 = this.f56831d.f78824X;
                if (i5 != 1) {
                    i = i5 != 2 ? i5 != 3 ? i5 != 4 ? 1 : 3 : 4 : 6;
                }
                if (i != 1) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzpk bzpk6 = (bzpk) da.f164949b;
                    bzpk6.f170929l = i - 1;
                    bzpk6.f170918a |= 1024;
                }
            }
        }
        if (aaya.m47229b(ceie.f182710a.mo6606a().mo79162a())) {
            int i6 = rfj.f42871c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzpk bzpk7 = (bzpk) da.f164949b;
            bzpk7.f170918a |= 128;
            bzpk7.f170927j = i6;
        }
        abet abet = j.f57267d;
        if (abet == null) {
            abet = abet.f57292q;
        }
        bxwc bxwc = abet.f57298e;
        for (int i7 = 0; i7 < bxwc.size(); i7++) {
            abes abes = (abes) bxwc.get(i7);
            bzpj a3 = m47621a(abes.f57290b, abes.f57291c);
            if (a3 != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzpk bzpk8 = (bzpk) da.f164949b;
                a3.getClass();
                if (!bzpk8.f170923f.mo73666a()) {
                    bzpk8.f170923f = bxvk.m124021a(bzpk8.f170923f);
                }
                bzpk8.f170923f.add(a3);
            }
            if (TextUtils.equals("genie-eng:app_pkg_name", abes.f57290b) && !abes.f57291c.isEmpty()) {
                String str4 = abes.f57291c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzpk bzpk9 = (bzpk) da.f164949b;
                str4.getClass();
                bzpk9.f170918a |= 64;
                bzpk9.f170926i = str4;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.f57348l != null) {
            bxvd bxvd = (bxvd) j.mo74142c(5);
            bxvd.mo73625a((bxvk) j);
            abet abet2 = j.f57267d;
            if (abet2 == null) {
                abet2 = abet.f57292q;
            }
            bxvd bxvd2 = (bxvd) abet2.mo74142c(5);
            bxvd2.mo73625a((bxvk) abet2);
            String str5 = this.f57348l;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            abet abet3 = (abet) bxvd2.f164949b;
            str5.getClass();
            abet3.f57294a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            abet3.f57307n = str5;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            abeo abeo = (abeo) bxvd.f164949b;
            abet abet4 = (abet) bxvd2.mo74062i();
            abeo abeo2 = abeo.f57262h;
            abet4.getClass();
            abeo.f57267d = abet4;
            abeo.f57264a = 4 | abeo.f57264a;
            j = (abeo) bxvd.mo74062i();
            m47622a("gcmToken", this.f57348l, arrayList);
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk10 = (bzpk) da.f164949b;
        j.getClass();
        bzpk10.f170930m = j;
        bzpk10.f170918a |= 2048;
        abep abep2 = j.f57265b;
        if (abep2 == null) {
            abep2 = abep.f57271d;
        }
        m47622a("app_package_name", abep2.f57274b, arrayList);
        abep abep3 = j.f57265b;
        if (abep3 == null) {
            abep3 = abep.f57271d;
        }
        m47622a("app_version", abep3.f57275c, arrayList);
        abeq abeq = j.f57266c;
        if (abeq == null) {
            abeq = abeq.f57276g;
        }
        m47622a("device_carrier_name", abeq.f57282e, arrayList);
        abeq abeq2 = j.f57266c;
        if (abeq2 == null) {
            abeq2 = abeq.f57276g;
        }
        m47622a("device_model_name", abeq2.f57280c, arrayList);
        abeq abeq3 = j.f57266c;
        if (abeq3 == null) {
            abeq3 = abeq.f57276g;
        }
        m47622a("device_locale", abeq3.f57279b, arrayList);
        abeq abeq4 = j.f57266c;
        if (abeq4 == null) {
            abeq4 = abeq.f57276g;
        }
        m47622a("device_release_version", abeq4.f57281d, arrayList);
        abeq abeq5 = j.f57266c;
        if (abeq5 == null) {
            abeq5 = abeq.f57276g;
        }
        m47622a("device_name", abeq5.f57283f, arrayList);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpk bzpk11 = (bzpk) da.f164949b;
        if (!bzpk11.f170922e.mo73666a()) {
            bzpk11.f170922e = bxvk.m124021a(bzpk11.f170922e);
        }
        bxsy.m123078a(arrayList, bzpk11.f170922e);
        return ((bzpk) da.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    static bzpj m47621a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        bxvd da = bzpj.f170911d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzpj bzpj = (bzpj) da.f164949b;
        str.getClass();
        int i = bzpj.f170913a | 1;
        bzpj.f170913a = i;
        bzpj.f170914b = str;
        str2.getClass();
        bzpj.f170913a = i | 2;
        bzpj.f170915c = str2;
        return (bzpj) da.mo74062i();
    }

    /* renamed from: a */
    private static void m47622a(String str, String str2, List list) {
        bzpj a = m47621a(str, str2);
        if (a != null) {
            list.add(a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79064p());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29519a(Map map) {
        super.mo29519a(map);
        map.put("If-None-Match", this.f57347a.f56504n);
    }
}
