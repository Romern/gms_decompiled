package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Random;

/* renamed from: glf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glf {

    /* renamed from: a */
    private final Random f18458a = new Random();

    /* renamed from: b */
    private final jyj f18459b;

    public glf(Context context) {
        this.f18459b = new jyj(context);
        long a = spn.getAndroidId(context);
        if (a != 0) {
            this.f18458a.setSeed(a);
        }
    }

    /* renamed from: a */
    public final void mo12006a(Logger Logger, bofx bofx) {
        String str;
        String str2;
        int a = bofu.m111157a(bofx.f132954c);
        if (a == 0) {
            a = 1;
        }
        int a2 = bofw.m111159a(bofx.f132953b);
        if (a2 == 0) {
            a2 = 1;
        }
        Object[] objArr = new Object[2];
        switch (a2) {
            case 1:
                str = "UNKNOWN_STAGE";
                break;
            case 2:
                str = "BROADCAST_RECEIVER";
                break;
            case 3:
                str = "TASK_SERVICE";
                break;
            case 4:
                str = "ACCOUNT_SYNC";
                break;
            case 5:
                str = "CREDENTIAL_SYNC";
                break;
            case 6:
                str = "OLD_ACCOUNT_SYNCER";
                break;
            default:
                str = "OLD_CREDENTIAL_SYNCER";
                break;
        }
        objArr[0] = str;
        switch (a) {
            case 1:
                str2 = "UNKNOWN_RESULT";
                break;
            case 2:
                str2 = "SUCCESS";
                break;
            case 3:
                str2 = "MISSING_ACCOUNT_ID";
                break;
            case 4:
                str2 = "ACCOUNT_NOT_FOUND";
                break;
            case 5:
                str2 = "MISSING_ACTION";
                break;
            case 6:
                str2 = "UNRECOGNIZED_ACTION";
                break;
            case 7:
                str2 = "MISSING_EXTRAS";
                break;
            case 8:
                str2 = "NETWORK_ERROR";
                break;
            default:
                str2 = "EMPTY_RESULT";
                break;
        }
        objArr[1] = str2;
        Logger.mo25414c(String.format("Sync reported at %s has status of %s.", objArr), new Object[0]);
        if (this.f18458a.nextDouble() < ccar.f178695a.mo6606a().mo75729c()) {
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 48;
            boct.f132610a = 1 | boct.f132610a;
            bofx.getClass();
            boct.f132609H = bofx;
            boct.f132611b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
            this.f18459b.mo14225b((boct) da.mo74062i());
        }
    }
}
