package p000;

import android.content.Context;
import android.util.Log;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: brez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class brez extends brgj {

    /* renamed from: a */
    public static final bngx f142746a = bngx.m109356a(Felica.MFI_PERMIT);

    /* renamed from: b */
    public static final String f142747b = brgk.class.getSimpleName();

    /* renamed from: m */
    private static final Integer f142748m = 100;

    /* renamed from: n */
    private static final bnhe f142749n;

    static {
        bnha bnha = new bnha();
        bnha.mo67695b(Integer.valueOf((int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD), bret.MFI_UNKNOWN_CARD);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_CARD_NOT_CACHED), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(160, bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_ACTIVATED), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_MFICLIENT_STARTED), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(f142748m, bret.MFI_VERSION_ERROR);
        bnha.mo67695b(Integer.valueOf((int) MfiClientException.TYPE_NO_ACCOUNT_INFO), bret.MFI_CLIENT_ERROR);
        bnha.mo67695b(Integer.valueOf((int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED), bret.MFI_SERVICE_PROVIDER_LIMIT_REACHED);
        f142749n = bnha.mo67618b();
    }

    public brez(Context context, brhc brhc, Executor executor, atfo atfo, atgo atgo) {
        super(context, brhc, executor, atfo, atgo);
    }

    /* renamed from: a */
    public static bret m113953a(int i, String str) {
        bret bret = (bret) f142749n.get(Integer.valueOf(i));
        if (bret == null) {
            String str2 = f142747b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 54);
            sb.append("Unknown error for User FeliCa operation: ");
            sb.append(i);
            sb.append(", ");
            sb.append(str);
            Log.e(str2, sb.toString());
            bret = bret.MFI_CLIENT_ERROR;
        }
        bret.f142728F = str;
        return bret;
    }

    /* renamed from: a */
    public final void mo69480a(int i) {
        this.f142824l.mo49963a(3, i);
    }

    /* renamed from: a */
    public final void mo69481a(Felica felica, int i) {
        try {
            felica.getMfiClient().stop(false, new brex(this, felica, i));
        } catch (MfiClientException e) {
            mo69502a(13, e);
            mo69508b(felica, i);
            mo69509c();
        } catch (Exception e2) {
            mo69508b(felica, i);
            mo69509c();
        } catch (Throwable th) {
            mo69508b(felica, i);
            mo69509c();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo69482a(brgh brgh) {
        Object obj = brgh.f142810c;
        if (!(obj instanceof brey)) {
            return false;
        }
        brey brey = (brey) obj;
        List list = brgh.f142809b;
        String str = brey.f142743a;
        brfa brfa = brey.f142744b;
        int i = brey.f142745c;
        int i2 = i == 2 ? 1 : i;
        mo69507b(14);
        this.f142822j = true;
        this.f142820h = this.f142823k.mo49927a(new brew(this, brfa, list, str, i2, i));
        this.f142820h.mo49924a(this.f142817e);
        return true;
    }
}
