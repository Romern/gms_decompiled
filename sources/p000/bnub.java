package p000;

import android.os.Build;
import android.util.Log;
import java.util.logging.Level;

/* renamed from: bnub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnub extends bntm implements bnth {

    /* renamed from: a */
    private static final bntg f132153a = new bntz();

    /* renamed from: b */
    private final String f132154b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    public bnub(String str, String str2, boolean z) {
        super(str2);
        if (str.length() + str2.length() > 23) {
            String replace = str2.replace('$', '.');
            str2 = replace.substring(replace.lastIndexOf(46) + 1);
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(str2);
        String str3 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        if (z) {
            str3 = str3.substring(0, Math.min(str3.length(), 23));
        } else {
            int i = Build.VERSION.SDK_INT;
        }
        this.f132154b = str3;
    }

    /* renamed from: a */
    public final void mo8544a(bnsw bnsw) {
        bnti.m110386a(bnsw, this, f132153a);
    }

    /* renamed from: a */
    public final void mo68481a(Level level, String str, Throwable th) {
        String str2 = this.f132154b;
        int a = bntv.m110419a(level);
        if (a != 2 && a != 3) {
            if (a == 4) {
                Log.i(str2, str, th);
            } else if (a != 5) {
                Log.e(str2, str, th);
            } else {
                Log.w(str2, str, th);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8545a(Level level) {
        int a = bntv.m110419a(level);
        return Log.isLoggable(this.f132154b, a) || Log.isLoggable("all", a);
    }
}
