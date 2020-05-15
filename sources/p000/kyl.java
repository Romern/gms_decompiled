package p000;

import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: kyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kyl implements beez {

    /* renamed from: a */
    private final behq f25417a = behq.m95058a();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        FileInputStream fileInputStream = new FileInputStream(this.f25417a.mo14941a(beey));
        try {
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            fileInputStream.close();
            return map;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
