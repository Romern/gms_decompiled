package p000;

import android.accounts.Account;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.AndroidAuthenticator;

/* renamed from: bjfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfz implements bjex, bjjb {

    /* renamed from: a */
    private static final bnic f122633a = bnic.m109493a("appValidationAction", "O2DocumentUploadAction", "droidGuardAction", "o2NetworkAction", "TapAndPayVerification");

    /* renamed from: b */
    private final Context f122634b;

    /* renamed from: c */
    private final RequestQueue f122635c;

    public bjfz(Context context, RequestQueue requestQueue) {
        this.f122634b = context;
        this.f122635c = requestQueue;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final bjfd mo52450a(bjfc bjfc) {
        char c;
        bjew bjew;
        String a = bjfc.mo65078a();
        switch (a.hashCode()) {
            case -1494622993:
                if (a.equals("TapAndPayVerification")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1276229963:
                if (a.equals("O2DocumentUploadAction")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -352547551:
                if (a.equals("o2NetworkAction")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1336873040:
                if (a.equals("appValidationAction")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1689423135:
                if (a.equals("droidGuardAction")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            bjew = new bjfj(this.f122634b);
        } else if (c == 1) {
            bjew = new bjjc(this.f122634b, this.f122635c, this);
        } else if (c == 2) {
            bjew = new bjfn(this.f122634b);
        } else if (c == 3) {
            bjew = new bjjf(this.f122634b, this.f122635c, this);
        } else if (c != 4) {
            bjew = null;
        } else {
            bjew = new bjfw(this.f122634b);
        }
        if (bjew == null) {
            return new bjfd(bjfd.m103295a(2));
        }
        return bjew.mo52455a(bjfc);
    }

    /* renamed from: b */
    public final boolean mo52451b(bjfc bjfc) {
        return f122633a.contains(bjfc.mo65078a());
    }

    /* renamed from: a */
    public final String mo65089a(Context context, Account account, String str, boolean z, long j) {
        boolean z2;
        if (!z || !bjhz.m103567a().mo65269e()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            String str2 = account.name;
            bxvd da = bpsi.f138959d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpsi bpsi = (bpsi) da.f164949b;
            bpsi.f138962b = 3;
            bpsi.f138961a |= 1;
            bjja.m103638a(j, str2, (bpsi) da.mo74062i());
        }
        try {
            String authToken = new AndroidAuthenticator(context, account, str).getAuthToken();
            if (z2) {
                String str3 = account.name;
                bxvd da2 = bpsi.f138959d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpsi bpsi2 = (bpsi) da2.f164949b;
                bpsi2.f138962b = 3;
                bpsi2.f138961a |= 1;
                bjja.m103639a(j, str3, (bpsi) da2.mo74062i(), 2);
            }
            return authToken;
        } catch (AuthFailureError e) {
            if (z2) {
                String str4 = account.name;
                bxvd da3 = bpsi.f138959d.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpsi bpsi3 = (bpsi) da3.f164949b;
                bpsi3.f138962b = 3;
                bpsi3.f138961a = 1 | bpsi3.f138961a;
                bjja.m103639a(j, str4, (bpsi) da3.mo74062i(), 5);
            }
            throw e;
        }
    }
}
