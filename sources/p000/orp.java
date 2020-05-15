package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;

/* renamed from: orp */
public final /* synthetic */ class orp implements Runnable {

    /* renamed from: a */
    private final CarSetupServiceImpl f38287a;

    /* renamed from: b */
    private final Closeable f38288b;

    /* renamed from: c */
    private final ParcelFileDescriptor f38289c;

    /* renamed from: d */
    private final ParcelFileDescriptor f38290d;

    /* renamed from: e */
    private final boolean f38291e;

    public orp(CarSetupServiceImpl carSetupServiceImpl, Closeable closeable, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2, boolean z) {
        this.f38287a = carSetupServiceImpl;
        this.f38288b = closeable;
        this.f38289c = parcelFileDescriptor;
        this.f38290d = parcelFileDescriptor2;
        this.f38291e = z;
    }

    public final void run() {
        CarSetupServiceImpl carSetupServiceImpl = this.f38287a;
        Closeable closeable = this.f38288b;
        ParcelFileDescriptor parcelFileDescriptor = this.f38289c;
        ParcelFileDescriptor parcelFileDescriptor2 = this.f38290d;
        boolean z = this.f38291e;
        bmxy.m108601b(((Boolean) carSetupServiceImpl.f29605v.mo6606a()).booleanValue(), "Unable to handoff car connection and not configured to fall back to GMS Core.");
        carSetupServiceImpl.mo17414a(closeable, parcelFileDescriptor, parcelFileDescriptor, parcelFileDescriptor2, z);
    }
}
