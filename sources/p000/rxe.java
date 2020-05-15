package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: rxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rxe extends aniu implements Closeable {

    /* renamed from: b */
    public static final /* synthetic */ int f43804b = 0;

    /* renamed from: a */
    public final Context f43805a;

    /* renamed from: g */
    private final rxb f43806g;

    /* renamed from: h */
    private final anfg f43807h;

    public rxe(Context context, rxb rxb, anfg anfg, aniz aniz) {
        super(context, anfg, null, aniz, new rxd(context), 3, rxc.f43802a);
        this.f43805a = context;
        this.f43806g = rxb;
        this.f43807h = anfg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo25224a(String str) {
        String str2;
        if (str != null) {
            bnhe d = mo25232d();
            if (d.containsKey(str)) {
                rxb rxb = this.f43806g;
                Account account = (Account) d.get(str);
                String peekAuthToken = rxb.f43801a.peekAuthToken(account, cgec.m144827b());
                if (peekAuthToken == null || peekAuthToken.isEmpty()) {
                    Log.i("AuthTokenRetriever", "auth token null");
                    return null;
                }
                String b = cgec.m144827b();
                String a = rxb.m34594a("com.google.android.gms");
                if (a == null || a.isEmpty()) {
                    str2 = null;
                } else {
                    str2 = bmxr.m108543a(':').mo66874a((Iterable) bngx.m109359a("EXP", "com.google.android.gms", a, b));
                }
                if (str2 != null && !str2.isEmpty()) {
                    String userData = rxb.f43801a.getUserData(account, str2);
                    if (userData == null || userData.isEmpty()) {
                        Log.i("AuthTokenRetriever", "Auth token my be expired.");
                    } else {
                        try {
                            if (Long.valueOf(userData).longValue() < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                                Log.i("AuthTokenRetriever", "EXPIRED");
                                return null;
                            }
                        } catch (NumberFormatException e) {
                            Log.i("AuthTokenRetriever", "Not a long", e);
                        }
                    }
                    return peekAuthToken;
                }
                Log.i("AuthTokenRetriever", "tokenCacheKey null");
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25225a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25226a(long j) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo25228b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final cafx mo25230c() {
        return anii.m64473a(this.f43805a);
    }

    public final void close() {
        anfg anfg = this.f43807h;
        if (anfg != null) {
            anfg.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final bnhe mo25232d() {
        try {
            Account[] accountsByType = AccountManager.get(this.f43805a).getAccountsByType("com.google");
            bnha bnha = new bnha();
            for (Account account : accountsByType) {
                bnha.mo67695b(account.name, account);
            }
            return bnha.mo67618b();
        } catch (SecurityException e) {
            Log.e("HeterodyneSyncerSB", "Failed to get device user accounts", e);
            return bnoj.f131912b;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25229b(String str) {
        this.f43806g.f43801a.invalidateAuthToken("com.google", str);
    }

    /* renamed from: a */
    public final String[] mo25227a() {
        bnic j = mo25232d().keySet();
        return (String[]) j.toArray(new String[j.size()]);
    }
}
