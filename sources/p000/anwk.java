package p000;

import android.content.Context;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.internal.PlusSession;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: anwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwk {

    /* renamed from: a */
    public String f77819a;

    /* renamed from: b */
    public String f77820b;

    /* renamed from: c */
    public String f77821c;

    /* renamed from: d */
    public String[] f77822d;

    /* renamed from: e */
    public String f77823e;

    /* renamed from: f */
    public PlusCommonExtras f77824f;

    /* renamed from: g */
    private final ArrayList f77825g = new ArrayList();

    public anwk(Context context) {
        this.f77821c = context.getPackageName();
        this.f77820b = context.getPackageName();
        this.f77824f = new PlusCommonExtras();
        this.f77825g.add("https://www.googleapis.com/auth/plus.login");
    }

    /* renamed from: a */
    public final PlusSession mo42333a() {
        if (this.f77819a == null) {
            this.f77819a = "<<default account>>";
        }
        ArrayList arrayList = this.f77825g;
        return new PlusSession(this.f77819a, (String[]) arrayList.toArray(new String[arrayList.size()]), null, this.f77822d, this.f77820b, this.f77821c, this.f77823e, this.f77824f);
    }

    /* renamed from: b */
    public final void mo42335b() {
        this.f77825g.clear();
    }

    /* renamed from: a */
    public final void mo42334a(String... strArr) {
        this.f77825g.clear();
        this.f77825g.addAll(Arrays.asList(strArr));
    }
}
