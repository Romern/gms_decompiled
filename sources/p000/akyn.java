package p000;

import android.webkit.JavascriptInterface;
import com.google.android.chimera.Activity;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akyn implements akww {

    /* renamed from: c */
    private static final sek f73124c = akzt.m60725a("OctarineUiBridge");

    /* renamed from: a */
    public final akym f73125a;

    /* renamed from: b */
    private final Activity f73126b;

    /* JADX WARN: Type inference failed for: r2v0, types: [akym, com.google.android.chimera.Activity], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akyn(Activity r2) {
        this.f73126b = r2;
        sdo.m34974b(true);
        this.f73125a = r2;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocUi", null, true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public void close() {
        Activity activity = this.f73126b;
        akym akym = this.f73125a;
        akym.getClass();
        activity.runOnUiThread(new akyj(akym));
    }

    @JavascriptInterface
    public void goBackOrClose() {
        Activity activity = this.f73126b;
        akym akym = this.f73125a;
        akym.getClass();
        activity.runOnUiThread(new akyk(akym));
    }

    @JavascriptInterface
    public void hideKeyboard() {
        Activity activity = this.f73126b;
        akym akym = this.f73125a;
        akym.getClass();
        activity.runOnUiThread(new akyg(akym));
    }

    @JavascriptInterface
    public boolean isOpenScreenEnabled() {
        return true;
    }

    @JavascriptInterface
    public void open(String str) {
        this.f73126b.runOnUiThread(new akyh(this, str));
    }

    @JavascriptInterface
    public void openScreen(int i, String str) {
        HashMap hashMap = new HashMap();
        if (!stm.m36302d(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (JSONException e) {
                f73124c.mo25417e("Unable to parse resourceParams JSON string", e, new Object[0]);
                return;
            }
        }
        this.f73126b.runOnUiThread(new akyi(this, i, hashMap));
    }

    @JavascriptInterface
    public void setBackStop() {
        Activity activity = this.f73126b;
        akym akym = this.f73125a;
        akym.getClass();
        activity.runOnUiThread(new akyl(akym));
    }
}
