package p000;

import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: ciy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciy implements cja {
    /* renamed from: a */
    public final Class mo3934a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3935a(File file) {
        return ParcelFileDescriptor.open(file, 268435456);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3936a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
