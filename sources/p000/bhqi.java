package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqi {

    /* renamed from: a */
    public static final List f119317a = new ArrayList(0);

    /* renamed from: b */
    public final List f119318b;

    /* renamed from: c */
    public final int f119319c;

    /* renamed from: d */
    public final long f119320d;

    /* renamed from: e */
    public final String f119321e;

    /* renamed from: f */
    public final int f119322f;

    /* renamed from: g */
    public final boolean f119323g;

    /* renamed from: h */
    public final boolean f119324h = false;

    /* renamed from: i */
    public final boolean f119325i;

    /* renamed from: j */
    public final bhub f119326j;

    /* renamed from: k */
    public final int f119327k;

    public bhqi(List list, long j, String str, int i, boolean z, boolean z2, int i2, int i3, bhub bhub) {
        this.f119318b = list;
        this.f119327k = i2;
        this.f119319c = i3;
        this.f119320d = j;
        this.f119321e = str;
        this.f119322f = i;
        this.f119323g = z;
        this.f119325i = z2;
        this.f119326j = bhub;
    }

    /* renamed from: a */
    public static bhqi m101332a(List list, long j, String str, int i, boolean z, boolean z2, int i2, int i3, bhub bhub) {
        return new bhqi(list, j, str, i, z, z2, i2, i3, bhub);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhqi) {
            bhqi bhqi = (bhqi) obj;
            if (this.f119320d == bhqi.f119320d && this.f119322f == bhqi.f119322f && this.f119318b.equals(bhqi.f119318b) && this.f119327k == bhqi.f119327k && this.f119319c == bhqi.f119319c && bhxi.m101705a(this.f119321e, bhqi.f119321e) && this.f119323g == bhqi.f119323g) {
                boolean z = bhqi.f119324h;
                return this.f119325i == bhqi.f119325i && bhxi.m101705a(this.f119326j, bhqi.f119326j);
            }
        }
    }

    public final int hashCode() {
        long j = this.f119320d;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.f119320d;
        String valueOf = String.valueOf(this.f119318b);
        int i = this.f119327k;
        String valueOf2 = String.valueOf(i != 0 ? Integer.toString(i - 1) : "null");
        int i2 = this.f119319c;
        String str = this.f119321e;
        int i3 = this.f119322f;
        boolean z = this.f119323g;
        boolean z2 = this.f119325i;
        String valueOf3 = String.valueOf(this.f119326j);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + PSKKeyManager.MAX_KEY_LENGTH_BYTES + length2 + String.valueOf(str).length() + String.valueOf(valueOf3).length());
        sb.append("PlaceInferenceResult { millisSinceBoot=");
        sb.append(j);
        sb.append(" placeInferences=");
        sb.append(valueOf);
        sb.append(" modelVersion=");
        sb.append(valueOf2);
        sb.append(" modelWeightsVersion=");
        sb.append(i2);
        sb.append(" accountName=");
        sb.append(str);
        sb.append(" statusCode=");
        sb.append(i3);
        sb.append(" isFromMockProvider=");
        sb.append(z);
        sb.append(" isComputedByHomeWorkDetector=false isFromCheckIn=");
        sb.append(z2);
        sb.append(" checkInCentroid=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
