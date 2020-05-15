package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.reporting.OptInRequest;

/* renamed from: aepy */
public final /* synthetic */ class aepy implements roo {

    /* renamed from: a */
    private final OptInRequest f63617a;

    public aepy(OptInRequest optInRequest) {
        this.f63617a = optInRequest;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        int i;
        switch (((aeql) ((aeqn) obj).mo25289B()).mo34459a(this.f63617a)) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 3507;
                break;
            case 2:
            case 3:
                i = 5;
                break;
            case 4:
                i = 10;
                break;
            case 5:
                i = 3500;
                break;
            case 6:
                i = 3501;
                break;
            case 7:
                i = 3502;
                break;
            case 8:
                i = 3503;
                break;
            case 9:
            default:
                i = 8;
                break;
            case 10:
                i = 3510;
                break;
            case 11:
                i = 3511;
                break;
            case 12:
                i = 3512;
                break;
            case 13:
                i = 3513;
                break;
            case 14:
                i = 3514;
                break;
        }
        rpc.m34201a(new Status(i), (aucf) obj2);
    }
}
