package p000;

import android.webkit.JavascriptInterface;
import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jcv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jcv {

    /* renamed from: a */
    public static final sek f22196a = jdh.m16547a("FolsomJsBridge");

    /* renamed from: b */
    public final jcw f22197b;

    /* renamed from: c */
    public boolean f22198c = false;

    /* renamed from: d */
    private final String f22199d;

    public jcv(jcw jcw, String str) {
        this.f22197b = jcw;
        this.f22199d = str;
    }

    @JavascriptInterface
    public void closeView() {
        f22196a.mo25412b("closeView", new Object[0]);
        if (this.f22198c) {
            this.f22197b.f22200a.mo2450b((Object) -1);
            return;
        }
        jdg.m16541a(6);
        this.f22197b.f22200a.mo2450b((Object) 0);
    }

    @JavascriptInterface
    public void setVaultSharedKeys(String str, String str2) {
        f22196a.mo25412b("setVaultSharedKeys", new Object[0]);
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(next);
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("key");
                    int i2 = jSONObject2.getInt("epoch");
                    byte[] bArr = new byte[jSONObject3.length()];
                    for (int i3 = 0; i3 < jSONObject3.length(); i3++) {
                        bArr[i3] = (byte) jSONObject3.getInt(Integer.toString(i3));
                    }
                    arrayList2.add(new SharedKey(i2, bArr));
                }
                sek sek = f22196a;
                int size = arrayList2.size();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Number of recovered keys: ");
                sb.append(size);
                sek.mo25412b(sb.toString(), new Object[0]);
                izn a = izo.m16377a();
                a.f22004a = next;
                izm a2 = izl.m16372a(rpr.m34216b(), a.mo13531a());
                String str3 = this.f22199d;
                roz b = rpa.m34196b();
                b.f43472a = new jap(arrayList2, str3);
                b.f43473b = new Feature[]{kaz.f23678a};
                arrayList.add(((rjx) a2).mo24701a(b.mo24977a()));
            }
            aucb b2 = aucu.m76785b(arrayList);
            b2.mo50373a(new jct(this));
            b2.mo50372a(new jcu(this));
        } catch (JSONException e) {
            f22196a.mo25417e("Couldn't parse JSON object", e, new Object[0]);
            this.f22197b.f22200a.mo2450b((Object) 0);
        }
    }
}
