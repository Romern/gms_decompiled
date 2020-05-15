package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.support.p001v4.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: iz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1096iz {

    /* renamed from: a */
    public boolean f21938a;

    /* renamed from: b */
    public final Bundle f21939b;

    /* renamed from: c */
    public ArrayList f21940c;

    /* renamed from: d */
    private final IconCompat f21941d;

    /* renamed from: e */
    private final CharSequence f21942e;

    /* renamed from: f */
    private final PendingIntent f21943f;

    /* renamed from: g */
    private boolean f21944g;

    public C1096iz(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompat;
        if (i != 0) {
            iconCompat = IconCompat.m1175a(null, "", i);
        } else {
            iconCompat = null;
        }
        Bundle bundle = new Bundle();
        this.f21938a = true;
        this.f21944g = true;
        this.f21941d = iconCompat;
        this.f21942e = C1102je.m16571a(charSequence);
        this.f21943f = pendingIntent;
        this.f21939b = bundle;
        this.f21940c = null;
        this.f21938a = true;
        this.f21944g = true;
    }

    /* renamed from: a */
    public final C1099jb mo13508a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f21940c;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                C1118ju juVar = (C1118ju) arrayList3.get(i);
                boolean z = juVar.f23216d;
                arrayList2.add(juVar);
            }
        }
        if (!arrayList.isEmpty()) {
            C1118ju[] juVarArr = (C1118ju[]) arrayList.toArray(new C1118ju[arrayList.size()]);
        }
        return new C1099jb(this.f21941d, this.f21942e, this.f21943f, this.f21939b, !arrayList2.isEmpty() ? (C1118ju[]) arrayList2.toArray(new C1118ju[arrayList2.size()]) : null, this.f21938a, this.f21944g);
    }
}
