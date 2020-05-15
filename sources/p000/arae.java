package p000;

import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: arae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arae {

    /* renamed from: a */
    public static final asco f87189a = ascp.m73787a("D2D", arae.class.getSimpleName());

    /* renamed from: b */
    public final ParcelFileDescriptor.AutoCloseInputStream f87190b;

    /* renamed from: c */
    public final ParcelFileDescriptor.AutoCloseOutputStream f87191c;

    public arae(aqzo aqzo, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        bmxy.m108581a(parcelFileDescriptor);
        this.f87190b = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        bmxy.m108581a(parcelFileDescriptor2);
        this.f87191c = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
        araf araf = new araf(this.f87190b, aqzo);
        HandlerThread handlerThread = new HandlerThread("NearbyDirectTransferThread");
        handlerThread.start();
        new adzt(handlerThread.getLooper()).post(araf);
    }

    /* renamed from: a */
    public static void m72315a(Closeable closeable) {
        f87189a.mo25412b("safelyCloseStream", new Object[0]);
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                asco asco = f87189a;
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("IOException while closing stream: ");
                sb.append(valueOf);
                asco.mo25416d(sb.toString(), new Object[0]);
            }
        }
    }
}
