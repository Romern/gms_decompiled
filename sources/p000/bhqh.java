package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bhqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqh {

    /* renamed from: a */
    public static final List f119307a = new ArrayList();

    /* renamed from: b */
    public final String f119308b;

    /* renamed from: c */
    public final int f119309c;

    /* renamed from: d */
    public final String f119310d;

    /* renamed from: e */
    public final float f119311e;

    /* renamed from: f */
    public final float f119312f;

    /* renamed from: g */
    public final List f119313g;

    /* renamed from: h */
    public final int f119314h;

    /* renamed from: i */
    public final bhua f119315i;

    /* renamed from: j */
    public final boolean f119316j;

    public bhqh(String str, int i, String str2, List list, int i2, float f, float f2, bhua bhua, boolean z) {
        this.f119308b = str;
        this.f119309c = i;
        this.f119310d = str2;
        this.f119313g = list;
        this.f119314h = i2;
        this.f119311e = f;
        this.f119312f = f2;
        this.f119315i = bhua;
        this.f119316j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bhqh) {
            bhqh bhqh = (bhqh) obj;
            return bhxi.m101705a(this.f119308b, bhqh.f119308b) && this.f119309c == bhqh.f119309c && bhxi.m101705a(this.f119310d, bhqh.f119310d) && this.f119311e == bhqh.f119311e && this.f119312f == bhqh.f119312f && bhxi.m101705a(this.f119313g, bhqh.f119313g) && this.f119314h == bhqh.f119314h && bhxi.m101705a(this.f119315i, bhqh.f119315i) && this.f119316j == bhqh.f119316j;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119308b, Integer.valueOf(this.f119309c), Integer.valueOf(this.f119314h)});
    }

    public final String toString() {
        String str = this.f119308b;
        int i = this.f119309c;
        String str2 = this.f119310d;
        float f = this.f119311e;
        float f2 = this.f119312f;
        String valueOf = String.valueOf(this.f119313g);
        int i2 = this.f119314h;
        String valueOf2 = String.valueOf(this.f119315i);
        boolean z = this.f119316j;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE + length2 + length3 + String.valueOf(valueOf2).length());
        sb.append("PlaceInference{placeId=");
        sb.append(str);
        sb.append(" highLevelCategoryId=");
        sb.append(i);
        sb.append(" parentPlaceId=");
        sb.append(str2);
        sb.append(" likelihood=");
        sb.append(f);
        sb.append(" hierarchyLikelihood=");
        sb.append(f2);
        sb.append(" descendantPlaceIds=");
        sb.append(valueOf);
        sb.append(" hierarchyLevel=");
        sb.append(i2);
        sb.append(" debugData=");
        sb.append(valueOf2);
        sb.append("isSensitivePlace=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
