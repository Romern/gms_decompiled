package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import java.io.File;
import java.net.IDN;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;

/* renamed from: ciri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ciri extends ICronetEngineBuilder {

    /* renamed from: c */
    private static final Pattern f191274c = Pattern.compile("^[0-9\\.]*$");

    /* renamed from: a */
    public String f191275a;

    /* renamed from: b */
    public int f191276b = 20;

    /* renamed from: d */
    private final Context f191277d;

    /* renamed from: e */
    private final List f191278e = new LinkedList();

    /* renamed from: f */
    private final List f191279f = new LinkedList();

    /* renamed from: g */
    private String f191280g;

    public ciri(Context context) {
        this.f191277d = context.getApplicationContext();
        mo86393a(0);
    }

    /* renamed from: a */
    public final void mo86393a(int i) {
        if (i == 3 || i == 2) {
            if (this.f191280g == null) {
                throw new IllegalArgumentException("Storage path must be set");
            }
        } else if (this.f191280g != null) {
            throw new IllegalArgumentException("Storage path must not be set");
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalArgumentException("Unknown cache mode");
        }
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        mo86395a(str, set, date);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        mo86399b(str);
        return this;
    }

    /* renamed from: b */
    public final void mo86398b(int i) {
        if (i > 19 || i < -20) {
            throw new IllegalArgumentException("Thread priority invalid");
        }
        this.f191276b = i;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        mo86393a(i);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    public final String getDefaultUserAgent() {
        int i;
        Context context = this.f191277d;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        synchronized (citf.f191406a) {
            if (citf.f191407b == 0) {
                try {
                    citf.f191407b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalStateException("Cannot determine package version");
                }
            }
            i = citf.f191407b;
        }
        sb.append(i);
        sb.append(" (Linux; U; Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append("; Cronet/83.0.4099.5)");
        return sb.toString();
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        mo86394a(str);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        mo86398b(i);
        return this;
    }

    public /* bridge */ /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.f191275a = str;
        return this;
    }

    /* renamed from: b */
    public final void mo86399b(String str) {
        if (!str.contains("/")) {
            this.f191278e.add(new cirh());
            return;
        }
        throw new IllegalArgumentException("Illegal QUIC Hint Host: " + str);
    }

    /* renamed from: a */
    public final void mo86394a(String str) {
        if (new File(str).isDirectory()) {
            this.f191280g = str;
            return;
        }
        throw new IllegalArgumentException("Storage path must be set to existing directory");
    }

    /* renamed from: a */
    public final void mo86395a(String str, Set set, Date date) {
        if (str == null) {
            throw new NullPointerException("The hostname cannot be null");
        } else if (set == null) {
            throw new NullPointerException("The set of SHA256 pins cannot be null");
        } else if (date == null) {
            throw new NullPointerException("The pin expiration date cannot be null");
        } else if (f191274c.matcher(str).matches()) {
            throw new IllegalArgumentException("Hostname " + str + " is illegal. A hostname should not consist of digits and/or dots only.");
        } else if (str.length() <= 255) {
            try {
                IDN.toASCII(str, 2);
                HashMap hashMap = new HashMap();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    byte[] bArr = (byte[]) it.next();
                    if (bArr == null || bArr.length != 32) {
                        throw new IllegalArgumentException("Public key pin is invalid");
                    }
                    hashMap.put(Base64.encodeToString(bArr, 0), bArr);
                }
                List list = this.f191279f;
                byte[][] bArr2 = (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]);
                list.add(new cirg());
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Hostname " + str + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
            }
        } else {
            throw new IllegalArgumentException("Hostname " + str + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }
}
