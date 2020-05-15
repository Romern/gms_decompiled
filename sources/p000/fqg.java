package p000;

import android.os.Bundle;
import android.os.Message;
import android.util.Pair;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.app.settings.OpenSourceLicensesChimeraActivity;

/* renamed from: fqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fqg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ OpenSourceLicensesChimeraActivity f17126a;

    public fqg(OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity) {
        this.f17126a = openSourceLicensesChimeraActivity;
    }

    public final void run() {
        OpenSourceLicensesChimeraActivity openSourceLicensesChimeraActivity = this.f17126a;
        StringBuilder sb = new StringBuilder();
        try {
            for (String str : ModuleManager.get(openSourceLicensesChimeraActivity).getThirdPartyLicenses().values()) {
                sb.append(str);
            }
        } catch (InvalidConfigException e) {
            sb.append(openSourceLicensesChimeraActivity.getString(C0126R.string.unable_to_retrieve_licenses));
        }
        bnre i = OpenSourceLicensesChimeraActivity.f9510b.listIterator();
        while (i.hasNext()) {
            Pair pair = (Pair) i.next();
            OpenSourceLicensesChimeraActivity.m6135a(openSourceLicensesChimeraActivity, (String) pair.first, sb, String.format("\n\n---%s Open Source Licenses---\n", (String) pair.second));
        }
        String sb2 = sb.toString();
        Message obtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("license", sb2);
        obtain.setData(bundle);
        this.f17126a.f9511c.sendMessage(obtain);
        this.f17126a.f9512d.shutdown();
    }
}
