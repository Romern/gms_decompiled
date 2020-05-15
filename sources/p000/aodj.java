package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.plus.service.v1whitelisted.models.ActivityEntity;
import java.util.Formatter;

/* renamed from: aodj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aodj extends shd {

    /* renamed from: a */
    private final shj f78220a;

    public aodj(shj shj) {
        this.f78220a = shj;
        shj.f44447g = 6400;
    }

    /* renamed from: a */
    public final ActivityEntity mo42553a(ClientContext clientContext, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, String str4, ActivityEntity activityEntity) {
        StringBuilder sb = new StringBuilder();
        new Formatter(sb).format("people/%1$s/activities", shd.m35267a(str));
        if (str2 != null) {
            shd.m35269a(sb, "contextType", shd.m35267a(str2));
        }
        if (str3 != null) {
            shd.m35269a(sb, "language", shd.m35267a(str3));
        }
        shd.m35269a(sb, "notifyCircles", String.valueOf(bool));
        shd.m35269a(sb, "preview", String.valueOf(bool2));
        if (bool3 != null) {
            shd.m35269a(sb, "shareOnGooglePlus", String.valueOf(bool3));
        }
        if (str4 != null) {
            shd.m35269a(sb, "source", shd.m35267a(str4));
        }
        return (ActivityEntity) this.f78220a.mo25536a(clientContext, 1, sb.toString(), activityEntity, ActivityEntity.class);
    }
}
