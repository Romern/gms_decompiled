package p000;

import android.location.Location;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.util.List;

/* renamed from: auiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auiu extends auja {

    /* renamed from: a */
    public final long f91920a;

    /* renamed from: b */
    public List f91921b;

    /* renamed from: c */
    public Location f91922c;

    public auiu(auiq auiq, long j) {
        super(auiq);
        this.f91920a = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bM */
    public final String mo50562bM() {
        String bM = super.mo50562bM();
        long j = this.f91920a;
        StringBuilder sb = new StringBuilder(String.valueOf(bM).length() + 21);
        sb.append(bM);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final aufq mo50573d() {
        return ((auiq) this.f91931i).f91895a;
    }

    /* renamed from: e */
    public final EmergencyInfo mo50574e() {
        return ((auiq) this.f91931i).f91899e;
    }
}
