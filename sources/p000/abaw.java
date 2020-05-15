package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import com.google.android.gms.googlehelp.metrics.MetricsIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: abaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abaw extends soa {

    /* renamed from: a */
    final /* synthetic */ aasf f56966a;

    /* renamed from: b */
    final /* synthetic */ HelpChimeraActivity f56967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abaw(HelpChimeraActivity helpChimeraActivity, aasf aasf) {
        super(10);
        this.f56967b = helpChimeraActivity;
        this.f56966a = aasf;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void
     arg types: [com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity, abeh, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.a(android.content.Context, abeh, boolean):void */
    public final void run() {
        ExperimentTokens experimentTokens;
        byte[] bArr;
        try {
            aasf aasf = this.f56966a;
            aasf.mo18630k();
            aucb o = anef.m64089a((Context) aasf).mo41765o("com.google.android.gms.googlehelp");
            aucu.m76783a(o, ceeg.f182447a.mo6606a().mo78994an(), TimeUnit.SECONDS);
            HelpChimeraActivity helpChimeraActivity = this.f56967b;
            if (o.mo50384b() && (experimentTokens = (ExperimentTokens) o.mo50386d()) != null && (bArr = experimentTokens.f82089c) != null) {
                String encodeToString = Base64.encodeToString(bArr, 11);
                if (!TextUtils.isEmpty(encodeToString) && helpChimeraActivity.f56986y != null) {
                    bxvd da = abeh.f57196I.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    abeh abeh = (abeh) da.f164949b;
                    abeh.f57215j = MfiClientException.TYPE_NO_ACCOUNT_INFO;
                    int i = abeh.f57206a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    abeh.f57206a = i;
                    encodeToString.getClass();
                    abeh.f57207b |= 1;
                    abeh.f57198A = encodeToString;
                    HelpConfig helpConfig = helpChimeraActivity.f56986y;
                    String str = helpConfig.f78827b;
                    str.getClass();
                    abeh.f57206a = i | 2;
                    abeh.f57209d = str;
                    if (!TextUtils.isEmpty(helpConfig.f78830e)) {
                        String str2 = helpChimeraActivity.f56986y.f78830e;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        abeh abeh2 = (abeh) da.f164949b;
                        str2.getClass();
                        abeh2.f57206a |= 64;
                        abeh2.f57214i = str2;
                    }
                    MetricsIntentOperation.m66596a((Context) helpChimeraActivity, (abeh) da.mo74062i(), false);
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
        }
    }
}
