package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: niv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class niv {

    /* renamed from: a */
    public static final bnsn f35775a = odk.m28481a("CAR.CAM.TASK");

    /* renamed from: f */
    private static int f35776f;

    /* renamed from: b */
    public final int f35777b;

    /* renamed from: c */
    public final nip f35778c;

    /* renamed from: d */
    public final ComponentName f35779d;

    /* renamed from: e */
    protected final List f35780e = new ArrayList();

    public niv(nip nip, ComponentName componentName) {
        int i = f35776f;
        f35776f = i + 1;
        this.f35777b = i;
        this.f35778c = nip;
        this.f35779d = componentName;
    }

    /* renamed from: a */
    private static Pair m26485a(nin nin, Context context, opo opo) {
        boolean z;
        Bundle bundle = nin.f35743c;
        if (bundle != null) {
            niq niq = new niq(bundle);
            String str = niq.f35751a;
            if (str != null) {
                boolean z2 = true;
                try {
                    Context createPackageContext = context.createPackageContext(str, 0);
                    int i = niq.f35752b;
                    int i2 = niq.f35753c;
                    if (i != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (i2 != 0) {
                        z2 = false;
                    }
                    if (z != z2) {
                        bnsi c = f35775a.mo68388c();
                        c.mo68432a("niv", "a", 132, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("enterAnimation and exitAnimation need to both be null or both be non-null.");
                        return Pair.create(null, null);
                    } else if (i != 0) {
                        return Pair.create(opo.mo22480a(createPackageContext, i), opo.mo22480a(createPackageContext, i2));
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(String.format("Failed to find package: %s", str), e);
                }
            } else {
                bnsi c2 = f35775a.mo68388c();
                c2.mo68432a("niv", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("Package name cannot be null.");
                return Pair.create(null, null);
            }
        }
        return Pair.create(null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract nij mo20845a(nin nin, nip nip, int i);

    /* renamed from: b */
    public final nij mo20846b() {
        if (!this.f35780e.isEmpty()) {
            return (nij) this.f35780e.get(0);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo20847c() {
        ArrayList arrayList = new ArrayList(this.f35780e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nij) arrayList.get(i)).mo20780f();
        }
    }

    public final String toString() {
        int i = this.f35777b;
        String flattenToShortString = this.f35779d.flattenToShortString();
        StringBuilder sb = new StringBuilder(String.valueOf(flattenToShortString).length() + 37);
        sb.append("CarActivityTask{#");
        sb.append(i);
        sb.append(": mRoot=");
        sb.append(flattenToShortString);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final nij mo20844a() {
        if (this.f35780e.isEmpty()) {
            return null;
        }
        List list = this.f35780e;
        return (nij) list.get(list.size() - 1);
    }
}
