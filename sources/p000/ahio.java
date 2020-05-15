package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: ahio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahio {

    /* renamed from: a */
    public final File f67246a;

    /* renamed from: b */
    public final ParcelFileDescriptor f67247b;

    /* renamed from: c */
    public final long f67248c;

    public ahio(File file, ParcelFileDescriptor parcelFileDescriptor, long j) {
        this.f67246a = file;
        this.f67247b = parcelFileDescriptor;
        this.f67248c = j;
    }

    /* renamed from: a */
    public static ahio m55834a(ParcelFileDescriptor parcelFileDescriptor) {
        sdo.checkIfNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor.");
        return new ahio(null, parcelFileDescriptor, parcelFileDescriptor.getStatSize());
    }
}
