package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxf {

    /* renamed from: f */
    private static final Map f96638f = Collections.emptyMap();

    /* renamed from: a */
    public final String f96639a;

    /* renamed from: b */
    public final String f96640b;

    /* renamed from: c */
    public final Uri f96641c;

    /* renamed from: d */
    public byte[] f96642d;

    /* renamed from: e */
    public long f96643e;

    /* renamed from: g */
    private Map f96644g;

    public axxf(String str, String str2) {
        this(str, str2, 0);
    }

    /* renamed from: a */
    public final String mo53709a(boolean z) {
        int i;
        Object obj;
        StringBuilder sb = new StringBuilder("DataItemInternal{ ");
        int hashCode = ((this.f96639a.hashCode() * 31) + this.f96640b.hashCode()) * 31;
        Map map = this.f96644g;
        int size = map.size();
        for (Map.Entry entry : map.entrySet()) {
            size = (size * 31) + ((String) entry.getKey()).hashCode();
            if (((axuh) entry.getValue()).f96387b != null) {
                size = (size * 31) + ((axuh) entry.getValue()).f96387b.hashCode();
            }
        }
        int i2 = (hashCode + size) * 31;
        byte[] bArr = this.f96642d;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        String valueOf = String.valueOf(Integer.toHexString(i2 + i));
        sb.append(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf));
        String valueOf2 = String.valueOf(this.f96639a);
        sb.append(valueOf2.length() == 0 ? new String(", host=") : ", host=".concat(valueOf2));
        String valueOf3 = String.valueOf(this.f96640b);
        sb.append(valueOf3.length() == 0 ? new String(", path=") : ", path=".concat(valueOf3));
        long j = this.f96643e;
        StringBuilder sb2 = new StringBuilder(31);
        sb2.append(", deadline=");
        sb2.append(j);
        sb.append(sb2.toString());
        byte[] bArr2 = this.f96642d;
        if (bArr2 != null) {
            obj = Integer.valueOf(bArr2.length);
        } else {
            obj = "null";
        }
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf4);
        sb.append(sb3.toString());
        int size2 = this.f96644g.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size2);
        sb.append(sb4.toString());
        if (z && !this.f96644g.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry2 : this.f96644g.entrySet()) {
                String str2 = (String) entry2.getKey();
                String valueOf5 = String.valueOf(entry2.getValue());
                StringBuilder sb5 = new StringBuilder(str.length() + 2 + String.valueOf(str2).length() + String.valueOf(valueOf5).length());
                sb5.append(str);
                sb5.append(str2);
                sb5.append(": ");
                sb5.append(valueOf5);
                sb.append(sb5.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }

    public final String toString() {
        return mo53709a(Log.isLoggable("DataItem", 3));
    }

    public axxf(String str, String str2, long j) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("host must not be empty");
        } else if (!TextUtils.isEmpty(str2)) {
            this.f96644g = f96638f;
            this.f96642d = null;
            Uri build = new Uri.Builder().scheme("wear").authority(str).path(str2).build();
            this.f96641c = build;
            this.f96639a = build.getHost();
            this.f96640b = this.f96641c.getPath();
            this.f96643e = j;
        } else {
            throw new IllegalArgumentException("path must not be empty");
        }
    }

    /* renamed from: a */
    public final Map mo53710a() {
        HashMap hashMap = new HashMap();
        for (String str : this.f96644g.keySet()) {
            hashMap.put(str, (axuh) this.f96644g.get(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final void mo53711a(String str, axuh axuh) {
        if (this.f96644g == f96638f) {
            this.f96644g = new HashMap();
        }
        this.f96644g.put(str, axuh);
    }
}
