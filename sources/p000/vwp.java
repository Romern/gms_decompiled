package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.util.List;

/* renamed from: vwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwp {

    /* renamed from: a */
    public static final int[] f50147a = {222, 102, 196, MfiClientException.TYPE_CARD_NOT_CACHED, BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 196, 204, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, 186, 202, 183, 38, ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, 205, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, 102, 202, BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, 117, 195, 133, 102, 183, 182, 117};

    /* renamed from: b */
    public static final int[] f50148b = {BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 102, 203, 222, 196, MfiClientException.TYPE_CARD_NOT_CACHED, 196, BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, 186, 183, 38, BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 102, 117, BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, 195, BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA, 133, BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, 102, BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, 183, 182, 117, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, 208, 102, 183, 182, BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, 117, 181, 203, 188, 37, 228, BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, 182};

    /* renamed from: c */
    public static final int[] f50149c = {BaseMfiEventCallback.TYPE_CARD_NOT_ACTIVE, 127, 4, 204, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, 222, 197, 19, 53};

    /* renamed from: d */
    public static final int[] f50150d = {205, 221, 102, BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_FILTER, BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, 183, 149, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, 190, MfiClientException.TYPE_MFICLIENT_NOT_STARTED, BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, 102, BaseMfiEventCallback.TYPE_ILLEGAL_LINKAGE_DATA, 117, 195, 133, 102, BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, 203, BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, 183, 182, 117};

    /* renamed from: f */
    private static final int[] f50151f = {102};

    /* renamed from: e */
    final vws f50152e;

    public vwp(vws vws) {
        this.f50152e = vws;
    }

    /* renamed from: a */
    public final void mo28915a(String str, List list) {
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new vwo());
            for (File file2 : listFiles) {
                String name = file2.getName();
                String a = this.f50152e.mo28917a(f50151f);
                long length = file2.length();
                String a2 = this.f50152e.mo28917a(f50151f);
                String a3 = ssl.m36243a(file2, this.f50152e.mo28917a(f50149c));
                int length2 = String.valueOf(name).length();
                StringBuilder sb = new StringBuilder(length2 + 20 + String.valueOf(a).length() + String.valueOf(a2).length() + String.valueOf(a3).length());
                sb.append(name);
                sb.append(a);
                sb.append(length);
                sb.append(a2);
                sb.append(a3);
                list.add(sb.toString());
            }
        }
    }
}
