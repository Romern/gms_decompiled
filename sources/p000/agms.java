package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.measurement.internal.EventParams;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* renamed from: agms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agms extends agjv {

    /* renamed from: a */
    public static final /* synthetic */ int f65976a = 0;

    /* renamed from: b */
    private static final String[] f65977b = {"firebase_", "google_", "ga_"};

    /* renamed from: c */
    private SecureRandom f65978c;

    /* renamed from: d */
    private final AtomicLong f65979d = new AtomicLong(0);

    /* renamed from: e */
    private int f65980e;

    /* renamed from: f */
    private Integer f65981f = null;

    public agms(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    static long m54588a(byte[] bArr) {
        boolean z;
        sdo.m34959a(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        int i2 = length - 1;
        long j = 0;
        while (i2 >= 0 && i2 >= bArr.length - 8) {
            j += (((long) bArr[i2]) & 255) << i;
            i += 8;
            i2--;
        }
        return j;
    }

    /* renamed from: b */
    static final boolean m54593b(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: f */
    static MessageDigest m54595f() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    /* renamed from: h */
    static final boolean m54597h(String str) {
        sdo.m34959a((Object) str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: i */
    private final int m54598i(String str) {
        if ("_ldl".equals(str)) {
            mo35538v();
            return 2048;
        } else if ("_id".equals(str)) {
            mo35538v();
            return PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        } else if (!mo35538v().mo35314a(aghn.f65479ae) || !"_lgclid".equals(str)) {
            mo35538v();
            return 36;
        } else {
            mo35538v();
            return 100;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo35464G() {
        mo35241h();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo35497E().f65567f.mo35435a("Utils falling back to Random for random id");
            }
        }
        this.f65979d.set(nextLong);
    }

    /* renamed from: a */
    public final long mo35721a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo35746c(String str) {
        if (!mo35737a("user property", str)) {
            return 6;
        }
        if (!mo35740a("user property", agka.f65765a, str)) {
            return 15;
        }
        mo35538v();
        if (mo35736a("user property", 24, str)) {
            return 0;
        }
        return 6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo35749d(String str) {
        if (!mo35737a("event param", str)) {
            return 3;
        }
        if (!mo35740a("event param", (String[]) null, str)) {
            return 14;
        }
        mo35538v();
        if (mo35736a("event param", 40, str)) {
            return 0;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final SecureRandom mo35751e() {
        mo35241h();
        if (this.f65978c == null) {
            this.f65978c = new SecureRandom();
        }
        return this.f65978c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo35753g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String k = mo35538v().mo35327k();
        if (!mo35537u().f65291a || !k.equals(mo35542z().getPackageName())) {
            return k.equals(str);
        }
        mo35497E().f65572k.mo35435a("Debug mode not permitted on service");
        return false;
    }

    /* renamed from: n */
    public final int mo35754n() {
        if (this.f65981f == null) {
            int i = rfj.f42871c;
            this.f65981f = Integer.valueOf(rfy.m33553j(mo35542z()) / 1000);
        }
        return this.f65981f.intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final String mo35755o() {
        byte[] bArr = new byte[16];
        mo35751e().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* renamed from: b */
    static boolean m54594b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        return false;
    }

    /* renamed from: f */
    static boolean m54596f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo35743b(String str) {
        if (!mo35737a("event", str)) {
            return 2;
        }
        if (!mo35740a("event", agjy.f65758a, str)) {
            return 13;
        }
        mo35538v();
        if (mo35736a("event", 40, str)) {
            return 0;
        }
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo35752e(String str) {
        mo35241h();
        if (svr.m36484b(mo35542z()).mo26169a(str) == 0) {
            return true;
        }
        mo35497E().f65571j.mo35436a("Permission not granted", str);
        return false;
    }

    /* renamed from: a */
    private final Object m54589a(int i, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(!((Boolean) obj).booleanValue() ? 0 : 1);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return mo35727a(String.valueOf(obj), i, z);
            }
            if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65496av) || !mo35538v().mo35314a(aghn.f65495au) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable instanceof Bundle) {
                    Bundle a = mo35723a((Bundle) parcelable);
                    if (!a.isEmpty()) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object
     arg types: [int, java.lang.Object, int, int]
     candidates:
      agms.a(long, java.lang.String, java.lang.String, long):java.net.URL
      agms.a(int, java.lang.String, java.lang.String, int):void
      agms.a(android.os.Bundle, int, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, java.lang.String, int, java.lang.Object):boolean
      agms.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean
      agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object */
    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Object mo35747c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m54589a(m54598i(str), obj, true, false);
        }
        return m54589a(m54598i(str), obj, false, false);
    }

    /* renamed from: d */
    public final long mo35750d() {
        long andIncrement;
        long j;
        if (this.f65979d.get() == 0) {
            synchronized (this.f65979d) {
                long nextLong = new Random(System.nanoTime() ^ mo35534A().mo20505a()).nextLong();
                int i = this.f65980e + 1;
                this.f65980e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.f65979d) {
            this.f65979d.compareAndSet(-1, 1);
            andIncrement = this.f65979d.getAndIncrement();
        }
        return andIncrement;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo35744b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = mo35745b("user property referrer", str, m54598i(str), obj);
        } else {
            z = mo35745b("user property", str, m54598i(str), obj);
        }
        return !z ? 7 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35748c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            cfjt.m139846c();
            if (TextUtils.isEmpty(str2)) {
                if (this.f65756y.mo35506j()) {
                    mo35497E().f65566e.mo35435a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m54597h(str2)) {
                return true;
            } else {
                mo35497E().f65566e.mo35436a("Invalid admob_app_id. Analytics disabled.", agid.m54288a(str2));
                return false;
            }
        } else if (m54597h(str)) {
            return true;
        } else {
            if (this.f65756y.mo35506j()) {
                mo35497E().f65566e.mo35436a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", agid.m54288a(str));
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo35745b(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo35497E().f65569h.mo35438a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m54590a(Context context) {
        ServiceInfo serviceInfo;
        sdo.m34959a(context);
        int i = Build.VERSION.SDK_INT;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* renamed from: a */
    static boolean m54591a(String str) {
        sdo.m34977c(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: a */
    private static boolean m54592a(String str, String[] strArr) {
        sdo.m34959a(strArr);
        for (String str2 : strArr) {
            if (m54594b(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo35720a(String str, String str2, String str3, Object obj, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str4 = str3;
        Object obj2 = obj;
        Bundle bundle2 = bundle;
        mo35241h();
        if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65497aw)) {
            if (z) {
                mo35538v();
                if (!mo35738a("param", str4, 1000, obj2)) {
                    return 17;
                }
            }
            i = 0;
        } else if (!m54593b(obj)) {
            i = 0;
        } else if (!z) {
            return 21;
        } else {
            if (!m54592a(str4, agjz.f65763c)) {
                return 20;
            }
            agln l = this.f65756y.mo35508l();
            l.mo35241h();
            l.mo35245l();
            if (l.mo35626s() && l.mo35540x().mo35754n() < 200900) {
                return 25;
            }
            mo35538v();
            if (!mo35738a("param", str4, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, obj2)) {
                mo35538v();
                if (obj2 instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj2;
                    if (parcelableArr.length > 200) {
                        bundle2.putParcelableArray(str4, (Parcelable[]) Arrays.copyOf(parcelableArr, (int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR));
                    }
                    i = 17;
                } else {
                    if (obj2 instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) obj2;
                        if (arrayList.size() > 200) {
                            bundle2.putParcelableArrayList(str4, new ArrayList(arrayList.subList(0, BaseMfiEventCallback.TYPE_UNKNOWN_ERROR)));
                        }
                    }
                    i = 17;
                }
            } else {
                i = 0;
            }
        }
        if ((!mo35538v().mo35320c(str, aghn.f65456L) || !m54596f(str2)) && !m54596f(str3)) {
            mo35538v();
            i2 = 100;
        } else {
            mo35538v();
            i2 = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        if (mo35745b("param", str4, i2, obj2)) {
            return i;
        }
        if (!z) {
            return 4;
        }
        boolean z2 = cfik.m139776b() && mo35538v().mo35314a(aghn.f65496av);
        if (!(obj2 instanceof Bundle)) {
            if (obj2 instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj2;
                for (Parcelable parcelable : parcelableArr2) {
                    if (!(parcelable instanceof Bundle)) {
                        mo35497E().f65569h.mo35437a("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str4);
                        return 4;
                    }
                    if (z2) {
                        mo35733a(str, str2, str3, (Bundle) parcelable, list);
                    }
                }
            } else if (!(obj2 instanceof ArrayList)) {
                return 4;
            } else {
                ArrayList arrayList2 = (ArrayList) obj2;
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = arrayList2.get(i3);
                    if (!(obj3 instanceof Bundle)) {
                        mo35497E().f65569h.mo35437a("All ArrayList elements must be of type Bundle. Value type, name", obj3.getClass(), str4);
                        return 4;
                    }
                    if (z2) {
                        mo35733a(str, str2, str3, (Bundle) obj3, list);
                    }
                }
            }
        } else if (z2) {
            mo35733a(str, str2, str3, (Bundle) obj2, list);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo35722a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo35497E().f65567f.mo35436a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo35723a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo35726a(str, bundle.get(str));
                if (a == null) {
                    mo35497E().f65569h.mo35436a("Param value can't be null", mo35541y().mo35424b(str));
                } else {
                    mo35731a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(android.os.Bundle, int, java.lang.String, java.lang.Object):void
     arg types: [android.os.Bundle, int, java.lang.String, boolean]
     candidates:
      agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object
      agms.a(long, java.lang.String, java.lang.String, long):java.net.URL
      agms.a(int, java.lang.String, java.lang.String, int):void
      agms.a(java.lang.String, java.lang.String, int, java.lang.Object):boolean
      agms.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean
      agms.a(android.os.Bundle, int, java.lang.String, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo35724a(String str, String str2, Bundle bundle, List list, boolean z) {
        boolean z2;
        boolean z3;
        Set<String> set;
        int i;
        Bundle bundle2;
        int i2;
        String str3;
        String str4;
        String str5 = str2;
        Bundle bundle3 = bundle;
        List list2 = list;
        if (!cfik.m139776b() || !mo35538v().mo35314a(aghn.f65497aw)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            z3 = m54592a(str5, agjy.f65760c);
        } else {
            z3 = z;
        }
        if (bundle3 == null) {
            return null;
        }
        Bundle bundle4 = new Bundle(bundle3);
        int b = mo35538v().mo35315b();
        if (mo35538v().mo35320c(str, aghn.f65467W)) {
            set = new TreeSet(bundle.keySet());
        } else {
            set = bundle.keySet();
        }
        int i3 = 0;
        for (String str6 : set) {
            if (list2 == null || !list2.contains(str6)) {
                i = mo35749d(str6);
            } else {
                i = 0;
            }
            if (i == 0) {
                String str7 = str6;
                int i4 = b;
                Bundle bundle5 = bundle4;
                int a = mo35720a(str, str2, str6, bundle3.get(str6), bundle4, list, z3);
                if (!z2 || a != 17) {
                    bundle2 = bundle5;
                    if (a != 0 && !"_ev".equals(str7)) {
                        if (a == 21) {
                            str4 = str5;
                        } else {
                            str4 = str7;
                        }
                        mo35730a(bundle2, a, str4, bundle3.get(str7));
                        bundle2.remove(str7);
                        i2 = i4;
                    }
                } else {
                    bundle2 = bundle5;
                    mo35730a(bundle2, 17, str7, (Object) false);
                }
                if (m54591a(str7)) {
                    int i5 = i3 + 1;
                    i2 = i4;
                    if (i5 > i2) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i2);
                        sb.append(" params");
                        mo35497E().f65566e.mo35437a(sb.toString(), mo35541y().mo35422a(str5), mo35541y().mo35421a(bundle3));
                        mo35735a(bundle2, 5);
                        bundle2.remove(str7);
                    }
                    i3 = i5;
                    b = i2;
                    bundle4 = bundle2;
                } else {
                    i2 = i4;
                }
            } else {
                String str8 = str6;
                i2 = b;
                bundle2 = bundle4;
                if (i == 3) {
                    str3 = str8;
                } else {
                    str3 = null;
                }
                mo35730a(bundle2, i, str8, str3);
                bundle2.remove(str8);
            }
            b = i2;
            bundle4 = bundle2;
        }
        return bundle4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle
     arg types: [java.lang.String, java.lang.String, android.os.Bundle, java.util.List, int]
     candidates:
      agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.lang.String, long):com.google.android.gms.measurement.internal.EventParcel
      agms.a(java.lang.String, int, java.lang.String, java.lang.String, int):void
      agms.a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, java.util.List):void
      agms.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final EventParcel mo35725a(String str, String str2, Bundle bundle, String str3, long j) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo35743b(str2) == 0) {
            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
            bundle2.putString("_o", str3);
            return new EventParcel(str2, new EventParams(mo35723a(mo35724a(str, str2, bundle2, Collections.singletonList("_o"), false))), str3, j);
        }
        mo35497E().f65564c.mo35436a("Invalid conditional property event name", mo35541y().mo35426c(str2));
        throw new IllegalArgumentException();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object
     arg types: [?, java.lang.Object, int, int]
     candidates:
      agms.a(long, java.lang.String, java.lang.String, long):java.net.URL
      agms.a(int, java.lang.String, java.lang.String, int):void
      agms.a(android.os.Bundle, int, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, java.lang.String, int, java.lang.Object):boolean
      agms.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean
      agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object
     arg types: [int, java.lang.Object, int, int]
     candidates:
      agms.a(long, java.lang.String, java.lang.String, long):java.net.URL
      agms.a(int, java.lang.String, java.lang.String, int):void
      agms.a(android.os.Bundle, int, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, java.lang.String, int, java.lang.Object):boolean
      agms.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean
      agms.a(int, java.lang.Object, boolean, boolean):java.lang.Object */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Object mo35726a(String str, Object obj) {
        boolean equals = "_ev".equals(str);
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        if (equals) {
            mo35538v();
            return m54589a((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES, obj, true, true);
        }
        if (m54596f(str)) {
            mo35538v();
        } else {
            mo35538v();
            i = 100;
        }
        return m54589a(i, obj, false, true);
    }

    /* renamed from: a */
    public final String mo35727a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    public final URL mo35728a(long j, String str, String str2, long j2) {
        try {
            sdo.m34977c(str2);
            sdo.m34977c(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j), Integer.valueOf(mo35754n())), str2, str, Long.valueOf(j2));
            if (str.equals(mo35538v().mo35313a("debug.deferred.deeplink", ""))) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo35497E().f65564c.mo35436a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo35729a(int i, String str, String str2, int i2) {
        mo35732a((String) null, i, str, str2, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agms.a(java.lang.String, int, boolean):java.lang.String
     arg types: [java.lang.String, int, int]
     candidates:
      agms.a(android.os.Bundle, java.lang.String, java.lang.Object):void
      agms.a(java.lang.String, int, java.lang.String):boolean
      agms.a(java.lang.String, java.lang.String[], java.lang.String):boolean
      agms.a(java.lang.String, int, boolean):java.lang.String */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35730a(Bundle bundle, int i, String str, Object obj) {
        if (mo35735a(bundle, i)) {
            mo35538v();
            bundle.putString("_ev", mo35727a(str, 40, true));
            if (obj != null) {
                sdo.m34959a(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35731a(Bundle bundle, String str, Object obj) {
        String str2;
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (cfik.m139776b() && mo35538v().mo35314a(aghn.f65496av) && mo35538v().mo35314a(aghn.f65495au) && (obj instanceof Bundle[])) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            if (obj != null) {
                str2 = obj.getClass().getSimpleName();
            } else {
                str2 = null;
            }
            mo35497E().f65569h.mo35437a("Not putting event parameter. Invalid value type. name, type", mo35541y().mo35424b(str), str2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35732a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        mo35735a(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        agje agje = this.f65756y;
        if (!agje.f65690f.f65291a) {
            agje.mo35501e().mo35570a("auto", "_err", bundle);
        } else if (!TextUtils.isEmpty(str)) {
            this.f65756y.mo35501e().mo35571a("auto", "_err", bundle, str);
        } else {
            this.f65756y.mo35497E().f65564c.mo35435a("Null appId when logging error event on package side");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35733a(String str, String str2, String str3, Bundle bundle, List list) {
        int i;
        int i2;
        String str4;
        String str5;
        int i3;
        String str6;
        int i4;
        String str7 = str2;
        Bundle bundle2 = bundle;
        List list2 = list;
        if (bundle2 != null) {
            boolean a = mo35538v().mo35314a(aghn.f65497aw);
            if (a) {
                mo35538v();
                i = 0;
            } else {
                i = mo35538v().mo35315b();
            }
            int i5 = 0;
            for (String str8 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str8)) {
                    i2 = mo35749d(str8);
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    if (m54593b(bundle2.get(str8))) {
                        mo35497E().f65569h.mo35438a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str7, str3, str8);
                        i3 = 22;
                        str5 = str8;
                    } else {
                        str5 = str8;
                        i3 = mo35720a(str, str2, str8, bundle2.get(str8), bundle, list, false);
                    }
                    if (i3 != 0 && !"_ev".equals(str5)) {
                        mo35730a(bundle2, i3, str5, bundle2.get(str5));
                        bundle2.remove(str5);
                    } else if (m54591a(str5) && (!a || !m54592a(str5, agjz.f65764d))) {
                        int i6 = i5 + 1;
                        if (i6 > i) {
                            if (!a) {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i);
                                sb.append(" custom params");
                                str6 = sb.toString();
                            } else {
                                str6 = "Item cannot contain custom parameters";
                            }
                            mo35497E().f65566e.mo35437a(str6, mo35541y().mo35422a(str7), mo35541y().mo35421a(bundle2));
                            if (!a) {
                                i4 = 5;
                            } else {
                                i4 = 23;
                            }
                            mo35735a(bundle2, i4);
                            bundle2.remove(str5);
                        }
                        i5 = i6;
                    }
                } else {
                    String str9 = str8;
                    if (i2 == 3) {
                        str4 = str9;
                    } else {
                        str4 = null;
                    }
                    mo35730a(bundle2, i2, str9, str4);
                    bundle2.remove(str9);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35734a(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = svr.m36484b(context).mo26176b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e) {
            mo35497E().f65564c.mo35436a("Error obtaining certificate", e);
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            mo35497E().f65564c.mo35436a("Package name not found", e2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35735a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35736a(String str, int i, String str2) {
        if (str2 == null) {
            mo35497E().f65566e.mo35436a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo35497E().f65566e.mo35438a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35737a(String str, String str2) {
        if (str2 == null) {
            mo35497E().f65566e.mo35436a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo35497E().f65566e.mo35436a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt) && codePointAt != 95) {
                mo35497E().f65566e.mo35437a("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo35497E().f65566e.mo35437a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35738a(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else if (!(obj instanceof ArrayList)) {
            return true;
        } else {
            i2 = ((ArrayList) obj).size();
        }
        if (i2 <= i) {
            return true;
        }
        mo35497E().f65569h.mo35438a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35739a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (!TextUtils.isEmpty(str4)) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35740a(String str, String[] strArr, String str2) {
        if (str2 != null) {
            sdo.m34959a((Object) str2);
            String[] strArr2 = f65977b;
            int length = strArr2.length;
            int i = 0;
            while (i < length) {
                if (!str2.startsWith(strArr2[i])) {
                    i++;
                } else {
                    mo35497E().f65566e.mo35437a("Name starts with reserved prefix. Type, name", str, str2);
                    return false;
                }
            }
            if (strArr == null || !m54592a(str2, strArr)) {
                return true;
            }
            mo35497E().f65566e.mo35437a("Name is reserved. Type, name", str, str2);
            return false;
        }
        mo35497E().f65566e.mo35436a("Name is required and can't be null. Type", str);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo35741a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle[] mo35742a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }
}
