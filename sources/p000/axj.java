package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: axj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axj {

    /* renamed from: a */
    private final List f2497a = new ArrayList(5);

    /* renamed from: a */
    public final int mo2818a() {
        return this.f2497a.size();
    }

    public final String toString() {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 1; i2 < mo2818a(); i2++) {
            stringBuffer.append(mo2819a(i2));
            if (i2 < mo2818a() - 1 && ((i = mo2819a(i2 + 1).f2499b) == 1 || i == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final axl mo2819a(int i) {
        return (axl) this.f2497a.get(i);
    }

    /* renamed from: a */
    public final void mo2820a(axl axl) {
        this.f2497a.add(axl);
    }
}
