package p000;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.wallet.shared.common.ExceptionHandlingAsyncTask;
import java.io.IOException;

/* renamed from: awhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awhc extends ExceptionHandlingAsyncTask {

    /* renamed from: a */
    private final awhf f94346a;

    public awhc(awhf awhf, Context context) {
        super(context);
        this.f94346a = awhf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52117a(Object[] objArr) {
        String str;
        Exception exc = null;
        try {
            str = gie.m13189a(this.f110422f, this.f94346a.f94349a.name, ((String[]) objArr)[0]);
        } catch (Exception e) {
            exc = e;
            str = null;
        }
        return Pair.create(exc, str);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Pair pair = (Pair) obj;
        super.onPostExecute(pair);
        awhf awhf = this.f94346a;
        awhf.f94350b = null;
        if (awhf.getActivity() == null) {
            return;
        }
        if (pair.first != null) {
            Exception exc = (Exception) pair.first;
            if (exc instanceof IOException) {
                this.f94346a.mo52168a(bkcz.m105336a());
            } else if (exc instanceof UserRecoverableAuthException) {
                this.f94346a.startActivityForResult(((UserRecoverableAuthException) exc).mo7366a(), 501);
            } else {
                Log.e("RetrieveAuthTokensFragment", "Authentication error", exc);
                this.f94346a.mo52165a();
            }
        } else if (pair.second != null) {
            this.f94346a.mo52169a((String) pair.second);
        } else {
            Log.e("RetrieveAuthTokensFragment", "Unknown authentication error");
            this.f94346a.mo52165a();
        }
    }
}
