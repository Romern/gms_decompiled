package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: axos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axos {

    /* renamed from: a */
    public final HashMap f96223a = new HashMap();

    /* renamed from: a */
    public static axos m82822a(byte[] bArr) {
        try {
            ayjj ayjj = new ayjj((ayjy) GeneratedMessageLite.m124016a(ayjy.f97807b, bArr, bxus.m123744c()), new ArrayList());
            axos axos = new axos();
            bxwc bxwc = ayjj.f97759a.f97809a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ayjx ayjx = (ayjx) bxwc.get(i);
                List list = ayjj.f97760b;
                String str = ayjx.f97804b;
                ayjw ayjw = ayjx.f97805c;
                if (ayjw == null) {
                    ayjw = ayjw.f97795d;
                }
                ayjk.m84110a(list, axos, str, ayjw);
            }
            return axos;
        } catch (bxwf e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    /* renamed from: b */
    public final int mo53334b() {
        return this.f96223a.size();
    }

    /* renamed from: c */
    public final String mo53337c(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m82823a(str, obj, "String", e);
            return null;
        }
    }

    /* renamed from: d */
    public final ArrayList mo53340d(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m82823a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    /* renamed from: e */
    public final ArrayList mo53341e(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m82823a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof axos)) {
            return false;
        }
        axos axos = (axos) obj;
        if (mo53334b() != axos.mo53334b()) {
            return false;
        }
        for (String str : mo53338c()) {
            Object b = mo53335b(str);
            Object b2 = axos.mo53335b(str);
            if (b instanceof Asset) {
                if (!(b2 instanceof Asset)) {
                    return false;
                }
                Asset asset = (Asset) b;
                Asset asset2 = (Asset) b2;
                if (asset != null && asset2 != null) {
                    if (!TextUtils.isEmpty(asset.f110861b)) {
                        z = asset.f110861b.equals(asset2.f110861b);
                    } else {
                        z = Arrays.equals(asset.f110860a, asset2.f110860a);
                    }
                    if (!z) {
                        return false;
                    }
                } else if (asset != asset2) {
                    return false;
                }
            } else if (b instanceof String[]) {
                if (!(b2 instanceof String[]) || !Arrays.equals((String[]) b, (String[]) b2)) {
                    return false;
                }
            } else if (b instanceof long[]) {
                if (!(b2 instanceof long[]) || !Arrays.equals((long[]) b, (long[]) b2)) {
                    return false;
                }
            } else if (b instanceof float[]) {
                if (!(b2 instanceof float[]) || !Arrays.equals((float[]) b, (float[]) b2)) {
                    return false;
                }
            } else if (b instanceof byte[]) {
                if (!(b2 instanceof byte[]) || !Arrays.equals((byte[]) b, (byte[]) b2)) {
                    return false;
                }
            } else if (b == null || b2 == null) {
                if (b != b2) {
                    return false;
                }
                return true;
            } else if (!b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final byte[] mo53343f(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            m82823a(str, obj, "byte[]", e);
            return null;
        }
    }

    /* renamed from: g */
    public final boolean mo53344g(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            m82824a(str, obj, "Boolean", false, e);
            return false;
        }
    }

    /* renamed from: h */
    public final int mo53345h(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            m82823a(str, obj, "Integer", e);
            return 0;
        }
    }

    public final int hashCode() {
        return this.f96223a.hashCode() * 29;
    }

    /* renamed from: i */
    public final long mo53347i(String str) {
        Object obj = this.f96223a.get(str);
        if (obj == null) {
            return 0;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            m82823a(str, obj, "long", e);
            return 0;
        }
    }

    public final String toString() {
        return this.f96223a.toString();
    }

    /* renamed from: b */
    public final Object mo53335b(String str) {
        return this.f96223a.get(str);
    }

    /* renamed from: b */
    public final void mo53336b(String str, ArrayList arrayList) {
        this.f96223a.put(str, arrayList);
    }

    /* renamed from: c */
    public final Set mo53338c() {
        return this.f96223a.keySet();
    }

    /* renamed from: c */
    public final void mo53339c(String str, ArrayList arrayList) {
        this.f96223a.put(str, arrayList);
    }

    /* renamed from: a */
    public static final void m82823a(String str, Object obj, String str2, ClassCastException classCastException) {
        m82824a(str, obj, str2, "<null>", classCastException);
    }

    /* renamed from: a */
    public static final void m82824a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w("DataMap", "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w("DataMap", "Attempt to cast generated internal exception:", classCastException);
    }

    /* renamed from: a */
    public final void mo53322a(axos axos) {
        for (String str : axos.mo53338c()) {
            this.f96223a.put(str, axos.mo53335b(str));
        }
    }

    /* renamed from: a */
    public final void mo53323a(String str, double d) {
        this.f96223a.put(str, Double.valueOf(d));
    }

    /* renamed from: a */
    public final void mo53324a(String str, float f) {
        this.f96223a.put(str, Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo53325a(String str, int i) {
        this.f96223a.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo53326a(String str, long j) {
        this.f96223a.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo53327a(String str, axos axos) {
        this.f96223a.put(str, axos);
    }

    /* renamed from: a */
    public final void mo53328a(String str, String str2) {
        this.f96223a.put(str, str2);
    }

    /* renamed from: a */
    public final void mo53329a(String str, ArrayList arrayList) {
        this.f96223a.put(str, arrayList);
    }

    /* renamed from: a */
    public final void mo53330a(String str, boolean z) {
        this.f96223a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo53331a(String str, byte[] bArr) {
        this.f96223a.put(str, bArr);
    }

    /* renamed from: a */
    public final boolean mo53332a(String str) {
        return this.f96223a.containsKey(str);
    }

    /* renamed from: a */
    public final byte[] mo53333a() {
        return ayjk.m84108a(this).f97759a.serializeToBytes();
    }
}
