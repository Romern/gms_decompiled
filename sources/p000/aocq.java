package p000;

import com.google.android.gms.plus.service.pos.PlusonesEntity;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aocq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aocq {

    /* renamed from: a */
    public String f78206a;

    /* renamed from: b */
    public final Set f78207b = new HashSet();

    /* renamed from: c */
    private String f78208c;

    /* renamed from: d */
    private boolean f78209d;

    /* renamed from: a */
    public final aocu mo42524a() {
        return new PlusonesEntity(this.f78207b, this.f78206a, this.f78208c, this.f78209d);
    }

    /* renamed from: a */
    public final void mo42525a(String str) {
        this.f78208c = str;
        this.f78207b.add(4);
    }

    /* renamed from: a */
    public final void mo42526a(boolean z) {
        this.f78209d = z;
        this.f78207b.add(5);
    }
}
