package p000;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: adfm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfm extends sri {

    /* renamed from: j */
    private static final String[] f61562j = {"Holdback", "Can't retry optin", "No eligible account", "User prefers browser", "Unsupported OS", "Unavailable runtime", "No AppInfo", "No route", "Installed app present", "Resolved Launch", "Resolved Opt-in", "Resolved Install", "Resolved Delegate", "Hash prefix w/at least filter matches: %d w/o at least filter match: %d", "LevelDB Error", "No domain filter", "Hash prefixes unsynced", "Resolved DevMan launch", "No DevMan AppInfo", "Network disallowed"};

    /* renamed from: k */
    private static SimpleDateFormat f61563k = null;

    public adfm() {
        super(20);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26007a(long j, int i, int i2) {
        String str;
        if (f61563k == null) {
            f61563k = new SimpleDateFormat("MM-dd HH:mm:ss", Locale.US);
        }
        SimpleDateFormat simpleDateFormat = f61563k;
        if (i != 13) {
            str = f61562j[i];
        } else {
            str = String.format(Locale.US, f61562j[i], Integer.valueOf(i2 & 15), Integer.valueOf((i2 & 240) >> 4));
        }
        String format = simpleDateFormat.format(new Date(j));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2 + String.valueOf(str).length());
        sb.append(format);
        sb.append(": ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo33419b(int i, int i2) {
        mo26010a(13, (i & 15) | ((i2 & 15) << 4));
    }
}
