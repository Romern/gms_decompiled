package p000;

import com.google.android.location.utils.ParcelableByteArray;
import java.util.List;

/* renamed from: bgda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgda extends bfnf {

    /* renamed from: b */
    public final rsk f116089b;

    public bgda(rsk rsk) {
        this.f116089b = rsk;
    }

    /* renamed from: b */
    public final void mo61973b() {
        super.mo61973b();
        this.f116089b.mo25069c();
    }

    /* renamed from: c */
    public final void mo62662c() {
        super.mo61973b();
        List e = this.f116089b.mo25074e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            ParcelableByteArray parcelableByteArray = (ParcelableByteArray) e.get(i);
            byte b = parcelableByteArray.f150970a;
            if (b != 0) {
                StringBuilder sb = new StringBuilder(26);
                sb.append("Found unknown version ");
                sb.append((int) b);
                sb.toString();
            } else {
                byte b2 = parcelableByteArray.f150971b;
                if (b2 != 0) {
                    StringBuilder sb2 = new StringBuilder(23);
                    sb2.append("Found unknown type ");
                    sb2.append((int) b2);
                    sb2.toString();
                } else {
                    bfnv bfnv = new bfnv(parcelableByteArray.f150972c);
                    if (bfnv.mo62004a()) {
                        long d = bfnv.mo62009d();
                        StringBuilder sb3 = new StringBuilder(50);
                        sb3.append("Recovered scan with timestamp ");
                        sb3.append(d);
                        sb3.toString();
                        this.f114469a.add(bfnv);
                    }
                }
            }
        }
    }
}
