package p000;

import android.os.WorkSource;
import com.google.android.gms.beacon.BleSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nem {

    /* renamed from: a */
    public int f35408a = 0;

    /* renamed from: b */
    private int f35409b = 0;

    /* renamed from: c */
    private int f35410c = 1;

    /* renamed from: d */
    private long f35411d = 0;

    /* renamed from: e */
    private List f35412e = new ArrayList();

    /* renamed from: f */
    private WorkSource f35413f = new WorkSource();

    public nem() {
    }

    /* renamed from: a */
    public final BleSettings mo20533a() {
        return new BleSettings(this.f35409b, this.f35410c, this.f35411d, this.f35412e, this.f35413f, this.f35408a);
    }

    /* renamed from: b */
    public final void mo20538b(int i) {
        if (i == 1 || i == 2 || i == 0 || i == 3) {
            this.f35409b = i;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("invalid scan mode ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo20534a(int i) {
        if (i == 1 || i == 2 || i == 4 || i == 6) {
            this.f35410c = i;
            return;
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("invalid callback type - ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public nem(BleSettings bleSettings) {
        this.f35409b = bleSettings.f29265a;
        this.f35410c = bleSettings.f29266b;
        this.f35411d = bleSettings.f29267c;
        this.f35412e = bleSettings.f29268d;
        this.f35413f = bleSettings.f29269e;
        this.f35408a = bleSettings.f29270f;
    }

    /* renamed from: a */
    public final void mo20535a(long j) {
        if (j >= 0) {
            this.f35411d = j;
            return;
        }
        throw new IllegalArgumentException("reportDelayMillis must be >= 0");
    }

    /* renamed from: a */
    public final void mo20536a(WorkSource workSource) {
        if (workSource != null) {
            this.f35413f = workSource;
            return;
        }
        throw new IllegalArgumentException("workSource must be not null");
    }

    /* renamed from: a */
    public final void mo20537a(List list) {
        if (list != null) {
            this.f35412e = list;
            return;
        }
        throw new IllegalArgumentException("bleFilters must be not null");
    }
}
