package p000;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.webkit.URLUtil;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: akhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhv {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d  */
    /* renamed from: a */
    public static TextAttachment m59739a(Context context, Intent intent) {
        String str;
        char c;
        String a = akiq.m59844a(intent);
        if (a == null) {
            return null;
        }
        int i = 1;
        if (!URLUtil.isValidUrl(a)) {
            int i2 = Build.VERSION.SDK_INT;
            TextClassification classifyText = ((TextClassificationManager) context.getSystemService(TextClassificationManager.class)).getTextClassifier().classifyText(a, 0, a.length(), new LocaleList(Locale.US));
            str = classifyText.getEntityCount() <= 0 ? "" : classifyText.getEntity(0);
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akiq", "a", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Text %s classified as %s", a, str);
        } else {
            str = "url";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1147692044) {
            if (hashCode != 116079) {
                if (hashCode == 106642798 && str.equals("phone")) {
                    c = 2;
                    if (c != 0) {
                        if (c != 1) {
                            i = c != 2 ? 0 : 3;
                        } else {
                            i = 2;
                        }
                    }
                    ajtz ajtz = new ajtz(a);
                    ajtz.f71281a = i;
                    return ajtz.mo38913a();
                }
            } else if (str.equals("url")) {
                c = 0;
                if (c != 0) {
                }
                ajtz ajtz2 = new ajtz(a);
                ajtz2.f71281a = i;
                return ajtz2.mo38913a();
            }
        } else if (str.equals("address")) {
            c = 1;
            if (c != 0) {
            }
            ajtz ajtz22 = new ajtz(a);
            ajtz22.f71281a = i;
            return ajtz22.mo38913a();
        }
        c = 65535;
        if (c != 0) {
        }
        ajtz ajtz222 = new ajtz(a);
        ajtz222.f71281a = i;
        return ajtz222.mo38913a();
    }

    /* renamed from: b */
    public static String m59743b(Intent intent) {
        ClipDescription description;
        ClipData clipData = intent.getClipData();
        if (clipData == null || (description = clipData.getDescription()) == null || description.getMimeTypeCount() == 0) {
            return "application/octet-stream";
        }
        String mimeType = description.getMimeType(0);
        if (TextUtils.isEmpty(mimeType)) {
            mimeType = "application/octet-stream";
        }
        for (int i = 1; i < description.getMimeTypeCount(); i++) {
            if (!mimeType.equals(description.getMimeType(i))) {
                return "application/octet-stream";
            }
        }
        return mimeType;
    }

    /* renamed from: b */
    public static List m59744b(Context context, Intent intent) {
        int i;
        Uri[] a = akif.m59807a(intent);
        String b = m59743b(intent);
        int length = a.length;
        ArrayList arrayList = new ArrayList(length);
        for (Uri uri : a) {
            String b2 = akif.m59809b(context, uri, b);
            String a2 = akif.m59797a(context, uri, b2);
            String b3 = akif.m59809b(context, uri, b2);
            if (!b3.startsWith("image")) {
                i = !b3.startsWith("video") ? b3.startsWith("audio") ? 4 : 0 : 2;
            } else {
                i = 1;
            }
            long b4 = akif.m59808b(context, uri);
            ajja ajja = new ajja(a2);
            ajja.f70733c = i;
            ajja.f70732b = b4;
            ajja.f70731a = uri;
            ajja.f70734d = b2;
            arrayList.add(ajja.mo38689a());
        }
        return arrayList;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static WifiCredentialsAttachment m59740a(Intent intent) {
        char c;
        if (!cfov.m142048X()) {
            return null;
        }
        Bundle bundleExtra = intent.getBundleExtra("android.intent.extra.WIFI_CREDENTIALS_BUNDLE");
        if (bundleExtra == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akhv", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get WifiCredentials from the intent. The WifiCredentialsBundle is null.");
            return null;
        }
        String string = bundleExtra.getString("android.intent.extra.SSID");
        String string2 = bundleExtra.getString("android.intent.extra.SECURITY_TYPE");
        boolean z = bundleExtra.getBoolean("android.intent.extra.HIDDEN_SSID");
        if (string == null) {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akhv", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get WifiCredentials from the intent. Ssid is null");
            return null;
        } else if (string2 != null) {
            srn srn = ajvp.f71371a;
            String string3 = bundleExtra.getString("android.intent.extra.PASSWORD");
            ajue ajue = new ajue(string);
            int i = 0;
            switch (string2.hashCode()) {
                case 85826:
                    if (string2.equals("WEP")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 86152:
                    if (string2.equals("WPA")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2402104:
                    if (string2.equals("NONE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2670762:
                    if (string2.equals("WPA2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2670763:
                    if (string2.equals("WPA3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1 || c == 2) {
                i = 2;
            } else if (c == 3) {
                i = 3;
            } else if (c == 4) {
                i = 1;
            }
            ajue.f71288a = i;
            ajue.f71289b = string3;
            ajue.f71290c = z;
            return ajue.mo38921a();
        } else {
            bnsl bnsl3 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl3.mo68432a("akhv", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Failed to get WifiCredentials from the intent. Security type is null");
            return null;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private static WifiCredentialsAttachment m59741a(Bundle bundle) {
        char c;
        String string = bundle.getString("android.intent.extra.SSID");
        String string2 = bundle.getString("android.intent.extra.SECURITY_TYPE");
        boolean z = bundle.getBoolean("android.intent.extra.HIDDEN_SSID");
        if (string == null) {
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68388c();
            bnsl.mo68432a("akhv", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get WifiCredentials from the intent. Ssid is null");
            return null;
        } else if (string2 != null) {
            srn srn = ajvp.f71371a;
            String string3 = bundle.getString("android.intent.extra.PASSWORD");
            ajue ajue = new ajue(string);
            int i = 0;
            switch (string2.hashCode()) {
                case 85826:
                    if (string2.equals("WEP")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 86152:
                    if (string2.equals("WPA")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2402104:
                    if (string2.equals("NONE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2670762:
                    if (string2.equals("WPA2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2670763:
                    if (string2.equals("WPA3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0 || c == 1 || c == 2) {
                i = 2;
            } else if (c == 3) {
                i = 3;
            } else if (c == 4) {
                i = 1;
            }
            ajue.f71288a = i;
            ajue.f71289b = string3;
            ajue.f71290c = z;
            return ajue.mo38921a();
        } else {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akhv", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to get WifiCredentials from the intent. Security type is null");
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m59742a(List list, int... iArr) {
        Iterator it = list.iterator();
        loop0:
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.mo44385c()) {
                int b = attachment.mo44384b();
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break loop0;
                    } else if (b != iArr[i]) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
