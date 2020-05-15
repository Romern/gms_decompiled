package p000;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import java.util.ArrayList;

/* renamed from: pkb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pkb implements pik {

    /* renamed from: a */
    final /* synthetic */ pkd f39418a;

    public pkb(pkd pkd) {
        this.f39418a = pkd;
    }

    /* renamed from: a */
    public final void mo23181a(int i) {
        if (this.f39418a.f39428h != null) {
            pkd.f39423c.mo23856a("Failed to connect to the new endpoint of %s", this.f39418a.f39230a);
            this.f39418a.mo23294h();
        }
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23181a(i);
        }
    }

    /* renamed from: b */
    public final void mo23192b(int i) {
    }

    /* renamed from: bm */
    public final void mo23194bm() {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23194bm();
        }
    }

    /* renamed from: c */
    public final void mo23195c(int i) {
        pkd pkd = this.f39418a;
        pkd.f39424d.mo23456a(pkd.f39426f, pkd);
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23195c(i);
        }
    }

    /* renamed from: d */
    public final void mo23196d(int i) {
        pkd pkd = this.f39418a;
        if (pkd.f39428h != null) {
            pkd.f39423c.mo23857a("%s failed to join the app on the new endpoint device. Error: %d ", this.f39418a.f39230a, Integer.valueOf(i));
            this.f39418a.mo23294h();
            ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((pim) arrayList.get(i2)).f39236e.mo23191a(false);
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList(pkd.f39434n);
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((pim) arrayList2.get(i3)).f39236e.mo23196d(i);
        }
    }

    /* renamed from: e */
    public final void mo23197e(int i) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23197e(i);
        }
    }

    /* renamed from: b */
    public final void mo23193b(String str, String str2) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23193b(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo23182a(int i, String str) {
        pkd pkd = this.f39418a;
        pkd.f39424d.mo23456a(str, pkd);
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23182a(i, str);
        }
    }

    /* renamed from: a */
    public final void mo23183a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        pkd pkd = this.f39418a;
        pkd.f39424d.mo23457a(str2, pkd, pkd.f39425e);
        pkd pkd2 = this.f39418a;
        int i = 0;
        if (pkd2.f39428h == null) {
            ArrayList arrayList = new ArrayList(pkd2.f39434n);
            int size = arrayList.size();
            while (i < size) {
                ((pim) arrayList.get(i)).f39236e.mo23183a(applicationMetadata, str, str2, z);
                i++;
            }
            return;
        }
        pkd.f39423c.mo23856a("%s successfully joined the app on the new endpoint device.", this.f39418a.f39230a);
        this.f39418a.f39428h.cancel(false);
        pkd pkd3 = this.f39418a;
        pkd3.f39428h = null;
        pkd3.mo23295i();
        ArrayList arrayList2 = new ArrayList(this.f39418a.f39434n);
        int size2 = arrayList2.size();
        while (i < size2) {
            ((pim) arrayList2.get(i)).f39236e.mo23191a(true);
            i++;
        }
    }

    /* renamed from: a */
    public final void mo23184a(ApplicationStatus applicationStatus) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23184a(applicationStatus);
        }
    }

    /* renamed from: a */
    public final void mo23185a(DeviceStatus deviceStatus) {
        pkd pkd = this.f39418a;
        if (pkd.f39428h == null) {
            ArrayList arrayList = new ArrayList(pkd.f39434n);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pim) arrayList.get(i)).f39236e.mo23185a(deviceStatus);
            }
            return;
        }
        ApplicationMetadata applicationMetadata = deviceStatus.f29891d;
        if (applicationMetadata != null && applicationMetadata.f29706a.equals(pkd.f39425e)) {
            pkd.f39423c.mo23856a(" %s's endpoint device is running the desired app now. Connecting to it", this.f39418a.f39230a);
            JoinOptions joinOptions = new JoinOptions();
            joinOptions.mo17516a(2);
            pkd pkd2 = this.f39418a;
            pkd2.f39429i.mo23205a(pkd2.f39425e, pkd2.f39426f, joinOptions);
        }
    }

    /* renamed from: a */
    public final void mo23186a(String str, double d, boolean z) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23186a(str, d, z);
        }
    }

    /* renamed from: a */
    public final void mo23187a(String str, long j) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23187a(str, j);
        }
    }

    /* renamed from: a */
    public final void mo23188a(String str, long j, int i) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pim) arrayList.get(i2)).f39236e.mo23188a(str, j, i);
        }
    }

    /* renamed from: a */
    public final void mo23189a(String str, String str2) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23189a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo23190a(String str, byte[] bArr) {
        ArrayList arrayList = new ArrayList(this.f39418a.f39434n);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((pim) arrayList.get(i)).f39236e.mo23190a(str, bArr);
        }
    }

    /* renamed from: a */
    public final void mo23191a(boolean z) {
        pkd pkd = this.f39418a;
        if (pkd.f39428h == null) {
            ArrayList arrayList = new ArrayList(pkd.f39434n);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((pim) arrayList.get(i)).f39236e.mo23191a(z);
            }
            return;
        }
        for (String str : pkd.f39433m) {
            this.f39418a.f39429i.mo23200a(str);
        }
        this.f39418a.f39433m.clear();
        this.f39418a.f39429i.mo23216f();
    }
}
