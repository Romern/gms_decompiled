package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rto implements rtp {

    /* renamed from: a */
    private final ArrayList f43666a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f43667b = new ArrayList();

    /* renamed from: c */
    private int f43668c;

    /* renamed from: d */
    private Bundle f43669d;

    public rto() {
    }

    /* renamed from: a */
    public static rto m34406a(rto rto, rtp rtp) {
        rto rto2 = new rto();
        ArrayList arrayList = rto.f43666a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rto2.mo25133a((rtp) arrayList.get(i));
        }
        rto2.mo25133a(rtp);
        return rto2;
    }

    /* renamed from: b */
    public final Bundle mo24662b() {
        Bundle bundle;
        synchronized (this) {
            bundle = this.f43669d;
        }
        return bundle;
    }

    /* renamed from: c */
    public final void mo12460c() {
        synchronized (this) {
            int size = this.f43666a.size();
            for (int i = 0; i < size; i++) {
                rtp rtp = (rtp) this.f43666a.get(i);
                if (rtp != null) {
                    rtp.mo12460c();
                }
            }
            this.f43666a.clear();
            this.f43667b.clear();
            this.f43669d = null;
        }
    }

    @Deprecated
    public final void close() {
        mo12460c();
    }

    public final Iterator iterator() {
        return new rtq(this);
    }

    public rto(rtp rtp) {
        mo25133a(rtp);
    }

    /* renamed from: a */
    public final int mo24660a() {
        int i;
        synchronized (this) {
            i = this.f43668c;
        }
        return i;
    }

    /* renamed from: a */
    public final Object mo24661a(int i) {
        synchronized (this) {
            int size = this.f43666a.size();
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Integer) this.f43667b.get(i2)).intValue();
                if (i < intValue) {
                    rtp rtp = (rtp) this.f43666a.get(i2);
                    if (rtp != null) {
                        Object a = rtp.mo24661a((i - intValue) + rtp.mo24660a());
                        return a;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo25133a(rtp rtp) {
        if (rtp != null) {
            synchronized (this) {
                if (this.f43666a.isEmpty()) {
                    this.f43669d = new Bundle();
                    Bundle b = rtp.mo24662b();
                    if (b != null) {
                        this.f43669d.putString("prev_page_token", b.getString("prev_page_token"));
                    }
                }
                this.f43666a.add(rtp);
                this.f43667b.clear();
                int size = this.f43666a.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    rtp rtp2 = (rtp) this.f43666a.get(i2);
                    if (rtp2 != null) {
                        i += rtp2.mo24660a();
                    }
                    this.f43667b.add(Integer.valueOf(i));
                }
                this.f43668c = i;
                Bundle b2 = rtp.mo24662b();
                if (b2 != null) {
                    this.f43669d.putString("next_page_token", b2.getString("next_page_token"));
                } else {
                    this.f43669d.remove("next_page_token");
                }
            }
        }
    }
}
