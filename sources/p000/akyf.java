package p000;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akyf implements akww {

    /* renamed from: d */
    public static final sek f73106d = akzt.m60725a("OctarineUdcBridge");

    /* renamed from: g */
    private static final int[] f73107g = {9, 10};

    /* renamed from: a */
    public final Context f73108a;

    /* renamed from: b */
    public final WebView f73109b;

    /* renamed from: c */
    bdtq f73110c;

    /* renamed from: e */
    rjx f73111e;

    /* renamed from: f */
    final rjx f73112f;

    /* renamed from: h */
    private Account f73113h;

    /* renamed from: i */
    private akzl f73114i;

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, ak], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akyf(Context r2, WebView webView, akzl akzl) {
        this.f73108a = r2;
        this.f73109b = webView;
        this.f73114i = akzl;
        akzl.f73168c.mo2445a(r2, new akxu(this));
        this.f73111e = auzz.m78131a(r2, new auzy(akzl.mo40023c()));
        if (cfri.m142695f()) {
            this.f73110c = akzm.m60712a(r2.getApplicationContext()).mo58362b(m60681c());
        }
        this.f73112f = aeqc.m52384a(r2);
    }

    /* renamed from: a */
    public static JSONObject m60675a(int i, boolean z) {
        return new JSONObject().put("settingId", i).put("settingValue", !z ? 3 : 2);
    }

    /* renamed from: c */
    private final Account m60681c() {
        return cfri.m142691b() ? this.f73114i.mo40023c() : this.f73113h;
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public boolean canGetUlrDeviceInformation() {
        return true;
    }

    @JavascriptInterface
    public boolean canOpenUlrSettingsUi() {
        return spn.m35860a(this.f73108a.getApplicationContext(), aert.m52468a(m60681c()));
    }

    @JavascriptInterface
    public void getDeviceSettingsStates(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (!m60680a(i2)) {
                f73106d.mo25412b("getDeviceSettingsStates called for unsupported setting ID %d", Integer.valueOf(i2));
                m60676a(this.f73109b, i);
                return;
            }
        }
        bdtq bdtq = this.f73110c;
        if (bdtq == null) {
            aucb a = this.f73111e.mo24689a(new UdcCacheRequest(iArr));
            a.mo50373a(new akxv(this, i));
            a.mo50372a(new akxw(this, i));
            return;
        }
        bqga.m112781a(bdtq.mo58358a(), new akyd(this, iArr, i), bqfb.INSTANCE);
    }

    @JavascriptInterface
    public void getSupportedDeviceSettings(int i) {
        try {
            int[] iArr = f73107g;
            JSONArray jSONArray = new JSONArray();
            for (int i2 : iArr) {
                jSONArray.put(i2);
            }
            m60678a(this.f73109b, jSONArray.toString(), i);
        } catch (JSONException e) {
            f73106d.mo25417e("converting to JSON failed", e, new Object[0]);
            m60676a(this.f73109b, i);
        }
    }

    @JavascriptInterface
    public void getUlrDeviceInformation(int i) {
        aucb c = this.f73112f.mo24736c(m60681c());
        c.mo50373a(new akxz(this, i));
        c.mo50372a(new akya(this, i));
        c.mo50370a(new akyb(this, i));
    }

    @JavascriptInterface
    public boolean openUlrSettingsUi() {
        if (canOpenUlrSettingsUi()) {
            try {
                this.f73108a.startActivity(aert.m52468a(m60681c()));
                return true;
            } catch (ActivityNotFoundException e) {
            }
        }
        return false;
    }

    @JavascriptInterface
    public void setDeviceSetting(int i, boolean z, int i2) {
        if (!m60680a(i)) {
            f73106d.mo25412b("setDeviceSetting called for unsupported setting ID %d", Integer.valueOf(i));
            m60676a(this.f73109b, i2);
        } else if (this.f73110c != null) {
            bxvd da = bxok.f164161d.mo74144da();
            if (i == 10) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxok bxok = (bxok) da.f164949b;
                bxok.f164163a = 1 | bxok.f164163a;
                bxok.f164164b = z;
            } else if (i == 9) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxok bxok2 = (bxok) da.f164949b;
                bxok2.f164163a |= 2;
                bxok2.f164165c = z;
            }
            bxvd da2 = bxqf.f164373f.mo74144da();
            bxok bxok3 = (bxok) da.mo74062i();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxqf bxqf = (bxqf) da2.f164949b;
            bxok3.getClass();
            bxqf.f164378d = bxok3;
            bxqf.f164375a |= 8;
            bqga.m112781a(this.f73110c.mo58360a((bxqf) da2.mo74062i()), new akye(this, z, i2), bqfb.INSTANCE);
        } else {
            avam avam = new avam();
            avam.f92852a.add(new UdcWriteLocalSettingsRequest.SettingChange(i, z));
            UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest = new UdcWriteLocalSettingsRequest((UdcWriteLocalSettingsRequest.SettingChange[]) avam.f92852a.toArray(new UdcWriteLocalSettingsRequest.SettingChange[0]));
            rkb rkb = this.f73111e.f43165D;
            avdw avdw = new avdw(rkb, udcWriteLocalSettingsRequest);
            rkb.mo24787a((rle) avdw);
            aucb a = sdl.m34954a(avdw);
            a.mo50373a(new akxx(this, z, i2));
            a.mo50372a(new akxy(this, i2));
        }
    }

    /* renamed from: a */
    public static void m60676a(WebView webView, int i) {
        m60677a(webView, String.format(Locale.ROOT, "window.ocUdcCallback(%s, %s, %s)", Integer.valueOf(i), null, true));
    }

    public akyf(Context context, WebView webView, Account account) {
        this.f73108a = context;
        this.f73109b = webView;
        this.f73113h = account;
        this.f73111e = auzz.m78131a(context, new auzy(account));
        if (cfri.m142695f()) {
            this.f73110c = akzm.m60712a(context.getApplicationContext()).mo58362b(m60681c());
        }
        this.f73112f = aeqc.m52384a(context);
    }

    /* renamed from: a */
    private static void m60677a(WebView webView, String str) {
        if (webView != null) {
            webView.post(new akyc(webView, str));
        }
    }

    /* renamed from: a */
    public static void m60678a(WebView webView, String str, int i) {
        m60677a(webView, String.format(Locale.ROOT, "window.ocUdcCallback(%s, %s, %s)", Integer.valueOf(i), str, false));
    }

    /* renamed from: a */
    public static void m60679a(WebView webView, boolean z, int i) {
        m60677a(webView, String.format(Locale.ROOT, "window.ocUdcCallback(%s, %s, %s)", Integer.valueOf(i), Boolean.valueOf(z), false));
    }

    /* renamed from: a */
    private static boolean m60680a(int i) {
        for (int i2 : f73107g) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocUdc", new akzu(Pattern.compile(bmxx.m108578b(cfrl.f185514a.mo6606a().mo82572c())), Pattern.compile(bmxx.m108578b(cfrl.f185514a.mo6606a().mo82571b()))), cfrl.f185514a.mo6606a().mo82570a());
    }
}
