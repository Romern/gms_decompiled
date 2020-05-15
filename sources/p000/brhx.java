package p000;

import android.os.Bundle;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: brhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brhx {

    /* renamed from: a */
    public String f142856a = caeb.f172791g.f172796d;

    /* renamed from: b */
    public final Bundle f142857b = new Bundle();

    /* renamed from: c */
    private boolean f142858c = caeb.f172791g.f172794b;

    /* renamed from: d */
    private int f142859d = caeb.f172791g.f172795c;

    /* renamed from: a */
    public final Thing.Metadata mo69540a() {
        return new Thing.Metadata(this.f142858c, this.f142859d, this.f142856a, this.f142857b, null);
    }

    /* renamed from: b */
    public final void mo69542b() {
        this.f142858c = true;
    }

    /* renamed from: a */
    public final void mo69541a(int i) {
        boolean z = i >= 0;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Negative score values are invalid. Value: ");
        sb.append(i);
        sdo.m34975b(z, sb.toString());
        this.f142859d = i;
    }
}
