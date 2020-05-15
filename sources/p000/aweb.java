package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.AsyncTaskLoader;
import java.util.Locale;

/* renamed from: aweb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aweb extends AsyncTaskLoader {

    /* renamed from: a */
    final String f94190a;

    /* renamed from: b */
    String f94191b;

    /* renamed from: c */
    private final Account f94192c;

    /* renamed from: d */
    private final int f94193d;

    /* renamed from: e */
    private final Context f94194e;

    public aweb(Account account, int i, String str, Context context) {
        super(context);
        this.f94194e = context;
        this.f94192c = account;
        this.f94193d = i;
        this.f94190a = str;
    }

    public final /* bridge */ /* synthetic */ void deliverResult(Object obj) {
        this.f94191b = (String) obj;
        if (isStarted()) {
            super.deliverResult(this.f94191b);
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        String str;
        String str2;
        Context context = this.f94194e;
        Account account = this.f94192c;
        int i = this.f94193d;
        String str3 = this.f94190a;
        sdo.m34973b("Cannot be called on UI thread");
        if (!TextUtils.isEmpty(str3)) {
            str = String.format(Locale.US, "weblogin:service=%s&continue=%s", str3, null);
        } else {
            if (!(i == 0 || i == 2)) {
                switch (i) {
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        str2 = (String) awif.f94434d.mo58455c();
                        break;
                }
                str = String.format(Locale.US, "weblogin:service=%s&continue=%s", str2, null);
            }
            str2 = (String) awif.f94433c.mo58455c();
            str = String.format(Locale.US, "weblogin:service=%s&continue=%s", str2, null);
        }
        try {
            return gie.m13194b(context, account, str);
        } catch (C1020gis e) {
            Log.e("CoffeeWebViewUtils", "UserRecoverableNotifiedException, notification has already been pushed.");
            return null;
        } catch (Exception e2) {
            Log.e("CoffeeWebViewUtils", "Exception is thrown from getting auth token");
            return null;
        }
    }

    public final void onReset() {
        super.onReset();
        this.f94191b = null;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        if (TextUtils.isEmpty(this.f94191b)) {
            forceLoad();
        } else {
            cancelLoad();
        }
    }
}
