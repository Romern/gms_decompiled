package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ajge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajge {

    /* renamed from: e */
    public static final /* synthetic */ int f70556e = 0;

    /* renamed from: f */
    private static final ClientAppIdentifier f70557f = ClientAppIdentifier.m67375a("com.google.android.gms");

    /* renamed from: a */
    public final aixw f70558a;

    /* renamed from: b */
    public final Map f70559b = new HashMap();

    /* renamed from: c */
    public final Context f70560c;

    /* renamed from: d */
    public final aiwj f70561d;

    public ajge(Context context, ClientAppIdentifier clientAppIdentifier, aiwj aiwj) {
        this.f70560c = context;
        this.f70561d = aiwj;
        if (f70557f.equals(clientAppIdentifier)) {
            srn srn = ahfq.f67120a;
            this.f70558a = null;
            return;
        }
        this.f70558a = new aixw(context, clientAppIdentifier, aiwj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Collection mo38593a() {
        aixw aixw = this.f70558a;
        if (aixw == null) {
            return this.f70559b.values();
        }
        return Collections.singletonList(aixw);
    }
}
