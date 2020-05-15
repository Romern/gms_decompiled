package p000;

import android.accounts.Account;
import android.os.AsyncTask;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: juj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class juj extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ SourceChimeraActivity f23231a;

    public juj(SourceChimeraActivity sourceChimeraActivity) {
        this.f23231a = sourceChimeraActivity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bsai[] mo14106a() {
        SourceChimeraActivity sourceChimeraActivity = this.f23231a;
        Logger Logger = SourceChimeraActivity.f11265a;
        bsai[] bsaiArr = new bsai[sourceChimeraActivity.f11267b.length];
        int i = 0;
        while (true) {
            Account[] accountArr = this.f23231a.f11267b;
            if (i >= accountArr.length) {
                return bsaiArr;
            }
            String str = accountArr[i].name;
            bxvd da = bsai.f143847d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsai bsai = (bsai) da.f164949b;
            str.getClass();
            bsai.f143849a |= 1;
            bsai.f143850b = str;
            try {
                SourceChimeraActivity sourceChimeraActivity2 = this.f23231a;
                ByteString a = ByteString.m123261a(byrr.m125226a(byrr.m125227b(((CryptauthPublicKey) SourceChimeraActivity.m6888a(sourceChimeraActivity2.f11281p.mo13188d("PublicKey", sourceChimeraActivity2.f11267b[i]))).f10517b)));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsai bsai2 = (bsai) da.f164949b;
                a.getClass();
                bsai2.f143849a |= 2;
                bsai2.f143851c = a;
                bsaiArr[i] = (bsai) da.mo74062i();
                i++;
            } catch (InvalidKeySpecException e) {
                Logger logger2 = SourceChimeraActivity.f11265a;
                String valueOf = String.valueOf(str);
                logger2.mo25417e(valueOf.length() == 0 ? new String("Could not get public key of user: ") : "Could not get public key of user: ".concat(valueOf), e, new Object[0]);
                return null;
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Logger logger3 = SourceChimeraActivity.f11265a;
                String valueOf2 = String.valueOf(Logger.m35081a(str));
                logger3.mo25417e(valueOf2.length() == 0 ? new String("Failed retrieve PublicKey for account: ") : "Failed retrieve PublicKey for account: ".concat(valueOf2), e2, new Object[0]);
                return null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return mo14106a();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bsai[] bsaiArr = (bsai[]) obj;
        if (bsaiArr != null) {
            bsac bsac = (bsac) bsad.f143828d.mo74144da();
            if (bsac.f164950c) {
                bsac.mo74035c();
                bsac.f164950c = false;
            }
            bsad bsad = (bsad) bsac.f164949b;
            bsad.f143832c = 1;
            bsad.f143830a |= 1;
            bsac.mo70094a(Arrays.asList(bsaiArr));
            bsad bsad2 = (bsad) bsac.mo74062i();
            bxvd da = bzws.f171671c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzws bzws = (bzws) da.f164949b;
            bsad2.getClass();
            bzws.f171674b = bsad2;
            bzws.f171673a |= 1;
            bzws bzws2 = (bzws) da.mo74062i();
            bxvd da2 = jus.f23257h.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            jus.m17350a((jus) da2.f164949b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            jus jus = (jus) da2.f164949b;
            bzws2.getClass();
            jus.f23262d = bzws2;
            jus.f23259a |= 8;
            String string = this.f23231a.getString(C0126R.string.auth_d2d_target_wait_progress_message);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            jus jus2 = (jus) da2.f164949b;
            string.getClass();
            jus2.f23259a |= 2;
            jus2.f23260b = string;
            try {
                this.f23231a.f11284s.mo14097a((jus) da2.mo74062i());
            } catch (IOException e) {
                SourceChimeraActivity.f11265a.mo25410a((Throwable) e);
            }
            SourceChimeraActivity sourceChimeraActivity = this.f23231a;
            Logger Logger = SourceChimeraActivity.f11265a;
            sourceChimeraActivity.f11283r = null;
            return;
        }
        SourceChimeraActivity sourceChimeraActivity2 = this.f23231a;
        Logger logger2 = SourceChimeraActivity.f11265a;
        sourceChimeraActivity2.mo7853a((int) C0126R.string.common_something_went_wrong);
    }
}
