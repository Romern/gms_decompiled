package p000;

import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: adkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adkr {

    /* renamed from: c */
    private static final long f62070c = TimeUnit.DAYS.toSeconds(7);

    /* renamed from: a */
    public final adkn f62071a;

    /* renamed from: b */
    public final SharedPreferences f62072b;

    /* renamed from: d */
    private final List f62073d = new ArrayList();

    static {
        new adfs("OptInPreferences");
    }

    /* renamed from: b */
    private final int m50748b() {
        return this.f62071a.mo33604d().length > 0 ? 2 : 3;
    }

    /* renamed from: a */
    public final int mo33606a() {
        long j;
        int i = this.f62072b.getInt("optInState", 2);
        int i2 = this.f62072b.getInt("optInLanguageVersion", 0);
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f62072b.contains("optInLastDeclineMillisSinceEpoch") || !this.f62072b.contains("optInNextPromptSecondsSinceEpoch")) {
                j = this.f62072b.getLong("optInLastDeclineMillisSinceEpoch", 0);
            } else {
                j = TimeUnit.SECONDS.toMillis(this.f62072b.getLong("optInNextPromptSecondsSinceEpoch", 0) - f62070c);
            }
            long K = j + cepl.f183185a.mo6606a().mo79527K();
            Object[] objArr = {Long.valueOf(K), Long.valueOf(currentTimeMillis)};
            if (currentTimeMillis >= K) {
                return m50748b();
            }
            return 3;
        } else if (this.f62071a.mo33600a() == null) {
            return m50748b();
        } else {
            return i2 >= 0 ? 1 : 2;
        }
    }

    public adkr(adkn adkn, SharedPreferences sharedPreferences) {
        this.f62071a = adkn;
        this.f62072b = sharedPreferences;
    }

    /* renamed from: a */
    public final synchronized void mo33607a(adkq adkq) {
        this.f62073d.add(adkq);
    }

    /* renamed from: a */
    public final synchronized void mo33608a(Account account, int i, int i2) {
        List list = this.f62073d;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((adkq) list.get(i3)).mo33598a(account, i, i2);
        }
    }

    /* renamed from: a */
    public final void mo33609a(String str) {
        if (str != null) {
            this.f62071a.mo33601a(str);
        }
        int a = mo33606a();
        this.f62072b.edit().putInt("optInState", 0).remove("optInNextPromptSecondsSinceEpoch").remove("optInOneMoreChance").remove("optInLastDeclineMillisSinceEpoch").remove("optInNumDeclines").apply();
        mo33608a(this.f62071a.mo33600a(), a, 0);
    }
}
