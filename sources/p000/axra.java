package p000;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: axra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axra extends rtr implements axoq {

    /* renamed from: d */
    private final int f96286d;

    public axra(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f96286d = i2;
    }

    /* renamed from: a */
    public final Uri mo53317a() {
        return Uri.parse(mo25151d("path"));
    }

    /* renamed from: b */
    public final byte[] mo53318b() {
        return mo25152e("data");
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        return new axqy(this);
    }

    /* renamed from: c */
    public final Map mo53319c() {
        HashMap hashMap = new HashMap(this.f96286d);
        for (int i = 0; i < this.f96286d; i++) {
            axqx axqx = new axqx(this.f43672a, this.f43673b + i);
            if (axqx.mo53321b() != null) {
                hashMap.put(axqx.mo53321b(), axqx);
            }
        }
        return hashMap;
    }

    public final String toString() {
        Object obj;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        byte[] b = mo53318b();
        Map c = mo53319c();
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        String valueOf = String.valueOf(mo53317a());
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb2.append("uri=");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        if (b != null) {
            obj = Integer.valueOf(b.length);
        } else {
            obj = "null";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(valueOf2);
        sb.append(sb3.toString());
        int size = c.size();
        StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        if (isLoggable && !c.isEmpty()) {
            sb.append(", assets=[");
            String str = "";
            for (Map.Entry entry : c.entrySet()) {
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
