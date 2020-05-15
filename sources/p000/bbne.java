package p000;

import android.util.Log;

/* renamed from: bbne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbne implements bbnd {

    /* renamed from: a */
    private final bxvq f102944a;

    public bbne(bxvq bxvq) {
        bmxy.m108589a(bxvq.mo14342a(0) != null, "EnumMap must have a value for number 0");
        this.f102944a = bxvq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo56228a(Object obj) {
        return ((bxvp) obj).mo3214a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo56229a(Integer num) {
        if (num == null) {
            String valueOf = String.valueOf((Object) null);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown event code ");
            sb.append(valueOf);
            sb.append("!");
            Log.e("SyncMetadata", sb.toString());
            return this.f102944a.mo14342a(0);
        }
        bxvp a = this.f102944a.mo14342a(num.intValue());
        if (a != null) {
            return a;
        }
        return this.f102944a.mo14342a(0);
    }
}
