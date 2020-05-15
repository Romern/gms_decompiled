package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutorService;

/* renamed from: ytp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytp {

    /* renamed from: a */
    public final rjx f54611a;

    /* renamed from: b */
    private final ExecutorService f54612b;

    /* renamed from: c */
    private final ytm f54613c;

    public ytp(ytm ytm, ExecutorService executorService, rjx rjx) {
        this.f54613c = ytm;
        this.f54612b = executorService;
        this.f54611a = rjx;
    }

    /* renamed from: a */
    public static int m44794a(Status status) {
        int i = status.f30115i;
        if (i == -1 || i == 0) {
            return 2;
        }
        if (i == 10) {
            return 64;
        }
        switch (i) {
            case -5003:
                return ErrorInfo.TYPE_SDU_MEMORY_FULL;
            case -5002:
                return ErrorInfo.TYPE_SDU_FAILED;
            case -5001:
                return ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            case -5000:
                return 102;
            default:
                switch (i) {
                    case 4:
                        return 77;
                    case 5:
                        return 75;
                    case 6:
                        return 61;
                    case 7:
                        return 67;
                    case 8:
                        return 82;
                    default:
                        switch (i) {
                            case 13:
                                return 3;
                            case 14:
                                return 80;
                            case 15:
                                return 81;
                            case 16:
                                return 79;
                            case 17:
                                return 18;
                            default:
                                switch (i) {
                                    case 5000:
                                        return 106;
                                    case 5001:
                                        return 107;
                                    case 5002:
                                        return 108;
                                    case 5003:
                                        return 109;
                                    case 5004:
                                        return 110;
                                    case 5005:
                                        return 111;
                                    default:
                                        switch (i) {
                                            case 5007:
                                                return AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                                            case 5008:
                                                return 113;
                                            case 5009:
                                                return 114;
                                            case 5010:
                                                return 115;
                                            case 5011:
                                                return 70;
                                            case 5012:
                                                return 117;
                                            case 5013:
                                                return 118;
                                            case 5014:
                                                return 119;
                                            case 5015:
                                                return 120;
                                            default:
                                                switch (i) {
                                                    case 5018:
                                                        return 121;
                                                    case 5019:
                                                        return 122;
                                                    case 5020:
                                                        return 123;
                                                    case 5021:
                                                        return 124;
                                                    case 5022:
                                                        return 125;
                                                    case 5023:
                                                        return 126;
                                                    case 5024:
                                                        return 127;
                                                    default:
                                                        return 1;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    public final ytq mo30767a(Context context) {
        if (!cdza.f181994a.mo6606a().mo78530e()) {
            return new yts();
        }
        return new ytn(context, this.f54613c.f54593a);
    }

    /* renamed from: a */
    public final void mo30768a(int i) {
        if (cdza.m135456d()) {
            this.f54613c.f54594b.mo24385d("IncomingSensorEventCount").mo24367a(i - 1);
        }
    }

    /* renamed from: a */
    public final void mo30769a(Context context, String str, bpgr bpgr) {
        if (cdza.m135454b()) {
            this.f54612b.execute(new yto(this, context, bpgr, str));
        }
    }

    /* renamed from: a */
    public final void mo30770a(caah caah, int i) {
        if (cdza.m135456d()) {
            this.f54613c.f54594b.mo24385d("IncomingSensorDataPointCount").mo24354a((long) bzzk.m126356a(caah.f172336b).f172235aH, (long) i, qxq.f42377b);
        }
    }
}
