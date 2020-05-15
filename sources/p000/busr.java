package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.util.logging.Level;

/* renamed from: busr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class busr extends bnsn {

    /* renamed from: a */
    public static final busr f154819a = new busr(bntd.m110367a("NearbyShared"));

    public busr(bnsx bnsx) {
        super(bnsx);
    }

    /* renamed from: a */
    public static String m120395a(aiaa aiaa) {
        if (aiaa == null) {
            return "StoredDiscoveryItem{}";
        }
        String str = aiaa.f68519g;
        String str2 = aiaa.f68520h;
        String str3 = aiaa.f68517e;
        int i = aiaa.f68528p;
        long j = aiaa.f68524l;
        long j2 = aiaa.f68523k;
        long j3 = aiaa.f68506D;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + MfiClientException.TYPE_NO_ACCOUNT_INFO + length2 + String.valueOf(str3).length());
        sb.append("StoredDiscoveryItem{");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", address=");
        sb.append(str3);
        sb.append(", rssi=");
        sb.append(i);
        sb.append(", first found=");
        sb.append(j);
        sb.append(", last found=");
        sb.append(j2);
        sb.append(", last lost=");
        sb.append(j3);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final bnsl mo26019b(Level level) {
        return mo68389c(level) ? new busq(this, level) : bnsn.f132081c;
    }
}
