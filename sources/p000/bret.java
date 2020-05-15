package p000;

import android.util.Log;
import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfoFactory;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bret */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bret implements brer {
    NOT_ACTIVATED,
    INVALID_RESPONSE,
    TIMEOUT_OCCURRED,
    OPEN_FAILED,
    SERVICE_NOT_FOUND,
    BLOCK_NOT_FOUND,
    READ_FAILED,
    NOT_IC_CHIP_FORMATTING,
    NOT_CLOSED,
    ALREADY_ACTIVATED,
    REMOTE_ACCESS_FAILED,
    CURRENTLY_ACTIVATING,
    FELICA_NOT_AVAILABLE,
    USED_BY_OTHER_APP,
    MFC_VERSION_ERROR,
    PERMIT_NOT_FOUND,
    ACTIVATE_HTTP_ERROR,
    ONLINE_NETWORK_ERROR,
    ONLINE_INTERRUPTED_ERROR,
    ONLINE_TICKET_EXPIRED,
    ONLINE_SERVER_BUSY,
    ONLINE_NO_SPACE_IN_CHIP,
    UNKNOWN_ONLINE_ERROR_CODE,
    BIND_FAILED,
    MFI_CLIENT_ERROR,
    MFI_UNKNOWN_CARD,
    MFI_SERVICE_PROVIDER_LIMIT_REACHED,
    MFI_VERSION_ERROR,
    UNKNOWN_FELICA_ERROR,
    OTHER_SERVICE_FOUND,
    OSAIFU_KEITAI_APP_VERSION_TOO_OLD;
    

    /* renamed from: G */
    private static final Integer f142695G = 100;

    /* renamed from: H */
    private static final String f142696H = bret.class.getSimpleName();

    /* renamed from: I */
    private static final Map f142697I = new HashMap();

    /* renamed from: J */
    private static final Map f142698J = new HashMap();

    /* renamed from: K */
    private static final Map f142699K = new HashMap();

    /* renamed from: L */
    private static final Map f142700L = new HashMap();

    /* renamed from: F */
    public String f142728F;

    /* renamed from: M */
    private AppInfo f142729M;

    static {
        new HashMap();
        f142697I.put(5, NOT_ACTIVATED);
        f142697I.put(6, INVALID_RESPONSE);
        f142697I.put(7, TIMEOUT_OCCURRED);
        f142697I.put(8, OPEN_FAILED);
        f142697I.put(11, SERVICE_NOT_FOUND);
        f142697I.put(12, BLOCK_NOT_FOUND);
        f142697I.put(14, READ_FAILED);
        f142697I.put(31, NOT_IC_CHIP_FORMATTING);
        f142697I.put(37, NOT_CLOSED);
        f142697I.put(42, ALREADY_ACTIVATED);
        f142697I.put(47, REMOTE_ACCESS_FAILED);
        f142697I.put(49, CURRENTLY_ACTIVATING);
        f142697I.put(55, FELICA_NOT_AVAILABLE);
        f142698J.put(7, USED_BY_OTHER_APP);
        f142698J.put(8, MFC_VERSION_ERROR);
        f142698J.put(9, MFC_VERSION_ERROR);
        f142698J.put(4, PERMIT_NOT_FOUND);
        f142698J.put(3, ACTIVATE_HTTP_ERROR);
        f142698J.put(1, UNKNOWN_FELICA_ERROR);
        f142698J.put(f142695G, MFC_VERSION_ERROR);
        f142699K.put(4, ONLINE_NETWORK_ERROR);
        f142699K.put(2, ONLINE_INTERRUPTED_ERROR);
        f142699K.put(3, ONLINE_NETWORK_ERROR);
        f142699K.put(1, UNKNOWN_FELICA_ERROR);
        f142700L.put(1135, ONLINE_TICKET_EXPIRED);
        f142700L.put(Integer.valueOf((int) ErrorInfoFactory.STATUS_CODE_SERVER_OVERCROWDING), ONLINE_SERVER_BUSY);
        f142700L.put(Integer.valueOf((int) ErrorInfoFactory.STATUS_CODE_SERVER_MAINTENANCE), ONLINE_SERVER_BUSY);
        f142700L.put(Integer.valueOf((int) ErrorInfoFactory.STATUS_CODE_WRITING_OUT_OF_SPACE), ONLINE_NO_SPACE_IN_CHIP);
        f142700L.put(Integer.valueOf((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD), MFI_UNKNOWN_CARD);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_CARD_NOT_CACHED), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA), MFI_CLIENT_ERROR);
        f142700L.put(160, MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_STARTED), MFI_CLIENT_ERROR);
        f142700L.put(f142695G, MFI_VERSION_ERROR);
        f142700L.put(Integer.valueOf((int) MfiClientException.TYPE_NO_ACCOUNT_INFO), MFI_CLIENT_ERROR);
        f142700L.put(Integer.valueOf((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED), MFI_SERVICE_PROVIDER_LIMIT_REACHED);
    }

    /* renamed from: a */
    public static bret m113947a(int i, String str) {
        bret bret = (bret) f142699K.get(Integer.valueOf(i));
        if (bret == null) {
            String str2 = f142696H;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55);
            sb.append("Unknown error for online FeliCa opration: ");
            sb.append(i);
            sb.append(", ");
            sb.append(str);
            Log.e(str2, sb.toString());
            bret = UNKNOWN_FELICA_ERROR;
        }
        bret.f142728F = str;
        return bret;
    }

    /* renamed from: b */
    public final String mo49934b() {
        return toString();
    }

    public final String toString() {
        String str = super.toString();
        String str2 = this.f142728F;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("{message='");
        sb.append(str2);
        sb.append("'}");
        return sb.toString();
    }

    /* renamed from: a */
    public static bret m113948a(int i, String str, AppInfo appInfo) {
        bret bret = (bret) f142698J.get(Integer.valueOf(i));
        if (bret == null) {
            String str2 = f142696H;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("Unknown error for activating FeliCa: ");
            sb.append(i);
            sb.append(", ");
            sb.append(str);
            Log.e(str2, sb.toString());
            bret = UNKNOWN_FELICA_ERROR;
        }
        bret.f142728F = str;
        bret.f142729M = appInfo;
        return bret;
    }

    /* renamed from: a */
    public static bret m113949a(FelicaException felicaException) {
        bret bret = (bret) f142697I.get(Integer.valueOf(felicaException.getType()));
        if (bret != null) {
            return bret;
        }
        String str = f142696H;
        int type = felicaException.getType();
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown error type: ");
        sb.append(type);
        Log.e(str, sb.toString());
        return UNKNOWN_FELICA_ERROR;
    }

    /* renamed from: a */
    public final String mo49933a() {
        return name();
    }
}
