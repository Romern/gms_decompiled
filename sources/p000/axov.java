package p000;

import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: axov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axov {

    /* renamed from: a */
    public final axos f96224a = new axos();

    /* renamed from: b */
    private final PutDataRequest f96225b;

    private axov(PutDataRequest putDataRequest) {
        this.f96225b = putDataRequest;
    }

    /* renamed from: a */
    public static axov m82850a(String str) {
        rzz.m34727a(str, "path must not be null");
        return new axov(PutDataRequest.m94392a(str));
    }

    /* renamed from: a */
    public final PutDataRequest mo53349a() {
        ayjj a = ayjk.m84108a(this.f96224a);
        this.f96225b.f110876c = a.f97759a.serializeToBytes();
        int size = a.f97760b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = (Asset) a.f97760b.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                sb.append("asset key cannot be null: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (asset == null) {
                throw new IllegalStateException(num.length() == 0 ? new String("asset cannot be null: key=") : "asset cannot be null: key=".concat(num));
            } else {
                if (Log.isLoggable("DataMap", 3)) {
                    String valueOf2 = String.valueOf(asset);
                    StringBuilder sb2 = new StringBuilder(num.length() + 33 + String.valueOf(valueOf2).length());
                    sb2.append("asPutDataRequest: adding asset: ");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(valueOf2);
                    Log.d("DataMap", sb2.toString());
                }
                this.f96225b.mo60252a(num, asset);
                i++;
            }
        }
        return this.f96225b;
    }
}
