package p000;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: chi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chi implements chd {

    /* renamed from: a */
    public static final Bitmap.Config[] f6857a;

    /* renamed from: b */
    public static final Bitmap.Config[] f6858b;

    /* renamed from: c */
    public static final Bitmap.Config[] f6859c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    public static final Bitmap.Config[] f6860d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    public static final Bitmap.Config[] f6861e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    public final chh f6862f = new chh();

    /* renamed from: g */
    public final cgx f6863g = new cgx();

    /* renamed from: h */
    private final Map f6864h = new HashMap();

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        int i = Build.VERSION.SDK_INT;
        Bitmap.Config[] configArr2 = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
        configArr2[configArr2.length - 1] = Bitmap.Config.RGBA_F16;
        f6857a = configArr2;
        f6858b = configArr2;
    }

    /* renamed from: a */
    static String m4271a(int i, Bitmap.Config config) {
        String valueOf = String.valueOf(config);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f6863g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f6864h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f6864h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: a */
    public final NavigableMap mo3899a(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f6864h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6864h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public final void mo3900a(Integer num, Bitmap bitmap) {
        NavigableMap a = mo3899a(bitmap.getConfig());
        Integer num2 = (Integer) a.get(num);
        if (num2 == null) {
            String valueOf = String.valueOf(num);
            String a2 = m4271a(crd.m7389a(bitmap), bitmap.getConfig());
            String valueOf2 = String.valueOf(this);
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 56 + String.valueOf(a2).length() + String.valueOf(valueOf2).length());
            sb.append("Tried to decrement empty size, size: ");
            sb.append(valueOf);
            sb.append(", removed: ");
            sb.append(a2);
            sb.append(", this: ");
            sb.append(valueOf2);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }
}
