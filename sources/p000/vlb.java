package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.internal.model.About;

/* renamed from: vlb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vlb extends shd {

    /* renamed from: a */
    private final shj f49431a;

    public vlb(shj shj) {
        this.f49431a = shj;
    }

    /* renamed from: a */
    public final About mo28609a(ClientContext clientContext, Boolean bool, Boolean bool2, Long l, Boolean bool3, Boolean bool4, String str, Long l2, Integer num, shc shc) {
        StringBuilder sb = new StringBuilder("about");
        shc.mo25531a(sb);
        if (bool != null) {
            shd.m35269a(sb, "errorRecovery", String.valueOf(bool));
        }
        if (bool2 != null) {
            shd.m35269a(sb, "includeSubscribed", String.valueOf(bool2));
        }
        if (l != null) {
            shd.m35269a(sb, "maxChangeIdCount", String.valueOf(l));
        }
        if (bool3 != null) {
            shd.m35269a(sb, "mutationPrecondition", String.valueOf(bool3));
        }
        if (bool4 != null) {
            shd.m35269a(sb, "openDrive", String.valueOf(bool4));
        }
        if (str != null) {
            shd.m35269a(sb, "reason", shd.m35267a(str));
        }
        if (l2 != null) {
            shd.m35269a(sb, "startChangeId", String.valueOf(l2));
        }
        if (num != null) {
            shd.m35269a(sb, "syncType", String.valueOf(num));
        }
        return (About) this.f49431a.mo25536a(clientContext, 0, sb.toString(), (Object) null, About.class);
    }
}
