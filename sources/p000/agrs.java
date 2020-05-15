package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: agrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agrs {

    /* renamed from: a */
    private static final srn f66327a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: a */
    public static Status m55019a(chuw chuw) {
        String str;
        bnsl a = f66327a.mo26019b(agyt.m55307c());
        a.mo68437a(chuw);
        a.mo68405a("Parsing GTAF status exception.");
        chuv chuv = chuw.f189236a;
        if (chuv == null) {
            return new Status(27011, "Calling GTAF failed.");
        }
        String valueOf = String.valueOf(chuv);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append(valueOf);
        sb.append("; RPC to GTAF failed");
        String sb2 = sb.toString();
        chus chus = chus.OK;
        switch (chuv.f189233s.ordinal()) {
            case 1:
                return new Status(27031, sb2);
            case 2:
                return new Status(27032, sb2);
            case 3:
                return new Status(27033, sb2);
            case 4:
                return new Status(27034, sb2);
            case 5:
                return new Status(27002, sb2);
            case 6:
                return new Status(27036, sb2);
            case 7:
            default:
                String valueOf2 = String.valueOf(sb2);
                if (valueOf2.length() == 0) {
                    str = new String("Unhandled RPC Failure: ");
                } else {
                    str = "Unhandled RPC Failure: ".concat(valueOf2);
                }
                return new Status(27043, str);
            case 8:
                return new Status(27012, sb2);
            case 9:
                return new Status(27030, sb2);
            case 10:
                return new Status(27039, sb2);
            case 11:
                return new Status(27017, sb2);
            case 12:
                return new Status(27040, sb2);
            case 13:
                return new Status(27041, sb2);
            case 14:
                return new Status(27022, sb2);
            case 15:
                return new Status(27042, sb2);
            case 16:
                return new Status(27038, sb2);
        }
    }
}
