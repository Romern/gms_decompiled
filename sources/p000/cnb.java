package p000;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

/* renamed from: cnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnb implements cne {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo3996a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
        mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }
}
