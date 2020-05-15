package p000;

import android.net.Uri;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;

/* renamed from: arou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arou extends arop {

    /* renamed from: b */
    public static final sek f88030b = ascp.m73787a("D2D", "UI", "QRCodeInstructionFlow");

    /* renamed from: c */
    public final arok f88031c;

    /* renamed from: d */
    public final armc f88032d;

    /* renamed from: e */
    private final arzl f88033e;

    public arou(arok arok, FragmentManager fragmentManager, Bundle bundle, armc armc) {
        super(fragmentManager);
        this.f88031c = arok;
        this.f88032d = armc;
        arzl arzl = null;
        if (bundle != null) {
            Fragment findFragmentById = fragmentManager.findFragmentById(C0126R.C0129id.fragment_container);
            if (findFragmentById instanceof arzl) {
                arzl = (arzl) findFragmentById;
            }
        }
        arzl = arzl == null ? new arzl() : arzl;
        arzl.f88528c = new arot(this);
        this.f88033e = arzl;
    }

    /* renamed from: a */
    public final int mo48711a() {
        return 4;
    }

    /* renamed from: a */
    public final void mo48712a(Bundle bundle) {
    }

    /* renamed from: a */
    public final boolean mo48714a(int i) {
        return i == 116;
    }

    /* renamed from: b */
    public final void mo48707b(int i, Bundle bundle) {
        if (i == 116) {
            String string = bundle.getString("pairingCode");
            String string2 = bundle.getString("encodedKey");
            if (string == null || string2 == null) {
                f88030b.mo25418e("Did not get pairing code or encoded key to start QR code", new Object[0]);
                return;
            }
            arzl arzl = this.f88033e;
            arzl.f88526a.mo25414c("Updating QR", new Object[0]);
            arzl.f88527b = Uri.parse(cgpg.m146452f()).buildUpon().appendPath("qr").appendPath(string).appendQueryParameter("key", string2).toString();
            arzl.mo48968a(arzl.f88527b);
            return;
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("Unknown action ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo48713a(boolean z) {
        if (!z) {
            mo48718b(this.f88033e);
        } else {
            mo48717a(this.f88033e);
        }
    }
}
