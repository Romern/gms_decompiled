package p000;

import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.ArrayList;

/* renamed from: tkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tkb {

    /* renamed from: a */
    private final ArrayList f46222a = new ArrayList();

    /* renamed from: b */
    private int[] f46223b = null;

    /* renamed from: a */
    public final TimeFilterImpl mo26620a() {
        return new TimeFilterImpl(this.f46222a, this.f46223b);
    }

    /* renamed from: b */
    public final void mo26624b() {
        this.f46222a.add(new TimeFilterImpl.Interval(0, Long.MAX_VALUE));
    }

    /* renamed from: a */
    public final void mo26621a(long j) {
        if (j < 0) {
            dst.m9256b("TimeFilter.Builder", "stopTimeMillis must be >= 0.  Clamping to 0.");
            j = 0;
        }
        this.f46222a.add(new TimeFilterImpl.Interval(-1, j));
    }

    /* renamed from: a */
    public final void mo26622a(long j, long j2) {
        if (j < 0) {
            dst.m9256b("TimeFilter.Builder", "startTimeMillis must be >= 0.  Clamping to 0.");
            j = 0;
        }
        if (j2 < 0) {
            dst.m9256b("TimeFilter.Builder", "stopTimeMillis must be >= 0.  Clamping to 0.");
            j2 = 0;
        }
        this.f46222a.add(new TimeFilterImpl.Interval(j, j2));
    }

    /* renamed from: a */
    public final void mo26623a(int... iArr) {
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder(29);
                sb.append("Unknown time type=");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f46223b = iArr;
    }
}
