package p000;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

/* renamed from: cnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnf implements cne {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3996a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
