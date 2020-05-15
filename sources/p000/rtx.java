package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* renamed from: rtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rtx extends rtm implements rkk {

    /* renamed from: b */
    private boolean f43679b = false;

    /* renamed from: c */
    private ArrayList f43680c;

    /* renamed from: d */
    private final Status f43681d;

    /* renamed from: d */
    private final void m34450d() {
        synchronized (this) {
            if (!this.f43679b) {
                int i = this.f43665a.f30168h;
                ArrayList arrayList = new ArrayList();
                this.f43680c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String c = this.f43665a.mo17769c("path", 0, this.f43665a.mo17762a(0));
                    int i2 = 1;
                    while (i2 < i) {
                        int a = this.f43665a.mo17762a(i2);
                        String c2 = this.f43665a.mo17769c("path", i2, a);
                        if (c2 != null) {
                            if (!c2.equals(c)) {
                                this.f43680c.add(Integer.valueOf(i2));
                                c = c2;
                            }
                            i2++;
                        } else {
                            StringBuilder sb = new StringBuilder("path".length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append("path");
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(a);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f43679b = true;
            }
        }
    }

    /* renamed from: a */
    public final int mo24660a() {
        m34450d();
        return this.f43680c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo25167b(int i) {
        if (i >= 0 && i < this.f43680c.size()) {
            return ((Integer) this.f43680c.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: bo */
    public final Status mo7183bo() {
        return this.f43681d;
    }

    public rtx(DataHolder dataHolder) {
        super(dataHolder);
        this.f43681d = new Status(dataHolder.f30165e);
    }

    /* renamed from: a */
    public final Object mo24661a(int i) {
        m34450d();
        int b = mo25167b(i);
        int i2 = 0;
        if (i >= 0 && i != this.f43680c.size()) {
            if (i == this.f43680c.size() - 1) {
                i2 = this.f43665a.f30168h - ((Integer) this.f43680c.get(i)).intValue();
            } else {
                i2 = ((Integer) this.f43680c.get(i + 1)).intValue() - ((Integer) this.f43680c.get(i)).intValue();
            }
            if (i2 == 1) {
                this.f43665a.mo17762a(mo25167b(i));
            }
        }
        return new axqu(this.f43665a, b, i2);
    }
}
