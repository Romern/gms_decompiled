package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;

/* renamed from: aeca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aeca {

    /* renamed from: c */
    public static final aecm f63108c = new aecm(aebx.f63089a);

    /* renamed from: d */
    public static final aecm f63109d = new aecm(aeby.f63090a);

    /* renamed from: a */
    private final boolean f63110a;

    /* renamed from: b */
    private final boolean f63111b;

    /* renamed from: e */
    public final String f63112e;

    /* renamed from: f */
    public final int f63113f;

    /* renamed from: g */
    public final String f63114g;

    /* renamed from: h */
    public final boolean f63115h;

    /* renamed from: i */
    public final int f63116i;

    /* renamed from: j */
    public final boolean f63117j;

    /* renamed from: k */
    public final Set f63118k;

    /* renamed from: l */
    public final aebo f63119l;

    /* renamed from: m */
    public final Bundle f63120m;

    /* renamed from: n */
    public final int f63121n;

    /* renamed from: o */
    public final int f63122o;

    /* renamed from: p */
    public final int f63123p;

    /* renamed from: q */
    public final int f63124q;

    /* renamed from: r */
    public final int f63125r;

    /* renamed from: s */
    public final int f63126s;

    /* renamed from: t */
    private final boolean f63127t;

    public aeca(aebz aebz) {
        this.f63112e = aebz.f63097i;
        this.f63110a = false;
        this.f63113f = aebz.f63098j;
        this.f63114g = aebz.f63099k;
        this.f63115h = aebz.f63100l;
        this.f63116i = aebz.f63101m;
        this.f63117j = aebz.f63102n;
        this.f63121n = aebz.f63091c;
        this.f63122o = aebz.f63092d;
        this.f63123p = aebz.f63093e;
        this.f63124q = aebz.f63094f;
        this.f63125r = aebz.f63095g;
        this.f63126s = aebz.f63096h;
        this.f63118k = aebz.f63105q;
        this.f63111b = aebz.f63103o;
        this.f63127t = aebz.f63104p;
        this.f63120m = aebz.f63107s;
        aebo aebo = aebz.f63106r;
        this.f63119l = aebo == null ? aebo.f63077a : aebo;
    }

    /* renamed from: a */
    public static aeca m51618a(Bundle bundle) {
        int length;
        if (bundle.getLong("period", -1) != -1) {
            return new aebm(bundle);
        }
        if (bundle.getLong("window_start", -1) != -1) {
            return new aebj(bundle);
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("content_uri_array");
        int[] intArray = bundle.getIntArray("content_uri_flags_array");
        if (parcelableArray != null && intArray != null && (length = parcelableArray.length) > 0 && length == intArray.length && !Arrays.asList(parcelableArray).contains(null)) {
            return new aead(bundle);
        }
        String valueOf = String.valueOf(bundle);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Invalid bundle provided to #fromBundle: ");
        sb.append(valueOf);
        Log.e("GmsTaskScheduler", sb.toString());
        return null;
    }

    /* renamed from: b */
    public static void m51621b(Bundle bundle) {
        if (bundle != null) {
            int c = m51622c(bundle);
            if (c <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof Boolean)) {
                        if (obj instanceof Bundle) {
                            m51621b((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("Extras exceeding maximum size(10240 bytes): ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public static int m51622c(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        int dataSize = obtain.dataSize();
        obtain.recycle();
        return dataSize;
    }

    public boolean equals(Object obj) {
        if (obj instanceof aeca) {
            aeca aeca = (aeca) obj;
            if (this.f63112e.equals(aeca.f63112e) && this.f63110a == aeca.f63110a && this.f63114g.equals(aeca.f63114g) && this.f63115h == aeca.f63115h && this.f63116i == aeca.f63116i && this.f63117j == aeca.f63117j && this.f63118k.equals(aeca.f63118k) && this.f63111b == aeca.f63111b && this.f63127t == aeca.f63127t && this.f63119l.equals(aeca.f63119l) && this.f63121n == aeca.f63121n && this.f63122o == aeca.f63122o && this.f63123p == aeca.f63123p && this.f63124q == aeca.f63124q && this.f63125r == aeca.f63125r && this.f63126s == aeca.f63126s) {
                return true;
            }
            return false;
        }
        return false;
    }

    public aeca(Bundle bundle) {
        String string = bundle.getString("service");
        sdo.m34959a((Object) string);
        this.f63112e = string;
        this.f63110a = bundle.getBoolean("is_tag_loggable");
        String string2 = bundle.getString("tag");
        sdo.m34959a((Object) string2);
        this.f63114g = string2;
        this.f63113f = bundle.getInt("service_kind", 0);
        boolean z = bundle.getBoolean("update_current");
        this.f63115h = z;
        this.f63116i = bundle.getInt("update_current_task", z ? 1 : 0);
        this.f63117j = bundle.getBoolean("persisted");
        int i = bundle.getInt("requiredNetwork");
        this.f63121n = i;
        this.f63122o = bundle.getInt("preferredNetwork", i);
        boolean z2 = bundle.getBoolean("requiresCharging");
        this.f63111b = z2;
        this.f63123p = bundle.getInt("requiredChargingState", z2 ? 1 : 0);
        this.f63124q = bundle.getInt("preferredChargingState", this.f63111b ? 1 : 0);
        boolean z3 = bundle.getBoolean("requiresIdle");
        this.f63127t = z3;
        this.f63125r = bundle.getInt("requiredIdleness", z3 ? 1 : 0);
        this.f63126s = bundle.getInt("preferredIdleness", this.f63127t ? 1 : 0);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("reachabilityUris");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            this.f63118k = bnon.f131923a;
        } else {
            this.f63118k = new C1225nr(stringArrayList.size());
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f63118k.add(Uri.parse(stringArrayList.get(i2)));
            }
        }
        this.f63120m = (Bundle) bundle.getParcelable("extras");
        aebo a = aebo.m51579a((Bundle) bundle.getParcelable("retryStrategy"));
        this.f63119l = a == null ? aebo.f63077a : a;
    }

    /* renamed from: a */
    public static Uri m51619a(String str) {
        boolean z;
        boolean z2;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        int port = parse.getPort();
        if (port == -1) {
            if ("http".equalsIgnoreCase(scheme)) {
                port = 80;
            } else {
                port = 443;
            }
        }
        String host = parse.getHost();
        Uri parse2 = Uri.parse(String.format(Locale.US, "tcp://%s:%d", host, Integer.valueOf(port)));
        m51620a(parse2);
        return parse2;
    }

    /* renamed from: a */
    public static void m51620a(Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (TextUtils.isEmpty(host) || "null".equals(host)) {
                throw new IllegalArgumentException("URI hostname is required");
            }
            try {
                int port = uri.getPort();
                if (!"tcp".equals(scheme)) {
                    if (!"ping".equals(scheme)) {
                        String valueOf = String.valueOf(scheme);
                        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Unsupported required URI scheme: ") : "Unsupported required URI scheme: ".concat(valueOf));
                    } else if (port != -1) {
                        throw new IllegalArgumentException("Ping does not support port numbers");
                    }
                } else if (port <= 0 || port > 65535) {
                    int port2 = uri.getPort();
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Invalid required URI port: ");
                    sb.append(port2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } catch (NumberFormatException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                throw new IllegalArgumentException(valueOf2.length() == 0 ? new String("Invalid port number: ") : "Invalid port number: ".concat(valueOf2));
            }
        } else {
            throw new IllegalArgumentException("Null URI");
        }
    }

    /* renamed from: a */
    public void mo33975a(Bundle bundle, int i) {
        bundle.putBoolean("is_tag_loggable", this.f63110a);
        bundle.putString("tag", this.f63114g);
        bundle.putBoolean("update_current", this.f63115h);
        bundle.putInt("update_current_task", this.f63116i);
        bundle.putBoolean("persisted", this.f63117j);
        bundle.putString("service", this.f63112e);
        bundle.putInt("service_kind", this.f63113f);
        bundle.putInt("requiredNetwork", this.f63121n);
        bundle.putBoolean("requiresCharging", this.f63111b);
        if (i >= 18585000) {
            bundle.putInt("preferredNetwork", this.f63122o);
            bundle.putInt("requiredChargingState", this.f63123p);
            bundle.putInt("preferredChargingState", this.f63124q);
        }
        if (i >= 20231000) {
            bundle.putInt("requiredIdleness", this.f63125r);
            bundle.putInt("preferredIdleness", this.f63126s);
        }
        if (!this.f63118k.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.f63118k) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresIdle", this.f63127t);
        aebo aebo = this.f63119l;
        Bundle bundle2 = new Bundle();
        aebo.mo34012b(bundle2);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.f63120m);
    }
}
