package p000;

import android.net.Uri;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axqy implements axoq {

    /* renamed from: a */
    private Uri f96283a;

    /* renamed from: b */
    private byte[] f96284b;

    /* renamed from: c */
    private Map f96285c;

    public axqy(axoq axoq) {
        this.f96283a = axoq.mo53317a();
        this.f96284b = axoq.mo53318b();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : axoq.mo53319c().entrySet()) {
            if (entry.getKey() != null) {
                hashMap.put((String) entry.getKey(), (axor) ((axor) entry.getValue()).mo7556bF());
            }
        }
        this.f96285c = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final Uri mo53317a() {
        return this.f96283a;
    }

    /* renamed from: b */
    public final byte[] mo53318b() {
        throw null;
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return this;
    }

    /* renamed from: c */
    public final Map mo53319c() {
        throw null;
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder sb = new StringBuilder("DataItemEntity{ ");
        String valueOf = String.valueOf(this.f96283a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        byte[] bArr = this.f96284b;
        if (bArr != null) {
            obj = Integer.valueOf(bArr.length);
        } else {
            obj = "null";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = this.f96285c.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !this.f96285c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : this.f96285c.entrySet()) {
                String str2 = (String) entry.getKey();
                String a = ((axor) entry.getValue()).mo53320a();
                int length = str.length();
                StringBuilder sb5 = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(a).length());
                sb5.append(str);
                sb5.append(str2);
                sb5.append(": ");
                sb5.append(a);
                sb.append(sb5.toString());
                str = ", ";
            }
            sb.append("]");
        }
        sb.append(" }");
        return sb.toString();
    }
}
