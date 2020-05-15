package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: azwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwa extends azrk {

    /* renamed from: c */
    public final bcve f100110c;

    public azwa(Context context, bcve bcve) {
        super(context);
        this.f100110c = bcve;
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "PhotosMessagingController";
    }

    @JavascriptInterface
    @azqt
    public String downloadImage(String str, String str2, String str3) {
        bmxv bmxv;
        try {
            JSONObject jSONObject = new JSONObject(str3);
            try {
                bmxv a = bcwp.m90172a(jSONObject.getJSONObject("LIGHTER_MEDIA_ID"));
                if (!a.mo66813a()) {
                    bbos.m88294d("ImageDlReqArgs", "Unable to convert ImageDownloadRequestArgs from JSON object.");
                    bmxv = bmvz.f131120a;
                } else {
                    bcvc bcvc = new bcvc();
                    bcwp bcwp = (bcwp) a.mo66814b();
                    if (bcwp != null) {
                        bcvc.f104983a = bcwp;
                        bcvc.f104984b = Integer.valueOf(jSONObject.getInt("DOWNLOAD_REQUEST_TYPE"));
                        String str4 = "";
                        if (bcvc.f104983a == null) {
                            str4 = " lighterMediaId";
                        }
                        if (bcvc.f104984b == null) {
                            str4 = str4.concat(" downloadRequestType");
                        }
                        if (str4.isEmpty()) {
                            bmxv = bmxv.m108566b(new bcvb(bcvc.f104983a, bcvc.f104984b.intValue()));
                        } else {
                            String valueOf = String.valueOf(str4);
                            throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                        }
                    } else {
                        throw new NullPointerException("Null lighterMediaId");
                    }
                }
            } catch (JSONException e) {
                bbos.m88294d("ImageDlReqArgs", "Failed to convert ImageDownloadRequestArgs from JSON object.");
                bmxv = bmvz.f131120a;
            }
            if (bmxv.mo66813a()) {
                return mo55257a(str, str2, new azvx(this), new azvy(this, bmxv), new azvz(this), 1849, 1850);
            }
            azoj.m85933c("WAPhotosInterface", "Unable to parse imageDownloadRequestArgsJsonString", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(1850, 60);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Unable to parse imageDownloadRequestArgsJsonString", new Object[0]);
        } catch (JSONException e2) {
            azoj.m85933c("WAPhotosInterface", "Unable to convert imageDownloadRequestArgsJsonString to JSONObject", new Object[0]);
            azph.m85998a(this.f99942a).mo55126a(1850, 60);
            azqf.m86130a(this.f99942a);
            return azqf.m86138a("Unable to convert imageDownloadRequestArgsJsonString to JSONObject", new Object[0]);
        }
    }
}
