package p000;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.format.Time;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: oas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oas implements ods {

    /* renamed from: a */
    private static final bnsn f37086a = odk.m28481a("CAR.VIDEO");

    /* renamed from: b */
    private MediaMuxer f37087b;

    /* renamed from: c */
    private int f37088c;

    /* renamed from: d */
    private boolean f37089d = false;

    /* renamed from: e */
    private final String f37090e;

    private oas(Context context) {
        Time time = new Time();
        time.setToNow();
        String format = time.format("%Y-%m-%d-%H_%M_%S");
        File a = npe.m27153a(context);
        if (a != null) {
            this.f37090e = new File(a, String.valueOf(format).concat(".mp4")).getAbsolutePath();
            this.f37087b = new MediaMuxer(this.f37090e, 0);
            return;
        }
        throw new IOException("Failed to get directory");
    }

    /* renamed from: a */
    public static oas m28302a(Context context) {
        try {
            return new oas(context);
        } catch (IOException e) {
            bnsi d = f37086a.mo68390d();
            d.mo68437a(e);
            d.mo68432a("oas", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Error creating MediaSaver");
            return null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo21909a() {
        if (this.f37089d) {
            this.f37087b.release();
        }
    }

    /* renamed from: a */
    public final void mo21910a(MediaFormat mediaFormat) {
        this.f37088c = this.f37087b.addTrack(mediaFormat);
    }

    /* renamed from: a */
    public final synchronized void mo21911a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (!this.f37089d) {
            this.f37087b.start();
            this.f37089d = true;
        }
        this.f37087b.writeSampleData(this.f37088c, byteBuffer, bufferInfo);
    }
}
