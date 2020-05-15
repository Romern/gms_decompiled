package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: addi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addi {

    /* renamed from: a */
    public static adea f61433a;

    /* renamed from: d */
    private static final Map f61434d = new C1223np();

    /* renamed from: e */
    private static final long f61435e = TimeUnit.DAYS.toMillis(7);

    /* renamed from: f */
    private static addz f61436f;

    /* renamed from: g */
    private static String f61437g;

    /* renamed from: b */
    final Context f61438b;

    /* renamed from: c */
    String f61439c = "";

    protected addi(Context context, String str) {
        this.f61438b = context.getApplicationContext();
        this.f61439c = str;
    }

    /* renamed from: a */
    public static synchronized addi m50206a(Context context) {
        addi addi;
        synchronized (addi.class) {
            Context applicationContext = context.getApplicationContext();
            if (f61433a == null) {
                f61433a = new adea(applicationContext);
                f61436f = new addz(applicationContext);
            }
            f61437g = Integer.toString(201515033);
            addi = (addi) f61434d.get("");
            if (addi == null) {
                addi = new addi(applicationContext, "");
                f61434d.put("", addi);
            }
        }
        return addi;
    }

    @Deprecated
    /* renamed from: b */
    public final String mo33346b() {
        return m50207a(mo33345a());
    }

    /* renamed from: b */
    public final String mo33347b(String str, String str2, Bundle bundle) {
        Bundle a;
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = !"".equals(this.f61439c) ? this.f61439c : str;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        addz addz = f61436f;
        KeyPair a2 = mo33345a();
        bundle.putString("gmsv", Integer.toString(201515033));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", Integer.toString(201515033));
        bundle.putString("app_ver_name", "20.15.15 (120300-{{cl}})");
        StringBuilder sb = new StringBuilder(15);
        sb.append("iid-201515000");
        bundle.putString("cliv", sb.toString());
        bundle.putString("appid", m50207a(a2));
        addw addw = new addw(addz.f61469e);
        Bundle bundle2 = null;
        try {
            a = (Bundle) aucu.m76782a(addw.mo33371a(new addu(addw.mo33370a(), bundle)));
        } catch (InterruptedException | ExecutionException e) {
            if ((e.getCause() instanceof addv) && ((addv) e.getCause()).f61458a == 4) {
                a = addz.mo33374a(bundle);
                if (a != null && a.containsKey("google.messenger")) {
                    Bundle a3 = addz.mo33374a(bundle);
                    if (a3 == null || !a3.containsKey("google.messenger")) {
                        bundle2 = a3;
                    }
                }
            }
        }
        bundle2 = a;
        if (bundle2 != null) {
            String string = bundle2.getString("registration_id");
            if (string == null) {
                string = bundle2.getString("unregistered");
            }
            if (string == null) {
                String string2 = bundle2.getString("error");
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String valueOf = String.valueOf(bundle2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb2.append("Unexpected response from GCM ");
                sb2.append(valueOf);
                Log.w("InstanceID", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            } else if (!"RST".equals(string) && !string.startsWith("RST|")) {
                return string;
            } else {
                addj.m50213a(this.f61438b, f61433a);
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    static String m50207a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final String mo33343a(String str, String str2) {
        return mo33344a(str, str2, null);
    }

    @Deprecated
    /* renamed from: a */
    public final String mo33344a(String str, String str2, Bundle bundle) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String a = f61433a.mo33377a("appVersion");
            String str3 = null;
            if (a != null && a.equals(f61437g)) {
                long b = f61433a.mo33381b(this.f61439c, str, str2);
                if (b >= 0 && System.currentTimeMillis() - b < f61435e) {
                    str3 = f61433a.mo33378a(this.f61439c, str, str2);
                }
            }
            if (str3 != null) {
                return str3;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            String b2 = mo33347b(str, str2, bundle);
            if (cecb.f182244a.mo6606a().mo78749a() && b2.contains(":") && !b2.startsWith(String.valueOf(mo33346b()).concat(":"))) {
                addj.m50213a(this.f61438b, f61433a);
                throw new IOException("SERVICE_NOT_AVAILABLE");
            } else if (b2 == null) {
                return b2;
            } else {
                f61433a.mo33380a(this.f61439c, str, str2, b2, f61437g);
                return b2;
            }
        } else {
            throw new IOException("MAIN_THREAD");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final KeyPair mo33345a() {
        return f61433a.mo33382b(this.f61439c).f61440a;
    }
}
