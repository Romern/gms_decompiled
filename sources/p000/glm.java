package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.gms.auth.account.p016be.legacy.AuthCronChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: glm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class glm implements Callable {

    /* renamed from: a */
    final /* synthetic */ AuthCronChimeraService f18475a;

    public glm(AuthCronChimeraService authCronChimeraService) {
        this.f18475a = authCronChimeraService;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        AuthCronChimeraService authCronChimeraService = this.f18475a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (!gnv.m13498H()) {
            ixl ixl = new ixl(authCronChimeraService);
            Account[] a = adyd.m51363a(authCronChimeraService).mo33916a("com.google");
            AppDescription a2 = new ilq(authCronChimeraService).mo13123a();
            int length = a.length;
            i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Account account = a[i2];
                TokenRequest tokenRequest = new TokenRequest(account, "ac2dm");
                tokenRequest.f10717m = false;
                tokenRequest.f10716l = true;
                tokenRequest.f10714j = a2;
                TokenResponse a3 = ixl.mo13425a(tokenRequest);
                izj b = a3.mo7647b();
                if (!izj.SUCCESS.equals(b)) {
                    AuthCronChimeraService.f10007a.mo25416d(String.valueOf(b.f22000ac).concat("  while performing schedueled work for account. Rescheduling."), new Object[0]);
                    if (izj.NETWORK_ERROR.equals(a3.mo7647b())) {
                        i = 1;
                        break;
                    }
                    i = 1;
                } else {
                    Logger Logger = AuthCronChimeraService.f10007a;
                    String valueOf = String.valueOf(account.name);
                    Logger.mo25412b(valueOf.length() == 0 ? new String(" Successfully performed schedueled work for ") : " Successfully performed schedueled work for ".concat(valueOf), new Object[0]);
                }
                i2++;
            }
        } else {
            iei iei = new iei(authCronChimeraService);
            SharedPreferences sharedPreferences = rpr.m34216b().getSharedPreferences("auth_cron_chimera_service_storage", 0);
            long j = sharedPreferences.getLong("key_failed_attempts", 0);
            try {
                sdo.m34973b("Calling this from your main thread can crash your app");
                iei.m15319a(iei.f20795a);
                if (!((Boolean) iei.mo12951a(new ief())).booleanValue()) {
                    if (j <= gnv.m13572q()) {
                        long j2 = j + 1;
                        sharedPreferences.edit().putLong("key_failed_attempts", j2).apply();
                        if (j2 > gnv.m13572q()) {
                            authCronChimeraService.mo7135aZ();
                        }
                    }
                    i = 1;
                } else {
                    authCronChimeraService.mo7375a(elapsedRealtime, 2);
                    if (j != Long.MAX_VALUE) {
                        sharedPreferences.edit().putLong("key_failed_attempts", Long.MAX_VALUE).apply();
                        authCronChimeraService.mo7135aZ();
                    }
                    i = 0;
                }
            } catch (IOException e) {
                authCronChimeraService.mo7375a(elapsedRealtime, 3);
            } catch (gid e2) {
                authCronChimeraService.mo7375a(elapsedRealtime, 4);
            }
        }
        return Integer.valueOf(i);
    }
}
