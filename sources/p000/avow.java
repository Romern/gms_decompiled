package p000;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Locale;

/* renamed from: avow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avow {

    /* renamed from: a */
    private static final Logger f93682a = avpq.m79018e("PayloadMetadataDownloadUtil");

    /* renamed from: a */
    public static boolean m78971a(Context context, String str) {
        FileChannel channel;
        Throwable th;
        Context context2 = context;
        String str2 = str;
        int i = Build.VERSION.SDK_INT;
        bmxy.m108588a(true);
        bmxv a = avpa.m78976a("payload_metadata.bin");
        if (!a.mo66813a()) {
            bmxv a2 = avpa.m78976a("payload.bin");
            if (!a2.mo66813a()) {
                return false;
            }
            avpr a3 = avpz.m79028a(context);
            a3.f93728a = str2;
            a3.f93735h = avot.m78956a();
            a3.f93729b = avox.m78972a(context2, "payload_header.bin", avlt.m78750c());
            a3.f93733f = avou.m78960a(context);
            a3.f93731d = ((avly) a2.mo66814b()).f93351b;
            a3.f93732e = 24;
            a3.mo51481a().mo51483a();
            try {
                File file = new File(avov.m78963a().getAbsolutePath(), "payload_header.bin");
                ByteBuffer allocate = ByteBuffer.allocate(24);
                channel = new FileInputStream(file).getChannel();
                if (channel.read(allocate) == 24) {
                    allocate.flip();
                    int i2 = allocate.getInt();
                    if (i2 == 1131561301) {
                        long j = allocate.getLong();
                        if (j == 2) {
                            long j2 = allocate.getLong() + 24 + ((long) allocate.getInt());
                            if (channel != null) {
                                channel.close();
                            }
                            a = bmxv.m108566b(new avly("payload_metadata.bin", ((avly) a2.mo66814b()).f93351b, j2));
                        } else {
                            throw new IOException(String.format(Locale.US, "Invalid file format version: [%d].", Long.valueOf(j)));
                        }
                    } else {
                        throw new IOException(String.format("Invalid magic: [0x%x].", Integer.valueOf(i2)));
                    }
                } else {
                    throw new IOException(String.format(Locale.US, "Cannot read %d bytes from payload header file.", 24));
                }
            } catch (IOException e) {
                f93682a.mo25417e("Cannot get the payload metadata.", e, new Object[0]);
                return false;
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        }
        avpr a4 = avpz.m79028a(context);
        a4.f93728a = str2;
        a4.f93735h = avot.m78956a();
        a4.f93729b = avox.m78972a(context2, "payload_metadata.bin", avlt.m78750c());
        a4.f93733f = avou.m78960a(context);
        a4.f93731d = ((avly) a.mo66814b()).f93351b;
        a4.f93732e = ((avly) a.mo66814b()).f93352c;
        a4.mo51481a().mo51483a();
        return true;
        throw th;
    }
}
