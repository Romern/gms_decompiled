package p000;

import android.content.Context;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.io.Closeable;
import java.util.Map;
import java.util.Set;

/* renamed from: ajbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajbr implements Closeable {

    /* renamed from: a */
    private final Context f70340a;

    /* renamed from: b */
    private final Map f70341b = new C1223np();

    /* renamed from: c */
    private final ajbe f70342c;

    public ajbr(Context context, ajbe ajbe) {
        this.f70340a = context;
        this.f70342c = ajbe;
    }

    /* renamed from: a */
    public final ajbs mo38453a(ClientAppIdentifier clientAppIdentifier) {
        ajbs ajbs = (ajbs) this.f70341b.get(clientAppIdentifier);
        if (ajbs != null) {
            return ajbs;
        }
        Context context = this.f70340a;
        ajbs ajbs2 = new ajbs(context, clientAppIdentifier, new ajbk(this.f70342c.f70318a, clientAppIdentifier));
        ((aixb) ahgz.m55754a(context, aixb.class)).mo38196a(ajbs2);
        this.f70341b.put(clientAppIdentifier, ajbs2);
        return ajbs2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Set mo38455b() {
        return this.f70341b.entrySet();
    }

    public final void close() {
        for (ajbs ajbs : this.f70341b.values()) {
            ajbs.close();
        }
    }

    /* renamed from: a */
    public final Set mo38454a() {
        return this.f70341b.keySet();
    }
}
